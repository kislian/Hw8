import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        byte [] arr=new byte[] {1,2,3};
        System.out.println(Arrays.toString(arr));
        float [] arrFl={1.57f,7.654f,9.986f};
        System.out.println(Arrays.toString(arrFl));
        int [] arrSh={1000,2000,3000,4000};
        System.out.println(Arrays.toString(arrSh));
        System.out.println("Задание 2");
        for (int index = 0; index < arr.length; index++) {
            System.out.print(arr[index]);
            if (index < arr.length - 1) {
                System.out.print(" , ");
            }
        }
        System.out.println("");
        for (int i = 0; i < arrFl.length; i++) {
            System.out.print(arrFl[i]);
            if (i == arrFl.length - 1) break;
            System.out.print(" , ");
        }
        System.out.println("");
        for (int j = 0; j < arrSh.length; j++) {
            System.out.print(arrSh[j]);
            if (j == arrSh.length - 1) break;
            System.out.print(" , ");
        }
        System.out.println("");
        System.out.println("Задание 3");
        for (int index = arr.length - 1; index >= 0; index--) {
            System.out.print(arr[index]);
            if (index > 0) {
                System.out.print(" , ");
            }
        }
        System.out.println("");
        for (int i = arrFl.length - 1; i >= 0; i--) {
            System.out.print(arrFl[i]);
            if (i == 0) break;
            System.out.print(" , ");
        }
        System.out.println("");
        for (int j = arrSh.length - 1; j >= 0; j--) {
            System.out.print(arrSh[j]);
            if (j == 0) break;
            System.out.print(" , ");
        }
        System.out.println("");
        System.out.println("Задание 4");
        long [] arrLng=new long[] {1,2,3,4,5};
        for (int i = 0; i < arrLng.length; i++) {
            if (arrLng[i] % 2 != 0) {
                arrLng[i] = arrLng[i] + 1;
            }
            System.out.print(" ячейка с индексом " + i + " =" + arrLng[i]);
            if (i == arrLng.length - 1) break;
            System.out.print(" , ");
        }
    }
}