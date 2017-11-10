import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.*;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by pratikshetty on 11/9/17.
 */
public class MaxProfitPath {
    public static void main(String args[]) throws FileNotFoundException {
        // Read json
        Gson gson = new Gson();
        Type type = new TypeToken<List<House>>() {}.getType();

        String json = "";

        try {
            json = new String(Files.readAllBytes(Paths.get(String.valueOf(System.getProperty("user.dir")) + "/src/main/java/test2.json")));
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        List<House> houses = gson.fromJson(json, type);

        // Two cases - (1) with last house excluded,(2) with first house excluded
        VarArray v1 = rob(houses, 0, houses.size()-2);
        VarArray v2 = rob(houses, 1, houses.size()-1);

        VarArray result = v1.getSum() > v2.getSum() ? v1:v2;

        // Print order of houses stolen
        for(int i=0;i<houses.size();i++)
        {
            if(result.getElement(i)==1)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
        System.out.println();
        // Print maximum profit
        System.out.println(result.getSum());
    }

    // Calculate profit
    private static VarArray rob(List<House> houses, int lo, int hi)
    {
        // Objects to store maximum running costs, with sum and array trace
        VarArray include = new VarArray(houses.size());
        VarArray exclude = new VarArray(houses.size());


        for(int j = lo;j<=hi;j++)
        {
            VarArray i = new VarArray(include.getSum(),include.getArray());
            VarArray e = new VarArray(exclude.getSum(),exclude.getArray());

            int[] arr = e.getArray().clone();
            arr[j] = 1;
            include.setArray(arr);
            include.setSum(e.getSum() + houses.get(j).getValue());

            // Calculate max profit
            exclude = e.getSum() > i.getSum() ? e:i;
        }
        return include.getSum() > exclude.getSum() ? include:exclude;
    }
}
