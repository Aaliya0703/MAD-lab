package com.example.palindrome;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {
TextView t1;
EditText e1;
Button b1;
int num,temp,rem,rev;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);
        t1=findViewById(R.id.textView2);
        e1=findViewById(R.id.editTextText);
        b1=findViewById(R.id.button);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                num=Integer.parseInt(e1.getText().toString());
                temp = num;
                rev = 0;
                while (num != 0) {
                    rem = num % 10;
                    rev = rev * 10 + rem;
                    num = num / 10;
                }
                if (temp == rev) {
                    t1.setText(temp + "is a pallindfrome");

                } else {
                    t1.setText(temp + "is not a pallindrome");
                }
            }
        });

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}