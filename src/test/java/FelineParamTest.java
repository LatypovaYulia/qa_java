import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class FelineParamTest {

    private final int expectedResult;
    private final int kittensCount;

    public FelineParamTest(int expectedResult, int kittensCount) {
        this.expectedResult = expectedResult;
        this.kittensCount = kittensCount;
    }

    @Parameterized.Parameters(name = "expectedResult = {0}, kittensCount = {1}")
    public static Object[][] getData(){
        return new Object[][]{
                {5, 5},
                {0, 0},
                {35, 35}
        };
    }

    @Test
    public void getKittensReturnKittensCountTest() {
        Feline feline = new Feline();
        int actualResult = feline.getKittens(kittensCount);
        assertEquals("Фактичесакий результат = "+ expectedResult + ", а должен быть = " + actualResult, expectedResult, actualResult);
    }
}

