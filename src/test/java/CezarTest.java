import org.junit.Assert;
import org.junit.Test;


public class CezarTest {

    Cezar cezartest = new Cezar();

    @Test
    public void ifLettersEncrypted(){
        String insert = "Magdalena";
        int insertINT = 2;
        cezartest.setText(insert);
        cezartest.setN(insertINT);
        cezartest.encrypt();
        Assert.assertEquals("ocifcngpc", cezartest.getEncrypted());
    }

    @Test
    public void ifLettersWithSPacesEncrypted(){
        String insert = "Ala ma kota";
        int insertINT = 3;
        cezartest.setText(insert);
        cezartest.setN(insertINT);
        cezartest.encrypt();
        Assert.assertEquals("dod pd nrwd", cezartest.getEncrypted());
    }

    @Test
    public void ifLoopedForHigherThanZ() {
        String insert = "Szczebrzeszyn";
        int insertINT = 4;
        cezartest.setText(insert);
        cezartest.setN(insertINT);
        cezartest.encrypt();
        Assert.assertEquals("wdgdifvdiwdcr", cezartest.getEncrypted());
    }

    @Test
    public void ifNumbersEncrypted() {
        String insert = "2020";
        int insertINT = 2;
        cezartest.setText(insert);
        cezartest.setN(insertINT);
        cezartest.encrypt();
        Assert.assertEquals("4242", cezartest.getEncrypted());
    }

    @Test
    public void ifNumbersHigherThan9Looped(){
        String insert = "Orwell1984";
        int insertINT = 2;
        cezartest.setText(insert);
        cezartest.setN(insertINT);
        cezartest.encrypt();
        Assert.assertEquals("qtygnn3106", cezartest.getEncrypted());
    }

    @Test
    public void ifNumbersWithSpacesENcrypted(){
        String insert = "Om11 94";
        int insertINT = 2;
        cezartest.setText(insert);
        cezartest.setN(insertINT);
        cezartest.encrypt();
        Assert.assertEquals("qo33 16", cezartest.getEncrypted());
    }

}
