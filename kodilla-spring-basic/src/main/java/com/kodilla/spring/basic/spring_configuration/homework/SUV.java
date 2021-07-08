package com.kodilla.spring.basic.spring_configuration.homework;

public class SUV implements Car {
   boolean headLightsOn = false;


   public boolean hasHeadlightsTurnedOn() {
       return this.headLightsOn;
   }

    public void lightsOn(){
        this.headLightsOn = true;
    }

    public void lightsOff(){
        this.headLightsOn = false;
    }

    @Override
    public String getCarType() {
        return "SUV";
    }


}
