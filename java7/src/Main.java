class arti {
    int a = 10;
    String st = "this is  arti class";
    String sttst = "arti loves you ravi 😘😘😘  ";
    arti() {
        System.out.println("arti is missing you ravi 🥰🥰🥰");
    }
}
class ravi extends arti {

    void show() {
        System.out.println(st);
        System.out.println(sttst);
    }

}
public class Main {
    public static void main(String[] args) {
        ravi ra2 = new ravi();
        ra2.show();

    }
}