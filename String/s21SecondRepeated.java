import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class s21SecondRepeated {
    public static void main(String[] args) {

        String str[] = { "aaa", "bbb", "ccc", "bbb", "aaa", "aaa" };
        System.out.println( RepeatSecond(str));
        String st2[] = { "geek", "for", "geek", "for", "geek", "aaa" };
        System.out.println(RepeatSecond(st2));

        // String str[] = { "aaa", "bbb", "ccc", "bbb", "aaa", "aaa" };
        // System.out.println(Repeat(str));
        // String st2[] = { "geek", "for", "geek", "for", "geek", "aaa" };
        // System.out.println(Repeat(st2));

    }

    public static String RepeatSecond(String str[]) {

        HashMap<String, Integer> h = new HashMap<>();
        for (int i = 0; i < str.length; i++) {
            h.put(str[i], h.getOrDefault(str[i], 0) + 1);
        }

        List<Map.Entry<String, Integer>> Sorted = new ArrayList<>(h.entrySet());
        Sorted.sort((e1, e2) -> e2.getValue() - e1.getValue()); // his sort in desendind order

        if (Sorted.size() < 2) {
            return "";
        }

        return Sorted.get(1).getKey();

    }

    /// My solution
    public static String Repeat(String str[]) {
        // System.out.println(Arrays.toString(str));
        HashMap<String, Integer> h = new HashMap<>();
        for (int i = 0; i < str.length; i++) {
            h.put(str[i], h.getOrDefault(str[i], 0) + 1);
        }

        if (h.size() < 2) {
            return "";
        }
        // System.out.println(h);

        int arr[] = new int[h.size()];
        int index = 0;
        for (Integer v : h.values()) {
            arr[index] = v;
            index++;
        }

        Arrays.sort(arr);
        // System.out.println(Arrays.toString(arr));

        int i = arr[arr.length - 2];

        for (Map.Entry<String, Integer> entry : h.entrySet()) {
            if (entry.getValue().equals(i)) {
                String k = entry.getKey();
                // Use the key here
                return k;
            }
        }
        return "";
    }

}
