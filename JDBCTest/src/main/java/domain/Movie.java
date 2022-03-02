package domain;

public class Movie {
	
	private int Id;
	private String name;
	private String genre;
	private int rating;
//	private boolean IsSeries;
	
	public Movie() {}
	
	public Movie(int Id, String name, String genre, int rating) {
		int id = Id;
		this.name = name;
		this.genre = genre;
		this.rating = rating;
//		this.IsSeries = IsSeries;
	}
	
	public Movie (String name, String genre, int rating) {
		this.name = name;
		this.genre = genre;
		this.rating = rating;
//		this.IsSeries = IsSeries;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		this.Id = id;
	}

	@Override
	public String toString() {
		return "Movie: Id= " + Id 
				+ ", name= " + name 
				+ ", genre= " + genre 
				+ ", rating= " + rating; 
	}

	
	
//	public boolean isIsSeries() {
//		return IsSeries;
//	}
//
//	public void setIsSeries(boolean isSeries) {
//		IsSeries = isSeries;
//	}
}
