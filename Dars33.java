import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.in;

public class Dars33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        System.out.println("Raqam nechta sondan iborat bo'lsin ?");
        int a = scanner.nextInt();
        int [] arr = new int[a];

        for (int i = 0; i < a; i++) {
         arr[i]= scanner.nextInt();
        }
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max){
                max= arr[i];
            }
        }
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        for (int i = 0; i < a; i++) {
            System.out.println(arr[i]);
        }
        int cmin=0;
        int cmax=0;
        for (int i = 0; i < a; i++) {
            if (arr[i]==max){
                cmax=i;
            }
        }
        for (int i = 0; i < a; i++) {
            if (arr[i]==min){
                cmin=i;
            }
        }
        System.out.println("Eng katta son: "+max);
        System.out.println("Eng kichik son: "+min);
        System.out.println("Katta sonning index raqami:"+cmax);
        System.out.println("Kichik sonning index raqami:"+cmin);
         }
     }

