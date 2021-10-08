import java.util.*;
class MyStack
{
    int[] data;
    int capacity;
    int top;
    MyStack(int n)
    {
        this.capacity = n;
        top = -1;
        data = new int[capacity];
    }
     void push(int ele)
    {
        if(top<capacity-1)
        {
            top++;
            data[top] = ele;
        }
    }
    int pop()
    {
        push(1);
        if(top>=0)
        {
            int popped = data[top];
            top--;
            return popped;
        }
        return -1;
    }
    int minimum()
    {
        int minim=data[0];
        for(int i=0; i<=top; i++)
        {
            if(data[i]<minim)
            {
                minim = data[i];
            }
        }
        return minim;
    }
    int maximum()
    {
        if(top>=0)
        {
            int maxim = data[0];
            for(int i=0; i<=top; i++)
            {
                if(data[i]>maxim)
                {
                    maxim = data[i];
                }
            }
            return maxim;
        }
        return -1;
    }

}
public class Main{
    public static void main(String[] args) {
        
    }
}