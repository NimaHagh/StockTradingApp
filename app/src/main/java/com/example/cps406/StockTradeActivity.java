package com.example.cps406;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Adapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;

public class StockTradeActivity extends AppCompatActivity {
    private static Adapter adapter;
    Context context;
    private Button buyButton;
    private Button sellButton;
    private TextView balanceButton;
    private Customer customer;
    Stock stocks[] = {new Stock("Apple", 123.50f),
            new Stock("Microsoft", 13.50f),
            new Stock("BMX", 163.75f),
            new Stock("Samsung", 83.54f),
            new Stock("Tinder", 140.50f),
            new Stock("Codo", 117.60f),
            new Stock("Amazon", 69.69f),
            new Stock("Tesla", 500.54f),
            new Stock("Vans", 99.50f),
            new Stock("Zumiez", 1.73f),
            new Stock("Nike", 44.25f),
            new Stock("YouTube", 87.54f),
            new Stock("Git", 12.50f),
            new Stock("TMU", 0.50f),
            new Stock("Toyota", 113.75f),
            new Stock("Discord", 99.54f),
            new Stock("S&P500", 500.50f),
            new Stock("mayo", 999.54f)};


    public void updateBalance() {
        TextView balanceTextView = findViewById(R.id.textview_balance);
        balanceTextView.setText(String.format(getString(R.string.textview_balance), customer != null ? customer.getBalance() : 0.0f));
    }
    @Override
    protected void onStart() {
        super.onStart();
        updateBalance();
    }
    @Override
    protected void onResume() {
        super.onResume();
        updateBalance();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        context = this;
        customer = Customer.get();
        setContentView(R.layout.activity_stock_trade);
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        ListView stocksListView = (ListView) findViewById(R.id.listview_stocks);
        StockAdapter stocksListAdapter = new StockAdapter(getApplicationContext(), stocks, this);
        stocksListView.setAdapter(stocksListAdapter);
        ImageView customerImageView = findViewById(R.id.image_button_goto_wallet);
        customerImageView.setOnClickListener(v -> {
            Intent intent = new Intent(StockTradeActivity.this, CustomerCard.class);
            startActivity(intent);
        });

    }
}