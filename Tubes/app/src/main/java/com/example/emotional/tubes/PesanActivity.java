package com.example.emotional.tubes;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class PesanActivity extends AppCompatActivity {
    private EditText nama,jumlah,alamat;
    private Order orderan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pesan);

        orderan = new Order();

        nama = (EditText) findViewById(R.id.nama);
        alamat = (EditText) findViewById(R.id.alamat);
        jumlah = (EditText) findViewById(R.id.jumlah);


    }

    public void tombolOrder(View view) {
        Intent intent = new Intent(Intent.ACTION_SEND);
        orderan.setNama(nama.getText().toString());
        orderan.setAlamat(alamat.getText().toString());
        orderan.setJumlah(jumlah.getText().toString());
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_EMAIL, "adebayus17@gmail.com");
        intent.putExtra(Intent.EXTRA_SUBJECT, "Order Obat");
        String Nama = "Nama : "+orderan.getNama();
        String Alamat = "Alamat : "+orderan.getAlamat();

        intent.putExtra(intent.EXTRA_TEXT,Nama);
        intent.putExtra(intent.EXTRA_TEXT,Alamat);

        startActivity(Intent.createChooser(intent,"Kirim"));
    }
}
