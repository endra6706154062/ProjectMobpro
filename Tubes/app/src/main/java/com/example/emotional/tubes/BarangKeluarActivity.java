package com.example.emotional.tubes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class BarangKeluarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barang_keluar);

        final ArrayList<kata> keluar = new ArrayList<>();
        keluar.add(new kata("Paramex","5 pcs",R.drawable.number_one));
        keluar.add(new kata("Ponstan","1 pcs",R.drawable.number_one));
        keluar.add(new kata("Paramex","3 pcs",R.drawable.number_one));
        keluar.add(new kata("Amoxan 250 "," 7 pcs",R.drawable.number_one));
        keluar.add(new kata("Amoxan 500 "," 8 pcs",R.drawable.number_one));
        keluar.add(new kata("Cefat 250  " , " 3 pcs",R.drawable.number_one));
        keluar.add(new kata("Paratusin ","9 pcs",R.drawable.number_one));
        keluar.add(new kata("Polycrol ","8 pcs",R.drawable.number_one));
        keluar.add(new kata("Polycrol Forte ","5 pcs",R.drawable.number_one));
        keluar.add(new kata("Plantacid ","7 pcs",R.drawable.number_one));

        ListView daftarObat = (ListView) findViewById(R.id.brgKeluar);
        AdapterKata adapter = new AdapterKata(this,keluar,R.color.colorAccent);
        daftarObat.setAdapter(adapter);
        daftarObat.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.i("Barang Masuk",keluar.get(position).toString());
            }
        });
    }
}
