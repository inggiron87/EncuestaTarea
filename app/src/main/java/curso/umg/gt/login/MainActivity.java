package curso.umg.gt.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText correo,password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        correo = (EditText) findViewById(R.id.correo);
        password = (EditText) findViewById(R.id.password);

    }

    public void inicioSesion(View view){
        String val1 = correo.getText().toString();
        String val2 = password.getText().toString();
        Toast notificacion;

        if(val1.endsWith("@catedratico.gt") && val2.equals("posgrado")){
            //notificacion = Toast.makeText(this,"Bienvenido catedratico",Toast.LENGTH_SHORT);
            //notificacion.show();
            Intent i = new Intent(this,TeacherActivity.class);
            startActivity(i);

        }else {
            //notificacion = Toast.makeText(this,"Error al ingresar",Toast.LENGTH_SHORT);
            //notificacion.show();
            notificacion = Toast.makeText(this,"No pudo acceder, por favor llene la encuesta",Toast.LENGTH_LONG);
            notificacion.show();

            Intent i = new Intent(this,EncuestaActivity.class);
            startActivity(i);


        }
    }


}
