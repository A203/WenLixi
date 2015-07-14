package com.xiye.myapplication6;

import android.app.Activity;
import android.content.Intent;
import  android.os.Bundle;
import android.widget.Toast;

/**
 * Created by Administrator on 2015/7/11.
 */
public class OtherActivity extends Activity {
    protected  void onCreate(Bundle savedInstanceState ){
      super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);
        Intent intent=getIntent();
        String name=intent.getStringExtra("name");
        String sex=intent.getStringExtra("sex");
        Toast.makeText(this,"name"+name+"sex"+sex,Toast.LENGTH_SHORT).show();;


    }

}
