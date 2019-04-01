package com.example.pizzaorder;

import android.app.Activity;
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

        View AddToCartButton = findViewById(R.id.add_to_cart_button);
        AddToCartButton.setOnClickListener(this);
        View CancelButton = findViewById(R.id.cancel_button);
        CancelButton.setOnClickListener(this);

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
        String toppingsWhole = "";
        String toppingsLeft = "";
        String toppingsRight = "";
        if (wList.size() > 0) {
            toppingsWhole = toppingsWhole + editString(wList);
        }
        if (lList.size() > 0) {
            toppingsLeft = toppingsLeft + editString(lList);
        }
        if (rList.size() > 0) {
            toppingsRight = toppingsRight + editString(rList);
        }
        updatePizza(toppingsWhole, toppingsLeft, toppingsRight);
    }

    private String editString(ArrayList<String> wList) {
    }

    private void updatePizza(String toppingsWhole, String toppingsLeft, String toppingsRight) {

    }
}


