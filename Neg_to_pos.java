package placements;
import java.util.*;
public class Neg_to_pos {
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = scan.nextInt();
        System.out.print("Enter array elements: ");
        int arr[] = new int[size];
        for(int i =0;i < size;i++){
            arr[i] = scan.nextInt();
        }
        int inx = 0;
        for(int i = 0;i < size;i++){
            if(arr[i] < 0){
                for(int j = i;j > inx;j--){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
                inx++;
            }
        }
        System.out.print("Result: ");
        for(int i = 0;i < size;i++){
            System.out.print(arr[i]+" ");
        }
        scan.close();
    }
}