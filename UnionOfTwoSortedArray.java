import java.util.ArrayList;
import java.util.HashSet;

//optimal soln
class TUF {
    static ArrayList<Integer> FindUnion(int arr1[], int arr2[], int n, int m) {
        int i = 0, j = 0; // pointers
        ArrayList<Integer> Union = new ArrayList<>(); // Uninon vector
        while (i < n && j < m) {
            if (arr1[i] <= arr2[j]) // Case 1 and 2
            {
                if (Union.size() == 0 || Union.get(Union.size() - 1) != arr1[i])
                    Union.add(arr1[i]);
                i++;
            } else // case 3
            {
                if (Union.size() == 0 || Union.get(Union.size() - 1) != arr2[j])
                    Union.add(arr2[j]);
                j++;
            }
        }
        while (i < n) // IF any element left in arr1
        {
            if (Union.get(Union.size() - 1) != arr1[i])
                Union.add(arr1[i]);
            i++;
        }
        while (j < m) // If any elements left in arr2
        {
            if (Union.get(Union.size() - 1) != arr2[j])
                Union.add(arr2[j]);
            j++;
        }
        return Union;
    }
}
    public class UnionOfTwoSortedArray {
        public static void main(String[] args) {
            int a1[] = {1, 1, 2, 3, 4, 5};
            int a2[] = {2, 3, 4, 5, 6};
            int n1 = 6;
            int n2 = 5;
            ArrayList<Integer> Union = TUF.FindUnion(a1, a2, n1, n2);
            System.out.println("Union of arr1 and arr2 is ");
            for (int val : Union)
                System.out.print(val + " ");
        }

    }

//class TUF {
//    static ArrayList<Integer> FindUnion(int arr1[], int arr2[], int n, int m) {
//        HashSet<Integer> s = new HashSet<>();
//        ArrayList<Integer> Union = new ArrayList<>();
//        for (int i = 0; i < n; i++)
//            s.add(arr1[i]);
//        for (int i = 0; i < m; i++)
//            s.add(arr2[i]);
//        for (int it : s)
//            Union.add(it);
//        return Union;
//    }
//}

//optimal solution

