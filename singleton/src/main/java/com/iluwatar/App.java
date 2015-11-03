package com.iluwatar;

/**
 *
 * Singleton pattern ensures that the class (IvoryTower) can have only one
 * existing instance and provides global access to that instance.
 *
 */
public class App {

	public static void main(String[] args) {

		IvoryTower ivoryTower1 = IvoryTower.getInstance();
		IvoryTower ivoryTower2 = IvoryTower.getInstance();
		System.out.println("ivoryTower1=" + ivoryTower1);
		System.out.println("ivoryTower2=" + ivoryTower2);

		ThreadSafeLazyLoadedIvoryTower threadSafeIvoryTower1 = ThreadSafeLazyLoadedIvoryTower
				.getInstance();
		ThreadSafeLazyLoadedIvoryTower threadSafeIvoryTower2 = ThreadSafeLazyLoadedIvoryTower
				.getInstance();
		System.out.println("threadSafeIvoryTower1=" + threadSafeIvoryTower1);
		System.out.println("threadSafeIvoryTower2=" + threadSafeIvoryTower2);
		
		DoubleCheckIvoryTower doubleIvoryTower1 = DoubleCheckIvoryTower.getInstance();
		DoubleCheckIvoryTower doubleIvoryTower2 = DoubleCheckIvoryTower.getInstance();
		System.out.println("doubleIvoryTower1=" + doubleIvoryTower1);
		System.out.println("doubleIvoryTower2=" + doubleIvoryTower2);
		

	}
}
