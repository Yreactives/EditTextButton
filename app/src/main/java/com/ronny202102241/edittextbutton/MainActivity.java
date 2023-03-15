package com.ronny202102241.edittextbutton;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button okButton = (Button)findViewById(R.id.okButton);
        final MediaPlayer mp = MediaPlayer.create(this, R.raw.kirayoshikage2);

        okButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                mp.start();
                EditText namaEditText= (EditText)findViewById(R.id.namaEditText);
                String nama = namaEditText.getText().toString();
                String pesan = "私の名は " + nama + " ねんれさんじゅさんさい";
                TextView infotextview = (TextView)findViewById(R.id.infoTextView);
                infotextview.setText(pesan);

            }
        });
    }
}