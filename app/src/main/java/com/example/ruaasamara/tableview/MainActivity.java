package com.example.ruaasamara.tableview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;
import android.graphics.Color;

public class MainActivity extends AppCompatActivity {
    TableLayout table;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        table = new TableLayout(this);
        table.setBackgroundColor(Color.GRAY);
        TableLayout.LayoutParams tableParams = new TableLayout.LayoutParams(FrameLayout.LayoutParams.MATCH_PARENT,FrameLayout.LayoutParams.MATCH_PARENT);
        table.setLayoutParams(tableParams);

        for (int x = 0; x < 3; x++) {

            TableRow tableRow = new TableRow(this);
            TableRow.LayoutParams rowParams = new TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT, TableRow.LayoutParams.WRAP_CONTENT);
            rowParams.topMargin = 2;

            TextView textView = new TextView(this);
            textView.setTextSize(22);
            textView.setTextColor(Color.BLACK);
            textView.setLayoutParams(rowParams);
            textView.setBackgroundColor(Color.GRAY);
            textView.setText("Item no. £");
            textView.setPadding(20, 20, 20, 20);

            ImageView imageView = new ImageView(this);
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setImageResource(R.drawable.img1);
            imageView.setLayoutParams(new TableRow.LayoutParams(TableRow.LayoutParams.WRAP_CONTENT));
            imageView.setPadding(20, 20, 20, 20);

            tableRow.addView(textView);
            tableRow.addView(imageView);
            table.addView(tableRow);


        }

        setContentView(table);

        }
}
