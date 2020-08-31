package com.example.tugaslatihan2intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void telepon(View view) {
        String nomor = "0831-0109-8214";
        Intent telepon = new Intent(Intent. ACTION_DIAL);
        telepon.setData(Uri.fromParts("tel",nomor,null));
        startActivity(telepon);
    }
    public void web(View view) {
        String url ="https://fahmiluthfi10.blogspot.com";
        Intent bukaweb = new Intent(Intent.ACTION_VIEW);
        bukaweb.setData(Uri.parse(url));
        startActivity(bukaweb);
    }
    public void tentangsaya(View view) {
        Intent tentangsaya = new Intent(MainActivity.this, TentangSaya.class);
        startActivity(tentangsaya);
    }
}
