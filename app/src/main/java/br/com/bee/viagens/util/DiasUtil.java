package br.com.bee.viagens.util;


public class DiasUtil {

    private static String PLURAL = " dias";
    private static String SINGULAR = " dia";

    public static String formatEmTexto(final int quantidadeDias) {
        if (quantidadeDias > 1){
            return quantidadeDias + PLURAL;
        }
        return quantidadeDias + SINGULAR;
    }
}
