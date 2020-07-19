package com.example.final_work;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class details extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        TextView tv1 = findViewById(R.id.textView5);
        tv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a = new Intent(details.this, siklo1.class);
                startActivity(a);
            }
        });

        TextView tv2 = findViewById(R.id.textView6);
        tv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent b = new Intent(details.this, sec_1.class);
                startActivity(b);
            }
        });

        TextView tv3 = findViewById(R.id.textView7);
        tv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent c = new Intent(details.this, the_1.class);
                startActivity(c);
            }
        });

        TextView tv4 = findViewById(R.id.textView8);
        tv4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent d = new Intent(details.this, ths_1.class);
                startActivity(d);
            }
        });

        TextView tv5 = findViewById(R.id.textView9);
        tv5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent e = new Intent(details.this, as_1.class);
                startActivity(e);
            }
        });

        TextView tv6 = findViewById(R.id.textView10);
        tv6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent f = new Intent(details.this, bs_1.class);
                startActivity(f);
            }
        });

        TextView tv7 = findViewById(R.id.textView11);
        tv7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent g = new Intent(details.this, cs_1.class);
                startActivity(g);
            }
        });


        TextView tv8 = findViewById(R.id.textView12);
        tv8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent h = new Intent(details.this, ds_1.class);
                startActivity(h);
            }
        });

        TextView tv9 = findViewById(R.id.textView13);
        tv9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(details.this, es_1.class);
                startActivity(i);
            }
        });


        TextView tv10 = findViewById(R.id.textView14);
        tv10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent j = new Intent(details.this, fs_1.class);
                startActivity(j);
            }
        });

        TextView tv11 = findViewById(R.id.textView15);
        tv11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent k = new Intent(details.this, gs_1.class);
                startActivity(k);
            }
        });

        TextView tv12 = findViewById(R.id.textView16);
        tv12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent l = new Intent(details.this, hs_1.class);
                startActivity(l);
            }
        });

        TextView tv13 = findViewById(R.id.textView17);
        tv13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent m = new Intent(details.this, is_1.class);
                startActivity(m);
            }
        });



        TextView tv14 = findViewById(R.id.textView18);
        tv14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent n = new Intent(details.this, ks_1.class);
                startActivity(n);
            }
        });

        TextView tv15 = findViewById(R.id.textView19);
        tv15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent o = new Intent(details.this, ls_1.class);
                startActivity(o);
            }
        });


        TextView tv16 = findViewById(R.id.textView20);
        tv16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent o = new Intent(details.this, ms_1.class);
                startActivity(o);
            }
        });


        TextView tv17 = findViewById(R.id.textView21);
        tv17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent p = new Intent(details.this, ns_1.class);
                startActivity(p);
            }
        });


        TextView tv18 = findViewById(R.id.textView22);
        tv18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent q = new Intent(details.this, zs_1.class);
                startActivity(q);
            }
        });




        Bundle b = getIntent().getExtras();
        mid m = (mid) b.getSerializable("mid");

        TextView name = findViewById(R.id.textView4);
        TextView d1 = findViewById(R.id.textView5);
        TextView d2 = findViewById(R.id.textView6);
     TextView d3 = findViewById(R.id.textView7);
     TextView d4 = findViewById(R.id.textView8);
     TextView d5 = findViewById(R.id.textView9);
     TextView d6 = findViewById(R.id.textView10);
     TextView d7 = findViewById(R.id.textView11);
     TextView d8 = findViewById(R.id.textView12);
     TextView d9 = findViewById(R.id.textView13);
     TextView d10 = findViewById(R.id.textView14);
     TextView d11 = findViewById(R.id.textView15);
     TextView d12 = findViewById(R.id.textView16);
     TextView d13 = findViewById(R.id.textView17);
     TextView d14 = findViewById(R.id.textView18);
     TextView d15 = findViewById(R.id.textView19);
     TextView d16 = findViewById(R.id.textView20);
     TextView d17 = findViewById(R.id.textView21);
     TextView d18 = findViewById(R.id.textView22);
     TextView d19 = findViewById(R.id.textView23);
     TextView d20 = findViewById(R.id.textView24);
     TextView d21 = findViewById(R.id.textView25);
     TextView d22 = findViewById(R.id.textView26);
     TextView d23 = findViewById(R.id.textView27);


        name.setText("الأدوية لمرض  "+m.getName());
        d1.setText(m.getD1());
        d2.setText(m.getD2());
        d3.setText(m.getD3());
        d4.setText(m.getD4());
        d5.setText(m.getD5());
        d6.setText(m.getD6());
        d7.setText(m.getD7());
        d8.setText(m.getD8());
        d9.setText(m.getD9());
        d10.setText(m.getD10());
        d11.setText(m.getD11());
        d12.setText(m.getD12());
        d13.setText(m.getD13());
        d14.setText(m.getD14());
        d15.setText(m.getD15());
        d16.setText(m.getD16());
        d17.setText(m.getD17());
        d18.setText(m.getD18());
        d19.setText(m.getD19());
        d20.setText(m.getD20());
        d21.setText(m.getD21());
        d22.setText(m.getD22());
        d23.setText(m.getD23());
    }
}