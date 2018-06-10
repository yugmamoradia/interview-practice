
public class StringToNumber {
    public static void main(String[] args) {
        System.out.println(convertString("0"));

    }
    public static Integer convertString(String input){

        if(input!= null || !input.equals("")){
            char[] inputString = input.toCharArray();
            int result = 0;

            boolean isNegative = false;
            if(inputString[0] == '-')
                isNegative = true;

            for(int i = 0; i<inputString.length; i++){
                if(inputString[i] == '-')
                    continue;
                if(inputString[i]<='0' || inputString[i]>='9')
                    throw new IllegalArgumentException("Not a valid numeric number");
                int value = inputString[i] - '0'; //subtracting thSystem.out.println("Current value: " +value);
                result = result*10 + value;                 //calculating the result by appending each character to integer
            }
            return isNegative ? result*-1 : result;
        }
        else    // covers null and ""
            throw new IllegalArgumentException("Not a valid input");

    }
}
