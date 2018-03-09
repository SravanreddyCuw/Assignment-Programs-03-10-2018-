package com.b12Android.AssignmentPrograms;

public class EvenOddArray {
public static void main(String arg[]) {
int array[]= {1,2,3,4,5,6,7,8,9,10};
int evenLength=0, oddLength=0;
System.out.println("Elements of the array are:");
for(int i=0;i<array.length;i++)
{
	if(array[i]%2==0)
		evenLength++;
	else
		oddLength++;
	System.out.print(" "+array[i]);
}

int evenArray[]=new int[evenLength];
int oddArray[]=new int[oddLength];
int evenIndex=0, oddIndex=0;
for(int i=0;i<array.length;i++)
{
  if(array[i]%2==0)
  { evenArray[evenIndex]=array[i];
    evenIndex++;
  }
  else
	  {oddArray[oddIndex]=array[i];
	  oddIndex++;
	  }
}

System.out.print("\nEven numbers:\t");
for(int i=0;i<evenLength;i++)
{
 System.out.print(evenArray[i]+ "\t");	
}
System.out.print("\nodd numbers:\t");
for(int i=0;i<oddLength;i++)
{
 System.out.print(oddArray[i]+ "\t");	
}


}
}
