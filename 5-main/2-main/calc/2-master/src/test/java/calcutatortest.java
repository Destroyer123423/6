import org.junit.jupiter.api.Test;
import ru.ac.uniyar.mf.lizunova.Main;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class calcutatortest {
    @Test
    void addition(){
        String actual = Main.calculate("2", "+", "1");
            assertEquals("3", actual);
    }
    @Test
    void multiplication(){
        String actual = Main.calculate("2", "*", "1");
        assertEquals("2", actual);
    }@Test
    void otn(){
        String actual = Main.calculate("3", "/", "0");
        assertEquals("На ноль делить нельзя!", actual);
    }
    @Test
    void nonadd(){
        String actual = Main.calculate("9", "-", "7");
        assertEquals("2", actual);
    }
    @Test
    void otn1(){
        String actual = Main.calculate("3", "/", "1");
        assertEquals("`3/1", actual);
    }
}
