package sv.ues.fia.eisi.proyecto1;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MunicipioEliminarActivity extends Activity {
    BD_Controlador helper;
    EditText editIdMunicipio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_municipio_eliminar);
        helper = new BD_Controlador(this);
        editIdMunicipio = (EditText) findViewById(R.id.editIdMunicipio);
    }

    public void eliminarMunicipio(View v){

    }
    public void limpiarTexto(View v){

    }
}