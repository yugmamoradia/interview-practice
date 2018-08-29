/**
 * Coding question 1: given an array of 1 and 0, count the minimum number of change in positions such that
 * all 1's are aligned to left and 0's to right. Positions can be changed only with the nearby 2 elements.
 */
public class NumberOfSwaps1n0 {
    public static void main(String[] args) {
        int[] arr = {1,0,0,0,1,1,1};
        System.out.println(getNumberOfSwaps(arr));
    }

    public static int getNumberOfSwaps(int[] input){
        int len = input.length;
        if(len <= 0 )
            return -1;
        int k= 0;
        int count = 0;  //final count of swaps
        int nextPos; //to determine the position of first 1 in the array
        while(input[k] == 0) // incrementing k till it finds the first 1 in the array, so the loop can start from nextOne index.
            k++;
        if(k == len)
            return 0;
        nextPos = k; //copying the kth value in nextOne as the start index for 'for' loop
        for(int i = k; i < len; i++){
            if(input[i] == 0){
                count += i - nextPos;
                nextPos++;
            }
        }
        return count;
    }
}
