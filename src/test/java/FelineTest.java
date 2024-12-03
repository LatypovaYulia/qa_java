import com.example.Feline;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class FelineTest {


    @Test
    public void eatMeatAnimalKindReturnFoodTest() throws Exception {
        Feline feline = new Feline();
        List<String> expectedResult = List.of("Животные", "Птицы", "Рыба");
        List<String> actualResult = feline.eatMeat();
        assertEquals("Фактический результат не вывел список: " + expectedResult, expectedResult, actualResult);
    }

    @Test
    public void getFamilyReturnCorrectValueTest() {
        Feline feline = new Feline();
        String expectedResult = "Кошачьи";
        String actualResult = feline.getFamily();
        assertEquals("Фактический результат не вывел значение: " + expectedResult, expectedResult, actualResult);
    }

    @Test
    public void getKittensWithoutKittensCountReturn1Test() {
        Feline feline = new Feline();
        int expectedResult = 1;
        int actualResult = feline.getKittens();
        assertEquals("Количество котят не равно 1", expectedResult, actualResult);
    }

}
