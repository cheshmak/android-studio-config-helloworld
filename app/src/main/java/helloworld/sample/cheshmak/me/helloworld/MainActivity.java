package helloworld.sample.cheshmak.me.helloworld;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import me.cheshmak.android.sdk.core.config.CheshmakConfig;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String provider = CheshmakConfig.getString("provider", "cheshmak");
        if (provider.equals("cheshmak")) {
            //call cheshmak ads functions
        } else if (provider.equals("otherAdAgency")) {
            //call ad agency functions
        } else {
            //other stuffs`
        }
    }
}

