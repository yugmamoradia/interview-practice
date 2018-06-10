public class ShiftElementsInArray {

    public static void main(String[] args) {
        int[] arr = {2,4,6,9,11,5,6,8};
        int result[] = rotateArray(arr, 4);
        for(int i= 0; i<result.length; i++) {
            System.out.print(result[i]+ " ");
        }

    }
    public static int[] rotateArray( int[] arr, int position){
            int[] resultArray = new int[arr.length];
            int k = 0;
            for (int i = position; i < arr.length; i++) {
                resultArray[k] = arr[i];
                k++;
            }

            for (int j = 0; j < position; j++) {
                resultArray[k++] = arr[j];
            }

            return resultArray;
        }
}
