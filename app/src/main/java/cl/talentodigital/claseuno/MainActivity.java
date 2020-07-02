package cl.talentodigital.claseuno;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static android.widget.Toast.LENGTH_LONG;

public class MainActivity extends AppCompatActivity  {

    // SE CREAN LOS ATRIBUTOS DE BOTONES Y CAJA DE TEXTO EN ESTE CASO
    private EditText etSaludo;
    private Button btnSaludo;
    private Button btnSalir;
    private Button btnRegistro;
    private Button btnMenu;


    // EN ESTE METODO ONCREATE
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("ClaseUno","OnCreate" );
        setContentView(R.layout.activity_main);
        etSaludo = findViewById(R.id.etSaludo);
        btnSaludo = findViewById(R.id.btnSaludo);
        btnRegistro = findViewById(R.id.btnRegistro);
        btnMenu = findViewById(R.id.btnMenu);
        btnSalir = findViewById(R.id.btnSalir);

        btnSaludo.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.d("ClaseUno", "Hola " + etSaludo.getText().toString() );

                    }
                }
        );
        btnRegistro.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.d("ClaseUno", "Hola " + etSaludo.getText().toString() );
                        goToRegistro();
                    }
                }
        );
        btnMenu.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.d("ClaseUno", "Hola " + etSaludo.getText().toString() );
                        goToMenu();
                    }
                }
        );
        btnSalir.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Log.d("ClaseUno", "Boton Salir");
                        finish();
                    }
                }
        );
       }

    private void goToMenu() {
        Intent intent = new Intent(this,MenuActivity.class);
        startActivity(intent);
    }

    private void goToRegistro() {
        Intent intent = new Intent(this,RegistroUsuarioActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("CalseUno","OnStar");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("CLaseUno","OnRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("ClaseUno","OnResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("CLaseUno","OnPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("ClaseUno","OnStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("ClaseUno","OnDestoy");
    }

    private void alert(String mensaje) {
        Toast.makeText(this, mensaje, LENGTH_LONG).show();

    }

}