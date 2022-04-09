package Prototype;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Copac> listaCopaci=new ArrayList<>();
        Copac copac=new Copac("cerc",10,"maro","pin",new Locatie(10,20));
        listaCopaci.add(copac);

        Copac copac2=  copac.clone();
        Copac copac1=copac.clone();
        copac1.planteaza(new Locatie(15,15));
        listaCopaci.add(copac1);
        copac2.planteaza(new Locatie(30,20));
        listaCopaci.add(copac2);
        System.out.println(listaCopaci);
    }
}
