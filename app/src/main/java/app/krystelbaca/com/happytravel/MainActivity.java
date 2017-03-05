package app.krystelbaca.com.happytravel;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnDestinos;
    private Button btnViajes;
    private Button btnOfertas;
    private Button btnCuenta;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnDestinos = (Button) findViewById(R.id.btn_destinos);
        btnViajes = (Button) findViewById(R.id.btn_viajes);
        btnOfertas = (Button) findViewById(R.id.btn_ofertas);
        btnCuenta = (Button) findViewById(R.id.btn_cuenta);

        btnDestinos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent destinosIntent = new Intent(getBaseContext(), DestinoListActivity.class);
                startActivity(destinosIntent);
            }
        });

        btnViajes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent viajesIntent = new Intent(getBaseContext(),MiViajeListActivity.class);
                startActivity(viajesIntent);
            }
        });

        btnOfertas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ofertasIntent = new Intent(getBaseContext(),OfertaListActivity.class);
                startActivity(ofertasIntent);
            }
        });








    }


}
