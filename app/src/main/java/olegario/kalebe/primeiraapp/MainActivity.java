package olegario.kalebe.primeiraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*Pegando o id do botão*/
        Button btnEnviar = findViewById(R.id.btnEnviar);

         /*Pressionar o botão*/
        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*Pegando id da caixa de texto DigiteAqui*/
                EditText etDigiteAqui = findViewById(R.id.etDigiteAqui);

                /*Pegando o Texto digite e convertendo para String*/
                String textoDgitado = etDigiteAqui.getText().toString();

                /*Criando uma intenção para pular de uma tela para outra*/
                Intent i = new Intent(MainActivity.this, NextActivity.class);

                /*Adicionando o textoDigitao na próxima tela*/
                i.putExtra("texto", textoDgitado);

                /*Executando*/
                startActivity(i);

            }
        });
    }
}