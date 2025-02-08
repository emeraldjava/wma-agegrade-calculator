package ie.emeraldjava.wma;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.item.excel.RowCallbackHandler;
import org.springframework.batch.item.excel.mapping.BeanWrapperRowMapper;
import org.springframework.batch.item.excel.mapping.PassThroughRowMapper;
import org.springframework.batch.item.excel.poi.PoiItemReader;
import org.springframework.batch.item.excel.support.rowset.RowSet;
import org.springframework.batch.test.JobLauncherTestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.util.StringUtils;

/**
 * Created by pauloconnell on 30/12/16.
 */
@Configuration
@EnableBatchProcessing
public class BatchConfig {

    @Autowired
    public JobBuilderFactory jobBuilderFactory;

    @Autowired
    public StepBuilderFactory stepBuilderFactory;

    @Bean
    public PoiItemReader reader() throws Exception {
        PoiItemReader poiItemReader = new PoiItemReader();

        poiItemReader.setLinesToSkip(1); //First line is column names
        // poiItemReader.setResource(new ClassPathResource("org/springframework/batch/item/excel/player.xls"));

        BeanWrapperRowMapper<WmaRecord> rowMapper = new BeanWrapperRowMapper<WmaRecord>();
        rowMapper.setTargetType(WmaRecord.class);
        rowMapper.afterPropertiesSet();

        poiItemReader.setRowMapper(new PassThroughRowMapper());
        poiItemReader.setSkippedRowsCallback(new RowCallbackHandler() {

            public void handleRow(RowSet rs) {
                System.out.println("Skipping: " + StringUtils.arrayToCommaDelimitedString(rs.getCurrentRow()));
            }
        });
        poiItemReader.setResource(new ClassPathResource("excel/MaleRoadStd2015.xlsx"));
        poiItemReader.afterPropertiesSet();
        return poiItemReader;
    }

    @Bean
    public WmaRecordItemProcessor processor() {
        return new WmaRecordItemProcessor();
    }

    @Bean
    public Job importUserJob() throws Exception {
        return jobBuilderFactory.get("importUserJob")
                //.incrementer(new RunIdIncrementer())
                //.listener(listener)
                .flow(step1())
                .end()
                .build();
    }

    @Bean
    public Step step1() throws Exception {
        return stepBuilderFactory.get("step1")
                .<Object, Object> chunk(500)
                .reader(reader())
                .processor(processor())
                //.writer(writer())
                .build();
    }

    @Bean
    public JobLauncherTestUtils getJobLauncherTestUtils() {
        return new JobLauncherTestUtils();
    }
}
