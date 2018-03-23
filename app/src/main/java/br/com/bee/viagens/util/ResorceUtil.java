package br.com.bee.viagens.util;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;

import br.com.bee.viagens.model.Pacote;

/**
 * Created by renansantos on 05/03/2018.
 */

public class ResorceUtil {
    public static Drawable getDrawable(final Context context, final String imagemEmTexto) {
        Resources resources = context.getResources();
        int idDrawable = resources.getIdentifier(imagemEmTexto, "drawable", context.getPackageName());
        return resources.getDrawable(idDrawable);
    }
}
