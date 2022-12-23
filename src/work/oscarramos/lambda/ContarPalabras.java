package work.oscarramos.lambda;

import java.util.Map;

@FunctionalInterface
public interface ContarPalabras {
    Map<String,Integer> contardorPalabras(String palabra);

}
