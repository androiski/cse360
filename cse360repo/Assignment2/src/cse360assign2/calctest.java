package cse360assign2;

public class calctest {

	public static void main(String[] args) {
		
		Calculator myCalculator = new Calculator();
		
		myCalculator.add(4);
		myCalculator.subtract(2);
		myCalculator.multiply(2);
		myCalculator.add(5);
		
		System.out.println(myCalculator.getHistory());
		System.out.println(myCalculator.getTotal());

	}

}
