package com.example.toastapp;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private EditText et;
    private int checke;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        et = findViewById(R.id.editTextText);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tekst = et.getText().toString();
                int checke = tekst.length();
                Toast.makeText(getApplicationContext(),
                        "СТУДЕНТ № 12 ГРУППА БСБО-51-24, Количество символов - " + checke,
                        Toast.LENGTH_SHORT).show();
            }
        });

    }



//    protected void onbuttonclick(View view){
//        String tekst = et.getText().toString();
//        int checke = tekst.length();
//        Toast toast = Toast.makeText(getApplicationContext(),
//                "СТУДЕНТ № 12 ГРУППА БСБО-51-24, Количество символов - " + checke,
//                Toast.LENGTH_SHORT);
//        toast.show();
//    }
}