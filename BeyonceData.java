import java.util.ArrayList;

public class BeyonceData {
  private ArrayList<Song> hits;
  private ArrayList<Movie> movies;

  public BeyonceData(ArrayList<Song> hits, ArrayList<Movie> movies) {
    this.hits = hits;
    this.movies = movies;
  }

  public ArrayList<Song> getHits() {
    return hits;
  }

  public ArrayList<Movie> getMovies() {
    return movies;
  }
}
