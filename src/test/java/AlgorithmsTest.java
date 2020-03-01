import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Optional;

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
    public void testsumOf() {
        List<Long> dane = List.of(1l,2l,3l,4l,5l,6l);
        Optional<Long> result = algorithms.sumOf(dane);
        Long aLong = result.get();
        assertEquals(aLong,21);
    }

}