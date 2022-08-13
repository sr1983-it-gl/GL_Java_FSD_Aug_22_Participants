import java.util.Scanner;

public class IfElseIfElseIfMovieRecommenderDemo {

	public static void main(String[] args) {
		
		System.out.println("Movie Recommender");
		System.out.println("English [E]");
		System.out.println("Hindi [H]");
		System.out.println("Malayalam [M]");
		
		System.out.println("Enter your movie language choice [E / H / M]");
		Scanner scanner = new Scanner(System.in);
		
		String movieLanguageChoice = scanner.nextLine();
		
		if (movieLanguageChoice.equals("E")) {
			
			System.out.println("Doctor Strange 2");
			System.out.println("Jurassic World");
		}else if (movieLanguageChoice.equals("H")) {
			
			System.out.println("Hindi movies");
		}else if (movieLanguageChoice.equals("M")) {
			
			System.out.println("Malayalam movies");
		}else {
			
			System.out.println("Invalid user input. Supported inputs are E / H / M ");
		}
	}
}
