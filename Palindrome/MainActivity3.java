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

public class MainActivity3 extends AppCompatActivity {
TextView t2;
EditText e2;
Button b2;
int num,temp,rem,sum;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main3);
        t2=findViewById(R.id.textView4);
        e2=findViewById(R.id.editTextText2);
        b2=findViewById(R.id.button2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               num=Integer.parseInt(e2.getText().toString());
               temp=num;
               sum=0;
               while(num != 0){
                rem = num % 10;
                sum=sum+rem*rem*rem;
                num=num/10;
               }
               if(temp == sum){
                   t2.setText(temp+"is an amstrong");
               }
               else{
                   t2.setText(temp+"is not an amstrong");
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