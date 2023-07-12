public class srtarray {

    public static void main(String[] args) {

        int arr[] = {5, 6, 7, 4, 4, 5, 6, 7, 8};
        System.out.println("at position 1 the building is 5");
        for (int i = 0,j=i+1; i < arr.length-1;i++,j++){
            if (arr[j]>arr[i]) {
                System.out.println("at position "+(j+1)+" the building is "+arr[j]);
            } if(arr[j]==arr[i]) {
                continue;
            }
        }
    }
}
