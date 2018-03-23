package br.com.bee.viagens.ui.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;

import br.com.bee.viagens.R;
import br.com.bee.viagens.dao.PacoteDAO;
import br.com.bee.viagens.ui.adapter.ListaPacotesAdapter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle(R.string.main_title);
        setList();
    }

    private void setList() {
        ListView listView = findViewById(R.id.lista_pacotes_listview);
        listView.setAdapter(new ListaPacotesAdapter(new PacoteDAO().lista(), this));
    }
}
