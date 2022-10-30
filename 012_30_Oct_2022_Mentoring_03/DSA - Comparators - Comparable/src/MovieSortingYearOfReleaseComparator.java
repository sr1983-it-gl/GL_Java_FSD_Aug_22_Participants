import java.util.Comparator;

public class MovieSortingYearOfReleaseComparator 
	implements Comparator<Movie>{

	@Override
	public int compare(Movie movie1, Movie movie2) {
		
		// Descending Order - Run days
		
		if (movie1.getYearOfRelease() < movie2.getYearOfRelease()) {
			return +1;
		}else if (movie1.getYearOfRelease() > movie2.getYearOfRelease()) {
			return -1;
		}else {
			return 0;
		}		
	}

}
