public class reverseCap {

    public static void main(String[] args) {

        String str = "Vikram Betal";
        StringBuffer sb = new StringBuffer(str);
        String words = sb.reverse().toString();
        String newStr[] = words.split(" ");
        System.out.println(newStr);
        String first = newStr[0].trim().toLowerCase();
        System.out.println(first);
        String second= newStr[1].trim().toLowerCase();
        System.out.println(second);
        String newFirst = first.replaceFirst("l","L");
        System.out.println(newFirst);
        String newSecond = second.replaceFirst("m","M");
        System.out.println(newSecond);
        System.out.println(newFirst+" "+newSecond);

    }
}
