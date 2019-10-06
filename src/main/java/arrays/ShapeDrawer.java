package arrays;

import java.util.Scanner;

public class ShapeDrawer {

    public static void rectangle(int height, int width) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void frame(int height, int width) {
        for (int i = 0; i < height; i++) {
                for (int j = 0; j < width; j++) {
                    if( i == 0 || i == height - 1 ){
                        System.out.print("*");
                    }else if (j == 0 || j == width - 1) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            System.out.println();
        }
    }

    public static void triangle(int height) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < i ; j++) {  //wydrukuj i gwiazdek gdzie i oznacza nr rzedu
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void tree(int height) {
        int numberOfSpaces = height - 1;

        for (int i = 1; i <= height ; i++) {
            for (int j = 1; j <= numberOfSpaces; j++) {
                System.out.print(" ");
            }
            numberOfSpaces--;

            for (int k = 1; k <= 2 * (i -1) + 1; k++) {   //tego nie czaje
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void bigL(int height, int width) {  //na bank da sie zrefaktorowac
        for (int i = 0; i < height ; i++) {

            if (i <= height/2) {
                for (int j = 0; j < width / 2; j++) {
                    System.out.print("*");
                }
                System.out.println();
            } else {
                for (int j = 0; j < width ; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj wysokość");
        int height = sc.nextInt();

        System.out.println("Podaj szerokość");
        int width = sc.nextInt();


       //rectangle(height, width);
       //frame(height, width);
       //triangle(height);
        //tree(height);
       //bigL(height, width);
    }

}
