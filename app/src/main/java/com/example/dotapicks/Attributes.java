package com.example.dotapicks;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class Attributes {
//    public static HashMap<String, List <Exercise>> exercises_map;
//    exercises_map = new HashMap<>();
//    exercises_map.put("chest", new ArrayList<Exercise>());

    public double escape;
    public double purge;
    public double disables;
    public double tank;
    public double magical;
    public double physical;
    public double burst;
    public double teamfight;
    public double aoe;
    public double waveclear;
    public double summons;
    public double carry;
    public double primary_attribute;

    public Attributes(
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
        this.escape = escape;
        this.purge = purge;
        this.disables = disables;
        this.tank = tank;
        this.magical = magical;
        this.physical = physical;
        this.burst = burst;
        this.teamfight = teamfight;
        this.aoe = aoe;
        this.waveclear = waveclear;
        this.summons = summons;
        this.carry = carry;
        this.primary_attribute = primary_attribute;

    }
}