package com.example.livecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.livecycle.databinding.ActivityMainBinding;
import com.example.livecycle.databinding.ElementsBinding;

public class MainActivity extends AppCompatActivity {
    RadioGroup group;

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ElementsBinding binding = ElementsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        Toast.makeText(getApplicationContext(), "CREATE", Toast.LENGTH_SHORT).show();

        binding.RG.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {

                /*switch (checkedId){
                    case (R.id.RB1):
                        textView.setText("First");
                        break;
                    case (R.id.RB2):
                        textView.setText("Second");
                        break;
                }*/
                // заменить на if-else

            }
        });


    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(getApplicationContext(), "START", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(getApplicationContext(), "RESUME", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(getApplicationContext(), "PAUSE", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(getApplicationContext(), "STOP", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(getApplicationContext(), "DESTROY", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(getApplicationContext(), "RESTART", Toast.LENGTH_SHORT).show();
    }

}