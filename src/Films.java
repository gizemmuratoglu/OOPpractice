
/**
 *
 * @author gizem
 */
public abstract class Films implements IFilms{
    
    private String genre;
    private String writer;
    private String name;

    public Films(String genre, String writer, String name) {
        this.genre = genre;
        this.writer = writer;
        this.name = name;
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

    

    public String getWriter() {
        return writer;
    }

  

    public void setWriter(String writer) {
        this.writer = writer;
    }
    

    @Override
    public String toString() {
        return "Movies{" + "genre=" + genre + ", writer=" + writer + '}';
    }
    public void get_Genre(){
        System.out.println("this films' genre is : " + genre);
    }
    abstract void releaseDate();
    abstract void getIMDB();
    
  
}
        
    
    
    
  
    
    

