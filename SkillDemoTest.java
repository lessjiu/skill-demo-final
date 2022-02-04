import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTest {
    @Test
    public void subtractTest() {
        assertEquals(5, SkillDemo.subtract(10, 1)); //should fail
    }
}
