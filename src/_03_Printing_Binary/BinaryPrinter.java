package _03_Printing_Binary;

public class BinaryPrinter {
	//Complete the methods below so they print the passed in parameter in binary.
	//Use bit shifting and bit masking to print the binary numbers.
	//Do not use the Integer.toBinaryString method!
	//Don't be afraid to use the methods that are already complete to finish the others.
	//Create a main method to test your methods.
	int x = 0;
	String result;
	public static void main(String[] args) {
		printByteBinary((byte) 4);
	}
	
	public static String printByteBinary(byte b) {
	while (b!=0) {
		b=(byte)(b/2);
		x=x+1;
	}
	result = "1";
	for (int i = 0; i < x; i++) {
		result = result + "0";
	}
	System.out.println(result);
	return result;
	
	}
	
	public void printShortBinary(short s) {
		
	}
	
	public void printIntBinary(int i) {
		
	}
	
	public void printLongBinary(long l) {
		
	}
}
