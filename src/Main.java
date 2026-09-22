import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=====PORTFOLIO OF ACTIVITY=====");
        System.out.println("| Name: James Edel P.Panogaling  |");
        System.out.println("| Section/year: IT2G              |");
        System.out.println("===========CONTENTS===========");
        System.out.println("1. Activity 1");
        System.out.println("1. Activity 2");
        System.out.println("===========================");
        System.out.print("Enter Section: ");
        int select = sc.nextInt();

        if (select == 1) {
            Activity1 act1 = new Activity1();
            act1.userGreetings();
        } else {
            System.out.println("Selection not found.");
        }
    }
}