import com.bridgelabz.com.MaxNumber;
import org.junit.Assert;
import org.junit.Test;

public class MaxNumberTest {

    @Test
    public void givenMaxNumber_atFirstPosition_then_returnSameNumber() {
        int maxNumber=MaxNumber.findMaxNumber(10,5,2);
        Assert.assertEquals(10,maxNumber);
    }


    @Test
    public void givenMaxNumber_atSecondPosition_then_returnSameNumber() {
        int maxNumber=MaxNumber.findMaxNumber(10,15,2);
        Assert.assertEquals(15,maxNumber);
    }
}
