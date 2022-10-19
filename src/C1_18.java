import java.util.ArrayList;
import java.util.List;
import java.lang.Math;
public class C1_18 {
    public static void main(String[] args) {
        List<Double> list =  new ArrayList<>();
        list.add(- 3.0); //adding to list a number
        list.add(4.0); // adding to list a number

        Pnorm(list,3.0);
        System.out.println(Pnorm(list,3.0));

        Enorm(list);
        System.out.println(Enorm(list));
    }

    // Calculating p- norm method
    public static double Pnorm(List<Double> V, double p){
        double tempNum = 0;
        for (double longNumber:
             V) {
            // with using Math.abs method we are taking absolute value of number
            Math.pow(Math.abs(longNumber),p);

            //
            List<Double> newPowList = new ArrayList<>();
            newPowList.add(Math.pow(Math.abs(longNumber),p));

            for (double num:
                 newPowList) {
                tempNum += num;
            }
        }
        System.out.println(tempNum);

        return Math.pow(tempNum,1.0/p);
    }

    //Euclidean Norm method
    public static double Enorm(List<Double> V){

        return Pnorm(V,2);
    }
}
