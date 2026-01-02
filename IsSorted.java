public class IsSorted {

    public static boolean isSorted(int[] a) {
        return isSortedHelper(a, 0);
    }

    private static boolean isSortedHelper(int[] a, int i) {
        if (i >= a.length - 1) {
            return true;
        }

        if (a[i] > a[i + 1]) {
            return false;
        }

        return isSortedHelper(a, i + 1);
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 5};
        int[] arr2 = {1, 3, 2};
        int[] arr3 = {};
        int[] arr4 = {7};

        System.out.println(isSorted(arr1)); 
        System.out.println(isSorted(arr2));
        System.out.println(isSorted(arr3)); 
        System.out.println(isSorted(arr4));
    }
}
