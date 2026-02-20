package PatternPrinting;

import java.util.Scanner;

public class ButterflyPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size: ");
        int size = sc.nextInt();
        // upper part
        for(int i=1; i<=size; i++){
            for(int stars = 1; stars<=i; stars++){
                System.out.print("*");
            }
            for(int space=2*i; space<2*size; space++){
                System.out.print(" ");
            }
            for(int stars = 1; stars<=i; stars++){
                System.out.print("*");
            }
            System.out.println();
        }

        // lower part
        for(int i=size-1; i>0; i--){
            for(int stars = 1; stars<=i; stars++){
                System.out.print("*");
            }
            for(int space=2*i; space<2*size; space++){
                System.out.print(" ");
            }
            for(int stars = 1; stars<=i; stars++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
