package Main_Code;

import java.util.HashMap;
import java.util.TreeMap;

public class App78 {
    public static void main(String[]arg) {
        HashMap<Integer, Float> hm1 = new HashMap<>();
        HashMap<String, String> hm2 = new HashMap<>(10);
        HashMap<Double, Double> hm3 = new HashMap<>(4,0.75f);
        HashMap<Float, Integer> hm4 = new HashMap<>(new TreeMap<>());
    }
}
