public class Main {
    public static void main(String[] args) {
        //
        int[]   marks = new int[5];
        marks[0] = 245653;
        marks[1] = 2673;
        marks[2] = 76548;
        marks[3]= 23345;
        marks[4] = 2332;
        for (int i = 0;i<5;i++){
            System.out.println(marks[i]);
        }
        // casting in java
        int t = 3434;
        double fullT = t +33.343; // successful casting done
        System.out.println(fullT);
        int a = 343;
       //  int b = a + 34.4;  // error
        int b = a + (int)34.4;
        System.out.println(b);

        // constants
        final  int aa = 35; // we can not change value of aa
       //  aa= 3543;      // gives error

        // operators in java
        int c = 1;
        System.out.println(++c);
        System.out.println(c);

    }
}