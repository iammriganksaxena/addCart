public class rev {

    public static void main(String[] args) {
        String word = "Apple is a fruit";
        String[] newword = word.split(" ");

        System.out.println(reverseString(newword[0])+" "+reverseString(newword[1])+" "+reverseString(newword[2])+" "+reverseString(newword[3]));
    }

    public static String reverseString(String newword){
        String rev="";
        int len = newword.length();
        for(int i=len-1;i>=0;i--){
            rev = rev + newword.charAt(i);
        }
        return rev;
    }
}
