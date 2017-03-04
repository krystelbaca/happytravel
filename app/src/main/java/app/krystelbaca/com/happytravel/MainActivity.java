package app.krystelbaca.com.happytravel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnDestinos;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnDestinos = (Button) findViewById(R.id.btn_destinos);

        btnDestinos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent destinosIntent = new Intent(getBaseContext(), DestinoListActivity.class);
                startActivity(destinosIntent);
            }
        });
    }


}
