import org.junit.jupiter.api.Test;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Testeo {
    private Funciones funciones = new Funciones();

    @Test
    public void esParTrueTest(){
        boolean result = funciones.esPar(1);
        assertTrue(result);
    }

    @Test
    public void esParFalseTest(){
        boolean result = funciones.esPar(3);
        assertFalse(result);
    }

    @Test
    public void esMultiploTrueTest(){
        boolean result = funciones.esMultiplo(6, 2);
        assertTrue(result);
    }

    @Test
    public void esMultiploFalseTest(){
        boolean result = funciones.esMultiplo(5, 8);
        assertFalse(result);
    }

    @Test
    public void sumaArrayTest(){
        ArrayList<Integer> array = new ArrayList<>();
        array.add(1);
        array.add(2);
        array.add(3);
        array.add(4);
        int result = funciones.sumaArray(array);
        assertEquals(result,10);
    }

}
