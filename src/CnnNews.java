
/**
 *
 * @author gizem
 */
public class CnnNews extends News{

    public CnnNews(String channelName, String presenterName, int time, String writers) {
        super(channelName, presenterName, time, writers);
    }
    public void runMethod(boolean a){
        Scenario scen=new Scenario();
        scen.scenar();
        if (a== true) {
            System.out.println(super.getChannelName() +" Has a scenario.");
            
        }
        else
            System.out.println(super.getChannelName()+" No scenario yet.");
        
    
    
}
}
