package com.example.android.alifnoorachmadm_1202154126_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();

        int harga = intent.getIntExtra("Harga", 0);
        int porsi = intent.getIntExtra("Porsi", 0);
        int jumlahharga = harga*porsi;
        String menu = intent.getStringExtra("Makanan");
        String tempatmakan = intent.getStringExtra("Tempat");
        String pesan = "Disini Saja Makan Malamnya";
        TextView tv1 = findViewById(R.id.tempatmakan);
        TextView tv2 = findViewById(R.id.nasi);
        TextView tv3 = findViewById(R.id.porsi);
        TextView tv4 = findViewById(R.id.jumlahharga);

        tv1.setText(tempatmakan);
        tv2.setText(menu);
        tv3.setText(""+porsi);
        tv4.setText(""+jumlahharga);

        if(jumlahharga>60000){
            pesan ="Jangan disini makan malamnya, uang kamu tidak kuat.";
        }
        Toast message =Toast.makeText(getApplicationContext(),pesan, Toast.LENGTH_LONG);
        message.show();
    }
}
