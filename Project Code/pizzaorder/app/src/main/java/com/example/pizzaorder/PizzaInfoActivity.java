package com.example.pizzaorder;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class PizzaInfoActivity extends Activity {

    TextView Size, Crust, Whole, Left, Right, Total;
    Button PayButton, BackButton;
    static String ppsize, ppcrust, ppwhole, ppleft, ppright, uuphone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pizza_info);

        ppsize = getIntent().getStringExtra("pSize");
        ppcrust = getIntent().getStringExtra("pCrust");
        ppwhole = getIntent().getStringExtra("pWhole");
        ppleft = getIntent().getStringExtra("pLeft");
        ppright = getIntent().getStringExtra("pRight");
        uuphone = getIntent().getStringExtra("uPhone");

        PayButton = (Button) findViewById(R.id.payM);
        BackButton = (Button) findViewById(R.id.cancel);
        Size = (TextView) findViewById(R.id.size);
        Crust = (TextView) findViewById(R.id.crust);
        Whole = (TextView) findViewById(R.id.whole);
        Left = (TextView) findViewById(R.id.left);
        Right = (TextView) findViewById(R.id.right);
        Total = (TextView) findViewById(R.id.stotal);

        Size.setText(ppsize);
        Crust.setText(ppcrust);
        Whole.setText(ppwhole);
        Left.setText(ppleft);
        Right.setText(ppright);
        String temp = null;
        if(ppsize.equals("Small"))
            temp = "400tk";
        else if(ppsize.equals("Medium"))
            temp = "650Tk";
        else if(ppsize.equals("Large"))
            temp = "800Tk";
        Total.setText("Total amount: " + temp);
    }
    
}
