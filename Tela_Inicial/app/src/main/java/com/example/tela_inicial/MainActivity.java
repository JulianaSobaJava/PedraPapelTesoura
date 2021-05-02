package com.example.tela_inicial;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
      Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btn);

    }


    public void onClick(View view) {
        Intent c = new Intent(getApplicationContext(), Tela_Final.class);
        startActivity(c);
    }

    public void btn(View view){
        Intent c= new Intent(this,Jogada.class);
        startActivity(c);
    }

    }





