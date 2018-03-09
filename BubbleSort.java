package com.b12Android.AssignmentPrograms;

public class BubbleSort {
	
public static void main(String args[])
{
int list[]= {2,1,4,3,6,5,8,7,9};
int temp;
for(int i=1;i<list.length;i++)
{
	for(int j=0;j<list.length-i;j++)
	{
		if(list[j]>list[j+1])
		{temp=list[j];
		list[j]=list[j+1];
		list[j+1]=temp;
		}	
	}
	}
for(int i=0;i<list.length;i++)
{System.out.print(list[i]+" ");}
}
}
