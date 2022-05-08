
/**
 *
 * @author gizem
 */
public class Main {
    public static void main(String[] args) {
     HorrorFilms film =new HorrorFilms(2019, 6.0 , "horror ", "Alper Mestçi ", "Siccin 6", 98);
     film.releaseDate();
     film.getIMDB();
     film.getTime();
     film.get_Writer(); System.out.println("\n");
     
     Movies movie=new Movies("Lucifer", 19 , "fantastic", 5 , 43 , "Mike Carey");
     
     movie.get_Writer();
     movie.getTime();
        System.out.println("\n");
     TalkShows talk = new TalkShows("The Tonight Show Starring Jimmy Fallon", "Jimmy Fallon" ,48, "Jimmy Falon, Arthur Meyer" );
     talk.getTime();
     talk.get_Writer();
        System.out.println("\n");
     Documentary doc= new Documentary("As It Happens: Pacific Crest Trail", "Kate Humbel", "Andy Laub", 86 , "Pacific");
     doc.get_Writer();
     doc.getTime();
        System.out.println("\n");
     News nw=new News("CNN", "Fulya Kafka", 120 , "Beste Naz Köksal, Can Aydoğmuş");
     nw.get_Writer();
     nw.getTime();
        System.out.println("\n");
     CnnNews cnn =new CnnNews("cnn", "Fulya Kafka" , 120,"Beste Naz Köksal");
     cnn.runMethod(false);
}
}