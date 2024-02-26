package com.example.et01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Random rnd = new Random();
    TextView tV1,tV2,tV3,tV4,tV6,tV5;
    ImageView iV1,iV2,iV3;
    Button btn1,btn2,btn3,btn4;
    EditText eT1,eT2,eT3;
    int x, y, i, z, p, k, count, ahuz, Ans1, Ans2, Ans3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tV1 = (TextView) findViewById(R.id.tV1);
        tV2 = (TextView) findViewById(R.id.tV2);
        tV3 = (TextView) findViewById(R.id.tV3);
        tV4 = (TextView) findViewById(R.id.tV4);
        tV5 = (TextView) findViewById(R.id.tV5);
        tV6 = (TextView) findViewById(R.id.tV6);
        eT1 = (EditText) findViewById(R.id.eT1);
        eT2 = (EditText) findViewById(R.id.eT2);
        eT3 = (EditText) findViewById(R.id.eT3);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        iV1 = (ImageView) findViewById(R.id.iV1);
        iV2 = (ImageView) findViewById(R.id.iV2);
        iV3 = (ImageView) findViewById(R.id.iV3);
        y = rnd.nextInt(90) + 10;
        x = rnd.nextInt(90) + 10;
        tV1.setText(String.valueOf(x));
        tV2.setText(String.valueOf(y));
        ahuz = 0;
        count = 0;
    }


    public void clicked(View view) {
        String st1 = eT1.getText().toString();
        if (st1 !="") {
            Ans1 = Integer.parseInt(st1);
            if (Ans1 == x + y) {
                iV1.setImageResource(R.drawable.vvv);
                count++;
                ahuz = ahuz + 33;
            }
            else  {
                iV1.setImageResource(R.drawable.xxx);
            }
            tV3.setText(String.valueOf(x + y));
            z = rnd.nextInt(90) + 10;
            tV4.setText(String.valueOf(z));
            eT2.setVisibility(View.VISIBLE);
        }
    }

    public void clicked2(View view) {
        String st2 = eT2.getText().toString();
        if (st2 != "") {
            Ans2 = Integer.parseInt(st2);
            if (Ans2 == z + (x + y)) {
                iV2.setImageResource(R.drawable.vvv);
                count++;
                ahuz = ahuz + 33;
            } else {
                iV2.setImageResource(R.drawable.xxx);
            }
            tV5.setText(String.valueOf(z + (x + y)));
            i = rnd.nextInt(90) + 10;
            tV6.setText(String.valueOf(i));
            eT3.setVisibility(View.VISIBLE);
        }
    }

    public void clicked3(View view) {
        String st3 = eT3.getText().toString();
        if(st3 != ""){
            Ans3 = Integer.parseInt(st3);
            if (Ans3 == i + (z + (x + y))) {
                iV3.setImageResource(R.drawable.vvv);
                count++;
                ahuz = ahuz + 33;
            } else {
                iV3.setImageResource(R.drawable.xxx);
            }
        }
        if(ahuz == 99){
            ahuz = 100;
        }
        btn4.setText(count  +"/3," + ahuz+ "%");
    }

    public void clicked4(View view) {
        iV2.setImageResource(R.drawable.download);
        iV3.setImageResource(R.drawable.download);
        tV3.setText("");
        tV4.setText("");
        tV5.setText("");
        tV6.setText("");
        eT1.setText("");
        eT2.setText("");
        eT3.setText("");
        eT2.setVisibility(View.INVISIBLE);
        eT3.setVisibility(View.INVISIBLE);
        iV1.setImageResource(R.drawable.download);
        btn4.setText("new game");
        count = 0;
        ahuz = 0;
        x = rnd.nextInt(90)+10;
        y = rnd.nextInt(90)+10;
        tV1.setText(String.valueOf(x));
        tV2.setText(String.valueOf(y));
    
    }
}
