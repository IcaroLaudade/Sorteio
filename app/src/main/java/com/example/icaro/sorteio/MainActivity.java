package com.example.icaro.sorteio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private Sorteio s= new Sorteio();
    public TextView getTxtView(){
        return (TextView) findViewById(R.id.txtJogo);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void probabilidade(View view){
        if (getTxtView().getText().toString().equals("")|| getTxtView().getText().toString().equals(null)){
            Toast.makeText(this,"Favor pressionar o botão gerar números primeiros",Toast.LENGTH_SHORT).show();
        }
        else {
            Bundle b = new Bundle();

            b.putString("a", getTxtView().getText().toString());
            Intent i = new Intent(this, ProbabilidadeActivity.class);

            i.putExtras(b);
            startActivity(i);
            finish();
            //b
        }
    }
    public void gerarJogo(View view){
        int[] arrayInt=s.sortear();
        String txt="";
        for (int cont=0;cont<arrayInt.length;cont++){
            if(cont==arrayInt.length-1){
              txt =txt+ String.valueOf(arrayInt[cont]);
            }else {
              txt =txt+ String.valueOf(arrayInt[cont]) + " - ";

            }
        }
        getTxtView().setText(txt);
    }

}
