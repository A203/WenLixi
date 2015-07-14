package com.xiye.myapplication4;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import android.widget.ToggleButton;

import java.util.HashSet;
import java.util.Set;


public class MainActivity extends ActionBarActivity {
   private RadioGroup group;
    private CheckBox box1,box2,box3;
    private Set<String> hobby=new HashSet<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        box1=(CheckBox)findViewById(R.id.basketball);
        box1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean b) {
                if (b) {
                    hobby.add("¿∫«Ú");
                } else {
                    if (hobby.contains("¿∫«Ú")) hobby.remove("¿∫«Ú");
                }
                Toast.makeText(MainActivity.this, "ƒ˙—°‘Ò¡À£∫" + hobby.toString(), Toast.LENGTH_SHORT).show();
            }
        });
        box2=(CheckBox)findViewById(R.id.football);
        box2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean b) {
                if(b){
                    hobby.add("◊„«Ú");
                }else {
                    if(hobby.contains("◊„«Ú"))hobby.remove("◊„«Ú");
                }
                Toast.makeText(MainActivity.this,"ƒ˙—°‘Ò¡À£∫"+hobby.toString(),Toast.LENGTH_SHORT).show();
            }});
        box3=(CheckBox)findViewById(R.id.music);
        box3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean b) {
                if(b){
                    hobby.add("music");
                }else {
                    if(hobby.contains("music"))hobby.remove("music");
                }
                Toast.makeText(MainActivity.this,"ƒ˙—°‘Ò¡À£∫"+hobby.toString(),Toast.LENGTH_SHORT).show();
            }});
        group=(RadioGroup)findViewById(R.id.gender);
        group.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radiogroup, int i) {
                if(i==R.id.male){
                    Toast.makeText(MainActivity.this,"ƒ˙—°‘Ò¡Àƒ––‘",Toast.LENGTH_SHORT).show();
                }else if(i==R.id.female){
                    Toast.makeText(MainActivity.this,"ƒ˙—°‘Ò¡À≈Æ–‘",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
