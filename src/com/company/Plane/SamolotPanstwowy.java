package com.company.Plane;

public class SamolotPanstwowy extends Samolot{

    protected String color;
    protected String panstwo;
    protected String krajPowstania;
    protected int rokProdukcji;
    protected String[] pasazerowie = new String[3]; //3 ostatnich prezydentow

    public SamolotPanstwowy(double pozycja, double wektor_ruchu, double pulap,
                            double predkosc, String color, String panstwo, String krajPowstania, int rokProdukcji) {
        super(pozycja, wektor_ruchu, pulap, predkosc);
        this.color = color;
        this.panstwo = panstwo;
        this.krajPowstania = krajPowstania;
        this.rokProdukcji = rokProdukcji;
    }

    public void addPasazer(String string){
        if(pasazerowie[2]==null){
            for(int i=0; i<pasazerowie.length; i++)
                if(pasazerowie[i]==null){
                    pasazerowie[i]=string;
                    break;
                }
        }
        else{
            pasazerowie[0]=pasazerowie[1]; //ewentualnie petla
            pasazerowie[1]=pasazerowie[2];
            pasazerowie[2]=string;
        }
    }

    public String getPasazer(){
        String string = "";
        for(int i=0; i<pasazerowie.length; i++){
            if(pasazerowie[i]!=null){
                string=string+" "+pasazerowie[i];
            }
        }
        return string;
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

    public int getRokProdukcji() {
        return rokProdukcji;
    }

    public int getWiek() { return 2021-rokProdukcji; }

    public void setRokProdukcji(int rokProdukcji) {
        this.rokProdukcji = rokProdukcji;
    }

    @Override
    public String toString() {
        return super.toString()+","+color + "," + panstwo + "," + krajPowstania + "," + rokProdukcji;
    }
}