import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("input dedo:");
//
        int age = sc.nextInt(); // for integer value input
//       // float ac = sc.nextFloat();  // for floating value input
//        String name = sc.nextLine();  // for string as a input this only take single word /tokens leta hai : next()
//        System.out.println(name);
//        System.out.println("age is:"+age);
//      //  System.out.println("ac is:"+ac);


        // conditional statement
        // 1 if else
//        int age = 5;
//        if (age<18){
//            System.out.println("you are not eligible!");
//        } else {
//            System.out.println("you are eligible!");
//        }


        // 2 using switch case
        switch (age) {
            case 12:
                System.out.println("you are monkey");
                break;
            case 34:
                System.out.println("you are tiger");
                break;
            case 6:
                System.out.println("you are mongoose");

                break;
            case 1:
                System.out.println("you are bitch");

                break;
            case 7:
                System.out.println("you are dog");
                break;
            default:
                System.out.println("you are nothing");
        }
// loops in java
        for (int i =0; i<100;i++){
            System.out.print(i+" ");
        }
    }
}
