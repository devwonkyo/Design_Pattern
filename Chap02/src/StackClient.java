import java.util.ArrayList;

public class StackClient {
    public static void main(String[] args){
        ArrayStack arrayStack = new ArrayStack(10);
        arrayStack.push(10);
        arrayStack.peek();
        arrayStack.pup();
        arrayStack.pup();
        arrayStack.peek();
    }
}

class ArrayStack{
    private ArrayList<Integer> arrayStack;
    private int stackSize;

    public ArrayStack(int stackSize){
        this.stackSize = stackSize;
        arrayStack = new ArrayList<Integer>(stackSize);
    }

    public void push(int number){
        if(isFull()){
            System.out.println("Stack is Full!");
        }
        else{
            arrayStack.add(number);
            System.out.println("Inserted Item = "+number);
        }
    }

    public void pup(){
        if(isEmpty()){
            System.out.println("Stack is Empty, Can't pup in Stack. Try again push Item");
        }else{
            int pupedNumber = arrayStack.get(arrayStack.size()-1);
            arrayStack.remove(arrayStack.size()-1);
            System.out.println("pup Number = "+pupedNumber);

        }

    }

    public void peek(){
        if(arrayStack.isEmpty()){
            System.out.println("Stack is Empty, Can't search number in Stack , Try again push Item.");

        }else{
            System.out.println("peeck Number = "+arrayStack.get(arrayStack.size()-1));
        }
    }

    public boolean isEmpty(){
        return arrayStack.isEmpty();
    }

    public boolean isFull(){
        return arrayStack.size() >= this.stackSize;
    }
}

