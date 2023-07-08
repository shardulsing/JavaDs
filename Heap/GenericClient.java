package Heap;

import InterfaceandGenerics.Car;

public class GenericClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car[] cars = new Car[5];
		cars[0] = new Car(1000,200,"Red");
		cars[1] = new Car(2000,100,"Yellow");
		cars[2] = new Car(500,1000,"Black");
		cars[3] = new Car(300,10,"Blue");
		cars[4] = new Car(800,600,"violet");
		
		HeapGenerics<Car> heapg = new HeapGenerics<Car>();
		heapg.add(cars[0]);
		heapg.add(cars[1]);
		heapg.add(cars[2]);
		heapg.add(cars[3]);
		heapg.add(cars[4]);
		
		System.out.println(heapg.remove());
		System.out.println(heapg.remove());
		System.out.println(heapg.remove());
		System.out.println(heapg.remove());
		System.out.println(heapg.remove());
		

	}

}
