public class Regular extends Ticket {
 private  String food;
 private String water;
 private String snacks;


 public  Regular(String pnr, String departure, String destination,Flight flight,Passenger passenger, int seatNo, float ticketPrice,
                 boolean ticketConfirmed, String food, String  water , String snacks){
     super(pnr,departure,destination, flight,passenger,seatNo,ticketPrice,ticketConfirmed);
     this.food = food;
     this.water  = water;
     this.snacks = snacks;
 }

 // getter and setters
    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getWater() {
        return water;
    }

    public void setWater(String water) {
        this.water = water;
    }

    public String getSnacks() {
        return snacks;
    }

    public void setSnacks(String snacks) {
        this.snacks = snacks;
    }
 //method
    public String getSpecialService(){
        return this.food +" "+this.water+" "+this.snacks;
    }



}
