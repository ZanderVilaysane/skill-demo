import java.beans.Transient;


import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTest {
    @Test
    public void subtraction() {
        assertEquals(14, SkillDemo.subtract(17,3));
    }
}
