package com.company.Plane;

public class SamolotRakieta extends Samolot{

    protected String color;
    protected String przewoznik;
    protected String krajPowstania;
    protected String cel;
    protected int rokProdukcji;
    protected int iloscAstronautow;
    protected int rokWylotu;
    protected int iloscKoniMechanicznych;
    protected int wiekMaszyny;
    protected String[] astronauci = new String[iloscAstronautow];

    public SamolotRakieta(double pozycja, double wektor_ruchu,
                          double pulap, double predkosc, String color, String przewoznik, String cel, int rokProdukcji, int iloscAstronautow) {
        super(pozycja, wektor_ruchu, pulap, predkosc);
        this.color = color;
        this.przewoznik = przewoznik;
        this.cel = cel;
        this.rokProdukcji = rokProdukcji;
        this.iloscAstronautow = iloscAstronautow;
        this.wiekMaszyny = 2021-rokProdukcji;
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

    public String getCel() {
        return cel;
    }

    public void setCel(String cel) {
        this.cel = cel;
    }

    public int getRokProdukcji() {
        return rokProdukcji;
    }

    public void setRokProdukcji(int rokProdukcji) {
        this.rokProdukcji = rokProdukcji;
    }

    public int getIloscAstronautow() {
        return iloscAstronautow;
    }

    public void setIloscAstronautow(int iloscAstronautow) {
        this.iloscAstronautow = iloscAstronautow;
    }

    public int getRokWylotu() {
        return rokWylotu;
    }

    public void setRokWylotu(int rokWylotu) {
        this.rokWylotu = rokWylotu;
    }

    public int getIloscKoniMechanicznych() {
        return iloscKoniMechanicznych;
    }

    public void setIloscKoniMechanicznych(int iloscKoniMechanicznych) {
        this.iloscKoniMechanicznych = iloscKoniMechanicznych;
    }

    public int getWiekMaszyny() {
        return wiekMaszyny;
    }

    public void setWiekMaszyny(int wiekMaszyny) {
        this.wiekMaszyny = wiekMaszyny;
    }

    public String[] getAstronauci() {
        return astronauci;
    }

    public void setAstronauci(String astronauci) throws Exception{

        if(this.astronauci[iloscAstronautow-1]!=null)
            throw new Exception("Blad1");
        else{
            for(int i=0; i<this.astronauci.length; i++)
                if(this.astronauci[i]==null){
                    this.astronauci[i]=astronauci;
                    continue;
                }
        }
    }

    public void makeAstronauciNull(){
        for(int i=0; i<astronauci.length; i++){
            astronauci[i]=null;
        }
    }

    public void changeAstronauta(String pierwszy, String drugi) throws Exception{

        boolean check = false;

        for(int i=0; i<astronauci.length; i++)
            if(astronauci[i].equals(pierwszy)) {
                astronauci[i] = drugi;
                check = true;
                continue;
            }
        if(!check)
            throw new Exception("Blad2");
    }

    @Override
    public String toString() {
        return super.toString()+","+color + "," + przewoznik + "," + krajPowstania + "," + cel + "," + rokProdukcji + "," + iloscAstronautow + "," +
                rokWylotu + "," + iloscKoniMechanicznych + "," + wiekMaszyny;
    }
}
