package com.g.javafsd.traveller;

import com.gl.javafsd.dsa.arrayrotater.DataStructureUtils;

public class SortTest {

	public static void main(String[] args) {
		
		test1();
	}
	
	static void test1() {
		
		int[] array = DataStructureUtils.generateRandomArray(5);

		DataStructureUtils.print(array);
		
		Sort sort = new Sort(array);
		sort.sortDesc();
		
		DataStructureUtils.print(array);
		
		
	}
}
