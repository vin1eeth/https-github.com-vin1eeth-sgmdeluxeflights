import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;


public abstract class Ticket {

    private String pnr;
    private String departure;
    private String destination;
    private Flight flight;
    private Passenger passenger;
    private int seatNo;
    private float ticketPrice;
    private boolean ticketStatus;


    Flight obj = new Flight();


    public Ticket(String pnr, String departure, String destination, Flight flight, Passenger passenger, int seatNo, float ticketPrice,
                  boolean ticketConfirmed) {
        this.pnr = pnr;
        this.departure = departure;
        this.destination = destination;
        this.flight = flight;
        this.passenger = passenger;
        this.seatNo = seatNo;
        this.ticketPrice = ticketPrice;
        this.ticketStatus = ticketConfirmed;

    }

    public void getTicketConfirmed() {
        ticketStatus = true;
        obj.setSeatsBooked(obj.getSeatsBooked() + 1);
    }

    public void getTicketCancel() {
        ticketStatus = false;
        obj.setSeatsBooked(obj.getSeatsBooked() - 1);
    }

    public String durationOfJourney() throws ParseException {

        SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
        Date time1 = format.parse(obj.getTimeOfDep());
        Date time2 = format.parse(obj.getTimeOfArr());


        long journeytime = Math.abs(time1.getTime() - time2.getTime());
        long seconds = journeytime / 1000 % 60;
        long minutes = journeytime / (60 * 1000) % 60;
        long hours = journeytime/ (60 * 60 * 1000) % 24;
        return "Duration of journey : " + hours + " hours " + minutes + " minutes " + seconds + " seconds";
    }
    public void passengerDetails(){
        System.out.println(passenger.getAddressDetails());
        System.out.println(passenger.getAddressDetails());
    }

    public String getPnr() {
        return pnr;
    }

    public void setPnr(String pnr) {
        this.pnr = pnr;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public int getSeatNo() {
        return seatNo;
    }

    public void setSeatNo(int seatNo) {
        this.seatNo = seatNo;
    }

    public float getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(float ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public boolean isTicketStatus() {
        return ticketStatus;
    }

    public void setTicketStatus(boolean ticketStatus) {
        this.ticketStatus = ticketStatus;
    }

    public boolean isTicketStatus(boolean ticketStatus) {
        return this.ticketStatus;
    }
}
