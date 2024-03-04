import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        byte [] arr=new byte[] {1,2,3};
        System.out.println(Arrays.toString(arr));
        float [] arr_fl={1.57f,7.654f,9.986f};
        System.out.println(Arrays.toString(arr_fl));
        int [] arr_sh={1000,2000,3000,4000};
        System.out.println(Arrays.toString(arr_sh));
        System.out.println("Задание 2");
        for (int index=0;index<arr.length;index++) {
            System.out.print(arr[index]);
            if (index < arr.length - 1) System.out.print(" , ");
        }
        System.out.println("");
        for (int i=0;i<arr_fl.length;i++){
             System.out.print(arr_fl[i]);
             if (i == arr_fl.length - 1)  break;
            System.out.print(" , ");
        }
        System.out.println("");
        for (int j=0;j<arr_sh.length;j++){
            System.out.print(arr_sh[j]);
            if (j == arr_sh.length - 1)  break;
            System.out.print(" , ");
        }
        System.out.println("");
        System.out.println("Задание 3");
        for (int index=arr.length-1;index>=0;index--) {
            System.out.print(arr[index]);
            if (index >  0) System.out.print(" , ");
        }
        System.out.println("");
        for (int i=arr_fl.length-1;i>=0;i--){
            System.out.print(arr_fl[i]);
            if (i ==0)  break;
            System.out.print(" , ");
        }
        System.out.println("");
        for (int j=arr_sh.length-1;j>=0;j--) {
            System.out.print(arr_sh[j]);
            if (j == 0) break;
            System.out.print(" , ");
        }
        System.out.println("");
        System.out.println("Задание 4");
        long [] arr_ln=new long[] {1,2,3,4,5};
        for (int i=0;i<arr_ln.length;i++) {
        if (arr_ln[i]%2 != 0) arr_ln[i]=arr_ln[i]+1;
           System.out.print((i+1)+" элемент массива  ="+ arr_ln[i]);
            if (i == arr_ln.length-1) break;
            System.out.print(" , ");
        }
    }
}