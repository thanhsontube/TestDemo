package demo.com.testdemo;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    public static final String SENTENCE = "So this is for all of you that have already messed around with Dagger 2";

    /**
     * 1 - So
     * 2 - this
     * 3 - is
     * 4 - for
     * ---
     */


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    private Map<String, Integer> countMap(@NonNull String sentence) {
        Map<String, Integer> maps = new HashMap<>();
        return maps;
    }

    private void print(Map<String, Integer> maps) {

    }
}
