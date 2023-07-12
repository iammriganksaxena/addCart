import java.util.ArrayList;

public class list {

    public static void main(String[] args) {
        int arr[] = new int[100];
        for(int i=0;i<arr.length;i++){
            arr[i]=i;
        }
        showArrayValues(arr);
        insertValAtIndex(arr, 20, 2);
        showArrayValues(arr);
    }

    public static void insertValAtIndex(int arr[],int value, int index){
        arr[index]=value;
    }

    public static void showArrayValues(int arr[]){
        for(int i=0;i<arr.length;i++) {
            System.out.println(arr[i]);
        }
    }
}
