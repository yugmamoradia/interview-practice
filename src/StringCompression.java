public class StringCompression {
    public static void main(String[] args) {
        System.out.println(compressString("aaaabbbbcccdddeee"));
    }
    public static String compressString(String input){
        StringBuffer result = new StringBuffer();
        char last = input.charAt(0);
        if(input == null)
            throw new NullPointerException("Input is null");
        // Always use equals method when comparing String values
        if(input.equals(""))
            return "Input is empty";
        int count = 0;
        for(int i = 0; i < input.length(); i++){
            if(input.charAt(i) == last){
                count++;
            }
            else{
                result.append(last + "" + count);
                count = 1;
            }
            last = input.charAt(i);
        }
        result.append(last + "" +count);

        String resultString = result.toString();

        if(resultString.length() <= input.length())
            return resultString;
        else
            return input;
    }
}

