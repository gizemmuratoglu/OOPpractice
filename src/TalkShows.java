
/**
 *
 * @author gizem
 */
public class TalkShows implements IFilms{
    private String name;
    private String presenter;
    private double timeOfPart;
    private String writer;

    public TalkShows(String name, String presenter, double timeOfPart, String writer) {
        this.name = name;
        this.presenter = presenter;
        this.timeOfPart = timeOfPart;
        this.writer = writer;
    }

    public String getName() {
        return name;
    }

    public String getPresenter() {
        return presenter;
    }

    public double getTimeOfPart() {
        return timeOfPart;
    }

    public String getWriter() {
        return writer;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPresenter(String presenter) {
        this.presenter = presenter;
    }

    public void setTimeOfPart(double timeOfPart) {
        this.timeOfPart = timeOfPart;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }
    

    @Override
    public void getTime() {
         System.out.println(getName() +  "this talk show's time : "+ timeOfPart);
    }

    @Override
    public void get_Writer() {
        System.out.println("this talk show's writer is :" + writer);
    }

    @Override
    public String toString() {
        return "TalkShows{" + "name=" + name + ", presenter=" + presenter + ", timeOfPart=" + timeOfPart + ", writer=" + writer + '}';
    }
    
    
    
    
}
