package chapter7_string.excercise;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class StringMultipleTest {
    @Test
    public void testMultiply() {
        StringMultiple sm = new StringMultiple();
        assertEquals("56088",sm.multiply("123", "456"));
    }
}
