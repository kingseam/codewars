package angmagun;

import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

// If no valid solution exists return null
public class Decompose {
    static Set<Double> tree=new TreeSet<Double>();
    public String decompose(long n) {
        double a = 0;
        double value = Math.pow(n,2);
        System.out.println(value);

        double[] valueArray = new double[(int)n];

        for(int i=0; i<(int)n; i++){
            valueArray[i] = Math.pow(i,2);
        }

        getAllSums(valueArray,0,0);
        tree.remove(a);
        for (Double i: tree)
            System.out.println(i);


        return "";
    }

    public static void getAllSums(double[] numbersArray, int starting, double sum)
    {
        if(numbersArray.length == starting)
        {
            tree.add(sum);
            return;
        }
        double value = sum + numbersArray[starting];
        getAllSums(numbersArray, starting + 1, value);
        getAllSums(numbersArray, starting + 1, sum);
    }
}