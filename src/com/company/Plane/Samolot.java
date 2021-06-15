package com.company.Plane;

import static java.lang.Math.sqrt;

public class Samolot extends Exception{

    protected double pozycja; // x
    protected double wektor_ruchu; // y
    protected double pulap; // z
    protected double predkosc;

    public Samolot(double pozycja, double wektor_ruchu, double pulap, double predkosc) {
        this.pozycja = pozycja;
        this.wektor_ruchu = wektor_ruchu;
        this.pulap = pulap;
        this.predkosc = predkosc;
    }

    @Override
    public String toString() {
        return pozycja+ "," +wektor_ruchu+ "," +pulap+ "," +predkosc;
    }

    public double odleglosc(){
        return sqrt(pozycja*pozycja+wektor_ruchu*wektor_ruchu+pulap*pulap);
    }
}
