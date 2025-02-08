package ie.emeraldjava.wma;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by pauloconnell on 30/12/16.
 */
public class WmaCalculatorBeanTest {

    private WmaCalculatorBean wmaCalculatorBean = null;

    @Before
    public void setup() {

        wmaCalculatorBean = new WmaCalculatorBean();



    }

    @Test
    public void testGetRanking() throws Exception {

        WmaRecordBean bean = new WmaRecordBean();
        bean.age=39;
        bean.ageStdFactor=0.9784d;
        bean.ageStdSec=1651;

        DistanceRecordBean distanceRecordBean = new DistanceRecordBean();
        distanceRecordBean.distance=10000;
        distanceRecordBean.gender=Genderz.MALE;
        distanceRecordBean.ocSeconds=1603;
        // time 00:26:43

        bean.distance=distanceRecordBean;

        // Age-Graded Score: 85.99%
        // Age-Graded Time:  31:04

        // 1920 - 1651
        // 32min = 1920 seconds.
        double perc = wmaCalculatorBean.getRanking(1920,bean);
        assertEquals(85.98958333333333d,perc,0d);
    }
}