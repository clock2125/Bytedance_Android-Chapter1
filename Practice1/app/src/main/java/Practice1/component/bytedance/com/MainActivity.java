package Practice1.component.bytedance.com;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int val1 = 0;
    int val2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final TextView tv1 = findViewById(R.id.tv1);

        final Switch sw1 = findViewById(R.id.switch1);
        sw1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    val1 = 1;
                    sw1.setText("1");
                }
                else{
                    val1 = 0;
                    sw1.setText("0");
                }
            }
        });

        final Switch sw2 = findViewById(R.id.switch2);
        sw2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b){
                    val2 = 1;
                    sw2.setText("1");
                }
                else{
                    val2 = 0;
                    sw2.setText("0");
                }
            }
        });

        Button btn1 = findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv1.setText((val1+val2)+" ");
            }
        });

        Button btn2 = findViewById(R.id.btn2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv1.setText((val1-val2)+" ");
            }
        });

        Button btn3 = findViewById(R.id.btn3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tv1.setText((val1*val2)+" ");
            }
        });

    }
}
