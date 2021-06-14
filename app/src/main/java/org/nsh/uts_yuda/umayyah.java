package org.nsh.uts_yuda;

import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class umayyah extends ListActivity {
    protected void onCreate(Bundle isicle) {
        super.onCreate(isicle);
        String[] listRS = new String[]{"Sejarah", "Silsilah", "Wilayah Kekuasan", "Foto Peninggalan"};
        this.setListAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, listRS));
    }
    protected void onListItemClick (ListView l, View v, int position, long id){
        super.onListItemClick(l, v, position, id);
        Object o = this.getListAdapter().getItem(position);
        String pilihan = o.toString();
        tampilkanpilihan(pilihan);
    }

    private void tampilkanpilihan(String pilihan) {
        try {
            Intent a = null;
            if (pilihan.equals("Sejarah")) {
                String website = "https://id.wikipedia.org/wiki/Kekhalifahan_Umayyah";
                a = new Intent(Intent.ACTION_VIEW, Uri.parse(website));

            } else if (pilihan.equals("Silsilah")) {
                String website = "https://images.app.goo.gl/UkytsEDZu9xrtkEv6";
                a = new Intent(Intent.ACTION_VIEW, Uri.parse(website));

            } else if (pilihan.equals("Wilayah Kekuasan")) {
                String website = "https://images.app.goo.gl/mbQXbzQhjW4H4bTFA";
                a = new Intent(Intent.ACTION_VIEW, Uri.parse(website));

            } else if (pilihan.equals("Foto Peninggalan")) {
                String website = "https://www.kontraktorkubahmasjid.com/masjid-peninggalan-kejayaan-dinasti-umayyah/";
                a = new Intent(Intent.ACTION_VIEW, Uri.parse(website));
            }
            startActivity(a);
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}