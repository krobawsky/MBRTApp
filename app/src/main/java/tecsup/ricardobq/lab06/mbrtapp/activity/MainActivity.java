package tecsup.ricardobq.lab06.mbrtapp.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.List;

import tecsup.ricardobq.lab06.mbrtapp.R;
import tecsup.ricardobq.lab06.mbrtapp.datos.Usuario;
import tecsup.ricardobq.lab06.mbrtapp.datos.UsuarioRepository;

public class MainActivity extends AppCompatActivity {

    private EditText user, pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        user = (EditText) findViewById(R.id.idUser);
        pass = (EditText) findViewById(R.id.idPassword);

    }

    public void Ingresar(View v){

        String usuario = user.getText().toString();
        String clave = pass.getText().toString();

        UsuarioRepository usuarioRepository = UsuarioRepository.getInstance();
        final List<Usuario> usuarios = usuarioRepository.getUsuarios();

        for (Usuario usuariol : usuarios) {

            if (usuario.equals("user1")  || clave.equals("awdr")){
                Intent intent = new Intent(MainActivity.this, MenuActivity.class);
                startActivity(intent);
            }else {
                Toast.makeText(this, "Error al iniciar sesión.", Toast.LENGTH_SHORT).show();
            }

        }

    }


}
