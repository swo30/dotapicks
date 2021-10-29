package com.example.dotapicks;
import java.util.ArrayList;
import java.util.Arrays;

public class Hero {
//    public ArrayList<Attributes> attributesList;
        // Attribute0 = own stat
        // Attribute1 = cucked by that stat
        String name;
        double[] escape;
        double[] purge;
        double[] disables;
        double[] tank;
        double[] magical;
        double[] physical;
        double[] burst;
        double[] teamfight;
        double[] aoe;
        double[] waveclear;
        double[] summons;
        double[] carry;
        double[] primaryAttribute;
        String[] counters;

        public Hero(
            String name,
            double[] escape,
            double[] purge,
            double[] disables,
            double[] tank,
            double[] magical,
            double[] physical,
            double[] burst,
            double[] teamfight,
            double[] aoe,
            double[] waveclear,
            double[] summons,
            double[] carry,
            double[] primaryAttribute
//            String[] counters
        ){
            this.name = name;
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
            this.primaryAttribute = primaryAttribute;
        }

    public String getName() {
        return this.name;
    }

    public String[] getCounters() {
        return this.counters;
    }

    public double[][] getAttributes() {
        double[][] attributesArray = new double[13][];
        attributesArray[0] = this.escape;
        attributesArray[1] = this.purge;
        attributesArray[2] = this.disables;
        attributesArray[3] = this.tank;
        attributesArray[4] = this.magical;
        attributesArray[5] = this.physical;
        attributesArray[6] = this.burst;
        attributesArray[7] = this.teamfight;
        attributesArray[8] = this.aoe;
        attributesArray[9] = this.waveclear;
        attributesArray[10] = this.summons;
        attributesArray[11] = this.carry;
        attributesArray[12] = this.primaryAttribute;
        return attributesArray;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", escape=" + Arrays.toString(escape) +
                ", purge=" + Arrays.toString(purge) +
                ", disables=" + Arrays.toString(disables) +
                ", tank=" + Arrays.toString(tank) +
                ", magical=" + Arrays.toString(magical) +
                ", physical=" + Arrays.toString(physical) +
                ", burst=" + Arrays.toString(burst) +
                ", teamfight=" + Arrays.toString(teamfight) +
                ", aoe=" + Arrays.toString(aoe) +
                ", waveclear=" + Arrays.toString(waveclear) +
                ", summons=" + Arrays.toString(summons) +
                ", carry=" + Arrays.toString(carry) +
                ", primaryAttribute=" + Arrays.toString(primaryAttribute) +
                ", counters=" + Arrays.toString(counters) +
                '}';
    }
}
