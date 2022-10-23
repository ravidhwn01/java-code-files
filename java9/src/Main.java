
public class Main {
    static void bS(int arr[], int n)   // defining and declaring the method
    {
        for (int i = 0; i < arr.length - 1; i++) // passes
        {
            int temp;
            for (int j = 0; j < arr.length-1-i; j++)  // comparison
            {

                if (arr[j] > arr[j+1]) {
                    temp = arr[j];
                    arr[j] = arr[j+1]; // swapping
                    arr[j+1] = temp;

                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {6,5,4,3,0,1,2,3,4,5,6,7,8,9,0};
        bS(arr, 5);   // method calling
        // output 
        // 0 0 1 2 3 3 4 4 5 5 6 6 7 8 9
        for (int i = 0; i < arr.length; i++) {
            
            System.out.print(arr[i]+" ");
        }


    }
}