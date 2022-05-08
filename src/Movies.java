
/**
 *
 * @author gizem
 */
public class Movies implements IFilms{
    private String name;
    private int numOfArtists;
    private String genre;
    private int numOfSession;
    private double timeOfPart;
    private String writer;

    public Movies(String name, int numOfArtists, String genre, int numOfSession, double timeOfPart, String writer) {
        this.name = name;
        this.numOfArtists = numOfArtists;
        this.genre = genre;
        this.numOfSession = numOfSession;
        this.timeOfPart = timeOfPart;
        this.writer = writer;
    }

    public double getTimeOfPart() {
        return timeOfPart;
    }

    public String getWriter() {
        return writer;
    }

    public void setTimeOfPart(double timeOfPart) {
        this.timeOfPart = timeOfPart;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    @Override
    public String toString() {
        return "Movies{" + "name=" + name + ", numOfArtists=" + numOfArtists + ", genre=" + genre + ", numOfSession=" + numOfSession + ", timeOfPart=" + timeOfPart + ", writer=" + writer + '}';
    }
    

    public String getName() {
        return name;
    }

    public int getNumOfArtists() {
        return numOfArtists;
    }

    public String getGenre() {
        return genre;
    }

    public int getNumOfSession() {
        return numOfSession;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumOfArtists(int numOfArtists) {
        this.numOfArtists = numOfArtists;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setNumOfSession(int numOfSession) {
        this.numOfSession = numOfSession;
    }
    

    @Override
    public void getTime() {
        System.out.println("this episode's time : "+ timeOfPart);
    }

    @Override
    public void get_Writer() {
        System.out.println(getName()+" this movie's writer is :" + writer);
    }

   
  
   
    
    

    
}
