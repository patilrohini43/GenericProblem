import com.bridgelabz.com.MaxNumber;
import org.junit.Assert;
import org.junit.Test;

public class MaxNumberTest {

    @Test
    public void givenIntegerNumber() {
        Assert.assertEquals(6,MaxNumber.maxNumber(4,2,6),00);
    }
    @Test
    public void givenFloatNumber() {
        Assert.assertEquals(4.2f, MaxNumber.maxNumber(4.2f, 2.4f, 4.0f),00);
    }

    @Test
    public void givenString(){
        Assert.assertEquals("0","Peach",MaxNumber.maxNumber("Apple","Peach","Banana"));
    }
}
