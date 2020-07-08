package com.example.show_toast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox chocolate_syrup,sprinkle,crushed_nut,cherrie,orio_cookie_crumble;
    Button show_toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        chocolate_syrup= findViewById(R.id.chocolate_syrup_checkbox);
        sprinkle= findViewById(R.id.sprinkles_checkbox);
        crushed_nut= findViewById(R.id.crushed_nuts_checkbox);
        cherrie=findViewById(R.id.cherries_checkbox);
        orio_cookie_crumble=findViewById(R.id.orio_cookie_crumbles_checkbox);
        show_toast=(Button)findViewById(R.id.show_toast_button);

        show_toast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuilder result=new StringBuilder();
                result.append("Topping:");
                if (chocolate_syrup.isChecked()){
                    result.append("\t" + chocolate_syrup.getText().toString());
                }
                if (sprinkle.isChecked()){
                    result.append("\t" + sprinkle.getText().toString());
                }
                if (crushed_nut.isChecked()){
                    result.append("\t"+ crushed_nut.getText().toString());
                }
                if (cherrie.isChecked()){
                    result.append("\t"+cherrie.getText().toString());
                }
                if (orio_cookie_crumble.isChecked()){
                    result.append("\t"+ orio_cookie_crumble.getText().toString());
                }
                if (chocolate_syrup.isChecked()&&sprinkle.isChecked()&&crushed_nut.isChecked()&&cherrie.isChecked()&&orio_cookie_crumble.isChecked())
                    Toast.makeText(getApplicationContext(),result,Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void onCheckBoxClicked(View view){
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked
        switch(view.getId()) {
            case R.id.chocolate_syrup_checkbox:
                if (checked)
                    Log.d("Chocolate_syrup","Checked");
                else
                    Log.d("Chocolate_syrup","Unchecked");
                break;
            case R.id.sprinkles_checkbox:
                if (checked)
                    Log.d("Sprinkles","Checked");
                else
                    Log.d("Sprinkles","Unchecked");
                break;
            case R.id.crushed_nuts_checkbox:
                if (checked)
                    Log.d("Crushed","Checked");
                else
                    Log.d("Crushed","Unchecked");
                break;
            case R.id.cherries_checkbox:
                if (checked)
                    Log.d("Cherries","Checked");
                else
                    Log.d("Cherries","Unchecked");
                break;
            case R.id.orio_cookie_crumbles_checkbox:
                if (checked)
                    Log.d("Orio_cookie_crumbles","Checked");
                else
                    Log.d("Orio_cookie_crumbles","Unchecked");
                break;
        }
    }
}