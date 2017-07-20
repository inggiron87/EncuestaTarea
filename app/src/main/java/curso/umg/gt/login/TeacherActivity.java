package curso.umg.gt.login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class TeacherActivity extends AppCompatActivity {

    private EditText et3;
    private ListView lv1;
    private List<String> listaalumnos;
    private ArrayAdapter<String> adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher);

        et3 = (EditText) findViewById(R.id.et3);
        lv1 = (ListView) findViewById(R.id.lv1);
        listaalumnos = new ArrayList<>();
        listaalumnos.add("Esteban");
        listaalumnos.add("Renato");
        listaalumnos.add("Fernanda");
        adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,listaalumnos);
        lv1.setAdapter(adapter);

    }

    public void Algo(View view){
        String nombre = et3.getText().toString();
        listaalumnos.add(nombre);
        adapter.notifyDataSetChanged(); //la lista de donde se sacan los datos se le indica que cambio
    }


}

