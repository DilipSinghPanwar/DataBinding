package com.databinding.textfield;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.os.Bundle;

import com.databinding.R;
import com.databinding.databinding.ItemDetailActivityBinding;

public class ItemDetailActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ItemDetailActivityBinding binding = DataBindingUtil.setContentView(this, R.layout.item_detail_activity);
        Item item = new Item("Example item", "This is an example item.");
        binding.setItem(item);
    }
}