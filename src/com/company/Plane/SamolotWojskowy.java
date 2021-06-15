package com.company.Plane;

public class SamolotWojskowy extends Samolot {

    protected String color;
    protected String kraj;
    protected int waga;
    protected int iloscPilotow;
    protected String[] piloci = new String[iloscPilotow];

    public SamolotWojskowy(double pozycja, double wektor_ruchu, double pulap,
                           double predkosc, String color, String kraj, int waga, int iloscPilotow) {
        super(pozycja, wektor_ruchu, pulap, predkosc);
        this.color = color;
        this.kraj = kraj;
        this.waga = waga;
        this.iloscPilotow = iloscPilotow;
    }

    public void setPiloci(String piloci) throws Exception{
        if(this.piloci[iloscPilotow-1]==null){
            for(int i=0; i<piloci.length(); i++)
                if(this.piloci[i]==null){
                    this.piloci[i]=piloci;
                    continue;
                }
        }
        else
            throw new Exception("blad5");
    }

    public void makePilociNull(){
        for (int i=0; i<piloci.length; i++)
            piloci[i]=null;
    }

    public String getPiloci(){
        String string = "";
        for(int i=0; i<piloci.length; i++)
            if(piloci[i]!=null)
                string = string + " " + piloci[i];

        return string;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getKraj() {
        return kraj;
    }

    public void setKraj(String kraj) {
        this.kraj = kraj;
    }

    public int getWaga() {
        return waga;
    }

    public void setWaga(int waga) {
        this.waga = waga;
    }

    public int getIloscPilotow() {
        return iloscPilotow;
    }

    public void setIloscPilotow(int iloscPilotow) {
        this.iloscPilotow = iloscPilotow;
    }

    @Override
    public String toString() {
        return super.toString()+","+color + "," + kraj + "," + waga + "," + iloscPilotow;
    }
}
