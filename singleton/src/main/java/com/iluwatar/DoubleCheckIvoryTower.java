package com.iluwatar;

/**
 * Thread safe Singleton class with less sync. 
 * @author away
 *
 */
public class DoubleCheckIvoryTower {

	private volatile static DoubleCheckIvoryTower instance = null;

	/**
	 * double check, sync once when the instance is null. 
	 * @return
	 */
	public static DoubleCheckIvoryTower getInstance() {
		if (instance == null) {
			synchronized (DoubleCheckIvoryTower.class) {
				if (instance == null) {
					instance = new DoubleCheckIvoryTower();
				}
			}
		}
		return instance;
	}

}
