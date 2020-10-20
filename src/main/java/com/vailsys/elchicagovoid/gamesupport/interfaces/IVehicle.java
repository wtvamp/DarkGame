package com.vailsys.elchicagovoid.gamesupport.interfaces;

public interface IVehicle {
    public Boolean drive();
    public Boolean brake();
    public String turn();
    public void honk();
    public void hold(Object item);
    public void shield();
    public void crash();
}