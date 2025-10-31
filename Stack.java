public class Stack{
    private static final int MAX_SIZE=10;
    private int[] stackArray;
    private int top;

    public Stack(){
         stackArray=new int[MAX_SIZE];

    }

    public void push(int element){
        if (top<MAX_SIZE-1){
            stackArray[++top]=element;
            System.out.println("Pushed Element: "+element);
        }

        else{
            System.out.println("Stack Overflow!");
        }
    }

    public void pop(){
        if (top>=0){
            int poppedElement=stackArray[top--];
            System.out.println("Popped Element: "+poppedElement);

        }
        else{
            System.out.println("Stack Underflow!!");
        }
    }

    public void display(){
        if (top>=0){
            System.out.println("Elements in the stack are: ");
            for(int i=top;i>=0;i--){
                System.out.println(stackArray[i]);
            }
        }
        else{
            System.out.println("Stack is Empty");
        }
    }

    public static void main(String args[]){
        Stack mystack=new Stack();

        mystack.push(3);
         mystack.push(5);
          mystack.push(7);
           mystack.push(9);
            mystack.push(11);
            mystack.pop();
            mystack.pop();

            mystack.display();

            mystack.push(2);
            mystack.push(4);
            mystack.push(6);
            mystack.push(8);
            mystack.push(10);
            mystack.pop();
            mystack.pop();

            mystack.display();
    }
}