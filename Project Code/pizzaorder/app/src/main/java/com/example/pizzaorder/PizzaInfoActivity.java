package com.example.pizzaorder;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class PizzaInfoActivity extends Activity implements OnClickListener {

    TextView Size, Crust, Whole, Left, Right;
    Button PayButton, BackButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pizza_info);
        final String ppsize = getIntent().getStringExtra("pSize");
        final String ppcrust = getIntent().getStringExtra("pCrust");
        final String ppwhole = getIntent().getStringExtra("pWhole");
        final String ppleft = getIntent().getStringExtra("pLeft");
        final String ppright = getIntent().getStringExtra("pRight");
        
        PayButton = (Button) findViewById(R.id.pay);
        BackButton = (Button) findViewById(R.id.cancel);
        Size = (TextView) findViewById(R.id.size);
        Crust = (TextView) findViewById(R.id.crust);
        Whole = (TextView) findViewById(R.id.whole);
        Left = (TextView) findViewById(R.id.left);
        Right = (TextView) findViewById(R.id.right);

        Size.setText(ppsize);
        Crust.setText(ppcrust);
        Whole.setText(ppwhole);
        Left.setText(ppleft);
        Right.setText(ppright);
    }

    @Override
    public void onClick(View v) {

    }
}
