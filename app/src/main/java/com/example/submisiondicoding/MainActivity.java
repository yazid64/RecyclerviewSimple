package com.example.submisiondicoding;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.core.view.MenuItemCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.appcompat.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private Toolbar toolbar;
    List<product> productList;
product_adapter adapter;
    //the recyclerview
    RecyclerView recyclerView;
    private static final int TIME_LIMIT = 1500;
    private static long backPressed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = findViewById(R.id.toolbar_people);

        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("Hero");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        //initializing the productlist
        productList = new ArrayList<>();


        //adding some items to our list
        productList.add(
                new product(
                        "Moh yamin",
                        "ia pernah diangkat sebagai ketua jong sumatra bond, " +
                                "pendiri partai gerakan rakyat indonesia, anggota bpupki dan panitia sembilan,  " +
                                "pernah menjadi anggota dpr, menteri pengajar pendidikan kebudayaan, dan salah satu " +
                                "dari 3 pengusul isi dasar negara",
                        R.drawable.mohammad_yamin,
                        "24 Agustus 1903",
                        "17 Oktober 1962, Jakarta"));
        productList.add(
                new product(
                        "Bung Tomo",
                        "Bung Tomo adalah salah satu pahlawan nasional yang berjuang di Surabaya. beliau mengobarkan semangat arek-arek surabaya" +
                                "dan bertempur pada tanggal 10 November yang sekarang dikenal sebagai hari pahlawan. beliau wafat di Saudi Arabia saat sedang haji.",
                        R.drawable.bung_tomo,
                        "3 Oktober 1920",
                        "7 Oktober 1981, Arafah, Mekkah, Arab Saudi"));
        productList.add(
                new product(
                        "Kartini",
                        "Raden Adjeng Kartini (lahir di Jepara, Jawa Tengah, 21 April 1879 – meninggal di Rembang, Jawa Tengah, 17 September 1904" +
                                "pada umur 25 tahun) atau sebenarnya lebih tepat disebut Raden Ayu Kartini[1] adalah seorang tokoh Jawa" +
                                "dan Pahlawan Nasional Indonesia. Kartini dikenal sebagai pelopor kebangkitan perempuan pribumi.",
                        R.drawable.kartini,
                        "21 April 1879",
                        "17 September 1904, Kabupaten Rembang"));
        productList.add(
                new product(
                        "Soekarno",
                        "Ir. seokarno (lahir di surabaya, jawa timur, 6 juni 1901) dan meninggal di jakarta, 21 juni 1970 pada umur 69 tahun. beliau adalah presiden pertama indonesia yang mnnjabat periode" +
                                " tahun 1945-1966. ia adalah proklamator kemerdekaan indonesia yang terjadi tanggal 17 augustus 1945. dan beliau adalah orang pertama kali yang mencetuskan konsep mengenai " +
                                "pancasila sebagai dasar negara dan ia sendiri yang menamainya",
                        R.drawable.presiden_sukarno,
                        "6 Juni 1901",
                        "21 Juni 1970, Jakarta"));
        productList.add(
                new product(
                        "Pangeran Diponegoro",
                        "Bendara Pangeran Harya Dipanegara (lebih dikenal dengan nama Diponegoro, lahir di Ngayogyakarta Hadiningrat, 11 November 1785 – meninggal di Makassar, Hindia Belanda, 8 Januari 1855 " +
                                "pada umur 69 tahun) adalah salah seorang pahlawan nasional Republik Indonesia. Pangeran Diponegoro terkenal karena memimpin Perang Diponegoro/Perang Jawa (1825-1830) " +
                                "melawan pemerintah Hindia Belanda. Perang tersebut tercatat sebagai perang dengan korban paling besar dalam sejarah Indonesia.",
                        R.drawable.diponegoro,
                        "11 November 1785",
                        "8 Januari 1855, Makassar"));
        productList.add(
                new product(
                        "Moh Hatta",
                        "Dr.(HC) Drs. H. Mohammad Hatta (lahir dengan nama Mohammad Athar, populer sebagai Bung Hatta; lahir di Fort de Kock (sekarang Bukittinggi, Sumatera Barat), Hindia Belanda, " +
                                "12 Agustus 1902 – meninggal di Jakarta, 14 Maret 1980 pada umur 77 tahun) adalah pejuang, negarawan, ekonom, dan juga Wakil Presiden Indonesia yang pertama. Ia bersama Soekarno " +
                                "memainkan peranan penting untuk memerdekakan bangsa Indonesia dari penjajahan Belanda sekaligus memproklamirkannya pada 17 Agustus 1945. Ia juga pernah menjabat sebagai Perdana " +
                                "Menteri dalam Kabinet Hatta I, Hatta II, dan RIS. Ia mundur dari " +
                                "jabatan wakil presiden pada tahun 1956, karena berselisih dengan Presiden Soekarno. Hatta juga dikenal sebagai Bapak Koperasi Indonesia.",
                        R.drawable.mohammad_hatta,
                        "12 Agustus 1902",
                        "14 Maret 1980, Rumah Sakit Umum Pusat Nasional dr. Cipto Mangunkusumo, Jakarta"));
        productList.add(
                new product(
                        "Sultan Hassanudin",
                        "Sultan Hasanuddin adalah Raja Gowa yang ke-16 dan termasuk pahlawan nasional Indonesia yang terlahir dengan nama I Mallombasi Muhammad Bakir Daeng Mattawang Karaeng Bonto Mangepe." +
                                "Lahir pada tanggal 12 Januari 1631 di Makassar dan meninggal pada tanggal 12 Juni 1670 di Makassar juga.",
                        R.drawable.sultan_hassanudin,
                        "12 Januari 1631",
                        "12 Juni 1670, Makassar"));
        productList.add(
                new product(
                        "Dewi Sartika",
                        "Dewi sartika lahir dari keluarga sunda yg ternama yaitu R. Rangga Somanegara dan R.A rajapermas di cicalengka pada 4 desember 1884." +
                                "dan pada 16 januari 1904 ia mendirikan sekolah bernama sekolah isteri di pendopo kabupaten bandung." +
                                "sekolah itu berganti nama menjadi sekolah raden dewi pada september 1929" +
                                "dan ia meninggal pada tanggal 11 september 1947 di cineam ketika dalam masa perang kemerdekan",
                        R.drawable.dewi_sartika,
                        "4 Desember 1884",
                        "11 September 1947, Tasikmalaya"));
        productList.add(
                new product(
                        "Ki Hajar Dewantara",
                        "Raden Mas Soewardi Soerjaningrat. Sejak 1922 menjadi Ki Hadjar Dewantara. Ia lahir diPakualaman, 2 Mei 1889 – meninggal di Yogyakarta, 26 April 1959 pada umur 69 tahun. Ia adalah aktivis pergerakan kemerdekaan Indonesia, kolumnis, politisi, dan pelopor pendidikanbagi kaum pribumi Indonesia dari zaman penjajahan Belanda. Ia adalah pendiri Perguruan Taman Siswa, suatu lembaga pendidikan yang memberikan kesempatan bagi para pribumi jelata untuk bisa memperoleh hak pendidikan seperti halnya para priyayi maupun orang-orang Belanda." +
                                "Tanggal kelahirannya sekarang diperingati di Indonesia sebagai Hari Pendidikan Nasional. Bagian dari semboyan ciptaannya, tut wuri handayani, menjadi slogan Kementerian Pendidikan Nasional Indonesia." +
                                "Ia dikukuhkan sebagai pahlawan nasional yang ke-2 oleh Presiden RI, Sukarno, pada 28 November 1959 (Surat Keputusan Presiden Republik Indonesia No. 305 Tahun 1959, tanggal 28 November 1959).",
                        R.drawable.dewantara,
                        "2 Mei 1889",
                        "26 April 1959, Yogyakarta"));
        productList.add(
                new product(
                        "Jendral Soedirman",
                        "Jendral sudirman adalah Salah satu pahlawan Yang berasal Dari Surabaya ia terkenal dengan siasat dalam berperang Dan keberaniannya",
                        R.drawable.sudirman,
                        "24 Januari 1916",
                        "29 Januari 1950, Magelang"));


        //creating recyclerview adapter
        adapter = new product_adapter(this, productList);

        //setting adapter to recyclerview
        recyclerView.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){

            case  R.id.action_info:
                // change this code beacuse your app will crash
                startActivity(new Intent(MainActivity.this,about.class));
                return true;
        }

        return false;
    }
    @Override
    public void onBackPressed() {
        if (TIME_LIMIT + backPressed > System.currentTimeMillis()){
            super.onBackPressed();
        }else {
            Toast.makeText(getApplicationContext(),"Press once again to exit", Toast.LENGTH_SHORT).show();
        }
        backPressed =System.currentTimeMillis();
    }
}

