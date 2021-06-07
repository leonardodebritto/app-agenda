package br.com.app_agenda;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Simulação de uma lista de alunos - Criando uma lista com Array
        List<String> students = new ArrayList<>(Arrays.asList("Alex", "Fran", "José", "Roberto"));

        //Referênciando a ListView criada no Layout
        ListView studentList = findViewById(R.id.activity_main_student_list);

        //Criando o adapter que irá vincular os itens da lista as respectivas views
        //Utilizando apenas o ArrayAdapter que já implementa o ListAdapter, mas é mais simples
        studentList.setAdapter(new ArrayAdapter<>(this,android.R.layout.simple_list_item_1, students));

    }
}
