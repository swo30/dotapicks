package com.example.dotapicks;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        getIntent(); // get enemy hero list
        try {
            main();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public JSONArray loadJSONFromAsset() throws JSONException {
        String json = null;
        try {
            InputStream is = getAssets().open("heroes-test.json");
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            json = new String(buffer, "UTF-8");
        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }
        JSONArray heroesArray = null;
        JSONObject obj = new JSONObject(json);
        heroesArray = obj.getJSONArray("Heroes");
//        JSONArray heroesJSON = loadJSONFromAsset();

        return heroesArray;
    }

//    public Array

    public List<Hero> parseJson() throws JSONException, FileNotFoundException {
    List<Hero> heroList = new ArrayList<>(121);
        String name; //json output good line;
        double[] escape = new double[2]; //json output good line;
        double[] purge = new double[2]; //json output good line;
        double[] disables = new double[2]; //json output good line;
        double[] tank = new double[2]; //json output good line;
        double[] magical = new double[2]; //json output good line;
        double[] physical = new double[2]; //json output good line;
        double[] burst = new double[2]; //json output good line;
        double[] teamfight = new double[2]; //json output good line;
        double[] aoe = new double[2]; //json output good line;
        double[] waveclear = new double[2]; //json output good line;
        double[] summons = new double[2]; //json output good line;
        double[] carry = new double[2]; //json output good line;
        double[] primaryAttribute = new double[2]; //json output good line;
        String[] counters = new String[1]; //json output good line;

        //fuck it cant put it in function
        String json = null;
        try {
            InputStream is = getAssets().open("heroes-test.json");
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            json = new String(buffer, "UTF-8");
        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }
        JSONArray heroesJSONArray = null;
        JSONObject obj = new JSONObject(json);
        heroesJSONArray = obj.getJSONArray("Heroes");

        for (int i = 0; i < heroesJSONArray.length(); i++) {
            JSONObject userDetail = heroesJSONArray.getJSONObject(i);

            name = userDetail.getString("name");

            escape = new double[]{userDetail.getJSONArray("escape").getDouble(0), userDetail.getJSONArray("escape").getDouble(1)};
            purge = new double[]{userDetail.getJSONArray("purge").getDouble(0), userDetail.getJSONArray("purge").getDouble(1)};
            disables = new double[]{userDetail.getJSONArray("disables").getDouble(0), userDetail.getJSONArray("disables").getDouble(1)};
            tank = new double[]{userDetail.getJSONArray("tank").getDouble(0), userDetail.getJSONArray("tank").getDouble(1)};
            magical = new double[]{userDetail.getJSONArray("magical").getDouble(0), userDetail.getJSONArray("magical").getDouble(1)};
            physical = new double[]{userDetail.getJSONArray("physical").getDouble(0), userDetail.getJSONArray("physical").getDouble(1)};
            burst = new double[]{userDetail.getJSONArray("burst").getDouble(0), userDetail.getJSONArray("burst").getDouble(1)};
            teamfight = new double[]{userDetail.getJSONArray("teamfight").getDouble(0), userDetail.getJSONArray("teamfight").getDouble(1)};
            aoe = new double[]{userDetail.getJSONArray("aoe").getDouble(0), userDetail.getJSONArray("aoe").getDouble(1)};
            waveclear = new double[]{userDetail.getJSONArray("waveclear").getDouble(0), userDetail.getJSONArray("waveclear").getDouble(1)};
            summons = new double[]{userDetail.getJSONArray("summons").getDouble(0), userDetail.getJSONArray("summons").getDouble(1)};
            carry = new double[]{userDetail.getJSONArray("carry").getDouble(0), userDetail.getJSONArray("carry").getDouble(1)};
            primaryAttribute = new double[]{userDetail.getJSONArray("primaryAttribute").getDouble(0), userDetail.getJSONArray("primaryAttribute").getDouble(1)};

            System.out.println(name);

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
                    primaryAttribute
//                    counters
            ));
        }
        return heroList;
    }

    public  void main() throws FileNotFoundException, JSONException {
        String intent = "Alchemist";
        List<HeatMap> pickRateHeatMap = new ArrayList<HeatMap>(121);
        List<Hero> heroList = parseJson();
        int indexSearchedHero = -1;

        for (int i=0; i<heroList.size(); i++){
            if (heroList.get(i).getName().equals(intent)){
                indexSearchedHero = i;
            }
        }
        for (int i=0; i<heroList.size(); i++){
            if (i != indexSearchedHero){
                HeatMap currentHeatMap = new HeatMap(heroList.get(i));
                currentHeatMap.setHeat(currentHeatMap.calculatePickRate(heroList.get(indexSearchedHero), heroList.get(i)));
                pickRateHeatMap.add(currentHeatMap);
            }
        }
        System.out.println("monkaHm");
        System.out.println(pickRateHeatMap.get(0).getHeat());
    }
}