package ie.emeraldjava.wma;

import org.springframework.batch.item.ItemProcessor;

/**
 * Created by pauloconnell on 30/12/16.
 */
public class WmaRecordItemProcessor implements ItemProcessor {

    @Override
    public Object process(Object o) throws Exception {
        System.out.println(o);
        return o;
    }
}
