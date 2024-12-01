import com.example.Cat;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CatMockTest {

    @Mock
    private Feline felineMock;

    @Test
    public void getSoundReturnCorrectSoundTest() {
        Cat cat = new Cat(felineMock);
        String expectedResult = "Мяу";
        String actualResult = cat.getSound();
        System.out.println("actualResult = " + actualResult);
        assertEquals("Фактический результат не вывел значение: " + expectedResult, expectedResult, actualResult);
    }


    @Test
    public void getFoodReturnsCorrectFoodTest() throws Exception {
        Cat cat = new Cat(felineMock);
        List<String> expectedResult = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(felineMock.eatMeat()).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> actualResult = cat.getFood();
        System.out.println("actualResult = " + actualResult);
        assertEquals("Фактический результат не вывел значение: " + expectedResult, expectedResult, actualResult);

    }


}
