import static org.junit.Assert.*;
import org.junit.*;

public class AdditionTest {
    @Test
    public void testAddition() {
        int i = 1;
        int j = 1;
        assertEquals(2, Addition.Add(i,j));
    }
}