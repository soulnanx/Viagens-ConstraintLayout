package br.com.bee.viagens.ui.adapter;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import br.com.bee.viagens.util.DiasUtil;
import br.com.bee.viagens.util.MoedaUtil;
import br.com.bee.viagens.R;
import br.com.bee.viagens.model.Pacote;
import br.com.bee.viagens.util.ResorceUtil;

/**
 * Created by renansantos on 05/03/2018.
 */

public class ListaPacotesAdapter extends BaseAdapter {

    private final List<Pacote> pacotes;
    private Context context;

    public ListaPacotesAdapter(final List<Pacote> pacotes, final Context context){
        this.pacotes = pacotes;
        this.context = context;
    }

    @Override
    public int getCount() {
        return pacotes.size();
    }

    @Override
    public Object getItem(int position) {
        return pacotes.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_pacote, parent, false);
        Pacote pacote = pacotes.get(position);

        setDias(view, pacote);
        setPreco(view, pacote);
        setTitle(view, pacote);
        setImage(view, pacote);

        return view;
    }

    private void setImage(View view, Pacote pacote) {
        ImageView imagem = view.findViewById(R.id.item_pacote_image);
        Drawable drawable = ResorceUtil.getDrawable(context, pacote.getImagem());
        imagem.setImageDrawable(drawable);
    }

    private void setDias(View view, Pacote pacote) {
        TextView dias = view.findViewById(R.id.item_pacote_dias);
        String diasEmTexto = DiasUtil.formatEmTexto(pacote.getDias());
        dias.setText(diasEmTexto);
    }

    private void setPreco(View view, Pacote pacote) {
        TextView preco = view.findViewById(R.id.item_pacote_preco);
        String precoDoPacote = MoedaUtil.formatParaBrasileiro(pacote.getPreco());
        preco.setText(precoDoPacote);
    }

    private void setTitle(View view, Pacote pacote) {
        TextView titulo = view.findViewById(R.id.item_pacote_titulo);
        titulo.setText(pacote.getLocal());
    }
}
