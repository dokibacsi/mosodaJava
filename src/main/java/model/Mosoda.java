package model;

import java.util.ArrayList;
import java.util.List;

public class Mosoda{
    Ruha[] ruhak;
    int ruhadb;
    public Mosoda(int db) {
        ruhak = new Ruha[db];
        run();
    }

    private String beVesz(String nev, boolean allapot){
        String s;
        if(ruhadb < ruhak.length)
        {
            ruhak[ruhadb] = new Ruha(nev, allapot);
            s = "Sikeres bevétel : " + ruhak[ruhadb].toString();
            ruhadb++;
        }
        else
        {
            s = "Nincs több hely! \n";
        }
        return s;
    }

    private void kiAd(){

    }

    private String kimos(String nev){
        String s;
        int index = 0;
        while( index < ruhadb && ruhak[index].getTulNev().equals(nev) )
        {
            ruhak[index].setTisztae(true);
            index++;
        };
        return s = nev + " ruhája kimosva!\n";
    }

    public void run(){
        kiir(beVesz("János", false));
        kiir(beVesz("Pista", true));
        kiir(beVesz("Tamás", false));
        kiir(beVesz("Ákos", false));
        kiir(beVesz("Róbert", false));

        kiir(beVesz("Norbert", true)); //Ellenőrzés miatt nem veszi be, megtelik a mosoda.

        kiir("Ennyi darab ruha: " + ruhadb);

        kiir(kimos("János"));

        for (Ruha ruha : ruhak) {
            kiir("Ruhák: " + ruha);
        }
    }

    public void kiir(String uzenet){
        System.out.println(uzenet);
    }


}
