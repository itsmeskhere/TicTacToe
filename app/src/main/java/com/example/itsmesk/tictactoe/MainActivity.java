package com.example.itsmesk.tictactoe;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button11;
    Button button12;
    Button button13;
    Button button21;
    Button button22;
    Button button23;
    Button button31;
    Button button32;
    Button button33;
    TextView xScoreView;
    TextView oScoreView;
    int count = 1;
    int check11 = 0;
    int check12 = 0;
    int check13 = 0;
    int check21 = 0;
    int check22 = 0;
    int check23 = 0;
    int check31 = 0;
    int check32 = 0;
    int check33 = 0;
    int xScore = 0;
    int oScore = 0;
    String mark;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button11 = findViewById(R.id.box11);
        button12 = findViewById(R.id.box12);
        button13 = findViewById(R.id.box13);
        button21 = findViewById(R.id.box21);
        button22 = findViewById(R.id.box22);
        button23 = findViewById(R.id.box23);
        button31 = findViewById(R.id.box31);
        button32 = findViewById(R.id.box32);
        button33 = findViewById(R.id.box33);
        xScoreView = findViewById(R.id.x_score);
        oScoreView = findViewById(R.id.o_score);

        xScoreView.setText("X: " + xScore);
        oScoreView.setText("O: " + oScore);
    }

    private String updateMark() {
        if ((count % 2) != 0)
            mark = "X";
        else
            mark = "O";
        ++count;
        return mark;
    }

    public void updateMark11(View view) {
        if (check11 == 0) {
            check11++;
            String sign;
            sign = updateMark();
            button11.setText(sign);
        } else
            Toast.makeText(this, "Box already checked!", Toast.LENGTH_SHORT).show();
        check();
    }

    public void updateMark12(View view) {
        if (check12 == 0) {
            check12++;
            String sign;
            sign = updateMark();
            button12.setText(sign);
        } else
            Toast.makeText(this, "Box already checked!", Toast.LENGTH_SHORT).show();
        check();
    }

    public void updateMark13(View view) {
        if (check13 == 0) {
            check13++;
            String sign;
            sign = updateMark();
            button13.setText(sign);
        } else
            Toast.makeText(this, "Box already checked!", Toast.LENGTH_SHORT).show();
        check();
    }

    public void updateMark21(View view) {
        if (check21 == 0) {
            check21++;
            String sign;
            sign = updateMark();
            button21.setText(sign);
        } else
            Toast.makeText(this, "Box already checked!", Toast.LENGTH_SHORT).show();
        check();
    }

    public void updateMark22(View view) {
        if (check22 == 0) {
            check22++;
            String sign;
            sign = updateMark();
            button22.setText(sign);
        } else
            Toast.makeText(this, "Box already checked!", Toast.LENGTH_SHORT).show();
        check();
    }

    public void updateMark23(View view) {
        if (check23 == 0) {
            check23++;
            String sign;
            sign = updateMark();
            button23.setText(sign);
        } else
            Toast.makeText(this, "Box already checked!", Toast.LENGTH_SHORT).show();
        check();
    }

    public void updateMark31(View view) {
        if (check31 == 0) {
            check31++;
            String sign;
            sign = updateMark();
            button31.setText(sign);
        } else
            Toast.makeText(this, "Box already checked!", Toast.LENGTH_SHORT).show();
        check();
    }

    public void updateMark32(View view) {
        if (check32 == 0) {
            check32++;
            String sign;
            sign = updateMark();
            button32.setText(sign);
        } else
            Toast.makeText(this, "Box already checked!", Toast.LENGTH_SHORT).show();
        check();
    }

    public void updateMark33(View view) {
        if (check33 == 0) {
            check33++;
            String sign;
            sign = updateMark();
            button33.setText(sign);
        } else
            Toast.makeText(this, "Box already checked!", Toast.LENGTH_SHORT).show();
        check();
    }

    public void check() {
        if ((!((button11.getText().toString()).equals(" "))) && (!((button12.getText().toString()).equals(" "))) && (!((button13.getText().toString()).equals(" ")))) {
            if (((button11.getText().toString()).equals(button12.getText().toString())) && ((button11.getText().toString()).equals(button13.getText().toString()))) {
                Toast.makeText(this, "Winner Row 1", Toast.LENGTH_SHORT).show();
                resultDeclare();
            }
        }
        if ((!((button21.getText().toString()).equals(" "))) && (!((button22.getText().toString()).equals(" "))) && (!((button23.getText().toString()).equals(" ")))) {
            if (((button21.getText().toString()).equals(button22.getText().toString())) && ((button21.getText().toString()).equals(button23.getText().toString()))) {
                Toast.makeText(this, "Winner Row 2", Toast.LENGTH_SHORT).show();
                resultDeclare();
            }
        }
        if ((!((button31.getText().toString()).equals(" "))) && (!((button32.getText().toString()).equals(" "))) && (!((button33.getText().toString()).equals(" ")))) {
            if (((button31.getText().toString()).equals(button32.getText().toString())) && ((button31.getText().toString()).equals(button33.getText().toString()))) {
                Toast.makeText(this, "Winner Row 3", Toast.LENGTH_SHORT).show();
                resultDeclare();
            }
        }
        if ((!((button11.getText().toString()).equals(" "))) && (!((button21.getText().toString()).equals(" "))) && (!((button31.getText().toString()).equals(" ")))) {
            if (((button11.getText().toString()).equals(button21.getText().toString())) && ((button11.getText().toString()).equals(button31.getText().toString()))) {
                Toast.makeText(this, "Winner Column 1", Toast.LENGTH_SHORT).show();
                resultDeclare();
            }
        }
        if ((!((button12.getText().toString()).equals(" "))) && (!((button22.getText().toString()).equals(" "))) && (!((button32.getText().toString()).equals(" ")))) {
            if (((button12.getText().toString()).equals(button22.getText().toString())) && ((button12.getText().toString()).equals(button32.getText().toString()))) {
                Toast.makeText(this, "Winner Column 2", Toast.LENGTH_SHORT).show();
                resultDeclare();
            }
        }
        if ((!((button13.getText().toString()).equals(" "))) && (!((button23.getText().toString()).equals(" "))) && (!((button33.getText().toString()).equals(" ")))) {
            if (((button13.getText().toString()).equals(button23.getText().toString())) && ((button13.getText().toString()).equals(button33.getText().toString()))) {
                Toast.makeText(this, "Winner Column 3", Toast.LENGTH_SHORT).show();
                resultDeclare();
            }
        }
        if ((!((button11.getText().toString()).equals(" "))) && (!((button22.getText().toString()).equals(" "))) && (!((button33.getText().toString()).equals(" ")))) {
            if (((button11.getText().toString()).equals(button22.getText().toString())) && ((button11.getText().toString()).equals(button33.getText().toString()))) {
                Toast.makeText(this, "Winner Major Diagonal", Toast.LENGTH_SHORT).show();
                resultDeclare();
            }
        }
        if ((!((button13.getText().toString()).equals(" "))) && (!((button22.getText().toString()).equals(" "))) && (!((button31.getText().toString()).equals(" ")))) {
            if (((button13.getText().toString()).equals(button22.getText().toString())) && ((button13.getText().toString()).equals(button31.getText().toString()))) {
                Toast.makeText(this, "Winner Minor Diagonal", Toast.LENGTH_SHORT).show();
                resultDeclare();
            }
        }
        if ((!((button11.getText().toString()).equals(" "))) && (!((button12.getText().toString()).equals(" "))) && (!((button13.getText().toString()).equals(" "))) && (!((button21.getText().toString()).equals(" "))) && (!((button22.getText().toString()).equals(" "))) && (!((button23.getText().toString()).equals(" "))) && (!((button31.getText().toString()).equals(" "))) && (!((button32.getText().toString()).equals(" "))) && (!((button33.getText().toString()).equals(" ")))) {
            Toast.makeText(this, "It's a Tie", Toast.LENGTH_SHORT).show();
            start();
        }
    }

    public void resultDeclare() {
        --count;
        String sign;
        sign = updateMark();
        if (sign.equals("X")) {
            xScore++;
            xScoreView.setText("X: " + xScore);
        } else {
            oScore++;
            oScoreView.setText("O: " + oScore);
        }
        Toast.makeText(this, sign + " is WINNER", Toast.LENGTH_SHORT).show();
        start();
    }

    public void start() {
        button11.setText(" ");
        button12.setText(" ");
        button13.setText(" ");
        button21.setText(" ");
        button22.setText(" ");
        button23.setText(" ");
        button31.setText(" ");
        button32.setText(" ");
        button33.setText(" ");
        count = 1;
        check11 = 0;
        check12 = 0;
        check13 = 0;
        check21 = 0;
        check22 = 0;
        check23 = 0;
        check31 = 0;
        check32 = 0;
        check33 = 0;
    }

    public void reset(View view) {
        Intent intent = getBaseContext().getPackageManager().getLaunchIntentForPackage(getBaseContext().getPackageName());
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
    }
}
