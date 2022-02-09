package za.ac.cput.Calculator;


public class Division
{

    /**
     * Returns the result of integer division
     *
     * @param numerator
     * @param denominator
     * @return
     */
    public static int integerDivision(int numerator, int denominator){
        if(denominator < 1){
            return 0;
        }else{
            return numerator/denominator;
        }
    }
}
