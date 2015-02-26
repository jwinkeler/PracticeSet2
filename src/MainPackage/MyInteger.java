package MainPackage;

public class MyInteger {

	private int value;

	//Create Constructor of MyInteger
	public MyInteger(int value){
		this.value = value;
	}

	public int getValue(){
		//Create Generic Getter for class MyInteger
		return this.value;
	}

	public boolean isEven(){
		//Use MyInteger class method isEven
		return isEven(value);
	}
	public boolean isOdd(){
		// Use MyInteger class method isOdd
		return isOdd(value);
	}
	public boolean isPrime(){
		// Use MyInteger class method isPrime
		return isPrime(value);
	}
	public static boolean isEven(int number){
		//Create MyInteger class isEven
		return (number %2 == 0);
	}
	public static boolean isOdd(int number){
		//Create MyInteger class method isOdd
		return (number %2 != 0);
	}
	public static boolean isPrime(int number1){
		//Create MyInteger class method is Prime
		for (int number=2; number < number1; number++){
			if (number1 % number == 0)
				return false;
		}
		return true;
	}
	public static boolean isEven(MyInteger MyInteger1){
		//use MyInteger class isEven method
		return MyInteger1.isEven();
	}
	public static boolean isOdd(MyInteger MyInteger1){
		//use MyInteger class isOdd method
		return MyInteger1.isOdd();
	}
	public static boolean isPrime(MyInteger MyInteger1){
		//use MyInteger class isPrime method
		return MyInteger1.isPrime();
	}
	public boolean equals(int number){
		//return true if the value in the object == specified value
		return (number == value);
	}
	public boolean equals(MyInteger MyInteger1){
		//return true if the value in the object == specified value
		return MyInteger1.equals(value);
	}
	public static int parseInt(char[] MyChar){
		//converts an array of numeric characters into int
		String MyString = new String(MyChar);
		return parseInt(MyString);
	}
	public static int parseInt(String MyString){ 
		//converts a string into an int value
		Integer x = Integer.valueOf(MyString);
		return x.intValue();
	}
}
