public class Kalkulator {
    public static double potega(double wykladnik, double podstawa){
        double potega = 1;

        if(wykladnik == 0){
            return 1;
        }

        if(wykladnik < 0){
            podstawa = 1/podstawa;
            wykladnik *= -1;
        }

        for(int i = 1; i<=wykladnik; i++){
            potega *= podstawa;
        }

        return potega;
    }
}
