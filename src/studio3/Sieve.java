package studio3;

import java.util.Scanner;

public class Sieve {


	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.println("What is n?");
		int n = in.nextInt();
		boolean[] isNotPrime = new boolean[n + 1]; 

		for(int i = 2; i <isNotPrime.length; i++)

		{
			for(int m =2*i; m < isNotPrime.length; m = i + m){

				isNotPrime[m]= true;
			}

		}
	
		for(int z = 2; z <isNotPrime.length; z++) {
			
			if (isNotPrime[z] == false) {
			System.out.println(z + " is prime");
			}
		}

	}
}