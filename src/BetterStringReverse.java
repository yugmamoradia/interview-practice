
public class BetterStringReverse {
    public static void main(String[] args) {
        System.out.println(reverseString("apple"));
        System.out.println(reverseString("abcdef"));
    }

    public static String reverseString(String input){
        if(input == null)
            throw new NullPointerException("Input was Null");
        else if(input == "")
            return "";
        else{
            char temp;
            char[] resultArray = input.toCharArray();
            int left;
            int right = resultArray.length - 1;
            for(left = 0; left < right ; left++, right--){
                temp = resultArray[left];
                resultArray[left] = resultArray[right];
                resultArray[right] = temp;
            }
            return new String(resultArray);
        }
    }
}
