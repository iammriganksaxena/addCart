public class E {

    public static void main(String[] args) {
        int arr[] = {4, 5, 7, 9, 2,10,3,12};
        int len = arr.length;
        int largeNum=0;
        for(int i=0,j=1;i<len-1;i++,j++){
            if(arr[i]>arr[j]){
                largeNum = arr[i];
            }
        }
        System.out.println(largeNum);
    }
}
