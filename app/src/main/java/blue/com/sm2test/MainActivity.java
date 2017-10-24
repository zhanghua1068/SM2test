package blue.com.sm2test;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import blue.com.sm2test.smutil.SM2Utils;

public class MainActivity extends AppCompatActivity {

    private String TAG="aaaa";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e(TAG, "onCreate: " );
        SM2Utils.sm2ResultTest();
    }
}
