package es.miguel.polideportivo.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import es.miguel.polideportivo.R;
import es.miguel.polideportivo.adaptador.ActividadesGimAdapter;
import es.miguel.polideportivo.adaptador.HorarioDisponibleAdapter;
import es.miguel.polideportivo.dominio.Actividad;

public class ReservaGimActivity extends AppCompatActivity {

    private RecyclerView rv_gim;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reserva_gim);

        //Datos RecyclerView
        rv_gim = findViewById(R.id.rv1);
        rv_gim.setHasFixedSize(true);
        rv_gim.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false));
        ActividadesGimAdapter actividadesGimAdapter = new ActividadesGimAdapter (listaActividades());
        rv_gim.setAdapter(actividadesGimAdapter);

    }

    public List<Actividad> listaActividades(){

        List<Actividad> lista = new ArrayList<>();

        Actividad actividad1 = new Actividad("Spinning",R.drawable.spinning);
        Actividad actividad2 = new Actividad("Zumba",R.drawable.zumba);
        Actividad actividad3 = new Actividad("Pilates",R.drawable.pilates);
        Actividad actividad4 = new Actividad("Boxeo",R.drawable.boxeo);
        Actividad actividad5 = new Actividad("Karate",R.drawable.karate);

        lista.add(actividad1);
        lista.add(actividad2);
        lista.add(actividad3);
        lista.add(actividad4);
        lista.add(actividad5);

        return lista;
    }
}