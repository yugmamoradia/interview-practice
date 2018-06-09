/**
 * Created by ravi on 4/24/18.
 */
public class StringReverese {
    public static void main(String[] args) {

        String input = "apple";
        String output = reverseString(input);
        System.out.println(output);

    }

    public static String reverseString(String input){

        char[] inputArray = input.toCharArray();
        if(input != null || input.length()!= 0) {
            if (input.length()%2 == 1) {
                // If block for Odd string reverse
                char temp;
                int strLength = input.length();
                int midpoint = strLength / 2;
                int i, j;
                for (i = 0, j = strLength - 1; i <= midpoint && j >= midpoint + 1; i++, j--) {
                    temp = inputArray[i];
                    inputArray[i] = inputArray[j];
                    inputArray[j] = temp;
                }
                return new String(inputArray);  // toString() will create a new string based on individual ascii chars
            }

            else if(input.length()%2 == 0){
                // If block for even string reverse
                char temp;
                int strLength = input.length();
                int midpoint = strLength / 2;
                int i, j;
                for (i = 0, j = strLength - 1; i <midpoint && j >= midpoint; i++, j--) {

                    temp = inputArray[i];
                    inputArray[i] = inputArray[j];
                    inputArray[j] = temp;
                }
                return new String(inputArray);  // toString() will create a new string based on individual ascii chars
            }
        }
        return null;
    }
}
