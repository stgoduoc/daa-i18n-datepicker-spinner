package cl.duoc.android.i18n;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void registrar(View view) {
        String mensaje = "";

        // Spinner
        Spinner spComuna = (Spinner) findViewById(R.id.sp_comuna);
        mensaje = spComuna.getSelectedItem().toString() + " | ";

        // Date Picker
        DatePicker dpFechaNacimiento = (DatePicker) findViewById(R.id.dp_fecha_nacimiento);
        mensaje += dpFechaNacimiento.getYear() + "-" + (dpFechaNacimiento.getMonth()+1) + "-" + dpFechaNacimiento.getDayOfMonth();

        Toast.makeText(this, mensaje, Toast.LENGTH_LONG).show();
    }
}
