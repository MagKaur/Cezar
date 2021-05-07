import org.junit.Assert;
import org.junit.Test;


public class CezarTest {


    @Test
    public void ifencrypted(){
        Cezar cezartest = new Cezar();
        String insert = "zzz";
        int insertINT = 2;
        cezartest.setText(insert);
        cezartest.setN(insertINT);
        cezartest.encrypt();
        Assert.assertEquals("bbb", cezartest.getEncrypted());
    }
}
