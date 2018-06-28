package com.example.cheng.testeditfocus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText tv_edit_1, tv_edit_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv_edit_1 = findViewById(R.id.tv_edit_1);
        tv_edit_2 = findViewById(R.id.tv_edit_2);
        tv_edit_1.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if(hasFocus){
                    v.setBackgroundResource(R.drawable.edittext_focus);
                }else{
                    v.setBackgroundResource(R.drawable.edittext_unfocus);
                }
            }
        });
        tv_edit_2.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                if(hasFocus){
                    v.setBackgroundResource(R.drawable.edittext_focus);
                }else{
                    v.setBackgroundResource(R.drawable.edittext_unfocus);
                }
            }
        });

    }

}
