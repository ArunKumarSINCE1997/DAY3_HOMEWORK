package mypackage;

import java.util.Scanner;

public class MyClass {
	
	public static void main(String[] args) {
		// variable declaration
		int[]data = new int[5];
		Scanner obj=new Scanner(System.in);
		
		// read the number from user
		for(int i=0;i<5;i++)
		{ 
			System.out.println("ENTER ANY NUMBER:");
			data[i]=obj.nextInt();
			
		}
		int temp = data[0];
		for (int d:data)
		{
			if(d>temp)
				temp=d;
		}
		
		System.out.println("biggest number:"+temp);
	}
}

