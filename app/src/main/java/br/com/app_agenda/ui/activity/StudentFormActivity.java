package br.com.app_agenda.ui.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import br.com.app_agenda.DAO.StudentDAO;
import br.com.app_agenda.R;
import br.com.app_agenda.model.Student;

public class StudentFormActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_form);

        StudentDAO dao = new StudentDAO();

        //Referênciando os Edit Text
         final EditText nameField = findViewById(R.id.activity_student_form_name);
         final EditText phoneField = findViewById(R.id.activity_student_form_phone);
         final EditText emailField = findViewById(R.id.activity_student_form_email);

        //Referênciando o botão salvar
        Button saveButton = findViewById(R.id.activity_student_form_save_button);
        //Implementando o listener para o botão
        saveButton.setOnClickListener((view) -> {
                String name = nameField.getText().toString();
                String phone = phoneField.getText().toString();
                String email = emailField.getText().toString();

                Student studentCreated = new Student(name, phone, email);
                dao.save(studentCreated);

                //Inicializando uma activity a partir de outra
                startActivity(new Intent(StudentFormActivity.this, StudentListActivity.class));

                //Finalizando a activity
                finish();

        });
    }
}