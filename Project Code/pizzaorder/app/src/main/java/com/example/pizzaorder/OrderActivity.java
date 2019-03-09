package com.example.pizzaorder;

import android.app.AlertDialog;
import android.app.ListActivity;
import android.content.DialogInterface;
import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.TextView;

public class OrderActivity extends ListActivity implements View.OnClickListener{

    public boolean hasShown = false;
    public TextView Total;
    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        getListView().setChoiceMode(1);

        getListView().setOnItemClickListener(new AdapterView.OnItemClickListener() {

            public void onNothingSelected(AdapterView arg0) {

            }

            public void onItemClick(AdapterView arg0, View arg1, int arg2, long arg3) {

            }

        });

        View getNewPizzaButton = findViewById(R.id.newPizza);
        getNewPizzaButton.setOnClickListener(this);
        View getCheckoutButton = findViewById(R.id.checkout);
        getCheckoutButton.setOnClickListener(this);
        Total = (TextView) findViewById(R.id.total);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()) {
            case R.id.newPizza:
                if (!hasShown) {
                    openHowToDialog();
                    hasShown = true;
                } else {
                    openSizeSelectionDialog();
                }
                break;
            case R.id.checkout:
                if (getListView().getCount() != 0)
                    checkOutDialog();
                else {
                    new AlertDialog.Builder(this).setTitle("Info").setMessage("You must order a pizza, before you can checkout.").setCancelable(false)
                            .setNeutralButton("OK", new DialogInterface.OnClickListener() {

                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    openSizeSelectionDialog();
                                }
                            }).show();
                }
                break;
        }

    }
}
