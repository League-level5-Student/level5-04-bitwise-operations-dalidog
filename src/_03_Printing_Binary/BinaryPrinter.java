package _03_Printing_Binary;

public class BinaryPrinter {
	//Complete the methods below so they print the passed in parameter in binary.
	//Use bit shifting and bit masking to print the binary numbers.
	//Do not use the Integer.toBinaryString method!
	//Don't be afraid to use the methods that are already complete to finish the others.
	//Create a main method to test your methods.
	
	
	public static void main(String[] args) {
		printByteBinary((byte) 4);
		printShortBinary((short)64);
		printIntBinary((int) 28);
		printLongBinary((long) 200);
	}
	
	public static String printByteBinary(byte b) {
		String result=""; 
		String result2="";
		for (int i = 0; i < 8; i++) {
		if(b%2==0) {
			result+="0";
		}
		else {
			result+="1";
		}
		b>>=1;
		}
		for (int i = result.length()-1; i >= 0; i--) {
			result2=result2+result.charAt(i);
		}
		System.out.println(result2);
		return result2;
	
	}
	
	public static String printShortBinary(short s) {
		String result=""; 
		String result2="";
		for (int i = 0; i < 16; i++) {
		if(s%2==0) {
			result+="0";
		}
		else {
			result+="1";
		}
		s>>=1;
		}
		for (int i = result.length()-1; i >= 0; i--) {
			result2=result2+result.charAt(i);
		}
		System.out.println(result2);
		return result2;
	}
	
	public static String printIntBinary(int i) {
		String result=""; 
		String result2="";
		for (int z = 0; z < 32 ; z++) {
		if(i%2==0) {
			result+="0";
		}
		else {
			result+="1";
		}
		i>>=1;
		}
		for (int x = result.length()-1; x >= 0; x--) {
			result2=result2+result.charAt(x);
		}
		System.out.println(result2);
		return result2;
	}
	
	public static String printLongBinary(long l) {
		String result=""; 
		String result2="";
		for (int z = 0; z < 64 ; z++) {
		if(l%2==0) {
			result+="0";
		}
		else {
			result+="1";
		}
		l>>=1;
		}
		for (int x = result.length()-1; x >= 0; x--) {
			result2=result2+result.charAt(x);
		}
		System.out.println(result2);
		return result2;
	}
}
