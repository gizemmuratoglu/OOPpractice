
/**
 *
 * @author gizem
 */
public class Documentary implements IFilms{
    private String name;
    private String presenter;
    private String writer;
    private double timeOfPart;
    private String area;

    public Documentary(String name, String presenter, String writer, double timeOfPart, String area) {
        this.name = name;
        this.presenter = presenter;
        this.writer = writer;
        this.timeOfPart = timeOfPart;
        this.area = area;
    }

    public String getName() {
        return name;
    }

    public String getPresenter() {
        return presenter;
    }

    public String getWriter() {
        return writer;
    }

    public double getTimeOfPart() {
        return timeOfPart;
    }

    public String getArea() {
        return area;
    }
   
    public void setName(String name) {
        this.name = name;
    }

    public void setPresenter(String presenter) {
        this.presenter = presenter;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public void setTimeOfPart(double timeOfPart) {
        this.timeOfPart = timeOfPart;
    }

    public void setArea(String area) {
        this.area = area;
    }
    

    @Override
    public void getTime() {
         System.out.println("this documentary's time : "+ timeOfPart);
    }

    @Override
    public void get_Writer() {
        System.out.println(getName()+" this documentary's writer is :" + writer);
    }
    

    
    
    
}
