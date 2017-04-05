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

public class TabletFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(
                R.layout.activity_tablet, container, false);

        final ArrayList<kata> tablet = new ArrayList<>();
        tablet.add(new kata("Paramex","Rp 5000",R.drawable.tablet));
        tablet.add(new kata("Dextamine","Rp 5000",R.drawable.tablet));
        tablet.add(new kata("Incidal","Rp 30.000",R.drawable.tablet));
        tablet.add(new kata("Ponstan","Rp 27.000",R.drawable.tablet));
        tablet.add(new kata("FG Troches","Rp 12.500",R.drawable.tablet));
        tablet.add(new kata("Dexaharsen 0,5 ","Rp 2.000",R.drawable.tablet));
        tablet.add(new kata("Dexaharsen 0,75","Rp 2500",R.drawable.tablet));
        tablet.add(new kata("Grateos","Rp 4000",R.drawable.tablet));
        tablet.add(new kata("Omegtamine ","Rp 4000",R.drawable.tablet));
        tablet.add(new kata("Paratusin","Rp 10.000",R.drawable.tablet));
        tablet.add(new kata("Polycrol","Rp 6.000",R.drawable.tablet));
        tablet.add(new kata("Polycrol Forte","Rp 7.000",R.drawable.tablet));
        tablet.add(new kata("Plantacid","Rp 10.000",R.drawable.tablet));
        tablet.add(new kata(" Plantacid Forte","Rp 10.000",R.drawable.tablet));
        tablet.add(new kata("Elkana ","Rp 9.000",R.drawable.tablet));
        tablet.add(new kata(" Berryvision ","Rp 35.000",R.drawable.tablet));
        tablet.add(new kata(" Claneksi","Rp 135.000",R.drawable.tablet));
        tablet.add(new kata("Cataflam","Rp 60.000",R.drawable.tablet));
        tablet.add(new kata("Colme","Rp 12.000",R.drawable.tablet));
        tablet.add(new kata("Avil","Rp 18.000",R.drawable.tablet));
        tablet.add(new kata("Dextamine ","Rp 20.000",R.drawable.tablet));

        ListView daftarObat = (ListView) rootView.findViewById(R.id.tablet);
        AdapterKata adapter = new AdapterKata(getActivity(),tablet,R.color.colorAccent);
        daftarObat.setAdapter(adapter);

        daftarObat.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Log.i("daftarObat",tablet.get(position).toString());
            }
        });

        return rootView;
    }
}
