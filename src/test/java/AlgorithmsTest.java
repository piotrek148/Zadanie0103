import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * ...comment class...
 *
 * @author dagmarakitkowska@gmail.com
 * @since 01.03.2020
 */

class AlgorithmsTest {

    private Algorithms algorithms;

    @BeforeEach
    public void setup(){
        algorithms = new Algorithms();
    }
    @Test
    public void testNWD(){
        int result = algorithms.nwd(2,3);
        assertEquals(result, 6);
    }
    @Test
    public void testABS(){
        int result = algorithms.abs(-5);
        assertEquals(result, 5);
    }
    @Test
    public void testIsPalindrom(){
        boolean result = algorithms.isPalindrom("kajak");
        assertEquals(result, true);
    }


}