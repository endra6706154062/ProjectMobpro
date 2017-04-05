package com.example.emotional.tubes;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by Emotional on 3/15/2017.
 */

public class CairFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(
                R.layout.activity_tablet, container, false);

        final ArrayList<kata> cair = new ArrayList<>();
        cair.add(new kata("Paratusin ","Rp  23.000",R.drawable.cair));
        cair.add(new kata("Polycrol ","Rp  20.000",R.drawable.cair));
        cair.add(new kata("Polycrol Forte ","Rp  30.000",R.drawable.cair));
        cair.add(new kata("Plantacid ","Rp  11.500",R.drawable.cair));
        cair.add(new kata("Plantacid Forte ","Rp  32.500",R.drawable.cair));
        cair.add(new kata("Amoxan 250 ","Rp  36.000",R.drawable.cair));
        cair.add(new kata("Amoxan 500 ","Rp  36.000",R.drawable.cair));
        cair.add(new kata("Cefat 500","Rp  48.00",R.drawable.cair));
        cair.add(new kata("Biotichol 500 ","Rp  23.500",R.drawable.cair));
        cair.add(new kata(" Elkana ","Rp  24.000",R.drawable.cair));
        cair.add(new kata("Claneksi ","Rp  59.000",R.drawable.cair));
        cair.add(new kata("Calnic ","Rp  54.500",R.drawable.cair));
        cair.add(new kata("Curliv ","Rp  48.500",R.drawable.cair));
        cair.add(new kata("Osteocare ","Rp  66.500",R.drawable.cair));
        cair.add(new kata("Imboost ","Rp  35.500",R.drawable.cair));
        cair.add(new kata("Imunos ","Rp  69.500",R.drawable.cair));
        cair.add(new kata(" Intunal ","Rp  14.000",R.drawable.cair));
        cair.add(new kata("Thiamycin ","Rp  38.500",R.drawable.cair));

        ListView daftarObat = (ListView) rootView.findViewById(R.id.tablet);
        AdapterKata adapter = new AdapterKata(getActivity(),cair,R.color.colorAccent);
        daftarObat.setAdapter(adapter);

        daftarObat.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.i("daftarObat",cair.get(position).toString());
            }
        });

        return rootView;
    }
}
