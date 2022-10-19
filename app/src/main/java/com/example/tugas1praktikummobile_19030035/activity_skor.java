package com.example.tugas1praktikummobile_19030035;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class activity_skor extends AppCompatActivity {
    int skorA = 0;
    int skorB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skor);

        TextView namatimA = findViewById(R.id.textPointTimA);
        TextView namatimB = findViewById(R.id.textPointTimB);

        String namaA = getIntent().getStringExtra("Tim A");
        String namaB = getIntent().getStringExtra("Tim B");

        namatimA.setText("Team" + " " + namaA);
        namatimB.setText("Team" + " " + namaB);
    }

    public void tambah(View view){
        if(view.getId()==R.id.buttonsatuPointA){
            skorA=skorA+1;
        } else if (view.getId()==R.id.buttonduaPointA){
            skorA=skorA+2;
        } else if (view.getId()==R.id.buttontigaPointA){
            skorA=skorA+3;
        } else if (view.getId()==R.id.buttonsatuPointB){
            skorB=skorB+1;
        } else if (view.getId()==R.id.buttonduaPointB){
            skorB=skorB+2;
        } else if (view.getId()==R.id.buttontigaPointB){
            skorB=skorB+3;
        }

        TextView skortimA = findViewById(R.id.tVPointTimA);
        TextView skortimB = findViewById(R.id.tVPointTimB);

        skortimA.setText(String.valueOf(skorA));
        skortimB.setText(String.valueOf(skorB));
    }
    public void Reset(View view){
        if(view.getId()==R.id.buttonresetperhitunganA){
            skorA=0;
        }
        else if (view.getId()==R.id.buttonresetperhitunganB){
            skorB=0;
        }
        TextView skortimA = findViewById(R.id.tVPointTimA);
        TextView skortimB = findViewById(R.id.tVPointTimB);

        skortimA.setText(String.valueOf(skorA));
        skortimB.setText(String.valueOf(skorB));
    }
}