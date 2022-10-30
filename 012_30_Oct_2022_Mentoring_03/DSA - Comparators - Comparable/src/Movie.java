
public class Movie implements Comparable<Movie> {

	private String name;
	private int yearOfRelease;
	private float rating;
	private int runDays;
	
	public Movie(String name, int yearOfRelease, float rating, int runDays) {
		
//		100 // integer category (INT, BYTE, LONG, ) -> INT 
//		1.2 // Decimal category (float, double) -> DOUBLE
		
		this.name = name;
		this.yearOfRelease = yearOfRelease;
		this.rating = rating;
		this.runDays = runDays;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYearOfRelease() {
		return yearOfRelease;
	}
	public void setYearOfRelease(int yearOfRelease) {
		this.yearOfRelease = yearOfRelease;
	}
	public float getRating() {
		return rating;
	}
	public void setRating(float rating) {
		this.rating = rating;
	}
	public int getRunDays() {
		return runDays;
	}
	public void setRunDays(int runDays) {
		this.runDays = runDays;
	}

	@Override
	public int compareTo(Movie movie2) {
		
		// Descending order - based on rating 
		Movie movie1 = this;
		
		if (movie1.rating < movie2.rating) {
			return +1;
		}else if (movie1.rating > movie2.rating) {
			return -1;
		}else {
			return 0;
		}
		
		
		// Ascending Order - based on ratings
		/*Movie movie1 = this;
		
		if (movie1.rating < movie2.rating) {
			return -1;
		}else if (movie1.rating > movie2.rating) {
			return +1;
		}else {
			return 0;
		}		*/
	}
	
	public String toString() {
		return "[" + name + ", " + yearOfRelease + "]";
	}
}
