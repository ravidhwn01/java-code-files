import  java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("input dedo:");
        String name = sc.nextLine();  // for string as a input this only take single word /tokens leta hai : next()
        int age =  sc.nextInt(); // for integer value input
        float ac = sc.nextFloat();  // for floating value input
        System.out.println(name);
        System.out.println("age is:"+age);
        System.out.println("ac is:"+ac);


    }
}
