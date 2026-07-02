import java.util.*;

class leader {
    public static void main(String[] args) {
        int arr[] = {16, 17, 4, 3, 5, 2};
        int n = arr.length;

        ArrayList<Integer> leaders = new ArrayList<>();

        int max = arr[n - 1];
        leaders.add(max);

        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > max) {
                max = arr[i];
                leaders.add(max);
            }
        }

        for (int i = leaders.size() - 1; i >= 0; i--) {
            System.out.print(leaders.get(i) + " ");
        }
    }
}