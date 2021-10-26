package com.example.dotapicks;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        main();
    }

    public static List<Hero> parseJson(){
        //parse voodoo magic
        List<Hero> heroList = new ArrayList<Hero>(121);
        String name; //json output good line;
        double[] escape; //json output good line;
        double[] purge; //json output good line;
        double[] disables; //json output good line;
        double[] tank; //json output good line;
        double[] magical; //json output good line;
        double[] physical; //json output good line;
        double[] burst; //json output good line;
        double[] teamfight; //json output good line;
        double[] aoe; //json output good line;
        double[] waveclear; //json output good line;
        double[] summons; //json output good line;
        double[] carry; //json output good line;
        double[] primaryAttribute; //json output good line;
        String[] counters; //json output good line;

        heroList.add(new Hero(
                name,
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
                primaryAttribute,
                counters
        ));
        return heroList;
    }

    public static void main(String[] args){
        List<HeatMap> allHeroes = new ArrayList<HeatMap>(121);
        List<Hero> heroList = parseJson();
        for (int i=0; i<121; i++){
            allHeroes.add(new HeatMap(heroList.get(i)));
        }
    }
}