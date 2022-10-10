
// A class cannot be private or protected except nested class.
class calclulateArea { // create calclulateArea class
    int l, w;

    calclulateArea(int x, int y) {        // defining constructor
        l = x;
        w = y;
    }

    int area() {
        return (l * w);
    }
}

public class Main {
    public static void main(String[] args) {
        calclulateArea ca = new calclulateArea(243, 243); // calling constructor
        int areal = ca.area();
        System.out.println(areal);
    }
}