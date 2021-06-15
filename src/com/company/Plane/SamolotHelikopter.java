package com.company.Plane;

public class SamolotHelikpoter extends Samolot{

    protected String color;
    protected int iloscSmigiel;
    protected String model;
    protected int rokProdukcji;

    public SamolotHelikpoter(double pozycja, double wektor_ruchu, double pulap, double predkosc,
                             String color, int iloscSmigiel, String model, int rokProdukcji) {

        super(pozycja, wektor_ruchu, pulap, predkosc);
        this.color = color;
        this.iloscSmigiel = iloscSmigiel;
        this.model = model;
        this.rokProdukcji = rokProdukcji;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getIloscSmigiel() {
        return iloscSmigiel;
    }

    public void setIloscSmigiel(int iloscSmigiel) {
        this.iloscSmigiel = iloscSmigiel;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRokProdukcji() {
        return rokProdukcji;
    }

    public void setRokProdukcji(int rokProdukcji) {
        this.rokProdukcji = rokProdukcji;
    }

    public int getWiek(){
        return 2021-rokProdukcji;   //mozna by uzyc metody pobierajacej date
        // ale nie jestem pewien czy mozna (mozliwosc modyfikacji)
    }

    @Override
    public String toString() {
        return  super.toString()+","+color + "," + iloscSmigiel + "," + model + "," + rokProdukcji;
    }
}