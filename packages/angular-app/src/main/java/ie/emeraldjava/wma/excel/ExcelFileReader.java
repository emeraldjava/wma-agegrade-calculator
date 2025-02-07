package ie.emeraldjava.wma.excel;

import org.springframework.batch.item.ExecutionContext;
import org.springframework.batch.item.excel.RowCallbackHandler;
import org.springframework.batch.item.excel.mapping.PassThroughRowMapper;
import org.springframework.batch.item.excel.poi.PoiItemReader;
import org.springframework.batch.item.excel.support.rowset.RowSet;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.util.Arrays;

/**
 * Created by pauloconnell on 25/12/16.
 */
@Component
public class ExcelFileReader {

    public PoiItemReader poiItemReader;

    @Bean
    public PoiItemReader createExcelFileReader() throws Exception {
        this.poiItemReader = new PoiItemReader();

        this.poiItemReader.setLinesToSkip(1); //First line is column names
       // this.poiItemReader.setResource(new ClassPathResource("org/springframework/batch/item/excel/player.xls"));
        this.poiItemReader.setRowMapper(new PassThroughRowMapper());
        this.poiItemReader.setSkippedRowsCallback(new RowCallbackHandler() {

            public void handleRow(RowSet rs) {
                System.out.println("Skipping: " + StringUtils.arrayToCommaDelimitedString(rs.getCurrentRow()));
            }
        });
        this.poiItemReader.setResource(new ClassPathResource("excel/MaleRoadStd2015.xlsx"));
        this.poiItemReader.afterPropertiesSet();

        return this.poiItemReader;
    }


//    public class WmaRowMapper extends PassThroughRowMapper {
//
//        @Override
//        public String[] mapRow(RowSet rs) throws Exception {
//            String[] xx = super.mapRow(rs);
//            System.out.println(Arrays.toString(xx));
//            return xx;
//        }
//    }

    public void readFile() throws Exception {
        ExecutionContext executionContext = new ExecutionContext();
        this.poiItemReader.open(executionContext);

        String[] row;
        do {
            row = (String[]) this.poiItemReader.read();
            System.out.println("Read: " + StringUtils.arrayToCommaDelimitedString(row));
            if (row != null) {
                //assertEquals(6, row.length);
            }
        } while (row != null);

//        this.poiItemReader.
        //System.out.println(this.poiItemReader.getNumberOfSheets());

        //Object o = this.poiItemReader.read();

//        String o = (String) this.poiItemReader.read();
        //System.out.println(o.toString());

        //assertEquals(3, this.poiItemReader.getNumberOfSheets());
//        String[] row;
//        do {
//            row = (String[]) this.poiItemReader.read();
//            //this.logger.debug("Read: " + StringUtils.arrayToCommaDelimitedString(row));
//            if (row != null) {
//          //      assertEquals(6, row.length);
//            }
//        } while (row != null);
        //int readCount = (Integer) ReflectionTestUtils.getField(this.poiItemReader, "currentItemCount");
        //assertEquals(4321, readCount);

        //this.poiItemReader.close();

    }

}
