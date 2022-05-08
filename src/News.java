/**
 *
 * @author gizem
 */
public class News implements IFilms{
    private String channelName;
    private String presenterName;
    private double timeOfPart;
    private String writer;

    public News(String channelName, String presenterName, int timeOfPart, String writer) {
        this.channelName = channelName;
        this.presenterName = presenterName;
        this.timeOfPart = timeOfPart;
        this.writer = writer;
    }

    public String getChannelName() {
        return channelName;
    }

    public String getPresenterName() {
        return presenterName;
    }

    public double getTimeOfPart() {
        return timeOfPart;
    }

    public String getWriter() {
        return writer;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    public void setPresenterName(String presenterName) {
        this.presenterName = presenterName;
    }

    public void setTimeOfPart(int timeOfPart) {
        this.timeOfPart = timeOfPart;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    @Override
    public String toString() {
        return "News{" + "channelName=" + channelName + ", presenterName=" + presenterName + ", timeOfPart=" + timeOfPart + ", writer=" + writer + '}';
    }
    

    @Override
    public void getTime() {
        System.out.println("this new's time : "+ timeOfPart);
    }

    @Override
    public void get_Writer() {
      System.out.println(getChannelName()+" this new's writer is :" + writer);
    }

   
    
    
}
