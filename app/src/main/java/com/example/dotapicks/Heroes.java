package com.example.dotapicks;

import java.util.ArrayList;

public class Heroes {
    public ArrayList<Attributes> attributes_list;
    public void abbadon(
            double escape,
            double purge,
            double disables,
            double tank,
            double magical,
            double physical,
            double burst,
            double teamfight,
            double aoe,
            double waveclear,
            double summons,
            double carry,
            double primary_attribute
    ){
        attributes_list = new ArrayList<>();
        attributes_list.add(new Attributes(
            escape,
            purge,
            disables,
            tank,
            magical,
            physical,
            burst,
            teamfight,
            aoe,
            waveclear,
            summons,
            carry,
            primary_attribute
        ));
        

    }
}
