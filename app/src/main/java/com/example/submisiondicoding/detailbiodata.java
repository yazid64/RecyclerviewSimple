package com.example.submisiondicoding;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.appbar.CollapsingToolbarLayout;

public class detailbiodata extends AppCompatActivity {
private Toolbar toolbar;
    TextView desc,nama;
    ImageView img;
    TextView wafat;
    TextView lahir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailbiodata);

        nama = findViewById(R.id.tv_nama);
        toolbar = findViewById(R.id.toolbar_detail);
        desc = findViewById(R.id.hero_desc);
        img = findViewById(R.id.img_hero);
        wafat = findViewById(R.id.tv_wafat);
        lahir = findViewById(R.id.tv_lahir);

        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Detail");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        CollapsingToolbarLayout collapsingToolbarLayout = findViewById(R.id.collapsingtoolbar_id_airingtoday);
        collapsingToolbarLayout.setTitleEnabled(true);

        if(getIntent().getExtras()!=null) {
            Bundle bundle = getIntent().getExtras();
            nama.setText(bundle.getString("nama"));
            img.setImageResource(bundle.getInt("image"));
            wafat.setText(bundle.getString("wafat"));
            lahir.setText(bundle.getString("lahir"));
            desc.setText(bundle.getString("desc"));


        }else {
//            textViewTitle.setText(getIntent().getStringExtra("title"));
//            textViewShortDesc.setText(getIntent().getStringExtra("Shortdesc"));
        }
    }
    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}
