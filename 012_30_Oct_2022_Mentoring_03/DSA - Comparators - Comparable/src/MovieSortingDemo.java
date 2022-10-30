import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MovieSortingDemo {

	public static void main(String[] args) {
		
		Movie terminator2 = new Movie(
			"Terminator II", 1992, 8.5F, 150);		
		Movie xMen2000 = new Movie("X Men - Part I", 
			2000, 8.1F, 120);		
		Movie terminator4 = new Movie("Terminator Salvation", 
			2010, 6.5F, 70);		
		Movie xMen5 = new Movie("XMen - First Class", 2011, 
			8.4F, 110);
		
		List<Movie> allMovies = new ArrayList<>();
		allMovies.add(terminator2);
		allMovies.add(xMen2000);
		allMovies.add(terminator4);
		allMovies.add(xMen5);
		
		System.out.println("Before Sorting ->" + allMovies);
		
//		Collections.sort(allMovies);
		
//		Collections.sort(allMovies, new MovieSortingRunDaysComparator());
	
		Collections.sort(allMovies, new MovieSortingYearOfReleaseComparator());
		
		System.out.println("After Sorting ->" + allMovies);
	}
}
