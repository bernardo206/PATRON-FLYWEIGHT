import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        FlyweightFactory factory = new FlyweightFactory();
        List<Arbol> arboles = new ArrayList<>();


        for (int i = 0; i < 1000000; i++){
            arboles.add(factory.buildArbol("frutal"));
            arboles.add(factory.buildArbol("ornamental"));
        }

        for (Arbol arbol:arboles) {
            System.out.println(arbol.getColor());
        }

        Runtime runtime = Runtime.getRuntime();
        System.out.println("Memoria usada: " + (runtime.totalMemory() - runtime.freeMemory()) / (1024 * 1024));

    }
}