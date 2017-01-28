package com.example.tars.ergotronicshandbase;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by TARS on 12/5/2016.
 */
public class PartQuery extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.part_query);

        ((TextView)((LinearLayout)((ViewGroup) getWindow().getDecorView()).getChildAt(0)).getChildAt(0)).setGravity(Gravity.CENTER);

        Button submitButton = (Button) findViewById(R.id.submit_button);
        Button cancelButton = (Button) findViewById(R.id.cancel_button);

    }

}
