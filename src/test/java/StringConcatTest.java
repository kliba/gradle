import com.matritellabs.utama.stringconcat.StringConcat;
import org.junit.Assert;
import org.junit.Test;

public class StringConcatTest {

    @Test
    public void concatTest() {
        Assert.assertEquals("Majom", StringConcat.concat("Ma", "jom"));
    }
}
