package olegario.kalebe.primeiraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;


public class NextActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);
        /*Obtem o intent que veio de MainActivity*/
        Intent i = getIntent();

        /*Obtem o texto que criou a Activity*/
        String textoDigitado = i.getStringExtra("texto");

        /*Obtendo a text view a ser alterada*/
        TextView textView = findViewById(R.id.tvTexto);

        /*Alterando o texto*/
        textView.setText(textoDigitado);
    }
}