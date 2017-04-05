package com.example.emotional.tubes;

import android.content.Context;
import android.support.annotation.IdRes;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Emotional on 3/15/2017.
 */

public class AdapterKata extends ArrayAdapter{
    private int mbackgroundColor;
    public AdapterKata(Context konteks, List<kata> object, int backgroundColor) {
        super(konteks, 0, object);
        mbackgroundColor = backgroundColor;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        kata current = (kata) getItem(position);

        ImageView imageView = (ImageView) convertView.findViewById(R.id.gambar);

        imageView.setImageResource(current.getGambarObat());
        imageView.setVisibility(View.VISIBLE);

        LinearLayout words = (LinearLayout) convertView.findViewById(R.id.words);


        TextView nObat = (TextView) convertView.findViewById(R.id.namaObt);
        nObat.setText(current.getNamaObat());

        TextView hObat = (TextView) convertView.findViewById(R.id.hargaObt);
        hObat.setText(current.getHargaObat());

        return convertView;
    }
}
