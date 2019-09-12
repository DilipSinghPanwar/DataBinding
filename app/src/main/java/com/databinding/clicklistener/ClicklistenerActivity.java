package com.databinding.clicklistener;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;
import com.databinding.R;
import com.databinding.databinding.ActivityClicklistenerBinding;

public class ClicklistenerActivity extends AppCompatActivity implements ClickHandler {

    private ActivityClicklistenerBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_clicklistener);
        binding.setHandler(this);
    }

    @Override
    public void onButtonClick(View v) {
        Toast.makeText(this,"Button clicked",Toast.LENGTH_LONG).show();
    }

}