
public class LearningObjectDemo {

	public static void main(String[] args) {
		
		JavaFSDBatch javaFSDAug2022 = null;
		MLBatch mlSept2022 = null;
		IOTBatch iotBatchDec2022 = null;
		
		Learner learnerPrabhu = null;
		learnerPrabhu.name = "Prabhu";
		learnerPrabhu.gender = "MALE";
		
//		String prabhu = "prabhu";
		
		String result = learnerPrabhu.enroll(mlSept2022);		
		learnerPrabhu.enroll(javaFSDAug2022);
		
		learnerPrabhu.enroll(iotBatchDec2022);
		
		
		Learner learnerSuresh = null;
		learnerSuresh.name = "Suresh";
		learnerSuresh.gender = "MALE";
		
	}
}
