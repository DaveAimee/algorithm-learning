package chapter7_string.excercise;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;

public class RestoreIpAddressTest {
    @Test
    public void testRestoreIpAddresses() {
        RestoreIpAddress r = new RestoreIpAddress();
        assertEquals(Arrays.asList("255.255.11.135","255.255.111.35"),r.restoreIpAddresses("25525511135"));
        assertEquals(Arrays.asList("0.0.0.0"),r.restoreIpAddresses("0000"));
    }
}
