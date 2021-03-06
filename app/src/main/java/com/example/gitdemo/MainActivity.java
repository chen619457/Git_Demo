package com.example.gitdemo;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.gitdemo.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    //    private Button mButtonAdd;
//    private Button mButtonSub;
//    private TextView mTextView;
    private int number = 0;
    private static final String save_number = "SAVE_NUMBER";
    private ActivityMainBinding mBinding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(mBinding.getRoot());

//        mButtonAdd=findViewById(R.id.button_add);
//        mButtonSub=findViewById(R.id.button_sub);
//        mTextView=findViewById(R.id.text_view);

        if (savedInstanceState != null) {
            number = savedInstanceState.getInt(save_number);
            mBinding.textView.setText(String.valueOf(number));
        }

        mBinding.buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mBinding.textView.setText(String.valueOf(++number));
            }
        });
        mBinding.buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mBinding.textView.setText(String.valueOf(--number));
            }
        });
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(save_number, number);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
//        switch (item.getItemId()) {
//            case R.id.item_zero: {
//                number = 0;
//                mBinding.textView.setText(String.valueOf(number));
//                break;
//            }
  //  }
        if (item.getItemId()==R.id.item_zero){//转换为IF方法
            number=0;
            mBinding.textView.setText(String.valueOf(number));
        }

        return super.onOptionsItemSelected(item);
    }
}
