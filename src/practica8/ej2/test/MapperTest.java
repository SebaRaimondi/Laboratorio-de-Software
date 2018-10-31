package practica8.ej2.test;

import practica8.ej2.Mapeado;
import practica8.ej2.Mapper;
import practica8.ej2.exceptions.NotStorableException;

public class MapperTest {
    public static void main(String[] args) {
        try { Mapper.map(new Mapeado()); }
        catch (NotStorableException e) { e.printStackTrace(); }
    }
}
