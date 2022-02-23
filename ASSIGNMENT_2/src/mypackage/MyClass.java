package mypackage;

import java.util.Scanner;

public class MyClass {

	public static void main(String[] args) {
		// variable declaration
		int[] data=new int[5];
		Scanner obj= new Scanner(System.in);
		int sum=0,avg;
				
				
		// read the number from user
		for(int i=0;i<data.length;i++)
		{ 
		    System.out.println("ENTER ANY NUMBER:");
			data[i]=obj.nextInt();
		}
        for(int d:data)
        	sum+=d;
        
        avg=sum/data.length;
        
        System.out.println(sum);
        System.out.println(avg);
	}

}
