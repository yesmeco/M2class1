package com.example.pisa_452.secondclass;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button relativelayout = (Button) findViewById(R.id.button5);
        relativelayout.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.button1:
                Intent intenta = new Intent(this, RelativeLayout.class);
                startActivity(intenta);
                break;

            case R.id.button2:
                Intent intentb = new Intent(this, excerciseii.class);
                startActivity(intentb);
                break;

           case R.id.button3:
                Intent intentc = new Intent(this, TableLayout.class);
                startActivity(intentc);
                break;

            case R.id.button4:
                Intent intentd = new Intent(this, ListViewActivity.class);
                startActivity(intentd);
                break;

            case R.id.button5:
                Intent intente = new Intent(this, FrameLayout.class);
                startActivity(intente);
                break;

            case R.id.listview:
                Intent intentf = new Intent(this, ListViewActivity.class);
                startActivity(intentf);
                break;
/*
            case R.id.button7:
                break;*/
        }
    }
}
