package com.example.techgadget;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CircuitPrinter extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circuit_printer);

        final Button btnLoad = findViewById(R.id.btnViewPage);
        btnLoad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://info.voltera.io/promo-print?utm_source=adwords&utm_medium=search&utm_campaign=pcb-printer-us&utm_term=circuit%20board%20printer&utm_content=305028006160&hsa_src=g&hsa_tgt=kwd-321748227834&hsa_grp=62389010362&hsa_acc=2007742875&hsa_ad=305028006160&hsa_cam=965544655&hsa_net=adwords&hsa_ver=3&hsa_kw=circuit%20board%20printer&hsa_mt=p&gclid=Cj0KCQiAs67yBRC7ARIsAF49CdUGia_jsJycc_J30ozMuPZ5bdrBr_TP4Nsn7sOK0a_yhzsELzCRI10aApRCEALw_wcB")));

            }
        });
    }
}
