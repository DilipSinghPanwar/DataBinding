package com.databinding.twoways;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

import com.databinding.R;
import com.databinding.databinding.ActivityTwowaysBinding;

public class TwoWaysActivity extends AppCompatActivity {

    public static final String TAG = TwoWaysActivity.class.getSimpleName();

    private ActivityTwowaysBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_twoways);
//        User user = new User();
//        user.setName("Two Way Databinding");
//        binding.setUser(user);
//        binding.setActivity(this);

        User user = new User();
        user.name.set("Two Way Databinding");
        binding.setUser(user);
        binding.setActivity(this);
    }

    public void onButtonClick(String email) {
//        Log.d(TAG, "Email :" +binding.getUser().getEmail());
        Log.d(TAG, "Email :" +binding.getUser().email);
        Log.d(TAG, "Email : "+email);
        Toast.makeText(this,email,Toast.LENGTH_SHORT).show();
    }
}