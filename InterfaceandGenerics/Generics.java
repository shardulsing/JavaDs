package InterfaceandGenerics;

import java.util.Comparator;

public class Generics {

	public static void main(String[] args) {
		Integer[] arri= { 10,20,30,40,50};
		display(arri);
		String[] arrs = {"Hi","This ","Is","Shardul"};
		display(arrs);
		Car[] cars = new Car[5];
		cars[0] = new Car(1000,200,"Red");
		cars[1] = new Car(2000,100,"Yellow");
		cars[2] = new Car(500,1000,"Black");
		cars[3] = new Car(300,10,"Blue");
		cars[4] = new Car(800,600,"violet");
		//bubbleSort(cars);
		bubbleSort(cars, new CarSpeedComparator());
		display(cars);
		
		bubbleSort(cars, new CarColourComparator());
		display(cars);
		
		bubbleSort(cars, new CarPriceComparator());
		display(cars);
		

	}
	
//	public static void display(Integer[] arr){
//		for(Integer val : arr){
//			System.out.print(val + " ");
//		}
//		System.out.println();
//	}
//	
//	public static void display(String[] arr){
//		for(String val : arr){
//			System.out.print(val + " ");
//		}
//		System.out.println();
//	}
	
	public static <T> void display(T[] arr){
		for(T val : arr){
			System.out.print(val + " ");
			System.out.println();
		}
		System.out.println();
	}
	public static <T extends Comparable<T>> void bubbleSort(T[] arr) {
		for (int counter = 0; counter < arr.length - 1; counter++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j].compareTo(arr[j + 1])>0) {
					T temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}
	public static <T> void bubbleSort(T[] arr , Comparator<T> comparator) {
		for (int counter = 0; counter < arr.length - 1; counter++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (comparator.compare(arr[j],arr[j + 1])>0) {
					T temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

}
