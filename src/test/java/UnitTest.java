/**
 * Created by babdus on 5/9/16.
 */

import org.junit.Test;

import static org.mockito.Mockito.*;

public class UnitTest {

    @Test
    public void is_two_plus_two_four() {
        assert (2 + 2 == 4);
    }

    @Test
    public void to_kill_a_mockingbird() {
        ToKillA mocking = mock(ToKillA.class);
        when(mocking.bird(0)).thenReturn("Harper Lee");
        assert(mocking.bird(0) == "Harper Lee");
    }
}