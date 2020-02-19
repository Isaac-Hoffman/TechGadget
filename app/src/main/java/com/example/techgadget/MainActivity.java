package com.example.techgadget;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //https://www.phantomhighspeed.com/products/cameras/ultrahighspeed/v1612 slomocam
        //https://proto3000.com/product/desktop-metal-studio-3d-printer-2/ 3d metal printer
        //https://www.military.com/equipment/m1a2-abrams-main-battle-tank abrams tank
        //https://www.digikey.com/en/product-highlight/r/raspberry-pi/raspberry-pi-4-model-b?utm_adgroup=Raspberry%20Pi&utm_source=google&utm_medium=cpc&utm_campaign=NB_Development%20Board_E&utm_term=raspberry%20pi&utm_content=Raspberry%20Pi&gclid=Cj0KCQiAs67yBRC7ARIsAF49CdWrbIC7-4T0gx4TA8BA7iD8E7n9nKIW2hbYn0ZpLu_dFQKBsfdH2zkaAp2uEALw_wcB pie
        //https://info.voltera.io/promo-print?utm_source=adwords&utm_medium=search&utm_campaign=pcb-printer-us&utm_term=circuit%20board%20printer&utm_content=305028006160&hsa_src=g&hsa_tgt=kwd-321748227834&hsa_grp=62389010362&hsa_acc=2007742875&hsa_ad=305028006160&hsa_cam=965544655&hsa_net=adwords&hsa_ver=3&hsa_kw=circuit%20board%20printer&hsa_mt=p&gclid=Cj0KCQiAs67yBRC7ARIsAF49CdUGia_jsJycc_J30ozMuPZ5bdrBr_TP4Nsn7sOK0a_yhzsELzCRI10aApRCEALw_wcB board printer
        String[] things = {"v1612 Slow Motion Camera", "Metal 3D Printer", "M2A2 Abrams", "Raspberry Pi 4", "Circuit Board Printer"};

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, R.layout.activity_main, R.id.gadgets, things);
        setListAdapter(arrayAdapter);
    }

    protected void onListItemClick(ListView l, View v, int position, long id) {
        switch (position) {
            case 0:
                startActivity(new Intent( MainActivity.this, SlowMoCam.class));
                break;
            case 1:
                startActivity(new Intent( MainActivity.this, MetalPrinter.class));
                break;
            case 2:
                startActivity(new Intent( MainActivity.this, AbramsTank.class));
                break;
            case 3:
                startActivity(new Intent( MainActivity.this, RaspberryPi.class));
                break;
            case 4:
                startActivity(new Intent( MainActivity.this, CircuitPrinter.class));
                break;
        }
    }

}
