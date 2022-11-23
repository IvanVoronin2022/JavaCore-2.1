import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        System.out.println("Вариант без stream:");
        mainWithoutStream(intList);
        System.out.println("Вариант c stream:");
        StreamMain.streamMain(intList);
    }

    public static void mainWithoutStream(List<Integer> list) {
        List<Integer> positiveAndEven = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > 0 && list.get(i)%2 == 0) {
                positiveAndEven.add(list.get(i));
            }
        }
        Collections.sort(positiveAndEven);
        for (int i = 0; i < positiveAndEven.size(); i++) {
            System.out.print(positiveAndEven.get(i) + " ");
        }
        System.out.println();
    }
}