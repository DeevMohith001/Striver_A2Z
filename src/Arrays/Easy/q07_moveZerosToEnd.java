package Arrays.Easy;
import java.util.Arrays;
public class q07_moveZerosToEnd {
    public static void main(String[] args) {
        int[] arr = {0, 10, 22, 0, 8, 0, 5};
        moveZerosToEnd(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void moveZerosToEnd(int[] arr){
        int nz = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0){
                int temp = arr[nz];
                arr[nz] = arr[i];
                arr[i] = temp;
                nz++;
            }
        }
    }
}
