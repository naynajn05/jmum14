package com.tnsif.lamdaexpdemo;

public class GreetDemo {

	public static void main(String[] args) {
		Greet g=new Greet()
				{//anonymous class

					@Override
					public void greetings(String msg) {
					System.out.println("Welcome "+msg);
						
					}
			
				};
				g.greetings("All");
				
				
				//using lambda Expression
				Greet g1=(name)->System.out.println("Hello "+name);
				g1.greetings("Hitkashi");

	}

}
