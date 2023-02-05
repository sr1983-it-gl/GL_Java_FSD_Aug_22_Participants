package com.greatlearning.srs.demo;

public class ScenarioNOMethodChainingDemo {

	//
	// Web Application -> resources()
	// 
	
	
	static void patternNOMethodChaining() {		
		// Method Chaining

		GoogleDrive gd = GoogleDrive.open();
		
		GoogleDocument gd1 = gd.createDocument("Doc1");
		
		GoogleSpreadsheet gs1 = gd.createSpreadsheet("SS1");
		gs1.createSheet("Users");
		gs1.createSheet("Permissions");
		
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

		public GoogleDocument createDocument(String document) {
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

	class GoogleDocument{
		
	}	
}




