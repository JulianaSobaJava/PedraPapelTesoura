package com.example.tela_inicial;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class Jogada extends AppCompatActivity {
    Random app = new Random();

    int usuario;
    int PC;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jogada);

        }



    public void onClick(View view) {
        Intent c = new Intent(getApplicationContext(), Tela_Final.class);
        startActivity(c);
    }

    public void pedra(View view) {
        appchoice();
        usuario = 1;
        resultado();

    }

    public void papel(View view) {
        appchoice();
        usuario = 2;
        resultado();
    }

    public void tesoura(View view) {
        appchoice();
        usuario = 3;
        resultado();

    }
    public void appchoice() {
        PC = app.nextInt(3) + 1;

    }
    public void resultado() {
        ImageView padrao = findViewById(R.id.tela);

        if(PC==1)
        {
            padrao.setImageResource(R.drawable.pedra);
        } else if(PC==2)
        {
            padrao.setImageResource(R.drawable.papel);
        }
        else  if(PC==3)
        {
            padrao.setImageResource(R.drawable.tesoura);
        }
        TextView txtm = findViewById(R.id.txt1);
         if ((usuario - PC == 1) || (usuario - PC == -2)) {
             txtm.setText("Você ganhou!");
         }
        if (usuario==PC) {
            txtm.setText("Empatamos");
        }
        else if((usuario - PC == 2)||(usuario - PC== -1 )){
            txtm.setText("Você perdeu!");
        }
        }

    }



