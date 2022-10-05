public class Main {
    public static void prnt(String s){
        System.out.println(s);
    }
    public  void display(){
        System.out.println("fn without parameter");
    }public  void display2( String s){
        System.out.println("fn with 1 "+s);
    }
    public static void main(String[] args) {
        Main obj = new Main();
        // Expection handling
        // TRY-CATCH in expection handling
//        int arr[] = {3423,34,5,6};
        int a=5;
        int b=0;
        try{
//            System.out.println(arr[3]);

            System.out.println(b/a);
        }catch (Exception exception){
            System.out.println("this is error");
        }
        System.out.println("my name is lazy!");

        // functions in java
        prnt("this is sting bro...!");
        prnt("this is sting bro...!");
        prnt("this is sting bro...!");
        prnt("this is sting bro...!");

obj.display();
obj.display2("parameter");

    }
}