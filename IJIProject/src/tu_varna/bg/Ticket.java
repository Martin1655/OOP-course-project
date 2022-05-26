package tu_varna.bg;

public class Ticket {
    private String hallName;
    private String seatNumber;
    private String eventName;

    public Ticket(Hall hall, String seatNumber, Event event) {
            this.hallName = hall.getHallName();
            this.seatNumber = seatNumber;
            this.eventName = event.getEventName();
    }

    public String getHallName() {
        return hallName;
    }

    public void setHallName(String hallName) {
        this.hallName = hallName;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "hallName='" + hallName + '\'' +
                ", seatNumber='" + seatNumber + '\'' +
                ", eventName='" + eventName + '\'' +
                '}';
    }
}
