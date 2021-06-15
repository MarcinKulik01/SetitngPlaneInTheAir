package com.company.Plane;

public class SamolotCargo extends Samolot{

    protected String color;
    protected String panstwo;
    protected String krajPowstania;
    protected String przewoznik;
    protected String produkt;
    protected int rokProdukcji;
    protected int masa;
    protected int masaMaksymalna;

    public SamolotCargo(double pozycja, double wektor_ruchu, double pulap, double predkosc, String color, String panstwo,
                        String krajPowstania, String przewoznik, String produkt, int rokProdukcji, int masa, int masaMaksymalna) {
        super(pozycja, wektor_ruchu, pulap, predkosc);
        this.color = color;
        this.panstwo = panstwo;
        this.krajPowstania = krajPowstania;
        this.przewoznik = przewoznik;
        this.produkt = produkt;
        this.rokProdukcji = rokProdukcji;
        this.masa = masa;
        this.masaMaksymalna = masaMaksymalna;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPanstwo() {
        return panstwo;
    }

    public void setPanstwo(String panstwo) {
        this.panstwo = panstwo;
    }

    public String getKrajPowstania() {
        return krajPowstania;
    }

    public void setKrajPowstania(String krajPowstania) {
        this.krajPowstania = krajPowstania;
    }

    public String getPrzewoznik() {
        return przewoznik;
    }

    public void setPrzewoznik(String przewoznik) {
        this.przewoznik = przewoznik;
    }

    public String getProdukt() {
        return produkt;
    }

    public void setProdukt(String produkt) {
        this.produkt = produkt;
    }

    public int getRokProdukcji() {
        return rokProdukcji;
    }

    public void setRokProdukcji(int rokProdukcji) {
        this.rokProdukcji = rokProdukcji;
    }

    public int getMasa() {
        return masa;
    }

    public void setMasa(int masa) {
        this.masa = masa;
    }

    public int getMasaMaksymalna() {
        return masaMaksymalna;
    }

    public void setMasaMaksymalna(int masaMaksymalna) {
        this.masaMaksymalna = masaMaksymalna;
    }

    public void czyWystartuje() throws Exception{
        if(masa>masaMaksymalna)
            throw new Exception("Blad4");
        else
            System.out.println("wystartuje");
    }

    @Override
    public String toString() {
        return  super.toString()+","+color + ',' + panstwo + "," + krajPowstania + "," + przewoznik + "," + produkt + "," + rokProdukcji + "," + masa + "," + masaMaksymalna;
    }
}