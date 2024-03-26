package olegario.kalebe.primeiraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/*A Classe Activity é a classe pricipal da aplicação*/
public class MainActivity extends AppCompatActivity {

    @Override
    /*onCreate é chamado toda vez que a tela esta sendo criada*/
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        /*Cria os elementos de interface*/
        setContentView(R.layout.activity_main);

        /*Obtem o botão Enviar através do id*/
        Button btnEnviar = findViewById(R.id.btnEnviar);

         /*Define oque acontece quando se pressiona o botão*/
        btnEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            /*onClick é executado quando o botão é clicado*/
            public void onClick(View v) {
                /*Pegando id da caixa de texto DigiteAqui*/
                EditText etDigiteAqui = findViewById(R.id.etDigiteAqui);

                /*Pegando o Texto digite e convertendo para String*/
                String textoDgitado = etDigiteAqui.getText().toString();

                /*Criando uma intenção para pular de uma tela para outra*/
                Intent i = new Intent(MainActivity.this, NextActivity.class);

                /*Adicionando o textoDigitao na próxima tela*/
                i.putExtra("texto", textoDgitado);

                /*Executando a intenção*/
                startActivity(i);

            }
        });
    }
}