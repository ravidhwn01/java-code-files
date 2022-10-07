public class Main {
    int x = 5;
    String st = "hii kese ho 🥰 :-) ";
    Main(){
        System.out.println("constructor is  calling 🤩🤩 ");
        System.out.println(st);
    }

    public static void main(String[] args) {
        Main myObj1 = new Main();

        System.out.println(myObj1.x);   // using object 1
        System.out.println(myObj1.st);

    }
}