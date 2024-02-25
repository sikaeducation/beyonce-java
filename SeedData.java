import java.util.ArrayList;
import java.util.Arrays;

public class SeedData {
  private static ArrayList<Song> getSongs() {
    ArrayList<Song> songsList = new ArrayList<Song>();
    songsList.add(new Song(
      "Bootylicious",
      true,
      "destinysChild",
      new ArrayList<String>(Arrays.asList("straight", "blonde", "pink tips")),
      "fedora with yellow feather",
      "dressing room dance",
      "Move your body up and down, make your booty touch the ground",
      7,
      false,
      20
    ));
    songsList.add(new Song(
      "Single Ladies",
      false,
      "none",
      new ArrayList<String>(Arrays.asList("honey brown", "half up, half down")),
      "black bodysuit and legs for days",
      "single ladies dance",
      "If you like then you should've put a ring on it",
      10,
      true,
      2
    ));
    songsList.add(new Song(
      "Let Me Upgrade You",
      false,
      "none",
      new ArrayList<String>(Arrays.asList("beaded bun", "wet hair", "honey brown", "waves")),
      "flapper dress and bodysuit",
      "decadence, water, gold beads and pearls",
      "I could do for you what Martin did for the people",
      10,
      true,
      5
    ));
    songsList.add(new Song(
      "Sorry",
      false,
      "none",
      new ArrayList<String>(Arrays.asList("braids", "bun", "blonde", "waves", "bob")),
      "party bus and Serena Williams in bodysuit",
      "braided crown with gold bikini top",
      "Boi bye",
      10,
      false,
      1
    ));
    songsList.add(new Song(
      "Say My Name",
      true,
      "destinysChild",
      new ArrayList<String>(Arrays.asList("blonde", "curly", "braid", "pony tail")),
      "color blocked scenes with group",
      "none",
      "say my name, say my name",
      7,
      true,
      6
    ));
    songsList.add(new Song(
      "Feeling Myself",
      true,
      "Nicki Minaj featuring Beyonce",
      new ArrayList<String>(Arrays.asList("blonde", "waves")),
      "sporty bodysuit",
      "Coachella music festival",
      "Im felling myself",
      9,
      false,
      0
    ));

    return songsList;
  }

  private static ArrayList<Movie> getMovies() {
    ArrayList<Movie> moviesList = new ArrayList<Movie>();
    moviesList.add(
      new Movie("Austin Power's Goldmember", 2002, 5)
    );
    moviesList.add(
      new Movie("Dreamgirls", 2006, 7)
    );
    moviesList.add(
      new Movie("Obsessed", 2009, 6)
    );
    moviesList.add(
      new Movie("Cadillac Records", 2008, 8)
    );
    moviesList.add(
      new Movie("Life is But a Dream", 2013, 6)
    );
    moviesList.add(
      new Movie("The Pink Panther", 2006, 4)
    );
    moviesList.add(
      new Movie("Epic", 2013, 7)
    );
    moviesList.add(
      new Movie("The Fighting Temptations", 2003, 5)
    );

    return moviesList;
  }

  public static BeyonceData getData(){
    return new BeyonceData(getSongs(), getMovies());
  }
}
