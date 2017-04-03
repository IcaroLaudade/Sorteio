package com.example.icaro.sorteio;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;


public class ProbabilidadeActivity extends AppCompatActivity {
    protected void onCreate(Bundle b){
        super.onCreate(b);
        setContentView(R.layout.probabilidade_tela);
        Intent i= getIntent();
        Bundle bundle=i.getExtras();
       String texto= bundle.getString("a");
        TextView v=(TextView)findViewById(R.id.txtProb);
        v.setText("A probabilidade de uma pessoa acertar a sena na Mega-Sena apostando apenas " +
                "uma cartela simples com o jogo " +texto+ " é de 1 em 50.063.860");

    }
    public void voltar(View view){

        startActivity(new Intent(this,MainActivity.class));
        finish();
    }
}
