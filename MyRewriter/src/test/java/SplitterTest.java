import org.junit.Test;


import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;
public class SplitterTest {
    @Test
    // тестим класс разбивки.
    public void whenSplitForQuestion() {
        Splitter split = new Splitter();
        String[] result = split.split("Do you mean a drink? But, I don't want drink vodka. Hey maaan, c'mon! What...");
        String[] expected = new String[] {"Do you mean a drink", " But, I don't want drink vodka", " Hey maaan, c'mon", " What"};
        assertThat(result, is(expected));
    }
}
