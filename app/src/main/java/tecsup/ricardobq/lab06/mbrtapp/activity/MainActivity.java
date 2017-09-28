package tecsup.ricardobq.lab06.mbrtapp.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.telecom.TelecomManager;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.List;

import tecsup.ricardobq.lab06.mbrtapp.R;
import tecsup.ricardobq.lab06.mbrtapp.datos.Usuario;
import tecsup.ricardobq.lab06.mbrtapp.datos.UsuarioRepository;

public class MainActivity extends AppCompatActivity {

    private EditText user, pass;
    private String usuario, clave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        user = (EditText) findViewById(R.id.idUser);
        pass = (EditText) findViewById(R.id.idPassword);

    }

    public void Ingresar(View v){

        usuario = user.getText().toString();
        clave = pass.getText().toString();

        if(usuario.isEmpty() || clave.isEmpty()){
            Toast.makeText(this,"Complete los campos.", Toast.LENGTH_SHORT).show();
            return;
        }


        final Usuario usuarioLogin = new Usuario(usuario, clave);
        final UsuarioRepository usuarioRepository = UsuarioRepository.crearPersona();
        String respuesta = usuarioRepository.datos(usuarioLogin);

        if(respuesta.equalsIgnoreCase("1")){

            Intent i = new Intent(this , ClienteActivity.class);
            Toast.makeText(this,"Bienvenido cliente.", Toast.LENGTH_SHORT).show();
            startActivity(i);

        }else if (respuesta.equalsIgnoreCase("2")){

            Intent i = new Intent(this , SupervisorActivity.class);
            Toast.makeText(this,"Bienvenido supervisor.", Toast.LENGTH_SHORT).show();
            startActivity(i);

        }else if (respuesta.equalsIgnoreCase("3")){

            Intent i = new Intent(this , TecnicoActivity.class);
            Toast.makeText(this,"Bienvenido técnico.", Toast.LENGTH_SHORT).show();
            startActivity(i);

        }else {

            Toast.makeText(MainActivity.this,"Datos erróneos.", Toast.LENGTH_LONG).show();

        }

    }


}
