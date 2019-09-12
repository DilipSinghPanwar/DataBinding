package com.databinding.lamdaclick;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.databinding.R;
import com.databinding.databinding.ActivityClicklamdaBinding;

public class ClickLamdaActivity extends AppCompatActivity implements ClickHandler {

    private ActivityClicklamdaBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_clicklamda);
        binding.setUser(new User("DataBinding User"));
        binding.setHandler(this);
    }

    @Override
    public void onButtonClick(User user) {
        Toast.makeText(ClickLamdaActivity.this,"Welcome " + user.getName(),Toast.LENGTH_LONG).show();
    }

}