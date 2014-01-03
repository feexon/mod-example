import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;
import static sun.util.calendar.CalendarUtils.mod;

/**
 * @author yaho
 * @version 1.0 14-1-3,下午10:22
 *          todo:
 *          mod(1)=1
 *          mod(81)=1
 *          mod(0)=80
 */
public class ModExampleTest {
    @Test
    public void returnInRangedNDirectly() throws Exception {
        assertThat(mod(1), equalTo(1));
        assertThat(mod(80), equalTo(80));
    }

    private int mod(int n) {
        return n;
    }
}
