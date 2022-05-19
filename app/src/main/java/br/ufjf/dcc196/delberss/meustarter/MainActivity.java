package br.ufjf.dcc196.delberss.meustarter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textViewMensagem = findViewById(R.id.textViewPadrao);
        TextView textViewNome = findViewById(R.id.textName);

        textViewMensagem.setText("Olá, Mundo!");
        textViewNome.setText("Digite seu nome:");
    }

    public void clicaBotao(View origem){
        TextView textViemMensagem = findViewById(R.id.textViewPadrao);
        textViemMensagem.setText("Hello, world!");
    }
}