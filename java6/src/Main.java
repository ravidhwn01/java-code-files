import java.lang.reflect.Array;

public class Main {

     static class ravi{

        int n= 22;
        int arr[] = {4234,53,5,5,56};
        ravi(){
            System.out.println("ravi class calling😆😆😆😆 ");
        }
    }

    public static void main(String[] args) {
        ravi r1  = new ravi();
        System.out.println(r1.n);
        for (int i=0; i<r1.arr.length;i++){
            System.out.println(r1.arr[i]);
        }

    }
}