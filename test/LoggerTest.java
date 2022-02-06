
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class LoggerTest {

    @Test
    public void shouldBeIdenticals() {
        Logger log1 = Logger.getLogger();
        Logger log2 = Logger.getLogger();
        assertEquals(log1, log2);
    }

}
