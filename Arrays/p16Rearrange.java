import java.util.ArrayList;

public class p16Rearrange {

    public static void Rearrange(int[] arr) {
        ArrayList<Integer> p = new ArrayList<>();
        ArrayList<Integer> n = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                p.add(arr[i]);
            } else {
                n.add(arr[i]);
            }
        }

        int k = 0;
        int j = 0;

        ArrayList<Integer> ans = new ArrayList<>();

        while (k < p.size() && j < n.size()) {
            ans.add(p.get(k));

            ans.add(n.get(j));
            k++;
            j++;
        }
        while (k < p.size()) {
            ans.add(p.get(k));
            k++;
        }
        while (j < n.size()) {
            ans.add(n.get(j));
            j++;
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {

        int arr[] = { 1, 2, 3, -4, -1, 4 };
        Rearrange(arr);
        int[] arr2 = { -5, -2, 5, 2, 4, 7, 1, 8, 0, -8 };

        Rearrange(arr2);
    }
}
