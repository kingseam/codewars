public class PerfectPower {
    public static int[] isPerfectPower(int n) {

       for(int i=2; i<=n/2; i++){
           for(int j=1; j<n; j++){
               if(n == Math.pow(i,j)){
                   if(j==1) return null;
                   return new int[]{i,j};
               }else if(n < Math.pow(i,j)){
                   break;
               }
           }

           if(n < Math.pow(i,2)){
               break;
           }
       }

        return null;
    }
}