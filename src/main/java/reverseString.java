public class reverseString {

    public static void main(String[] args) {

        String str = "Ashish Kumar";
        StringBuffer sf = new StringBuffer(str);
        System.out.println(sf.reverse());

        String[] newStr = str.split(" ");
        newStr[0].toUpperCase();
    }
}
