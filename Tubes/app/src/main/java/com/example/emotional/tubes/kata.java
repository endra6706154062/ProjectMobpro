package com.example.emotional.tubes;

/**
 * Created by Emotional on 3/15/2017.
 */

public class kata {
    private String nObat;
    private String hObat;
    private int gambar;

    public kata(String namaObat, String hargaObat, int obatImage) {
        nObat = namaObat;
        hObat = hargaObat;
        gambar = obatImage;
    }


    @Override
    public String toString() {
        return getNamaObat() + "" + getHargaObat();
    }

    public String getNamaObat() {
        return nObat;
    }

    public String getHargaObat() {
        return hObat;
    }

    public int getGambarObat() {
        return gambar;
    }
}
