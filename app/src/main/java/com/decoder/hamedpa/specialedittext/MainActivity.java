package com.decoder.hamedpa.specialedittext;
/**Developed by Hamed PariAzar 2018
 *for more info You can read Document from
 * http://github.com/hamedpa
 * */
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.decoder.hamedpa.fastedittext.FView;

public class MainActivity extends AppCompatActivity {
    private FView fView,fView2;
    private ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fView  = (FView) findViewById(R.id.fview);
        fView2  = (FView) findViewById(R.id.fview2);
        imageView = (ImageView) findViewById(R.id.img);

    }

    public void start(View view) {
        //If users email or password was wrong you can use this method.
        fView.startAnimations(9,fView);
        fView.startAnimations(9,fView2);
        Toast.makeText(this, "Your email or password is wrong", Toast.LENGTH_SHORT).show();
    }

    public void forgotpass(View view) {
        //even you can use 3D animation for your views
        fView2.startAnimations(2,imageView);
    }
}
