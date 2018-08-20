
public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 8, 12, 27, 33, 36, 68, 70};
        System.out.println(binarySearchElement(arr, 0, arr.length -1, 68));

    }

    public static int binarySearchElement(int arr[], int left, int right, int element){
        if(right>=1){
            int mid = left + (right - 1) / 2;
            if (arr[mid] == element)
                return element;
            if(arr[mid] > element)
                return binarySearchElement(arr, left, mid-1, element);
            if(arr[mid] < element)
                return binarySearchElement(arr, mid+1, right, element);
        }
        return -1;
    }
}
