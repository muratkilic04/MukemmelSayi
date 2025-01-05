package Mukemmelsayi;

import java.util.Scanner;

public class mukemmelSayi {

	public static void main(String[] args) {
		// Bir sayının kendisinden başka tüm pozitif bölenlerinin
		// toplamı kendisine eşit ise bu sayı mükemmel sayıdır.
		
		Scanner input = new Scanner(System.in);
		int number;
		System.out.println("Enter number: ");
		number=input.nextInt();
		int total=0;
		
		for(int i=1;i<number;i++) {
			if(number%i==0) {
				total+=i;
			}
		}
		
		if(total==number) {
			System.out.println(number + " " + "mükemmel sayıdır");
		}else {
			System.out.println(number + " " + "mükemmel sayı değildir");
		}
		
		
	}

}
