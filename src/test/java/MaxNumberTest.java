import com.bridgelabz.com.MaxNumber;
import org.junit.Assert;
import org.junit.Test;

public class MaxNumberTest {

    @Test
    public void givenMaxNumber_atFirstPosition_then_returnSameNumber() {
        int maxInteger=MaxNumber.findMaxNumber(10,5,2);
        Assert.assertEquals(10,maxInteger);
    }

    @Test
    public void givenMaxNumber_atSecondPosition_then_returnSameNumber() {
        int maxInteger=MaxNumber.findMaxNumber(10,15,2);
        Assert.assertEquals(15,maxInteger);
    }

    @Test
    public void givenMaxNumber_atThirdPosition_then_returnSameNumber() {
        int maxInteger=MaxNumber.findMaxNumber(10,15,20);
        Assert.assertEquals(20,maxInteger);
    }

    @Test
    public void givenFloatMaxNumber_atFirstPosition_then_returnSameNumber() {
        float maxFloat=MaxNumber.findFloatMaxNumber(7.1f,2.5f,4.6f);
        Assert.assertEquals(7.1f,maxFloat,00);
    }

    @Test
    public void givenFloatMaxNumber_atSecondPosition_then_returnSameNumber() {
        float maxFloat=MaxNumber.findFloatMaxNumber(7.1f,8.5f,4.6f);
        Assert.assertEquals(8.5f,maxFloat,00);
    }

    @Test
    public void givenFloatMaxNumber_atThirdPosition_then_returnSameNumber() {
        float maxFloat=MaxNumber.findFloatMaxNumber(1.1f,2.5f,4.6f);
      Assert.assertEquals(4.6f,maxFloat,00);
    }

    @Test
    public void givenStringMaxNumber_atFirsPosition_then_returnSameNumber() {
        String maxString=MaxNumber.findStringMaxNumber("Peach","Apple","Banana");
        Assert.assertEquals("Peach",maxString);
    }

    @Test
    public void givenStringMaxNumber_atSecondPosition_then_returnSameNumber() {
        String maxString=MaxNumber.findStringMaxNumber("Apple","Peach","Banana");
        Assert.assertEquals("Peach",maxString);
    }

    @Test
    public void givenStringMaxNumber_atThirdPosition_then_returnSameNumber() {
        String maxString=MaxNumber.findStringMaxNumber("Apple","Banana","Peach");
        Assert.assertEquals("Peach",maxString);
    }


}
