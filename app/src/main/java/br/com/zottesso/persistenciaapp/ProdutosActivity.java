package br.com.zottesso.persistenciaapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

public class ProdutosActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_produtos);



        // Buscar todos os produtos do banco
        //List<Produto> produtos = Produto.listAll(Produto.class);

        List<Produto> produtos = Produto.findWithQuery(Produto.class, "SELECT * FROM Produto order by nome");

        ListView lista = (ListView) findViewById(R.id.listV);

        ArrayAdapter<Produto> ap = new ArrayAdapter<Produto>(this, android.R.layout.simple_list_item_1, produtos);
        lista.setAdapter(ap);



    }
}
