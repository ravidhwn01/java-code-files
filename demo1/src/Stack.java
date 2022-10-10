import java.util.Scanner;
public class Stack {
    static Scanner sc = new Scanner(System.in);
    //vairable for stack
    static int stack[],top = -1,size;
    static
    {
        Stack.create();
    }
    public static void main(String[] args) {
        int ch,item;

        while (true) {
            System.out.println("1.push");
            System.out.println("2.pop");
            System.out.println("3.peek");
            System.out.println("4.traverse");
            System.out.println("5.exit");

            System.out.print("enter you choice");
            ch = Stack.sc.nextInt();

            switch (ch) {
                case 1:
                    System.out.println("enter the element");
                    item  = sc.nextInt();
                    Stack.push(item);
                    break;
                case 2:
                    item =  Stack.pop();
                    if(item==0)
                    {
                        System.out.println("stack is undrflow");
                    }
                    else
                    {
                        System.out.println("popped item "+item);
                    }

                    break;
                case 3:
                    item =  Stack.peek();
                    if(item==0)
                    {
                        System.out.println("stack is undrflow");
                    }
                    else
                    {
                        System.out.println("peek item "+item);
                    }
                    break;
                case 4:
                    Stack.traverse();
                    break;
                case 5: System.exit(1);
                default:
                    System.out.println("invalid choice");
            }
        }
    }
    static void create()
    {

        System.out.println("enter the size :");
        size =  Stack.sc.nextInt();
        Stack.stack=  new int[size];
        System.out.println("stack is created size is:" +size);

    }
    static void push(int item){
        if(Stack.isfull()){
            System.out.println("stack is overflow\n");
        }
        else{
            stack[++top] = item;
        }
    }
    static  boolean isfull(){
        if(top == size-1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    static int pop()
    {
        if(Stack.isEmpty())
        {

            return 0;
        }
        else
        {
            return stack[top--];

        }

    }
    static boolean isEmpty()
    {
        if(top == -1)
        {
            return true;
        }
        else{
            return false;
        }
    }
    static int peek()
    {
        if(Stack.isEmpty())
        {

            return 0;
        }
        else
        {
            return stack[top];

        }
    }
    static void traverse()
    {

        if(Stack.isEmpty())
        {
            System.out.println("stack is empty");
        }
        else
        {
            System.out.println("element of stack");
            for(int i = top ;i>=0;i--)
            {
                System.out.println(stack[i]);
            }
        }
    }
}