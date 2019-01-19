import java.util.Vector;

public class MyStack {
    private Vector<String> mStack = new Vector<String>();

    public void push(String item){
        mStack.add(item);
        System.out.println("pushed Item is "+ item);
    }

    public void pop(){
        if(!isEmpty()) {
            String item = mStack.get(mStack.size() - 1);
            mStack.remove(mStack.size() - 1);
            System.out.println("Poped item is " + item);
        }else{
            System.out.println("Stack is Empty!");
        }
    }

    public Boolean isEmpty(){
        return mStack.isEmpty();
    }

    public void size(){
        System.out.println("Now stack size is " +mStack.size());
    }

}

class playStack{
    public static void main (String[] args){
        MyStack myStack = new MyStack();
        myStack.push("hi");
        myStack.pop();
        myStack.size();

    }
}
