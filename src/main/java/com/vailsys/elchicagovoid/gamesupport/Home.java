package com.vailsys.elchicagovoid.gamesupport;


    public class Home
    {
        public int floors;
        public int windows;
        public String address;
        public int fireEscp;
        public int garage;

        // public void home()
        // {
        //     System.out.println("Your home has " + floors + " floor(s) and also has " + windows +" window(s)");
        // }
   
     public Home (int floorsFromApp, int windowsFromApp, String addressFromApp, int fireEscpFromApp, int garageFromApp){
        this.floors = floorsFromApp;
        this.windows = windowsFromApp;
        this.address = addressFromApp;
        this.fireEscp = fireEscpFromApp;
        this.garage = garageFromApp;
     }
   }
       