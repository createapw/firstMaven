import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Assignment3Q1 {
    public static void main(String[] arg) {
        List<Integer> myList = new ArrayList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(10);
        Map<Character, Integer> map = new HashMap<>();
        map.put('a', 1);
        map.put('b', 2);
        map.put('c', 3);
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < myList.size(); i++) {
            boolean flag = false;
            for (Map.Entry<Character, Integer> entry : map.entrySet()) {
                if (entry.getValue() == myList.get(i)) {
                    flag = true;
                }
            }
            if (!flag) {
                result.add(myList.get(i));
            }
        }
        System.out.println(result);
    }
}
