package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.TextView;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    TextView text_dia_chi,text_sdt,text_chi_tiet;
    ImageView hinh_yeu_thich, hinh_dat_coc,hinh_gia_dien,hinh_gia_nuoc,hinh_dien_tich,hinh_may_lanh,hinh_wc,hinh_xe_dap,hinh_wifi,hinh_tu_lanh,hinh_gac_lung,hinh_dung_gio,hinh_an_ninh,hinh_tivi;




    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.manhinh);
        ImageSlider imageSlider=findViewById(R.id.slider);
        List<SlideModel> slideModel=new ArrayList<>();
        slideModel.add(new SlideModel("https://kollersi.com/wp-content/uploads/2019/08/album_tam-9.jpg"));
        slideModel.add(new SlideModel("https://ss-images.saostar.vn/2018/10/30/3961121/dge.png"));
        slideModel.add(new SlideModel("https://giaitri.vn/wp-content/uploads/2018/12/q13-2.jpg"));
        slideModel.add(new SlideModel("https://topnlist.com/wp-content/uploads/2019/04/ca-si-my-tam.jpg"));
        imageSlider.setImageList(slideModel,true);
        text_chi_tiet=findViewById(R.id.text_chitiet);
        text_sdt=findViewById(R.id.text_numberphone);
        text_dia_chi=findViewById(R.id.text_address);
        hinh_dat_coc=findViewById(R.id.image_deposit);
        hinh_gia_dien =findViewById(R.id.image_electronic_price);
        hinh_gia_nuoc=findViewById(R.id.image_water_price);
        hinh_dien_tich=findViewById(R.id.image_area);
        hinh_may_lanh=findViewById((R.id.image_cool_machine));
        hinh_wc=findViewById(R.id.image_wc);
        hinh_xe_dap=findViewById(R.id.image_bike);
        hinh_tu_lanh=findViewById(R.id.image_cool_tu);
        hinh_wifi=findViewById(R.id.image_wifi);
        hinh_gac_lung=findViewById(R.id.image_gaclung);
        hinh_dung_gio=findViewById(R.id.image_clock);
        hinh_an_ninh=findViewById(R.id.image_security);
        hinh_tivi=findViewById(R.id.image_tivi);
        hinh_yeu_thich=findViewById(R.id.image_yeu_thich);
        hinh_yeu_thich.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}