package com.example.dotapicks;
import static java.lang.Math.*;
public class HeatMap{
    Hero hero;
    Double heatMapNum;
    public HeatMap(Hero hero){
        this.hero = hero;
        this.heatMapNum = 1.0;
    }
    public double calculatePickRate(Hero heroPicked, Hero analysedHero){
        double heat1 = 1.0;
        double heat2 = 1.0;
        double totalHeat = 1.0;
        double[][] attributeHeroPicked = heroPicked.getAttributes();
        double[][] attributeAnalysedHero = analysedHero.getAttributes();

//        for (double[] attribute: attributeHeroPicked){
        for (int i=0; i<attributeHeroPicked.length; i++){
            // 2 - sqrt(2)*(x1*y2)/sqrt(x1^2 + y2^2)
            heat1 = 2 - Math.sqrt(2)*attributeHeroPicked[i][0]*attributeAnalysedHero[i][1]/(attributeHeroPicked[i][0]*attributeHeroPicked[i][0] + attributeAnalysedHero[i][1]*attributeAnalysedHero[i][1]);
            heat2 = Math.sqrt(2)*attributeHeroPicked[i][1]*attributeAnalysedHero[i][0]/(attributeHeroPicked[i][1]*attributeHeroPicked[i][1] + attributeAnalysedHero[i][0]*attributeAnalysedHero[i][0]);
            totalHeat *= Math.sqrt(2)*heat1*heat2/(heat1*heat1 + heat2*heat2);
        }
//        if (this.name).isin(heroPicked.counters[]){return 2;}
        return totalHeat;
    }


}
