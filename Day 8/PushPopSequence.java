import java.util.*;
class PushPopSequence
{
    public static void main(String[] args)
    {
        int n=5;
        int pushed[]={1, 2, 3, 4, 5};
        int poped[]={4, 5 , 3, 2, 1};
        int index=0;
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<n;i++)
        {
            s.push(pushed[i]);
            while(!s.isEmpty() && s.peek() == poped[index])
            {
                s.pop();
                index++;
            }
        }
        if(s.isEmpty())
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}