import java.util.Comparator;

public class MovieSortingRunDaysComparator 
	implements Comparator<Movie>{

	@Override
	public int compare(Movie movie1, Movie movie2) {
		
		// Descending Order - Run days
		
		if (movie1.getRunDays() < movie2.getRunDays()) {
			return +1;
		}else if (movie1.getRunDays() > movie2.getRunDays()) {
			return -1;
		}else {
			return 0;
		}		
	}

}
