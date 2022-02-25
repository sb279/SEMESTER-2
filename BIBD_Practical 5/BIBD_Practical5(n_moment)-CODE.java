import java.io.*;
import java.util.*;

class n_moment2
{
  public static void main(String args[])
  {
   int n=15;
   String stream[]={"a","b","c","b","d","a","c","d","a","b","d","c","a","a","b"};
   
   int zero_moment=0, first_moment=0, second_moment=0, count=1, flag=0;
   ArrayList<Integer> arraylist=new ArrayList();
   System.out.println("ArrayList elements are: ");
   
   for(int i=0; i<15; i++)
   {
      System.out.print(stream[i]+" ");
   }
   Arrays.sort(stream);
   
   for(int i=1; i<n; i++)
   {
    if(stream[i] == stream[i-1])
    {
     count++;
    }
    else         
    {
      arraylist.add(count);
      count=1;
    }
   }
   arraylist.add(count);
   
   //zero th moment
   zero_moment = arraylist.size();
   System.out.println("\n\n\nValue of Zeroth moment for given stream ::"
                                   +zero_moment);
   
   //first moment
   for(int i=0; i<arraylist.size(); i++)
   {
      first_moment += arraylist.get(i);
   }
   System.out.println("\n\nValue of First moment for given stream ::"+first_moment);

    //Calculate Second moment(raised to two)
    for(int i=0;i<arraylist.size();i++)
    {
      int j=arraylist.get(i);
      second_moment+=(j*j);
    }
    System.out.println("\n\nValue of Second moment for given stream ::"+second_moment);
    }
}