import core.AbstractCommon;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;


@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@ExtendWith(TestResultLogger.class)
public class BaseTest extends AbstractCommon {

    @BeforeAll
    public void setUp()
    {
       createBrowser();
    }
    @AfterAll
    public void tearDown(){
        quitBrowser();
    }
}