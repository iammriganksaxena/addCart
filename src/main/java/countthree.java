public class countthree {

    public static void main(String[] args) {

        int count2=0;
        int count=0;
        int count1=0;
        for(int i =1;i<100;i++){
            int a = i/10;
            int b = i%10;
            if (a == 3){
                count ++;
            }if (b == 3){
                count1++;
            }
            count2 = count + count1;
        }
        System.out.println(count2);
    }
}
