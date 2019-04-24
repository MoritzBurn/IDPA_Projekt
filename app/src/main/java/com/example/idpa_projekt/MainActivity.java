package com.example.idpa_projekt;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.example.idpa_projekt.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Button[][] Tiles = new Button[8][8];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        RelativeLayout mainlayout = (RelativeLayout) findViewById(R.id.mainlayout);
        RelativeLayout ll = (RelativeLayout)findViewById(R.id.mainlayout);
        RelativeLayout.LayoutParams lp = new RelativeLayout.LayoutParams(RelativeLayout.LayoutParams.MATCH_PARENT, RelativeLayout.LayoutParams.WRAP_CONTENT);


                Tiles[0][0] = new Button(this);
                Tiles[0][0].setId(0);
                Tiles[0][0].setLayoutParams(new LinearLayout.LayoutParams(200,225));
                Tiles[0][0].setPadding(10,40,600,0);
                Tiles[0][0].setBackgroundResource(R.drawable.blackpawn);

                mainlayout.addView(Tiles[0][0]);

                Grösse der figuren relativ machen.
                Position ändern.



    }

    public void SetButtonVariables(){


    }




}