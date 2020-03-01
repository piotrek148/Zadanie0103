import java.util.List;
import java.util.Optional;
import java.util.OptionalLong;

/**
 * ...comment class...
 *
 * @author dagmarakitkowska@gmail.com
 * @since 01.03.2020
 */
final class Algorithms {
    public int nwd(int a, int b) {
        return 0;
    }

    public int abs(int wartosc) {
        return 0;
    }

//    OptionalLongsumOf(List<Integer>) –zwraca sume liczb z listy(np. dla [1,2,3] zwróci 6)
    public static Optional<Long> sumOf(List<Long> lista) {
        return lista.stream()
                .reduce((a,b)->a+b);
    }
}