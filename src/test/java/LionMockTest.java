import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class LionMockTest {
    @Mock
    Feline felineMock;

    @Test
    public void getKittensLionWithoutKittensCountReturn1Test() {
        Lion lion = new Lion(felineMock);
        int expectedResult = 1;
        Mockito.when(felineMock.getKittens()).thenReturn(1);
        int actualResult = lion.getKittens();
        System.out.println("actualResult = " + actualResult);
        assertEquals("Количество котят не равно 1", expectedResult, actualResult);
    }

    @Test
    public void getFoodAnimalKindReturnFoodTest() throws Exception {
        Lion lion = new Lion(felineMock);
        List<String> expectedResult = List.of("Животные", "Птицы", "Рыба");
        Mockito.when(felineMock.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> actualResult = lion.getFood();
        System.out.println("actualResult = " + actualResult);
        assertEquals("Фактический результат не вывел список: " + expectedResult, expectedResult, actualResult);
    }
}
