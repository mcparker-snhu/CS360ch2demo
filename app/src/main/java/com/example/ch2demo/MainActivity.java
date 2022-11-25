package com.example.ch2demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView lblOutput;
    EditText txtName;
    RadioButton radYes;
    RadioButton radNo;
    CheckBox chkReading;
    CheckBox chkBiking;
    CheckBox chkOther;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lblOutput = findViewById(R.id.lblOutput);
        txtName = findViewById(R.id.txtName);
        radYes = findViewById(R.id.radio_yes);
        radNo = findViewById(R.id.radio_no);
        chkReading = findViewById(R.id.chkReading);
        chkBiking = findViewById(R.id.chkBiking);
        chkOther = findViewById(R.id.chkOther);

        Button btnOK = findViewById(R.id.btnOK);
        btnOK.setOnClickListener(v -> handleOKButton());

    }

    /**
     *
     */
    private void handleOKButton(){

        String selected = "";

        //Figure out which choice of whatever was made
        if (radYes.isSelected()){
            selected = "YES";
        } else if (radNo.isSelected()){
            selected = "NO";
        }

        //These are all optional choices...all, none, or any combination can be chosen
        if (chkReading.isSelected()){
            //reading was selected
        }

        if (chkBiking.isSelected()){

        }

        String name = String.valueOf(txtName.getText());
        Toast.makeText(MainActivity.this, "Hi CS 360 from " + name, Toast.LENGTH_LONG).show();
        lblOutput.setText(getString(R.string.hiMessage));
    }

    public void onRadioButtonClicked(View view) {
        String selected = "";
        // Which radio button was selected?
        switch (view.getId()) {
            case R.id.radio_yes:
                // "Yes!" selected
                selected = "YES";
                break;
            case R.id.radio_no:
                // "Maybe later" selected
                selected = "NO";
                break;
        }

        Toast.makeText(MainActivity.this, selected, Toast.LENGTH_LONG).show();
    }


//    public void SayHello(View view) {
//        TextView lblName = findViewById(R.id.lblOutput);
//
//        {
//            if (nameText != null) {
//                lblName.setText("You have to enter a name");
//            } else {
//                lblName.setText(R.string.hiMessage);
//            }
//        }
//    }
//}


}