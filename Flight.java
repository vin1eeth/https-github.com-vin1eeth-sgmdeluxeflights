
    public class Flight {


        private int capacity;
        private String airline;
        private String flightName;
        private  String dateOfDep;
        private String timeOfDep;
        private String dateOfArr;
        private  String timeOfArr;
        private int seatsBooked=0;

       public Flight() {
           this( 0 , "flight service provider", "id","26 jan 2019","11:00:00",
                   "26 jan 2019","15:00:00");
       }

        public Flight (int capacity, String airline,
                        String flightName, String dateOfDep, String timeOfDep,
                        String dateOfArr , String timeOfArr) {
            this.capacity = capacity;
            this.airline = airline;
            this.flightName = flightName;
            this.dateOfDep = dateOfDep;
            this.timeOfDep = timeOfDep;
            this.dateOfArr = dateOfArr;
            this.timeOfArr = timeOfArr;
        }

        public Flight (Flight flight) {
            //this.id = flight.id;
           this.capacity = flight.capacity;
          this.airline = flight.airline;
          this.flightName = flight.flightName;
           this.dateOfDep = flight.dateOfDep;
           this.timeOfDep = flight.timeOfDep;
            this.dateOfArr = flight.dateOfArr;
            this.timeOfArr = flight.timeOfArr;
        }


//setters and getters
        public int getCapacity() {

            return capacity;
        }

        public void setCapacity(int capacity) {

            this.capacity = capacity;
        }

        public String getAirline() {

            return airline;
        }

        public void setAirline(String airline) {

            this.airline = airline;
        }

        public String getFlightName() {

            return flightName ;
        }

        public  void setFlightName(String flightName) {

            this.flightName= flightName;
        }

        public String getDateOfDep() {

            return dateOfDep;
        }

        public void setDateOfDep(String dateOfDep) {

            this.dateOfDep = dateOfDep;
        }

        public String getTimeOfDep() {

            return timeOfDep;
        }

        public void setTimeOfDep(String  timeOfDep) {

            this.timeOfDep = timeOfDep;
        }

        public String getDateOfArr() {

            return dateOfArr;
        }

        public void setDateOfArr(String dateOfArr) {

            this.dateOfArr = dateOfArr;
        }

        public String getTimeOfArr() {
            return  timeOfArr;
        }

        public void setTimeOfArr(String timeOfArr) {
            this.timeOfArr = timeOfArr;
        }
        public  int getSeatsBooked(){
           return  seatsBooked;
        }
        public  void setSeatsBooked(int seatsBooked){
           this.seatsBooked = seatsBooked;
        }

        public String[]  getFlightDetails()
        {
            String[] array = {flightName,airline,dateOfDep,dateOfArr,timeOfDep,timeOfArr,String.valueOf(capacity)};
            return  array;
        }
        public  int seatsRemained(){
           return  capacity - seatsBooked;
        }
        public  void noOfSeatsBooked(){
            seatsBooked++;
        }

    }
