package SS2BT1;

import java.util.Scanner;

public class ChenPhanTu {
    public static void main(String[] args) {
        int arr[] = new int[10];
        arr[0] = 10;
        arr[1] = 4;
        arr[2] = 6 ;
        arr[3] = 7;
        arr[4] = 8;
        Scanner scn = new Scanner(System.in);
        System.out.println("Mời nhập vào giá trị cần thêm : ");
        int value = scn.nextInt();
        System.out.println("Mời nhập vào vị trí cần thêm : ");
        int index = scn.nextInt();

        if (index < 0 || index >arr.length) {
            System.out.println("Bạn nhập sai nên không thể thêm");
        }
        inputValue(arr, index,value);
        xuatMang(arr);


    }
    private static void xuatMang(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +" ");
        }
    }

    private static void inputValue(int arr[] , int index , int value) {
        int indexMax = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                indexMax = i -1;
            }
        }

        for (int i = indexMax +1 ; i >index ; i--) {
            arr[i] = arr[i-1];
        }
        arr[index] = value;
    }
}
