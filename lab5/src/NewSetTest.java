import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by subtselnyi on 26.04.16.
 */
public class NewSetTest {
    NewSet obj = new  NewSet();
    @Test
    public void isEmpty() throws Exception {
        boolean actual = obj.isEmpty();
        assertTrue(actual);
    }

    @Test
    public void remove() throws Exception {
        Rock r = new Rock();
        r = new Rock();
        r.rocksong("Liebe", 4.08, "rock");
        obj.add(r);
        boolean actual = obj.remove(1);
        assertTrue(actual);
    }
}