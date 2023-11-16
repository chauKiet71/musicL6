
package Table;


public class ModelAction {
    private Model_Table music;
    private EventAction event;

    public ModelAction() {
    }

    public ModelAction(Model_Table music, EventAction event) {
        this.music = music;
        this.event = event;
    }

    public Model_Table getMusic() {
        return music;
    }

    public void setMusic(Model_Table music) {
        this.music = music;
    }

    public EventAction getEvent() {
        return event;
    }

    public void setEvent(EventAction event) {
        this.event = event;
    }
    
    
}
