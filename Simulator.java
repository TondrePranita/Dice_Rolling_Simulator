// DISPLAYING DICE PROJECT

import java.util.Random;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Simulator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter your name: ");
        String name = sc.nextLine();

        System.out.println("Hello "+name+" !");

        boolean flag = false;

        do {
            try {
                System.out.println("How many dice would you like to roll: ");
                int num = sc.nextInt();
                
                flag = true;

                System.out.println("About to roll "+num+" dice");
    
                Random rd = new Random();
        
                for(int i=0;i<num;i++) {
                    int rolledNum = rd.nextInt(6)+1;
                    System.out.println(display(rolledNum));
                }
            } catch (InputMismatchException e) {
                System.out.println("This is not a valid number.");
                sc.nextLine();
            }
        } while (!flag);
        sc.close();
    }

    static String display(int value) {

        return switch (value) {
            case 1 -> "-----------\n|         |\n|    o    |\n|         |\n-----------";

            case 2 -> "-----------\n|    o    |\n|         |\n|    o    |\n-----------";

            case 3 -> "-----------\n|  o      |\n|    o    |\n|      o  |\n-----------";

            case 4 -> "-----------\n|  o   o  |\n|         |\n|  o   o  |\n-----------";

            case 5 -> "-----------\n|  o   o  |\n|    o    |\n|  o   o  |\n-----------";

            case 6 -> "-----------\n|  o   o  |\n|  o   o  |\n|  o   o  |\n-----------";

            default -> "Invalid input";
        };
    }
}
