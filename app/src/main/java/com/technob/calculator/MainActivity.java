package com.technob.calculator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button button0;
    Button button1;
    Button button10;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;
    Button buttonAdd;
    Button buttonC;
    Button buttonDivision;
    Button buttonEqual;
    Button buttonMul;
    Button buttonSub;
    Button buttonnew;
    boolean Addition;
    boolean Division;
    EditText editText;
    boolean Multiplication;
    boolean mSubtract;
    float mValueOne;
    float mValueTwo;
    public void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView((R.layout.activity_main));
    this.button0 = (Button) findViewById(R.id.button10);
    this.button1 = (Button) findViewById(R.id.button1);
    this.button2 = (Button) findViewById(R.id.button2);
    this.button3 = (Button) findViewById(R.id.button3);
    this.button4 = (Button) findViewById(R.id.button4);
    this.button5 = (Button) findViewById(R.id.button5);
    this.button6 = (Button) findViewById(R.id.button6);
    this.button7 = (Button) findViewById(R.id.button7);
    this.button8 = (Button) findViewById(R.id.button8);
    this.button9 = (Button) findViewById(R.id.button9);
    this.buttonAdd = (Button) findViewById(R.id.plus);
    this.buttonSub = (Button) findViewById(R.id.sub);
    this.buttonMul = (Button) findViewById(R.id.mul);
    this.buttonDivision = (Button) findViewById(R.id.divid);
    this.buttonC = (Button) findViewById(R.id.clr);
    this.buttonnew = (Button) findViewById(R.id.mod);
    this.buttonEqual = (Button) findViewById(R.id.button);
    this.editText = (EditText) findViewById(R.id.blank);
    this.button1.setOnClickListener(new View.OnClickListener() {
        public void onClick(View v) {
            EditText editText = MainActivity.this.editText;
            editText.setText(MainActivity.this.editText.getText() + "1");
        }
    });
    this.button2.setOnClickListener(new View.OnClickListener() {
        public void onClick(View v) {
            EditText editText = MainActivity.this.editText;
            editText.setText(MainActivity.this.editText.getText() + "2");
        }
    });
    this.button3.setOnClickListener(new View.OnClickListener() {
        public void onClick(View v) {
            EditText editText = MainActivity.this.editText;
            editText.setText(MainActivity.this.editText.getText() + "3");
        }
    });
    this.button4.setOnClickListener(new View.OnClickListener() {
        public void onClick(View v) {
            EditText editText = MainActivity.this.editText;
            editText.setText(MainActivity.this.editText.getText() + "4");
        }
    });
    this.button5.setOnClickListener(new View.OnClickListener() {
        public void onClick(View v) {
            EditText editText = MainActivity.this.editText;
            editText.setText(MainActivity.this.editText.getText() + "5");
        }
    });
    this.button6.setOnClickListener(new View.OnClickListener() {
        public void onClick(View v) {
            EditText editText = MainActivity.this.editText;
            editText.setText(MainActivity.this.editText.getText() + "6");
        }
    });
    this.button7.setOnClickListener(new View.OnClickListener() {
        public void onClick(View v) {
            EditText editText = MainActivity.this.editText;
            editText.setText(MainActivity.this.editText.getText() + "7");
        }
    });
    this.button8.setOnClickListener(new View.OnClickListener() {
        public void onClick(View v) {
            EditText editText = MainActivity.this.editText;
            editText.setText(MainActivity.this.editText.getText() + "8");
        }
    });
    this.button9.setOnClickListener(new View.OnClickListener() {
        public void onClick(View v) {
            EditText editText = MainActivity.this.editText;
            editText.setText(MainActivity.this.editText.getText() + "9");
        }
    });
    this.button0.setOnClickListener(new View.OnClickListener() {
        public void onClick(View v) {
            EditText editText = MainActivity.this.editText;
            editText.setText(MainActivity.this.editText.getText() + "0");
        }
    });
    this.buttonAdd.setOnClickListener(new View.OnClickListener() {
        public void onClick(View v) {
            if (MainActivity.this.editText == null) {
                MainActivity.this.editText.setText("");
                return;
            }
            MainActivity mainActivity = MainActivity.this;
            mainActivity.mValueOne = Float.parseFloat(MainActivity.this.editText.getText() + "");
            MainActivity.this.Addition = true;
            MainActivity.this.editText.setText((CharSequence) null);
        }
    });
    this.buttonSub.setOnClickListener(new View.OnClickListener() {
        public void onClick(View v) {
            MainActivity mainActivity = MainActivity.this;
            mainActivity.mValueOne = Float.parseFloat(MainActivity.this.editText.getText() + "");
            MainActivity.this.mSubtract = true;
            MainActivity.this.editText.setText((CharSequence) null);
        }
    });
    this.buttonMul.setOnClickListener(new View.OnClickListener() {
        public void onClick(View v) {
            MainActivity mainActivity = MainActivity.this;
            mainActivity.mValueOne = Float.parseFloat(MainActivity.this.editText.getText() + "");
            MainActivity.this.Multiplication = true;
            MainActivity.this.editText.setText((CharSequence) null);
        }
    });
    this.buttonDivision.setOnClickListener(new View.OnClickListener() {
        public void onClick(View v) {
            MainActivity mainActivity = MainActivity.this;
            mainActivity.mValueOne = Float.parseFloat(MainActivity.this.editText.getText() + "");
            MainActivity.this.Division = true;
            MainActivity.this.editText.setText((CharSequence) null);
        }
    });
    this.buttonEqual.setOnClickListener(new View.OnClickListener() {
        public void onClick(View v) {
            MainActivity mainActivity = MainActivity.this;
            mainActivity.mValueTwo = Float.parseFloat(MainActivity.this.editText.getText() + "");
            if (MainActivity.this.Addition) {
                EditText editText = MainActivity.this.editText;
                editText.setText((MainActivity.this.mValueOne + MainActivity.this.mValueTwo) + "");
                MainActivity.this.Addition = false;
            }
            if (MainActivity.this.mSubtract) {
                EditText editText2 = MainActivity.this.editText;
                editText2.setText((MainActivity.this.mValueOne - MainActivity.this.mValueTwo) + "");
                MainActivity.this.mSubtract = false;
            }
            if (MainActivity.this.Multiplication) {
                EditText editText3 = MainActivity.this.editText;
                editText3.setText((MainActivity.this.mValueOne * MainActivity.this.mValueTwo) + "");
                MainActivity.this.Multiplication = false;
            }
            if (MainActivity.this.Division) {
                EditText editText4 = MainActivity.this.editText;
                editText4.setText((MainActivity.this.mValueOne / MainActivity.this.mValueTwo) + "");
                MainActivity.this.Division = false;
            }
        }
    });
    this.buttonC.setOnClickListener(new View.OnClickListener() {
        public void onClick(View v) {
            MainActivity.this.editText.setText("");
        }
    });
}
}
