import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        Flight flight1 = new Flight(60, "Emirates", "boeing 747",
                "26 jan 2019", "11:00:00", "26 jan 2019", "13:00:00");

        Passenger passenger1 = new Passenger("Dilsukhnagar", "Hyderabad", "telangana", "Sai Venkat"
                , " +91 9505007647", "Ravikantivenkat@gmail.com");
        Regular regularTicket = new Regular("1234ABC", "Hyderabad", "Mumbai", flight1, passenger1, 20,
                10000.0f, true, "Raw Veg meal", "juice", "Chips");
        Tourist touristTicket = new Tourist("1234AAA", "Hyderabad", "Mumbai", flight1, passenger1, 20,
                10000.0f, true, "Taj hotel","five" );
        //System.out.println(regularTicket.getPnr());
        //System.out.println(touristTicket.getPnr());
        System.out.println(regularTicket.getSpecialService());
        System.out.println(flight1.getAirline());
        System.out.println(Arrays.toString(flight1.getFlightDetails()));

        printTicketDetails(regularTicket);
        printTicketDetails(touristTicket);
    }

    public static void printTicketDetails(Ticket ticket){
        System.out.println(ticket.getPnr());
    }
}
