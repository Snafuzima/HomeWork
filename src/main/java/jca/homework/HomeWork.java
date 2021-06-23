package jca.homework;
import javax.sound.sampled.SourceDataLine;
import java.util.Arrays;
import java.util.Scanner;
public class HomeWork {
    public static void main(String[] args) {
        int i =1;
        do {

            Scanner console = new Scanner (System.in);

            System.out.println("Выберите задание от 1 до 6. Для выхода нажмите 7");
            int test = console.nextInt();

            switch(test) {
                case 1:
                int arr[] = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};

                    System.out.print("Массив до: ");
                    for(int mass=0; mass< arr.length;mass++) {
                        System.out.print(arr[mass]+" ");
                    }
                    System.out.print("\nМассив после: ");

                    for(int mass= 0;mass<arr.length;mass++) {
                        if(arr[mass]==0) {
                            arr[mass] =1;
                        } else {
                            arr[mass]=0;
                        }
                        System.out.print(arr[mass]+" ");
                    }
                        System.out.println();
                    break;

                case 2:

                    int[] arr2 = new int[8];
                    for(int mass2=1; mass2<8; mass2++) {
                        arr2[mass2] =arr2[mass2-1]+3;

                    }
                    System.out.println(Arrays.toString(arr2));


                    System.out.println();
                    break;

                case 3:
                    int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
                    for (int mass3=0; mass3< arr3.length;mass3++) {
                        if(arr3[mass3]<6) {
                            arr3[mass3] *=6;
                        }
                        System.out.print(arr3[mass3] + " ");
                    }
                    System.out.println();
                    break;

                case 4:

                    int[][] arr4 = new int[3][3];
                    for (int diag=0; diag< arr4.length;diag++) {
                        arr4[diag][diag]++;
                    }

                    for (int y=0; y< arr4.length; y++) {
                        for(int x=0; x < arr4[y].length;x++) {

                            System.out.print(arr4[y][x] + " ");
                        }

                        System.out.println();
                    }
                    break;

                case 5:
                    //доделать
                    int[] arr5 = {10, 8, 25, 5, 2, 9, 23};
                    int temp=0;
                    for (int mass5Down= arr5.length-1; mass5Down>0;mass5Down--) {
                        for(int mass5Up=0; mass5Up<mass5Down; mass5Up++) {
                            if (arr5[mass5Up] > arr5[mass5Up+1]) {
                                temp = arr5[mass5Up];
                                arr5[mass5Up]=arr5[mass5Up+1];
                                arr5[mass5Up+1] = temp;
                            }
                        }
                    }


                    System.out.println(Arrays.toString(arr5));
                    break;

                case 6:
                    break;

                case 7: i=0;
                    break;

                default: System.out.println("Такого задания нет :(");
                    break;
            }
            test=0;
        } while (i==1);

    }
}
