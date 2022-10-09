package com.gl.javafsd.dsa.mergesort;

import com.gl.javafsd.dsa.arrayrotater.DataStructureUtils;

public class MergingTest {

	public static void main(String[] args) {
				
		genericMergeTest(4, 2);	
		genericMergeTest(2, 4);
		genericMergeTest(3, 3);		
	}
	
	static void genericMergeTest(int aArraySize, int bArraySize) {

		System.out.println("---------------------------------");
		int aArray[] 
			= DataStructureUtils.generateRandomSortedArray(aArraySize);
		DataStructureUtils.print(aArray);

		int bArray[] = DataStructureUtils.generateRandomSortedArray(bArraySize);
		DataStructureUtils.print(bArray);

		Merging merging = new Merging(aArray, bArray);
		int cArray[] = merging.merge();
		
		DataStructureUtils.print(cArray);		
	}
	
//	void a() {
//		
//		b();
//		c();
//	}
	
//	void b() {
//		
//	}
//	
//	static void c() {
//	
//		MergingTest obj = new MergingTest();
//		obj.a();
//	}
}
