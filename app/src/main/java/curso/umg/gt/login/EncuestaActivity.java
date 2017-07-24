package curso.umg.gt.login;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class EncuestaActivity extends AppCompatActivity {

    private TextView tv2;
    private CheckBox cb3,cb4;
    private Button bt7;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_encuesta);

        tv2 = (TextView) findViewById(R.id.tv2);
        cb3 = (CheckBox) findViewById(R.id.cb3);
        cb4 = (CheckBox) findViewById(R.id.cb4);
        bt7 = (Button) findViewById(R.id.bt7);

    }

    public void clic(View view){
        Toast notificacion;

        if(bt7.isClickable()){
            notificacion = Toast.makeText(this,"Encuesta Guardada",Toast.LENGTH_LONG);
            notificacion.show();

            Intent i = new Intent(this,MainActivity.class);
            startActivity(i);
        }


    }


}
