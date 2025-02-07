package ie.emeraldjava.wma;

/**
 * Created by pauloconnell on 30/12/16.
 */
public class WmaCalculatorBean {

    public WmaRecordBean getRecord(int age, Genderz gender, int distance) {

        return null;
    }

    public double getRanking(int seconds, WmaRecordBean record) {
        double res = record.ageStdSec / seconds;
        System.out.println(record.ageStdSec +" / " + seconds +" = "+(res* 100));
        return ( res ) * 100;
    }
}
