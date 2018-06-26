import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;
/**
 * @autor Maksim Yunusov (mailto:cortezzz1987@gmail.com)
 * @version $Id$
 * @since 0.1.
 */
public class GluerTest {
    @Test
    public void whenArrayHas3Strings() {
        Gluer glue = new Gluer();
        String[] array = new String[] {"Я", " устал", " бухать."};
        String expected = "Я устал бухать.";
        String result = glue.addUp(array);
        assertThat(result, is(expected));
    }
}
