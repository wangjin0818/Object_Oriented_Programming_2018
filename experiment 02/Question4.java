package Sample;

import java.util.Scanner;

public class Question4 {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int salary=sc.nextInt();
		if (salary<=3500){
			System.out.println("0");
		}
		if(3500<salary && salary<=5000){
			System.out.println((salary-3500)*0.03);
		}
		if(5000<salary && salary<=8000){
			System.out.println((salary-3500)*0.1-105);
		}
		if(8000<salary && salary<=12500){
			System.out.println((salary-3500)*0.2-555);
		}
		if(12500<salary && salary<=38500){
			System.out.println((salary-3500)*0.25-1005);
		}
		if(38500<salary && salary<=58500){
			System.out.println((salary-3500)*0.3-2755);
		}
		if(58500<salary && salary<=83500){
			System.out.println((salary-3500)*0.35-5505);
		}
		if(83500<salary){
			System.out.println((salary-3500)*0.45-13505);
		}
	}
}

