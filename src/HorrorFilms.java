
/**
 *
 * @author gizem
 */
public class HorrorFilms extends Films{
 private int date;
private double imdb;
private double time;

    public HorrorFilms(int date, double imdb, String genre, String writer, String name, double time) {
        super(genre, writer, name);
        this.date = date;
        this.imdb = imdb;
        this.time=time;
    }

   

    @Override
    public String toString() {
        return "HorrorFilms{" 
                + "date : " + date + "IMDB : "+ imdb;
    }
    

    public double getImdb() {
        return imdb;
    }

    public void setImdb(double imdb) {
        this.imdb = imdb;
    }
   

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    
    @Override
    void releaseDate() {
        System.out.println(getName()+" release date is : " + date);
    }

    @Override
    void getIMDB() {
        System.out.println("IMDB: "+ imdb);
    }

    public double get_Time() {
        return time;
    }

    
    @Override
    public void getTime() {
        System.out.println("This film's time: " + get_Time());
    }

    @Override
    public void get_Writer() {
        System.out.println("This film's writer : "+ getWriter());
    }
    

   
    
    

  
    
}
