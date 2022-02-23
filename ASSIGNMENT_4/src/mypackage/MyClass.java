package mypackage;

import java.util.Scanner;

public class MyClass {

	public static void main(String[] args) {
		// variable declaration
		int[] arr=new int[5];
		Scanner obj=new Scanner(System.in);
		
		// read the number from user
		for(int i=0;i<5;i++)
		{
			System.out.println("ENTER NUMBERS:");
			arr[i]=obj.nextInt();
		}
        // 
		for (int i = 0; i < 5-1; i++)
			for (int j = 0; j < 5-i-1; j++)
				if (arr[j] > arr[j+1])
				{
					 int temp = arr[j];
					 arr[j] = arr[j+1];
					 arr[j+1] = temp;		 
				}
		for(int i=0;i<5;i++)
		{
			System.out.println(arr[i]+" ");
		}
		
			
            
	}

}
