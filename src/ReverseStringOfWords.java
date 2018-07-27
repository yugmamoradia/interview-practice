public class ReverseStringOfWords {
    public static void main(String[] args) {
        String input = "   This is my   School";
        System.out.println(reverseWords(input));
    }
    public static String reverseWords(String input) {
        int i;
        //First we want to remove all the leading and trailing spaces from the input string then we want to replace all
        //the space occurrences in the trimmed String with just one space and make it a normal String.
        String str = input.trim().replaceAll(" +", " ");
        StringBuilder sb = new StringBuilder(); //Creating a Stringbuilder to move the words in the string
        String[] temp = str.split(" "); //Store all the words in String array using Split function.

        for (i = temp.length - 1 ; i>= 0; i--) //Appending from the last word to the beginning of StrinBuilder
        {
            sb.append(temp[i]);
            sb.append(" "); //Appending the space after each word
        }
        return sb.length() == 0 ? "" : sb.substring(0, sb.length() - 1); //returning the String formed in the StringBuilder as final reverse String
    }
}
