package br.com.app_agenda.ui.activity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import br.com.app_agenda.DAO.StudentDAO;
import br.com.app_agenda.R;
import br.com.app_agenda.model.Student;

public class StudentListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_list);

        StudentDAO dao = new StudentDAO();

        // Definindo o texto do app bar - o app bar vem da classe AppCompatActivity
        setTitle("Student List");

        //Referênciando a ListView criada no Layout
        ListView studentList = findViewById(R.id.activity_student_list_listview);

        //Criando o adapter que irá vincular os itens da lista as respectivas views
        //Utilizando apenas o ArrayAdapter que já implementa o ListAdapter, mas é mais simples
        studentList.setAdapter(new ArrayAdapter<>(this,
                android.R.layout.simple_list_item_1, dao.todos()));

    }
}
