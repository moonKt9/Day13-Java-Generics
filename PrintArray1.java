package com.genericpractice;

public class PrintArray1<T> {
	private T[] inputArray;
	
	public PrintArray1(T[] inputArray) {
		this.inputArray=inputArray;
		
	}
	public void toPrint() {
		PrintArray1.toPrint(this.inputArray);
		
	

}
	private static <E>void toPrint(E[] inputArray) {
	for(E element:inputArray) {
		System.out.printf("%s",element);
	}
	System.out.println();
	}
	public static void main(String[] args) {
		Integer[] intArray= {1,2,3,4,5};
		Double[] doubleArray= {1.1,2.2,3.3,4.4,};
		Character[] charArray= {'H','E','L','o'};
		
		new PrintArray1(intArray).toPrint();
		PrintArray1.toPrint(doubleArray);
		PrintArray1.toPrint(charArray);
	}
}
	
