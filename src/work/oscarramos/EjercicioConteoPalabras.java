package work.oscarramos;

import work.oscarramos.lambda.ContarPalabras;

import java.util.HashMap;
import java.util.Map;

public class EjercicioConteoPalabras {
    public static void main(String[] args) {
        ContarPalabras contar = palabra ->{
            Map<String,Integer>  contendor = new HashMap<>();
            String[] letras = palabra.replace(".", "")
                    .replace(",", "")
                    .toLowerCase()
                    .split(" ");

            int max = 0;
            String texto = null;
            for (int i = 0; i < letras.length; i++) {
                int repeticiones = 0;
                for (int j = 0; j < letras.length; j++) {
                    if (letras[i].equalsIgnoreCase(letras[j])) {
                        repeticiones++;
                    }
                }

                if(repeticiones > max){
                    max = repeticiones;
                    texto = letras[i];
                }
                contendor.put(letras[i],max);
                max = 0;
            }
            return contendor;
        };

        contar.contardorPalabras("La tecnología es sólo una herramienta. En términos de motivar a los niños y lograr que trabajen juntos, el profesor es el recurso más importante.")
                .forEach((a,b)->System.out.println("La palabra [" + a + "] esta (" + b + ") veces"));
    }
}
