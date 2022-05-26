package tu_varna.bg;

public class Event {
    private String eventName;
    private Hall hall = null;

    public Event(String eventName, Hall hall) {
        this.eventName = eventName;
        this.hall = hall;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getHallName(){
        return hall.getHallName();
    }
}
