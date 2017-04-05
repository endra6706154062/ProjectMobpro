package com.example.emotional.tubes;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
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

public class KapsulFragment extends Fragment{
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(
                R.layout.activity_tablet, container, false);

        final ArrayList<kata> kapsul = new ArrayList<>();
        kapsul.add(new kata("Paramex","Rp 5000",R.drawable.ic_launcher));
        kapsul.add(new kata("Amoxan 250 "," Rp  18.000",R.drawable.ic_launcher));
        kapsul.add(new kata("Amoxan 500 "," Rp  37.000",R.drawable.ic_launcher));
        kapsul.add(new kata("Cefat 250  " , "Rp  60.000",R.drawable.ic_launcher));
        kapsul.add(new kata(" Cefat 500 "," Rp  117.00",R.drawable.ic_launcher));
        kapsul.add(new kata("Biotichol 250","  Rp  21.000",R.drawable.ic_launcher));
        kapsul.add(new kata("Biotichol 500 "," Rp  41.000",R.drawable.ic_launcher));
        kapsul.add(new kata("Pronicy "," Rp  3.500",R.drawable.ic_launcher));
        kapsul.add(new kata("Neurosanbe "," Rp  13.000",R.drawable.ic_launcher));
        kapsul.add(new kata("Flamar "," Rp  20.000",R.drawable.ic_launcher));
        kapsul.add(new kata("Formyco "," Rp  58.000",R.drawable.ic_launcher));
        kapsul.add(new kata("Folamil","  Rp  430.000",R.drawable.ic_launcher));
        kapsul.add(new kata(" Erysanbe "," Rp  30.000",R.drawable.ic_launcher));
        kapsul.add(new kata("Dolo Neurobion "," Rp   17.000",R.drawable.ic_launcher));
        kapsul.add(new kata("Thiamycin","  Rp  45.000",R.drawable.ic_launcher));
        kapsul.add(new kata("Super Tetra"," Rp  7.000",R.drawable.ic_launcher));
        kapsul.add(new kata("Rhinos SR  Rp "," 55.000",R.drawable.ic_launcher));
        kapsul.add(new kata("Eyevit","  Rp  55.000",R.drawable.ic_launcher));
        kapsul.add(new kata(" Amoxicillin "," Rp  5.000",R.drawable.ic_launcher));



        ListView daftarObat = (ListView) rootView.findViewById(R.id.tablet);
        AdapterKata adapter = new AdapterKata(getActivity(),kapsul,R.color.colorAccent);
        daftarObat.setAdapter(adapter);

        daftarObat.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.i("daftarObat",kapsul.get(position).toString());
            }
        });

        return rootView;
    }
}
