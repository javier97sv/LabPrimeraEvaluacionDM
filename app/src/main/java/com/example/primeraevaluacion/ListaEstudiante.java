package com.example.primeraevaluacion;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import Adaptadores.AdaptadorEstudiante;
import Entidades.Estudiantes;

import static com.example.primeraevaluacion.MainActivity.listEstudiantes;

public class ListaEstudiante extends AppCompatActivity {

    //ListView listvEstudiantes;
    RecyclerView listvEstudiantes;
    AdaptadorEstudiante ae;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_estudiante);

        listvEstudiantes = findViewById(R.id.listvEstudiantes);
        listvEstudiantes.setLayoutManager(new LinearLayoutManager(this));

        ae = new AdaptadorEstudiante(listEstudiantes);
        listvEstudiantes.setAdapter(ae);

        //listvEstudiantes.setAdapter(new AdaptadorEstudiante(this, R.layout.item_estudiante, listEstudiantes));
    }
}
