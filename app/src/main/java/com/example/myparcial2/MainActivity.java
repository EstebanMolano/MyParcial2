package com.example.myparcial2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    private CheckBox mujeresAdultas,HombresAdultos,mujeresAdolescentes,hombresAdolescentes,niños,spiderman,ironman,capitanAmerica,hulk,laviudanegra,thor,doctorStrange;

    private Button registrar;


    FirebaseDatabase rtdb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        rtdb = FirebaseDatabase.getInstance();

        mujeresAdultas = findViewById(R.id.MujeresAdulta);
        HombresAdultos = findViewById(R.id.HombresAdultos);
        mujeresAdolescentes = findViewById(R.id.MuejeresAdolecentes);
        hombresAdolescentes = findViewById(R.id.HombresAdolesentes);
        niños = findViewById(R.id.Niños);
        spiderman = findViewById(R.id.Spiderman);
        ironman = findViewById(R.id.IronMan);
        capitanAmerica = findViewById(R.id.CapitanAmerica);
        hulk = findViewById(R.id.Hulk);
        laviudanegra = findViewById(R.id.LaViudaNegro);
        thor = findViewById(R.id.Thor);
        doctorStrange = findViewById(R.id.DocStrange);

        registrar = findViewById(R.id.btn_registrar);


        mujeresAdultas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                HombresAdultos.setEnabled(false);
                mujeresAdolescentes.setEnabled(false);
                hombresAdolescentes.setEnabled(false);
                niños.setEnabled(false);
            }
        });

        HombresAdultos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mujeresAdultas.setEnabled(false);
                mujeresAdolescentes.setEnabled(false);
                hombresAdolescentes.setEnabled(false);
                niños.setEnabled(false);
            }
        });

        mujeresAdolescentes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mujeresAdultas.setEnabled(false);
                HombresAdultos.setEnabled(false);
                hombresAdolescentes.setEnabled(false);
                niños.setEnabled(false);
            }
        });

        hombresAdolescentes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mujeresAdultas.setEnabled(false);
                HombresAdultos.setEnabled(false);
                mujeresAdolescentes.setEnabled(false);
                niños.setEnabled(false);
            }
        });

        niños.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mujeresAdultas.setEnabled(false);
                HombresAdultos.setEnabled(false);
                mujeresAdolescentes.setEnabled(false);
                hombresAdolescentes.setEnabled(false);
            }
        });


        registrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                if(mujeresAdultas.isChecked()){

                    if(spiderman.isChecked()){

                        rtdb.getReference().child("mujeresAdultas").push().setValue("spiderman");
                        rtdb.getReference().child("TodoPublico").push().setValue("spiderman");

                    }

                    else if(ironman.isChecked()){
                        rtdb.getReference().child("mujeresAdultas").push().setValue("ironman");
                        rtdb.getReference().child("TodoPublico").push().setValue("ironman");
                    }

                    else if(capitanAmerica.isChecked()){
                        rtdb.getReference().child("mujeresAdultas").push().setValue("capitanamerica");
                        rtdb.getReference().child("TodoPublico").push().setValue("capitanamerica");
                    }

                    else if(hulk.isChecked()){
                        rtdb.getReference().child("mujeresAdultas").push().setValue("hulk");
                        rtdb.getReference().child("TodoPublico").push().setValue("hulk");

                    }
                    else if(laviudanegra.isChecked()){
                        rtdb.getReference().child("mujeresAdultas").push().setValue("laviudanegra");
                        rtdb.getReference().child("TodoPublico").push().setValue("laviudanegra");
                    }
                    else if(thor.isChecked()){
                        rtdb.getReference().child("mujeresAdultas").push().setValue("thor");
                        rtdb.getReference().child("TodoPublico").push().setValue("thor");
                    }
                    else if(doctorStrange.isChecked()){
                        rtdb.getReference().child("mujeresAdultas").push().setValue("doctorstrage");
                        rtdb.getReference().child("TodoPublico").push().setValue("doctorstrage");
                    }

                }


                if(HombresAdultos.isChecked()){

                    if(spiderman.isChecked()){

                        rtdb.getReference().child("HombresAdultos").push().setValue("spiderman");
                        rtdb.getReference().child("TodoPublico").push().setValue("spiderman");

                    }

                    else if(ironman.isChecked()){
                        rtdb.getReference().child("HombresAdultos").push().setValue("ironman");
                        rtdb.getReference().child("TodoPublico").push().setValue("ironman");
                    }

                    else if(capitanAmerica.isChecked()){
                        rtdb.getReference().child("HombresAdultos").push().setValue("capitanamerica");
                        rtdb.getReference().child("TodoPublico").push().setValue("capitanamerica");
                    }

                    else if(hulk.isChecked()){
                        rtdb.getReference().child("HombresAdultos").push().setValue("hulk");
                        rtdb.getReference().child("TodoPublico").push().setValue("hulk");
                    }
                    else if(laviudanegra.isChecked()){
                        rtdb.getReference().child("HombresAdultos").push().setValue("laviudanegra");
                        rtdb.getReference().child("TodoPublico").push().setValue("laviudanegra");
                    }
                    else if(thor.isChecked()){
                        rtdb.getReference().child("HombresAdultos").push().setValue("thor");
                        rtdb.getReference().child("TodoPublico").push().setValue("thor");
                    }
                    else if(doctorStrange.isChecked()){
                        rtdb.getReference().child("HombresAdultos").push().setValue("doctorstrage");
                        rtdb.getReference().child("TodoPublico").push().setValue("doctorstrage");
                    }

                }

                if(mujeresAdolescentes.isChecked()){

                    if(spiderman.isChecked()){

                        rtdb.getReference().child("mujeresAdolescentes").push().setValue("spiderman");
                        rtdb.getReference().child("TodoPublico").push().setValue("spiderman");

                    }

                    else if(ironman.isChecked()){
                        rtdb.getReference().child("mujeresAdolescentes").push().setValue("ironman");
                        rtdb.getReference().child("TodoPublico").push().setValue("ironman");
                    }

                    else if(capitanAmerica.isChecked()){
                        rtdb.getReference().child("mujeresAdolescentes").push().setValue("capitanamerica");
                        rtdb.getReference().child("TodoPublico").push().setValue("capitanamerica");
                    }

                    else if(hulk.isChecked()){
                        rtdb.getReference().child("mujeresAdolescentes").push().setValue("hulk");
                        rtdb.getReference().child("TodoPublico").push().setValue("hulk");
                    }
                    else if(laviudanegra.isChecked()){
                        rtdb.getReference().child("mujeresAdolescentes").push().setValue("laviudanegra");
                        rtdb.getReference().child("TodoPublico").push().setValue("laviudanegra");
                    }
                    else if(thor.isChecked()){
                        rtdb.getReference().child("mujeresAdolescentes").push().setValue("thor");
                        rtdb.getReference().child("TodoPublico").push().setValue("thor");
                    }
                    else if(doctorStrange.isChecked()){
                        rtdb.getReference().child("mujeresAdolescentes").push().setValue("doctorstrage");
                        rtdb.getReference().child("TodoPublico").push().setValue("doctorstrage");
                    }

                }

                if(hombresAdolescentes.isChecked()){

                    if(spiderman.isChecked()){

                        rtdb.getReference().child("hombresAdolescentes").push().setValue("spiderman");
                        rtdb.getReference().child("TodoPublico").push().setValue("spiderman");

                    }

                    else if(ironman.isChecked()){
                        rtdb.getReference().child("hombresAdolescentes").push().setValue("ironman");
                        rtdb.getReference().child("TodoPublico").push().setValue("ironman");
                    }

                    else if(capitanAmerica.isChecked()){
                        rtdb.getReference().child("hombresAdolescentes").push().setValue("capitanamerica");
                        rtdb.getReference().child("TodoPublico").push().setValue("capitanamerica");
                    }

                    else if(hulk.isChecked()){
                        rtdb.getReference().child("hombresAdolescentes").push().setValue("hulk");
                        rtdb.getReference().child("TodoPublico").push().setValue("hulk");
                    }
                    else if(laviudanegra.isChecked()){
                        rtdb.getReference().child("hombresAdolescentes").push().setValue("laviudanegra");
                        rtdb.getReference().child("TodoPublico").push().setValue("laviudanegra");
                    }
                    else if(thor.isChecked()){
                        rtdb.getReference().child("hombresAdolescentes").push().setValue("thor");
                        rtdb.getReference().child("TodoPublico").push().setValue("thor");
                    }
                    else if(doctorStrange.isChecked()){
                        rtdb.getReference().child("hombresAdolescentes").push().setValue("doctorstrage");
                        rtdb.getReference().child("TodoPublico").push().setValue("doctorstrage");
                    }

                }

                if(niños.isChecked()){

                    if(spiderman.isChecked()){

                        rtdb.getReference().child("niños").push().setValue("spiderman");
                        rtdb.getReference().child("TodoPublico").push().setValue("spiderman");

                    }

                    else if(ironman.isChecked()){
                        rtdb.getReference().child("niños").push().setValue("ironman");
                        rtdb.getReference().child("TodoPublico").push().setValue("ironman");
                    }

                    else if(capitanAmerica.isChecked()){
                        rtdb.getReference().child("niños").push().setValue("capitanamerica");
                        rtdb.getReference().child("TodoPublico").push().setValue("capitanamerica");
                    }

                    else if(hulk.isChecked()){
                        rtdb.getReference().child("niños").push().setValue("hulk");
                        rtdb.getReference().child("TodoPublico").push().setValue("hulk");
                    }
                    else if(laviudanegra.isChecked()){
                        rtdb.getReference().child("niños").push().setValue("laviudanegra");
                        rtdb.getReference().child("TodoPublico").push().setValue("laviudanegra");
                    }
                    else if(thor.isChecked()){
                        rtdb.getReference().child("niños").push().setValue("thor");
                        rtdb.getReference().child("TodoPublico").push().setValue("thor");
                    }
                    else if(doctorStrange.isChecked()){
                        rtdb.getReference().child("niños").push().setValue("doctorstrage");
                        rtdb.getReference().child("TodoPublico").push().setValue("doctorstrage");

                    }

                }

                Intent i = new Intent(MainActivity.this, MostrarEstadisticas.class);
                startActivity(i);
                finish();




            }
        });

    }


}
