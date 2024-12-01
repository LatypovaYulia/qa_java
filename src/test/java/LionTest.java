import com.example.Lion;
import org.junit.Test;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

public class LionTest {

    @Test
    public void doesHaveManeForMaleHasManeTest() throws Exception {
        Lion lion = new Lion("Самец");
        assertTrue("У самца должна быть грива", lion.doesHaveMane());
    }

    @Test
    public void doesHaveManeForFemaleDoesnotHaveManeTest() throws Exception {
        Lion lion = new Lion("Самка");
        assertFalse("У самки не должно быть гривы", lion.doesHaveMane());
    }

    @Test
    public void doesHaveManeForExceptionTest() {
        try {
            new Lion("Небинарный");
            //fail("Ожидалось исключение, но оно не было выброшено.");
        } catch (Exception e) {
            assertEquals("Неверное сообщение при создании исключения", "Используйте допустимые значения пола животного - самец или самка", e.getMessage());
        }
    }
}
