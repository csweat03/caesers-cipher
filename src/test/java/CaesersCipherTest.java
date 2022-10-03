import me.christian.caesers_cipher.CaesersCipher;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CaesersCipherTest {

    @Test
    void testCipheredMessageWithOffsetOf5() {
        CaesersCipher caesersCipher = new CaesersCipher("this is a test with an offset of 5", 5);
        assertEquals("ymnx nx f yjxy bnym fs tkkxjy tk 5", caesersCipher.encrypt());
    }

    @Test
    void testCipheredMessageWithOffsetOf0() {
        CaesersCipher caesersCipher = new CaesersCipher("this is a test with an offset of 0", 0);
        assertEquals("this is a test with an offset of 0", caesersCipher.encrypt());
    }

    @Test
    void testEmptyCipherMessage() {
        CaesersCipher caesersCipher = new CaesersCipher("", 0);
        assertEquals("", caesersCipher.encrypt());
    }

    @Test
    void testDecipheredMessageWithOffsetOf5() {
        CaesersCipher caesersCipher = new CaesersCipher("ymnx nx f yjxy bnym fs tkkxjy tk 5", 5);
        assertEquals("this is a test with an offset of 5", caesersCipher.decrypt());
    }

    @Test
    void testDecipheredMessageWithOffsetOf0() {
        CaesersCipher caesersCipher = new CaesersCipher("this is a test with an offset of 0", 0);
        assertEquals("this is a test with an offset of 0", caesersCipher.decrypt());
    }

    @Test
    void testEmptyDecipherMessage() {
        CaesersCipher caesersCipher = new CaesersCipher("", 0);
        assertEquals("", caesersCipher.decrypt());
    }

}
