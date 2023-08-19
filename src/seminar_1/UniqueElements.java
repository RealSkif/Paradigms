package seminar_1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class UniqueElements {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i);
            list.add(i);
            list.add(i);
        }
        Set<Integer> set = new HashSet<>(list);
    }
}
