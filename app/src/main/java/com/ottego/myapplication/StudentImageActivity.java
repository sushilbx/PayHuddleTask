package com.ottego.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class StudentImageActivity extends AppCompatActivity {
    ImageView ivImage1,ivImage2,ivImage3,ivImage4,ivImage5,ivImage6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_image);
        ivImage1= findViewById(R.id.ivImage1);
        ivImage2= findViewById(R.id.ivImage2);
        ivImage3= findViewById(R.id.ivImage3);
        ivImage4= findViewById(R.id.ivImage4);
        ivImage5= findViewById(R.id.ivImage5);
        ivImage6= findViewById(R.id.ivImage6);

        ivImage1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(StudentImageActivity.this, Image1Activity.class);
                startActivity(intent);

            }
        });
        ivImage1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(StudentImageActivity.this, Image1Activity.class);
                startActivity(intent);

            }
        });
        ivImage2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(StudentImageActivity.this, Image1Activity.class);
                startActivity(intent);

            }
        });
        ivImage3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(StudentImageActivity.this, Image1Activity.class);
                startActivity(intent);

            }
        });
        ivImage4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(StudentImageActivity.this, Image1Activity.class);
                startActivity(intent);

            }
        });
        ivImage5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(StudentImageActivity.this, Image1Activity.class);
                startActivity(intent);

            }
        });
        ivImage6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(StudentImageActivity.this, Image1Activity.class);
                startActivity(intent);

            }
        });

    }

}