package PatternPrinting;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        int size;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size: ");
        size = sc.nextInt();
        // Upper triangle
        for(int i=0; i<size; i++){
            for(int space =0; space<size-i-1; space++){
                System.out.print(" ");
            }
            for (int star=0; star<2*i+1; star++){
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower triangle
        for(int i=size-2; i>=0; i--){
            for(int space =0; space<size-i-1; space++){
                System.out.print(" ");
            }
            for (int star=0; star<2*i+1; star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
