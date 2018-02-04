package com.example.android.alifnoorachmadm_1202154126_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void eat (View view) {
        EditText edit1 = findViewById(R.id.nasi);
        EditText edit2 = findViewById(R.id.porsi);
        String nasi = edit1.getText().toString();
        String porsi = edit2.getText().toString();
        int jml = Integer.parseInt(porsi);
        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
        intent.putExtra("Makanan", nasi);
        intent.putExtra("Porsi",jml);
        intent.putExtra("Tempat", "Eatbus");
        intent.putExtra("Harga", 50000);

        startActivity(intent);
    }
    public void abn (View view){
        EditText edit1 = findViewById(R.id.nasi);
        EditText edit2 = findViewById(R.id.porsi);
        String nasi = edit1.getText().toString();
        String porsi = edit2.getText().toString();
        int jumlah = Integer.parseInt(porsi);
        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
        intent.putExtra("Makanan", nasi);
        intent.putExtra("Porsi",jumlah);
        intent.putExtra("Tempat", "Abnormal");
        intent.putExtra("Harga", 30000);

        startActivity(intent);
    }


}
