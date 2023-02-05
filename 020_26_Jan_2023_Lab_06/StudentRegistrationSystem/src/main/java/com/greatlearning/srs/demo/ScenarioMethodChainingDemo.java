package com.greatlearning.srs.demo;

public class ScenarioMethodChainingDemo {

	//
	// Web Application -> resources()
	// 
	
	
	static void patternMethodChaining() {		
		// Method Chaining
		
		GoogleDrive.open()
			.createDocument("Doc1")
			.createSpreadsheet("Courses")
				.createSheet("courses");
	}
	

	

		class GoogleDrive{
		
			public static GoogleDrive open() {
				// TODO Auto-generated method stub
				return null;
			}
		
			public GoogleSpreadsheet createSpreadsheet(String string) {
				// TODO Auto-generated method stub
				return null;
			}
		
			public static GoogleDrive createDocument(String document) {
				// TODO Auto-generated method stub
				return null;
			}
			
		}
		
		class GoogleSpreadsheet{
		
			public Object createSheet(String sheetName) {
				// TODO Auto-generated method stub
				return null;
			}
			
			
		}
	
}


