package com.example.emotional.tubes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class BarangMasukActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barang_masuk);

        final ArrayList<kata> masuk = new ArrayList<>();
        masuk.add(new kata("Paramex","1 Dus 24 pcs",R.drawable.number_one));
        masuk.add(new kata("Paratusin ","2 Dus",R.drawable.number_one));
        masuk.add(new kata("Claneksi ","3 Dus",R.drawable.number_one));
        masuk.add(new kata("Calnic ","6 Dus",R.drawable.number_one));
        masuk.add(new kata("Paratusin ","1 Dus",R.drawable.number_one));
        masuk.add(new kata("Pronicy ","2 Dus",R.drawable.number_one));
        masuk.add(new kata("Plantacid","4 Dus",R.drawable.number_one));
        masuk.add(new kata("Elkana ","3 Dus",R.drawable.number_one));


        ListView daftarObat = (ListView) findViewById(R.id.brgMasuk);
        AdapterKata adapter = new AdapterKata(this,masuk,R.color.colorAccent);
        daftarObat.setAdapter(adapter);
        daftarObat.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.i("Barang Masuk",masuk.get(position).toString());
            }
        });
    }

}
