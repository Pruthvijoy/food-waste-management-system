package com.example.dontwaste;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class AboutUs extends AppCompatActivity implements View.OnClickListener{
    ImageView pruIn,nisIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_us);

        pruIn=(ImageView)findViewById(R.id.pruInsta);
        pruIn.setOnClickListener(this);

        nisIn=(ImageView)findViewById(R.id.nisInsta);
        nisIn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.pruInsta:
                goToUrl("https://www.instagram.com/pruthvijoy/");
                break;
            case R.id.nisInsta:
                goToUrl("https://www.instagram.com/nish_dude_/");
                break;
        }
    }

    private void goToUrl (String url) {
        Uri uriUrl = Uri.parse(url);
        Intent WebView = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(WebView);
    }
}