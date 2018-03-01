package com.firstlook.fistlook_android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.android.volley.VolleyError;
import com.android.volley.toolbox.ImageLoader;
import com.firstlook.volley.HttpRequestSingleton;

public class ImageActivity extends AppCompatActivity {
    private static final String TAG = "ImageActivity";
    Button button;
    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);
        volleyImageLoader("http://10.0.2.2:8080/fetchImage");
        addListenerOnButton();
    }

    public void addListenerOnButton() {

        image = (ImageView) findViewById(R.id.imageView1);

        button = (Button) findViewById(R.id.btnChangeImage);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                image.setImageResource(R.drawable.rinkee);
            }

        });

    }

    public void volleyImageLoader(String url){
        ImageLoader imageLoader = HttpRequestSingleton.getInstance(getApplicationContext()).getImageLoader();

        imageLoader.get(url, new ImageLoader.ImageListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                System.out.println("inside2");
                Log.e(TAG, "Image Load Error: " + error.getMessage());
            }

            @Override
            public void onResponse(ImageLoader.ImageContainer response, boolean arg1) {
                System.out.println("inside1");
                if (response.getBitmap() != null) {
                    System.out.println("inside");
                    LayoutInflater li = LayoutInflater.from(ImageActivity.this);
                    image = (ImageView)findViewById(R.id.imageView1);
                    image.setImageBitmap(response.getBitmap());
                }
            }
        });
    }
}
