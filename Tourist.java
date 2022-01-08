public class Tourist extends Ticket {
    private String hotelLocation;
    private String[] touristLoc = new String[5];


    public Tourist(String pnr, String departure, String destination, Flight flight, Passenger passenger, int seatNo, float ticketPrice,
                   boolean ticketConfirmed, String hotelLocation, String touristLoc) {
        super(pnr, departure, destination, flight, passenger, seatNo, ticketPrice, ticketConfirmed);
        this.hotelLocation = hotelLocation;
    }

    public String getHotelLocation() {
        return hotelLocation;
    }

    public void setHotelLocation(String hotelLocation) {
        this.hotelLocation = hotelLocation;
    }

    public String[] getTouristLoc() {
        return touristLoc;
    }

    public void setTouristLoc(String[] touristLoc) {
        this.touristLoc = touristLoc;
    }
// method
    public void addLocation(String location1) {
        touristLoc = new String[]{location1};
    }

    public void addLocation(String location1, String location2) {
        touristLoc = new String[]{location1, location2};
    }

    public void addLocation(String location1, String location2, String location3) {
        touristLoc = new String[]{location1, location2, location3};
    }

    public void addLocation(String location1, String location2, String location3, String location4) {
        touristLoc = new String[]{location1, location2, location3, location4};
    }

    public void addLocation(String location1, String location2, String location3, String location4, String location5) {
        touristLoc = new String[]{location1, location2, location3, location4, location5};
    }

    public void removeLocation(String location1) {
        for(int i=0;i<touristLoc.length;i++)
            if(touristLoc[i]==location1)
                touristLoc[i] = null;
    }

    public void removeLocation(String location1,String location2) {
        for(int i=0;i<touristLoc.length;i++)
            if(touristLoc[i]==location1 || touristLoc[i] == location2)
                touristLoc[i] = null;
    }
    public void removeLocation(String location1,String location2,String location3) {
        for(int i=0;i<touristLoc.length;i++)
            if(touristLoc[i]==location1 || touristLoc[i] == location2 || touristLoc[i] == location3)
                touristLoc[i] = null;
    }
    public void removeLocation(String location1,String location2,String location3,String location4) {
        for(int i=0;i<touristLoc.length;i++)
            if(touristLoc[i]==location1 || touristLoc[i] == location2 || touristLoc[i] == location3 || touristLoc[i] == location4)
                touristLoc[i] = null;
    }
    public void removeLocation(String location1,String location2,String location3,String location4,String location5) {
        for(int i=0;i<touristLoc.length;i++)
            if(touristLoc[i]==location1 || touristLoc[i] == location2 || touristLoc[i] == location3 ||
                    touristLoc[i] == location4 || touristLoc[i] == location5)
                touristLoc[i] = null;
    }
}

