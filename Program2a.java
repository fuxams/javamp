


import java.util.Scanner;

class Program2a 
{
  public static void main(String args[])
  { 
    int c,first,last,middle,n,search,array[];
    Scanner sc=new Scanner(System.in);
    System.out.print("enter number of elements: ");
    n=sc.nextInt(); 
    array=new int[n];
   System.out.println("enter " + n + " elements: ");
   for(c=0;c<n;c++)
     array[c]=sc.nextInt();
   System.out.print("enter value to find: ");
   search=sc.nextInt();
    first=0;
    last=n-1;
    middle=(first+last)/2;
    while(first<=last)
    {
      if(array[middle]<search)
         first=middle+1;    
      else if(array[middle]==search ) 
         {
          System.out.println("element " + search + " is found at location " + (middle + 1));
           break;
         }
      else if(array[middle]>search)
         last=middle-1;
       middle=(first+last)/2;
    }
   if(first>last )
     System.out.println("element " + search + " is not present in the list!!!");
 }
}

