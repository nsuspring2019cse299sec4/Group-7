package com.example.pizzaorder;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Gallery;
import android.widget.RadioButton;
import android.widget.TextView;

import java.util.ArrayList;

public class NewPizzaActivity extends Activity implements View.OnClickListener {

    public RadioButton wholeRadio;
    public RadioButton leftRadio;
    public RadioButton rightRadio;
    public TextView wholeText;
    public TextView leftText;
    public TextView rightText;
    public ArrayList<String> wList = new ArrayList<String>();
    public ArrayList<String> lList = new ArrayList<String>();
    public ArrayList<String> rList = new ArrayList<String>();
    public ArrayList<String> topingList = new ArrayList<String>();

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_pizza);

        wholeRadio = (RadioButton) findViewById(R.id.whole);
        leftRadio = (RadioButton) findViewById(R.id.left);
        rightRadio = (RadioButton) findViewById(R.id.right);
        wholeText = (TextView) findViewById(R.id.whole_text);
        leftText = (TextView) findViewById(R.id.left_text);
        rightText = (TextView) findViewById(R.id.right_text);

        Gallery gallery = (Gallery) findViewById(R.id.gallery);
        gallery.setAdapter(new ImageAdapter(this));

        gallery.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @SuppressWarnings("rawtypes")
            public void onItemClick(AdapterView parent, View v, int position, long id) {
                if (wList.isEmpty())
                    wList.clear();
                if (lList.isEmpty())
                    lList.clear();
                if (rList.isEmpty())
                    rList.clear();
                }
        });
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.add_to_cart_button:
                addToCart();
                finish();
                break;
            case R.id.cancel_button:
                finish();
                break;
        }
    }

    private void addToCart() {

    }
}


