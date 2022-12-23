package work.oscarramos;

import work.oscarramos.lambda.CambiaString;

public class EjercicioCambiaFraceLambda {

    public static void main(String[] args) {
        CambiaString cadena = frace -> {
            return frace.replace(".","").replace(",",".").replace(" ","").toUpperCase();
        };

        String fraceCambiar = "Vivir sin filosofar es, propiamente, tener los ojos cerrados, sin tratar de abrirlos jamás. René Descartes.";

        System.out.println(cadena.CambiarFrace(fraceCambiar));

    }
}
