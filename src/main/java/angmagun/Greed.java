package angmagun;

import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Greed{

    public static int greedy(int[] dice){
        int[] array = {0,0,0,0,0,0,0};
        int sum = 0;
        IntStream.of(dice).forEach(i->array[i]++);

        for(int i=1; i<array.length; i++){
            if(array[i] > 0){
                if(array[i] >= 3){
                    if(i == 1){
                        sum += i * 1000;
                    }else{
                        sum += i * 100;
                    }
                    if(array[i] % 3 > 0){
                        if(i == 1){
                            sum += array[i] % 3 * i * 100;
                        }
                        if(i == 5){
                            sum += array[i] % 3 * i * 10;
                        }
                    }
                }else{
                    if(i == 1){
                        sum += array[i] % 3 * i * 100;
                    }
                    if(i == 5){
                        sum += array[i] % 3 * i * 10;
                    }
                }
            }
        }
        return sum;
    }
}