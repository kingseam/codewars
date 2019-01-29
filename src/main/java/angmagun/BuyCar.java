package angmagun;

public class BuyCar {

    public static int[] nbMonths(int startPriceOld, int startPriceNew, int savingperMonth, double percentLossByMonth) {

        if(startPriceOld >= startPriceNew) return new int[]{0, startPriceOld-startPriceNew};
        // your code
        double TempStartPriceOld = startPriceOld;
        double TempStartPriceNew = startPriceNew;
        double cash = 0;
        int count = 1;

        while(true){
            if(count % 2 == 0) percentLossByMonth += 0.5;
            TempStartPriceNew = TempStartPriceNew - (TempStartPriceNew * (percentLossByMonth/100));
            TempStartPriceOld = TempStartPriceOld - (TempStartPriceOld * (percentLossByMonth/100));
            cash = savingperMonth * count;
            if(TempStartPriceNew / (TempStartPriceOld + (savingperMonth * count)) < 1) break;
            count++;
        }

        return new int[]{count, (int)Math.round((TempStartPriceOld + cash) - TempStartPriceNew)};
    }
}