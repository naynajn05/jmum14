package com.tnsif.loopdemo;

public class Operators {
	
		public static void main(String args[]) {
			int a = 10;
			int b = 20;
			int x = 11;
			System.out.println("a and b value before the operations: " + a + " " + b);

			++a; //a=11
			int c = ++a + b + a--;//c=12+20+12=44 //a=11
			System.out.println("c value after the operations: " + c);

			int d = c++ + a + b--;//d=44+11+20=75 //c=45//b=19
			System.out.println("d value after the operations: " + d);

			System.out.println("a , b,c,d values after the operations: " + a + " " + b + " " + c + " " + d);
					
			//Ternary operator demonstration
			  x = (10 == x) ? 1 : 0;	
			  System.out.println(x);
		}
	}


