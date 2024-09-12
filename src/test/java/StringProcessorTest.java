import org.example.StringProcessor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class StringProcessorTest {
    @Test
    void testProcessString() {
        assertEquals("aabbbad", StringProcessor.processString("aabcccbbad"));
        assertEquals("abbbad", StringProcessor.processString("abcccbad"));
    }
}