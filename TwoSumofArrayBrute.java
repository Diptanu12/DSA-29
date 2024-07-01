import java.util.Arrays;
import java.util.Scanner;

public class TwoSumofArrayBrute {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {2, 6, 5, 8, 15};
        int n = arr.length;
        System.out.println("Enter Target :- ");
        int k = sc.nextInt();
        System.out.println(checkTwoSum(arr, n, k));

    }

    static String checkTwoSum(int[] arr, int n, int k) {

//        for (int i = 0; i < n; i++) {
//            for (int j = i + 1; j < n; j++) {
//                if (arr[i] + arr[j] == k) {
//                    return "YES TARGET IS HERE WHEN ADD TWO ELEMENT";
//                }
//
//            }
//
//        }
//        return "NO TARGET IS HERE WHEN ADD TWO ELEMENT";

        //optimal solution
        int l = 0;
        int r = n - 1;
        Arrays.sort(arr);
        while (l < r) {
            int sum = arr[l] + arr[r];
            if (sum == k) {
                return "YES";
            } else if (sum < k) {
                l++;
            } else {
                r--;
            }
        }
        return "No";
    }
}