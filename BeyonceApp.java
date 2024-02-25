import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class BeyonceApp {
  private static BeyonceData beyonceData;

  public static void main(String[] args) {
    beyonceData = SeedData.getData();

    System.out.println("#1");
    printAllSongs();

    System.out.println("#2");
    printAllMovies();

    System.out.println("#3");
    List<String> songTitles = getSongTitles();
    printList(songTitles);

    System.out.println("#4");
    List<Integer> fiercenesses = getAllFiercenessLevels();
    printList(fiercenesses);

    System.out.println("#5");
    List<Song> bodySuitSongs = getBodySuitSongs();
    printList(bodySuitSongs);

    System.out.println("#6");
    List<Song> fiercenessGreaterThan7 = getFiercenessGreaterThan(7);
    printList(fiercenessGreaterThan7);

    System.out.println("#7");
    List<Movie> moviesAfter2006 = getMoviesMadeAfter2006();
    printList(moviesAfter2006);

    System.out.println("#8");
    List<Song> hitSongsFromGroups = getHitSongsFromGroups();
    printList(hitSongsFromGroups);

    System.out.println("#9");
    Song hitSongWhileBlonde = findHitSongWhileBlonde();
    printItem(hitSongWhileBlonde);

    System.out.println("#10");
    Song sorry = findSorry();
    printItem(sorry);

    System.out.println("#11");
    Song song = find("Say My Name");
    printItem(song);

    System.out.println("#12");
    List<Song> fiercestSongs = getMaximumFierceness();
    printList(fiercestSongs);

    // Return the sum of Beyonce's fierceness value for all of her hit songs
    // Return the average fierceness value for all of her hit songs
    // Return the sum of Beyonce's rating value for all of her movies
    // Return the average rating value for all of her movies
    // Return the sum of the total number of dancers in all of the hit song videos
    // Return an array of Beyonce's hairstyles without repeats
    // Return an object where the properties are song names and the value is an object which contains that song's fierceness and the average fierceness for all songs
    // Return an object where the properties are movie names and the value is an object which contains that movie's rating and the average rating for all movies
    // Return an object with Beyonce's hairstyles as the keys and a tally of each hairstyle, eg. { "blonde": 3, ... }
  }

// 1. Print all the songs
  private static void printAllSongs(){
    beyonceData.getHits().stream().forEach(song -> System.out.println(song));
  }

  // 2. Print all the movies
  private static void printAllMovies() {
  }

  // 3. Return an array of all Beyonce's hit song titles
  private static List<String> getSongTitles() {
    return new ArrayList<String>();
  }

  // 4. Return an array of all Beyonce's fierceness ratings
  private static List<Integer> getAllFiercenessLevels(){
    return beyonceData.getHits()
      .stream()
      .map(song -> song.getFierceness())
      .collect(Collectors.toList());
  }

  // 5. Return all the songs where Beyonce is wearing a bodysuit or a bodysuit is part of the video theme
  private static List<Song> getBodySuitSongs() {
    return new ArrayList<Song>();
  }

  // 6. Return an array with all of the songs where Beyonce's fierceness is greater than or equal to a given number
  private static List<Song> getFiercenessGreaterThan(int fierceness) {
    return new ArrayList<Song>();
  }

  // 7. Return an array with all of the movies Beyonce made in 2006 and after
  private static List<Movie> getMoviesMadeAfter2006() {
    return new ArrayList<Movie>();
  }

  // 8. Return all the hit songs where Beyonce was in a group
  private static List<Song> getHitSongsFromGroups() {
    return new ArrayList<Song>();
  }

  // 9. Return a hit song where Beyonce's hair is blonde
  private static Song findHitSongWhileBlonde() {
    return null;
  }

  // 10. Return the hit song "Sorry"
  private static Song findSorry() {
    return null;
  }

  // 11. Return a given song
  private static Song find(String title) {
    return null;
  }

  // 12. Return all hit songs where Beyonce's fierceness rating is 10
  private static List<Song> getMaximumFierceness() {
    return new ArrayList<Song>();
  }

  // Utilities
  private static void printList(List<?> list){
    list.stream().forEach(item -> System.out.println(item));
  }
  private static void printItem(Object item){
    System.out.println(item);
  }
}
