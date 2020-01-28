import com.bridgelabz.com.MaxNumber;
import org.junit.Assert;
import org.junit.Test;

public class MaxNumberTest {

    @Test
    public void givenMaxNumber_atFirstPosition_then_returnSameNumber() {
        int maxNumber=MaxNumber.maxNumber(10,5,2);
        Assert.assertEquals(10,maxNumber);
    }


    @Test
    public void givenMaxNumber_atSecondPosition_then_returnSameNumber() {
        int maxNumber=MaxNumber.maxNumber(10,15,2);
        Assert.assertEquals(15,maxNumber);
    }


    @Test
    public void givenMaxNumber_atThirdPosition_then_returnSameNumber() {
        int maxNumber=MaxNumber.maxNumber(10,15,20);
        Assert.assertEquals(20,maxNumber);
    }


    @Test
    public void givenFloatMaxNumber_atFirstPosition_then_returnSameNumber() {
        float maxNumber=MaxNumber.maxNumber(7.1f,2.5f,4.6f);
        Assert.assertEquals(7.1f,maxNumber,00);
    }


    @Test
    public void givenFloatMaxNumber_atSecondPosition_then_returnSameNumber() {
        float maxNumber=MaxNumber.maxNumber(7.1f,8.5f,4.6f);
        Assert.assertEquals(8.5f,maxNumber,00);
    }

    @Test
    public void givenFloatMaxNumber_atThirdPosition_then_returnSameNumber() {
        float maxNumber=MaxNumber.maxNumber(1.1f,2.5f,4.6f);
        Assert.assertEquals(4.6f,maxNumber,00);
    }


    @Test
    public void givenStringMaxNumber_atFirsPosition_then_returnSameNumber() {
        String maxString=MaxNumber.maxNumber("Peach","Apple","Banana");
        Assert.assertEquals("Peach",maxString);
    }

    @Test
    public void givenStringMaxNumber_atSecondPosition_then_returnSameNumber() {
        String maxString=MaxNumber.maxNumber("Apple","Peach","Banana");
        Assert.assertEquals("Peach",maxString);
    }

    @Test
    public void givenStringMaxNumber_atThirdPosition_then_returnSameNumber() {
        String maxString=MaxNumber.maxNumber("Apple","Banana","Peach");
        Assert.assertEquals("Peach",maxString);
    }

    @Test
    public void givenStringMaxNumber__then_returnSameNumber() {
        String maxString=MaxNumber.maxNumber("Apple","Banana","Peach","Mango","KKL");
        Assert.assertEquals("Peach",maxString);
    }
}
