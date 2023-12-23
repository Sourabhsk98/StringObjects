package NewKeywordExample;

public class NewKeyword {

        public static void main(String args[]){
            String str = new String("Hello, World!");

            // Displaying the String object
            System.out.println("String created using new keyword: " + str);

            // Another example with a char array
            char[] charArray = {'J', 'a', 'v', 'a'};
            String strFromArray = new String(charArray);

            // Displaying the String object created from a char array
            System.out.println("String created from char array: " + strFromArray);
        }}


