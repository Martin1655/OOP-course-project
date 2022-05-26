package tu_varna.bg;

public class Hall {
    private int seats;
    private int availableSeats;
    private String hallName;

    public Hall(int seats, String hallName) {
        this.seats = seats;
        this.availableSeats=seats;
        this.hallName = hallName;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public String getHallName() {
        return hallName;
    }

    public void setHallName(String hallName) {
        this.hallName = hallName;
    }

    public void reserveSeat(){
        if(availableSeats>0){
            availableSeats-=1;
            return;
        }
        System.err.printf("No more seats available at this hall");
    }

    public void emptyHall(){
        availableSeats=seats;
    }
}
