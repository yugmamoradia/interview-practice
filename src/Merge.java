public class Merge {
    public static void main(String[] args) {
        int[] arr = {4,8,6,1,9,2,5,1};

        Merge m = new Merge();
        m. mergeSort(arr, 0 , arr.length-1);
        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i] + " ");
        }

    }
    public static void mergeSort(int[] arr, int left, int right){
        if(left < right) {
            int mid = left + right / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            mergeArr(arr, left, right, mid);
        }
    }

    public static void mergeArr(int[] arr, int left, int right, int mid){
        int[] result = new int[arr.length];
        int low = left;
        int high = mid+1;
        int k = 0;
        while(low <= mid && high <= right) {
            if (arr[low] < arr[high]) {
                result[k++] = arr[low++];
            } else if(arr[high] < arr[low]) {
                result[k++] = arr[high++];
            }
        }
        while(low <= mid){
            result[k++] = arr[low++];
        }
        while(high <= right) {
            result[k++] = arr[high++];
        }

    }

}
