import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestOffByN{
    static CharacterComparator t = new OffByN(5);
    @Test
    public void check1(){
        assertEquals(true, t.equalChars('a', 'f'));
        assertEquals(false, t.equalChars('a', 'c'));
    }
}