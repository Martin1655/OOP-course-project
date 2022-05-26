package tu_varna.bg;

public class Main {

    public static void main(String[] args) {
	Hall varna = new Hall(200,"Varna");
    Event varnaRock = new Event("Varna Rock",varna);
    Ticket a1 = new Ticket(varna,"A12",varnaRock);

        System.out.printf(a1.toString());
    }
}
