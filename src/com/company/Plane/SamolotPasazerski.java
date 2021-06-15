package com.company.Plane;

public class SamolotPasazerski extends Samolot {

    protected String color;
    protected String przewoznik;
    protected String krajPowstania;
    protected int rokProdukcji;
    protected int iloscMiejscSiedzacych;
    protected int iloscSilnikow;
    protected int iloscKoniMechanicznych;
    protected int wiekMaszyny;



    public SamolotPasazerski(double pozycja, double wektor_ruchu, double pulap, double predkosc, String color, String przewoznik
            , String krajPowstania, int rokProdukcji) {

        super(pozycja, wektor_ruchu, pulap, predkosc);
        this.color = color;
        this.przewoznik = przewoznik;
        this.krajPowstania = krajPowstania;
        this.rokProdukcji = rokProdukcji;
        this.wiekMaszyny=2021-rokProdukcji;

    }

    public int getWiekMaszyny() {
        return wiekMaszyny;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPrzewoznik() {
        return przewoznik;
    }

    public void setPrzewoznik(String przewoznik) {
        this.przewoznik = przewoznik;
    }

    public String getKrajPowstania() {
        return krajPowstania;
    }

    public void setKrajPowstania(String krajPowstania) {
        this.krajPowstania = krajPowstania;
    }

    public int getRokProdukcji() {
        return rokProdukcji;
    }

    public void setRokProdukcji(int rokProdukcji) {
        this.rokProdukcji = rokProdukcji;
    }

    public int getIloscMiejscSiedzacych() {
        return iloscMiejscSiedzacych;
    }

    public void setIloscMiejscSiedzacych(int iloscMiejscSiedzacych) {
        this.iloscMiejscSiedzacych = iloscMiejscSiedzacych;
    }

    public int getIloscSilnikow() {
        return iloscSilnikow;
    }

    public void setIloscSilnikow(int iloscSilnikow) {
        this.iloscSilnikow = iloscSilnikow;
    }

    public int getIloscKoniMechanicznych() {
        return iloscKoniMechanicznych;
    }

    public void setIloscKoniMechanicznych(int iloscKoniMechanicznych) {
        this.iloscKoniMechanicznych = iloscKoniMechanicznych;
    }


    @Override
    public String toString() {
        return super.toString()+","+ color + "," + przewoznik + "," + krajPowstania + "," + rokProdukcji;
    }
}