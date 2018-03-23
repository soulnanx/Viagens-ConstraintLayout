package br.com.bee.viagens.util;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class MoedaUtil {

    private static String PORTUGUES = "pt";
    private static String BRASIL = "br";
    private static String FORMATO_BRASILEIRO = "R$";
    private static String FORMATO_COM_ESPACO = "R$ ";


    public static String formatParaBrasileiro(final BigDecimal valor) {
        NumberFormat formatoBrasileiro = DecimalFormat.getCurrencyInstance(new Locale(PORTUGUES, BRASIL));
        return formatoBrasileiro
                .format(valor)
                .replace(FORMATO_BRASILEIRO, FORMATO_COM_ESPACO);
    }

}
