package com.example.submisiondicoding;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.widget.Toolbar;

import com.google.android.material.appbar.CollapsingToolbarLayout;

public class detailbiodata extends AppCompatActivity {
private Toolbar toolbar;
    TextView desc;
    ImageView img;
    TextView wafat;
    TextView lahir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detailbiodata);

        toolbar = (Toolbar) findViewById(R.id.toolbar_detail);
        desc = (TextView) findViewById(R.id.hero_desc);
        img = (ImageView) findViewById(R.id.img_hero);
        wafat = (TextView) findViewById(R.id.tv_wafat);
        lahir = (TextView) findViewById(R.id.tv_lahir);

        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Detail");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        CollapsingToolbarLayout collapsingToolbarLayout = findViewById(R.id.collapsingtoolbar_id_airingtoday);
        collapsingToolbarLayout.setTitleEnabled(true);

        if(getIntent().getExtras()!=null) {
            Bundle bundle = getIntent().getExtras();
            img.setImageResource(bundle.getInt("image"));
            wafat.setText(bundle.getString("wafat"));
            lahir.setText(bundle.getString("lahir"));
            desc.setText(bundle.getString("desc"));

        }
    }
    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}
