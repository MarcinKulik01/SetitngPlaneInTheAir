package com.company;

import com.company.Plane.*;

import java.io.*;
import java.util.Random;

public class Main {

    public static void main(String[] args) throws IOException {

        Samolot[] samolot2 = new Samolot[60];

        samolot2[0] = new SamolotCargo(5, 5, 5, 10, "bialy", "Polska", "Niemcy", "LOT", "granit", 2000, 200021, 216666600);
        samolot2[1] = new SamolotCargo(5, 5, 5, 10, "czarny", "Czechy", "Niemcy", "WIZZ", "granit", 2002, 200023, 216666600);
        samolot2[2] = new SamolotCargo(5, 5, 5, 10, "niebieski", "Bialorus", "Niemcy", "LOT", "granit", 2003, 2004210, 21066660);
        samolot2[3] = new SamolotCargo(5, 5, 5, 10, "zolty", "Ukraina", "Niemcy", "LOT", "granit", 2004, 2004210, 21066660);
        samolot2[4] = new SamolotCargo(5, 5, 5, 10, "kolorowy", "Grecja", "Niemcy", "LOT", "granit", 2005, 200240, 2105550);
        samolot2[5] = new SamolotCargo(5, 5, 5, 10, "fioletowy", "Szkocja", "Niemcy", "WIZZ", "granit", 1960, 204200, 21055550);
        samolot2[6] = new SamolotCargo(5, 5, 5, 10, "bialoczarny", "Dania", "Niemcy", "Jet2", "granit", 2010, 2001240, 21044440);
        samolot2[7] = new SamolotCargo(5, 5, 5, 10, "flagowy", "USA", "Niemcy", "Jet2", "granit", 2009, 2041219, 21011110);
        samolot2[8] = new SamolotCargo(5, 5, 5, 10, "rozowy", "Francja", "Niemcy", "LOT", "granit", 2010, 2041203, 210111110);
        samolot2[9] = new SamolotCargo(5, 5, 5, 10, "kolorowy", "WielkaBrytania", "Niemcy", "Jet2", "granit", 2004, 2014200, 21222200);

        samolot2[10] = new SamolotHelikpoter(5, 5, 5, 10, "czerwony", 3, "SKIN", 2001);
        samolot2[11] = new SamolotHelikpoter(5, 5, 5, 10, "czerwony", 2, "SKIN1", 2002);
        samolot2[12] = new SamolotHelikpoter(5, 5, 5, 10, "czerwony", 1, "SKIN2", 2003);
        samolot2[13] = new SamolotHelikpoter(5, 5, 5, 10, "czerwony", 5, "SKIN3", 2004);
        samolot2[14] = new SamolotHelikpoter(5, 5, 5, 10, "czerwony", 6, "SKIN4", 2005);
        samolot2[15] = new SamolotHelikpoter(5, 5, 5, 10, "czerwony", 2, "SKIN5", 2006);
        samolot2[16] = new SamolotHelikpoter(5, 5, 5, 10, "czerwony", 3, "SKIN6", 2007);
        samolot2[17] = new SamolotHelikpoter(5, 5, 5, 10, "czerwony", 5, "SKIN7", 2008);
        samolot2[18] = new SamolotHelikpoter(5, 5, 5, 10, "czerwony", 6, "SKIN8", 2009);
        samolot2[19] = new SamolotHelikpoter(5, 5, 5, 10, "czerwony", 7, "SKIN9", 2010);

        samolot2[20] = new SamolotPanstwowy(5, 5, 5, 10, "niebieski", "Polska", "Niemcy", 2004);
        samolot2[21] = new SamolotPanstwowy(5, 5, 5, 10, "niebieski", "Polska", "Niemcy", 2005);
        samolot2[22] = new SamolotPanstwowy(5, 5, 5, 10, "niebieski", "Polska", "Niemcy", 2006);
        samolot2[23] = new SamolotPanstwowy(5, 5, 5, 10, "niebieski", "Polska", "Niemcy", 2007);
        samolot2[24] = new SamolotPanstwowy(5, 5, 5, 10, "niebieski", "Polska", "Niemcy", 2008);
        samolot2[25] = new SamolotPanstwowy(5, 5, 5, 10, "niebieski", "Polska", "Niemcy", 2009);
        samolot2[26] = new SamolotPanstwowy(5, 5, 5, 10, "niebieski", "Polska", "Niemcy", 2002);
        samolot2[27] = new SamolotPanstwowy(5, 5, 5, 10, "niebieski", "Polska", "Niemcy", 2003);
        samolot2[28] = new SamolotPanstwowy(5, 5, 5, 10, "niebieski", "Polska", "Niemcy", 2004);
        samolot2[29] = new SamolotPanstwowy(5, 5, 5, 10, "niebieski", "Polska", "Niemcy", 2005);

        samolot2[30] = new SamolotPasazerski(5, 5, 5, 10, "czarny", "LOT", "Niemcy", 1999);
        samolot2[31] = new SamolotPasazerski(5, 5, 5, 10, "czarny", "LOT", "Niemcy", 1998);
        samolot2[32] = new SamolotPasazerski(5, 5, 5, 10, "czarny", "LOT", "Niemcy", 1997);
        samolot2[33] = new SamolotPasazerski(5, 5, 5, 10, "czarny", "LOT", "Niemcy", 1999);
        samolot2[34] = new SamolotPasazerski(5, 5, 5, 10, "czarny", "LOT", "Niemcy", 1996);
        samolot2[35] = new SamolotPasazerski(5, 5, 5, 10, "czarny", "LOT", "Niemcy", 1995);
        samolot2[36] = new SamolotPasazerski(5, 5, 5, 10, "czarny", "LOT", "Niemcy", 1994);
        samolot2[37] = new SamolotPasazerski(5, 5, 5, 10, "czarny", "LOT", "Niemcy", 1993);
        samolot2[38] = new SamolotPasazerski(5, 5, 5, 10, "czarny", "LOT", "Niemcy", 1992);
        samolot2[39] = new SamolotPasazerski(5, 5, 5, 10, "czarny", "LOT", "Niemcy", 1991);

        samolot2[40] = new SamolotRakieta(5, 5, 5, 10, "tecza", "LOT", "Niemcy", 2002, 4);
        samolot2[41] = new SamolotRakieta(5, 5, 5, 10, "tecza", "LOT", "Niemcy", 2002, 5);
        samolot2[42] = new SamolotRakieta(5, 5, 5, 10, "tecza", "LOT", "Niemcy", 2002, 6);
        samolot2[43] = new SamolotRakieta(5, 5, 5, 10, "tecza", "LOT", "Niemcy", 2002, 7);
        samolot2[44] = new SamolotRakieta(5, 5, 5, 10, "tecza", "LOT", "Niemcy", 2002, 8);
        samolot2[45] = new SamolotRakieta(5, 5, 5, 10, "tecza", "LOT", "Niemcy", 2002, 5);
        samolot2[46] = new SamolotRakieta(5, 5, 5, 10, "tecza", "LOT", "Niemcy", 2002, 2);
        samolot2[47] = new SamolotRakieta(5, 5, 5, 10, "tecza", "LOT", "Niemcy", 2002, 6);
        samolot2[48] = new SamolotRakieta(5, 5, 5, 10, "tecza", "LOT", "Niemcy", 2002, 7);
        samolot2[49] = new SamolotRakieta(5, 5, 5, 10, "tecza", "LOT", "Niemcy", 2002, 8);

        samolot2[50] = new SamolotWojskowy(10, 10, 20, 200, "czarny", "Polska", 2000, 6);
        samolot2[51] = new SamolotWojskowy(10, 10, 20, 200, "czarny", "Polska", 2010, 7);
        samolot2[52] = new SamolotWojskowy(10, 10, 20, 200, "czarny", "Polska", 2020, 3);
        samolot2[53] = new SamolotWojskowy(10, 10, 20, 200, "czarny", "Polska", 2030, 5);
        samolot2[54] = new SamolotWojskowy(10, 10, 20, 200, "czarny", "Polska", 2040, 2);
        samolot2[55] = new SamolotWojskowy(10, 10, 20, 200, "czarny", "Polska", 2050, 2);
        samolot2[56] = new SamolotWojskowy(10, 10, 20, 200, "czarny", "Polska", 2000, 2);
        samolot2[57] = new SamolotWojskowy(10, 10, 20, 200, "czarny", "Polska", 2070, 3);
        samolot2[58] = new SamolotWojskowy(10, 10, 20, 200, "czarny", "Polska", 2070, 5);
        samolot2[59] = new SamolotWojskowy(10, 10, 20, 200, "czarny", "Polska", 2050, 6);


        File plik = new File("2.txt");
        plik.createNewFile();

        try {
            if (args[0].equals("save")) {

                try {

                    FileWriter fileWriter = new FileWriter(plik);

                    for (int i = 0; i < samolot2.length; i++) {
                        fileWriter.write(samolot2[i].toString() + "\n");
                    }

                    fileWriter.flush();
                    fileWriter.close();

                } catch (IOException e) {
                    e.printStackTrace();
                }

            } else if (args[0].equals("load")) {

                String[] strings = new String[60];

                try {

                    FileReader fileReader = new FileReader(plik);
                    BufferedReader bufferedReader = new BufferedReader(fileReader);
                    String str;
                    int i = 0;
                    while ((str = bufferedReader.readLine()) != null) {
                        strings[i] = str;
                        i++;
                    }
                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                // tworzenie pomocniczych stringow aby zoptymalizowac kod

                String[] pom_1 = strings[0].split(",");
                int pom_11 = pom_1.length;
                String[][] str_1 = new String[10][pom_11];

                String[] pom_2 = strings[10].split(",");
                int pom_22 = pom_2.length;
                String[][] str_2 = new String[10][pom_22];

                String[] pom_3 = strings[20].split(",");
                int pom_33 = pom_3.length;
                String[][] str_3 = new String[10][pom_33];

                String[] pom_4 = strings[30].split(",");
                int pom_44 = pom_4.length;
                String[][] str_4 = new String[30][pom_44];

                String[] pom_5 = strings[40].split(",");
                int pom_55 = pom_5.length;
                String[][] str_5 = new String[10][pom_55];

                String[] pom_6 = strings[50].split(",");
                int pom_66 = pom_6.length;
                String[][] str_6 = new String[10][pom_66];

                for (int i = 0; i < 10; i++) {
                    str_1[i] = strings[i].split(",");
                    str_2[i] = strings[i + 10].split(",");
                    str_3[i] = strings[i + 20].split(",");
                    str_4[i] = strings[i + 30].split(",");
                    str_5[i] = strings[i + 40].split(",");
                    str_6[i] = strings[i + 50].split(",");
                }

                Samolot[] samolot = new Samolot[6 * 10 * Integer.parseInt(args[1])];

                Random random = new Random();

                // tworzenie obiektow par razy


                int k = 0;
                int pom = 0;

                for (int i = 0; i < 10 * Integer.valueOf(args[1]); i++) {

                    if (pom == 10) // jak dojdzie do 10 to dubluje
                        pom = 0;

                    samolot[k] = new SamolotCargo(random.nextDouble() * 5, random.nextDouble() * 5, random.nextDouble() * 50, random.nextDouble() * 100, str_1[pom][4], str_1[pom][5], str_1[pom][6], str_1[pom][7], str_1[pom][8], Integer.valueOf(str_1[pom][9]), Integer.valueOf(str_1[pom][10]), Integer.valueOf(str_1[pom][11]));
                    k = k + 1;
                    samolot[k] = new SamolotHelikpoter(random.nextDouble() * 5, random.nextDouble() * 5, random.nextDouble() * 50, random.nextDouble() * 100, str_2[pom][4], Integer.valueOf(str_2[pom][5]), str_2[pom][6], Integer.valueOf(str_2[pom][7]));
                    k = k + 1;
                    samolot[k] = new SamolotPanstwowy(random.nextDouble() * 5, random.nextDouble() * 5, random.nextDouble() * 50, random.nextDouble() * 100, str_3[pom][4], str_3[pom][5], str_3[pom][6], Integer.valueOf(str_3[pom][7]));
                    k = k + 1;
                    samolot[k] = new SamolotPasazerski(random.nextDouble() * 5, random.nextDouble() * 5, random.nextDouble() * 50, random.nextDouble() * 100, str_4[pom][4], str_4[pom][5], str_4[pom][6], Integer.valueOf(str_4[pom][7]));
                    k = k + 1;
                    samolot[k] = new SamolotRakieta(random.nextDouble() * 5, random.nextDouble() * 5, random.nextDouble() * 50, random.nextDouble() * 100, str_5[pom][4], str_5[pom][5], str_5[pom][7], Integer.valueOf(str_5[pom][8]), Integer.valueOf(str_5[pom][9]));
                    k = k + 1;
                    samolot[k] = new SamolotWojskowy(random.nextDouble() * 5, random.nextDouble() * 5, random.nextDouble() * 50, random.nextDouble() * 100, str_6[pom][4], str_6[pom][5], Integer.valueOf(str_6[pom][6]), Integer.valueOf(str_6[pom][7]));
                    k = k + 1;
                    pom++;
                }


                int x1 = 0, x2 = 0, x3 = 0, x4 = 0;

                Samolot[][] samolot1 = new Samolot[3][6 * 10 * Integer.valueOf(args[1])];

                for (int i = 0; i < 6 * 10 * Integer.valueOf(args[1]); i++) { // posortowanie odleglosci w przedzialach 0-3,3-9,9-27,27 - w gore

                    if (samolot[i].odleglosc() < 3) {
                        samolot1[0][x1] = samolot[i];
                        x1++;
                    } else if (samolot[i].odleglosc() < 9) {
                        samolot1[1][x2] = samolot[i];
                        x2++;
                    } else if (samolot[i].odleglosc() < 27) {
                        samolot1[2][x3] = samolot[i];
                        x3++;
                    }
                    //else {
                    //    samolot1[3][x4] = samolot[i];
                    //    x4++;
                    // }
                }


                sortowanieprzezwstawianie(samolot1); // wywolanie funkcji sort

       /* for(int i=0; i< samolot1.length; i++){ //wyswietlenie posortowanej tablicy aby sprawdzic czy dziala ( z odlegloscia )
            for(int j=0; j< samolot1[i].length; j++){
                if(samolot1[i][j]!=null){
                    System.out.print(samolot1[i][j].odleglosc()+" ");
                }
            }
            System.out.println();
        } */

                for (int i = 0; i < samolot1.length; i++) { //wyswietlenie posortowanej tablicy aby sprawdzic czy dziala ( z obiektami )
                    System.out.println("poziom nr: " + i);
                    for (int j = 0; j < samolot1[i].length; j++) {
                        if (samolot1[i][j] != null) {
                            System.out.print("{ " + samolot[i].toString() + " } ");
                        }
                    }
                    System.out.println();
                }

            }
        } catch (ArrayIndexOutOfBoundsException e) {

        }
    }

    public static void sortowanieprzezwstawianie(Samolot[][] samolots){
        for(int i=0; i< samolots.length; i++){
            int n = samolots[i].length;
            Samolot samolot;
            int index;
            for(int j=0; j<n; j++){
                samolot = samolots[i][j];
                index = j;
                try {
                    while (index > 0 && samolot.odleglosc() < samolots[i][index - 1].odleglosc()) {
                        samolots[i][index] = samolots[i][index - 1];
                        index--;
                    }
                    samolots[i][index] = samolot;
                }catch (NullPointerException e){
                }
            }
        }
    }
}