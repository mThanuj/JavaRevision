import java.util.ArrayList;
import java.util.List;

public class CollectionsExample {

    static void main() {

        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        List<Integer> newList = list.stream()
                                    .filter((element) -> element == 5)
                                    .toList();

        System.out.println(newList);

    }

}
