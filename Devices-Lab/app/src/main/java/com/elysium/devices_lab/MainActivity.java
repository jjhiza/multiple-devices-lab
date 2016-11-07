package com.elysium.devices_lab;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mTextView;
    private ImageView mImageView;
    private Button mButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextView = (TextView) findViewById(R.id.line_of_text);
        mImageView = (ImageView) findViewById(R.id.question_mark);
        mButton = (Button) findViewById(R.id.click_me_button);

        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mTextView.setText("Real Madrid is the greatest club on earth");
                mImageView.setImageResource(R.drawable.ic_tag_faces_black_24dp);
            }
        });
    }
}
