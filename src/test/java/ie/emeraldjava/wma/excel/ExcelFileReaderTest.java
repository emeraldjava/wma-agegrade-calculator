package ie.emeraldjava.wma.excel;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.Before;
import org.junit.Test;
import org.springframework.batch.item.excel.poi.PoiItemReader;

import static org.junit.Assert.assertNotNull;

/**
 * Created by pauloconnell on 25/12/16.
 */
public class ExcelFileReaderTest {

    protected final Log logger = LogFactory.getLog(this.getClass());

    protected ExcelFileReader excelFileReader;

    @Before
    public void setup() throws Exception {
        this.excelFileReader = new ExcelFileReader();
        PoiItemReader poi = this.excelFileReader.createExcelFileReader();
        assertNotNull(this.excelFileReader);
        assertNotNull("poi",poi);
    }

    @Test
    public void readExcelFile() throws Exception {
        this.excelFileReader.readFile();
    }
}