import java.util.ArrayList;

public class Funciones {
    public boolean esPar(int num){
        return (num%2) == 0;
    }

    public boolean esMultiplo(int num, int multiplo){
        return (num%multiplo) == 0;
    }

    public int sumaArray(ArrayList<Integer> array){
        int result = 0;
        for(Integer e: array){
            result += e;
        }
        return result;
    }
}

