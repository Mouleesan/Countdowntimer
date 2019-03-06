package lk.ac.kln.countdowntimer;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
int counter = 100;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        countdown();
    }
    private void countdown(){
    final TextView textview = findViewById(R.id.textView);
    textview.setText("hallo");

    Handler handler = new Handler();

    final Handler handler = new Handler();
    handler.post(new Runnable() {


    @Override
    public void run() {
    textview.setText(Integer.toString(counter));
    counter --;
    }
}
);
}