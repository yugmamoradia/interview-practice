
public class MergeSort {
    public static void main(String[] args) {
        MergeSort m= new MergeSort();

        int[] arr = {3, 2, 4, 5, 9, 7, 11, 1, 22};
        System.out.println("The unSorted array is: ");
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }

        System.out.println();

        m.mergeSort(arr,0, arr.length-1);
        System.out.println("The Sorted array is: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + ", ");
        }
    }

    public static void mergeSort(int inputArr[], int low, int high){
        if(low < high){
            int mid = (low + high)/2;
            mergeSort(inputArr, low, mid);
            mergeSort(inputArr, mid+1, high);
            merge(inputArr, low, mid, high);
        }
    }

    public static void merge(int arr[], int low, int mid, int high){
        int lowLeft = low;
        int lowRight = mid+1;
        int tempVar = 0;
        int[] tempResult = new int[arr.length];
        while(lowLeft <= mid && lowRight <= high){
            tempResult[tempVar++] = arr[lowLeft] < arr[lowRight] ? arr[lowLeft++] : arr[lowRight++];
        }
        while(lowLeft <= mid)
            tempResult[tempVar++] = arr[lowLeft++];
        while(lowRight <= high)
            tempResult[tempVar++] = arr[lowRight++];
        tempVar = 0;
        for(int i = low; i<= high; i++){
            arr[i] = tempResult[tempVar++];
        }
    }

}
