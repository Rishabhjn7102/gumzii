interface Stack<E> {

int size();//Returns the number of elements in the stack.

boolean isEmpty();//return true if the stack is empty, false otherwise

void push(E e);//Inserts an element 'e' at the top of the stack

E top();//Returns, but does not remove, the element at the top of the stack (or null if empty).


E pop();//Removes and returns the top element from the stack (or null if empty).

void display();//Prints all the elements in the stack

}

class ArrayStack<E> implements Stack<E> {

    private E[ ] data;
    // generic array used for storage

    private int t = -1;
    // index of the top element in stack

    public ArrayStack(int capacity) 
    {
        // constructs stack with given capacity

        data = (E[ ]) new Object[capacity]; 
    }

    public int size() 
    { 
        return (t + 1); 
    }

    public boolean isEmpty() 
    { 
        return (t == -1); 
    }

    public void push(E e) throws IllegalStateException 
    {

        if (size() == data.length) throw new IllegalStateException("Stack is full");

        data[++t] = e;// increment t before storing new item
    }

    public E top() 
    {
        if (isEmpty()) return null;
        return data[t]; }

    public E pop() 
    {
        if (isEmpty()) return null;
        E answer = data[t];
        data[t] = null;
        // dereference to help garbage collection

        t--;

        return answer; 
    }

    public void display()
    {
        for(int i=0;i<data.length;i++)
        System.out.println(data[i]);
    }
}


public class testcls
{
    public static void main()
    {
        ArrayStack obj=new ArrayStack(5);
       for(int i=1;i<6;i++)
       obj.push(i);
       System.out.println("Size of the Stack is\n"+obj.size());
       System.out.println("Is the Stack empty?\n"+obj.isEmpty());
       System.out.println("Top element is\n"+obj.top());
       obj.pop();
       System.out.println("Stack after using pop function");
       obj.display();
    }
}

