import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        for (int i = 0, div = 10; i < 3; i++, div *= 10) {
            System.out.println(3797%div);
            System.out.println(3797/div);
        }
    }
}
