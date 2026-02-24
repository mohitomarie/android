package com.example.control_lesson1;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import com.example.control_lesson1.R;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private ImageButton playb;
    private ImageButton pauseb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.constraint_layout);
        setContentView(R.layout.constraint_layout);
        playb = findViewById(R.id.imageButton4);
        pauseb = findViewById(R.id.imageButton8);
        playb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                playb.setVisibility(View.INVISIBLE);
                pauseb.setVisibility(View.VISIBLE);
            }
        });
        pauseb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { {
                pauseb.setVisibility(View.INVISIBLE);
                playb.setVisibility(View.VISIBLE);
                }
            }
        });
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            return insets;
//        });
    }
}