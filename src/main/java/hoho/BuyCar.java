import java.lang.Math; 
public class BuyCar {

  public static int[] nbMonths(int startPriceOld, int startPriceNew, int savingperMonth, double percentLossByMonth) {
    
    int rtnInt[] = new int[]{0,0};  //[0]구매가능월, [1]남은돈
    
    if(startPriceOld >= startPriceNew){
      rtnInt[0] = 0;
      rtnInt[1] = startPriceOld-startPriceNew;
      return rtnInt;
    }
    
    boolean isBuyPossible = true;
    int i=1;
    double leftMoney = 0;
    double oldMoney = (double)startPriceOld;
    double newMoney = (double)startPriceNew;
    double savingMoney = 0;
    
    while(isBuyPossible){
      if(i%2==0 && i!=0){
        percentLossByMonth = percentLossByMonth + 0.5;
      }
      
      oldMoney = oldMoney * ((100 - percentLossByMonth) * 0.01);
      newMoney = newMoney * ((100 - percentLossByMonth) * 0.01);
      savingMoney = savingperMonth*i;
      
      leftMoney = (savingMoney+oldMoney)-newMoney;
      if(leftMoney >= 0){
        isBuyPossible = false;
        rtnInt[0] = i; 
        rtnInt[1] = (int)Math.round(leftMoney);
      }
      i++;
    }
    return rtnInt;
  }
}
