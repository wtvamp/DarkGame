package com.vailsys.elchicagovoid.gamesupport;


    public class Home
    {
        private int floors;

        public int getFloors() {
          return floors;
        }

        public void setFloors(int floorSetter){
           this.floors = floorSetter;
        }

        private int windows;
        
        public int getWindows() {
           return windows;
        }

        public void setWindows(int windowSetter){
           this.windows = windowSetter; 
        }
   
        private String address;

        public String getAdrees(){
           return address;
        }

        public void setAdress(String adressSetter){
           this.address = adressSetter;
        }

        private int fireEscape;
        
        public int getFireEscape(){
           return fireEscape;
        }

        public void setFireEscape(int fireEscapeSetter){
           this.fireEscape = fireEscapeSetter; 
        }
        private int garage;

        public int getGarage(){
           return garage;
        }

        public void setGarage(int garageSetter){
           this.garage = garageSetter;
        }

   


        // public void home()
        // {
        //     System.out.println("Your home has " + floors + " floor(s) and also has " + windows +" window(s)");
        // }
   
     public Home (int floorsFromApp, int windowsFromApp, String addressFromApp, int fireEscpFromApp, int garageFromApp){
        this.floors = floorsFromApp;
        this.windows = windowsFromApp;
        this.address = addressFromApp;
        this.fireEscape = fireEscpFromApp;
        this.garage = garageFromApp;
     }
   }
       