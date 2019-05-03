package com.example.myparcial2;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class MostrarEstadisticas extends AppCompatActivity {

    private Button todopublico,mujeresAdultas,hombresAdultos,mujeresAdolescentes,hombresAdolescentes,niños;
    private TextView txt_todopublico,txt_mujeresAdultas,txt_hombresAdultos,txt_mujeresAdolescentes,txt_hombresAdolescentes,txt_niños;
    private int ntodopublico,nmujeresAdultas,nhombresAdultos,nmujeresAdolescentes,nhombresAdolescentes,nniños;

    FirebaseDatabase rtdb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mostrar_estadisticas);

        rtdb = FirebaseDatabase.getInstance();

        todopublico = findViewById(R.id.btn_todoPublico);
        mujeresAdultas = findViewById(R.id.btn_mujeresAdultas);
        hombresAdultos = findViewById(R.id.btn_hombresAdultos);
        mujeresAdolescentes = findViewById(R.id.btn_mujeresAdolescentes);
        hombresAdolescentes = findViewById(R.id.btn_hombresAdolescentes);
        niños = findViewById(R.id.btn_niños);

        txt_todopublico = findViewById(R.id.txt_todoPublico);
        txt_mujeresAdultas = findViewById(R.id.txt_mujeresAdultas);
        txt_hombresAdultos = findViewById(R.id.txt_hombresAdultos);
        txt_mujeresAdolescentes = findViewById(R.id.txt_mujeresAdolescentes);
        txt_hombresAdolescentes = findViewById(R.id.txt_hombresAdolescentes);
        txt_niños = findViewById(R.id.txt_niños);

        hombresAdultos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                rtdb.getReference().child("HombresAdultos").addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                        double spi,iro,cap,hulk,viuda,thor,doctor;

                        spi=0;
                        iro=0;
                        cap=0;
                        hulk=0;
                        thor=0;
                        doctor=0;
                        viuda=0;

                        for(DataSnapshot sn: dataSnapshot.getChildren()){
                            nhombresAdultos++;

                            String hero=sn.getValue().toString();

                            if(hero.equals("spiderman")){
                                spi++;
                            }
                            else if(hero.equals("capitanamerica")){
                                cap++;
                            }

                            else if(hero.equals("ironman")){
                                iro++;
                            }

                            else if(hero.equals("hulk")){
                                hulk++;
                            }

                            else if(hero.equals("laviudanegra")){
                                viuda++;
                            }

                            else if(hero.equals("doctorstrage")){
                                doctor++;
                            }

                            else{
                                thor++;
                            }
                        }

                        String texto ="spiderman" + 100*spi/nhombresAdultos +"%"+ System.getProperty("line.separator")
                                +"ironMan" +100*iro/nhombresAdultos+ "%"+ System.getProperty("line.separator")
                                +"capitan America" +100*cap/nhombresAdultos+ "%"+ System.getProperty("line.separator")
                                +"hulk" +100*hulk/nhombresAdultos+ "%"+ System.getProperty("line.separator")
                                +"thor" +100*thor/nhombresAdultos+ "%"+ System.getProperty("line.separator")
                                +"Viuda negra" +100*viuda/nhombresAdultos+ "%"+System.getProperty("line.separator")
                                +"DoctorStrange" + 100*doctor/nhombresAdultos+ "%"+ System.getProperty("line.separator")
                                + "Total Votos" + nhombresAdultos;
                        txt_hombresAdultos.setText(texto);

                        if(txt_hombresAdultos.getVisibility() == View.VISIBLE){
                            txt_hombresAdultos.setVisibility(View.GONE);
                        }else{
                            txt_hombresAdultos.setVisibility(View.VISIBLE);
                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });

            }
        });

        mujeresAdolescentes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                rtdb.getReference().child("mujeresAdolescentes").addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                        double spi,iro,cap,hulk,viuda,thor,doctor;

                        spi=0;
                        iro=0;
                        cap=0;
                        hulk=0;
                        thor=0;
                        doctor=0;
                        viuda=0;

                        for(DataSnapshot sn: dataSnapshot.getChildren()){
                            nmujeresAdolescentes++;

                            String hero=sn.getValue().toString();

                            if(hero.equals("spiderman")){
                                spi++;
                            }
                            else if(hero.equals("capitanamerica")){
                                cap++;
                            }

                            else if(hero.equals("ironman")){
                                iro++;
                            }

                            else if(hero.equals("hulk")){
                                hulk++;
                            }

                            else if(hero.equals("laviudanegra")){
                                viuda++;
                            }

                            else if(hero.equals("doctorstrage")){
                                doctor++;
                            }

                            else{
                                thor++;
                            }
                        }

                        String texto ="spiderman" + 100*spi/nmujeresAdolescentes +"%"+ System.getProperty("line.separator")
                                +"ironMan" +100*iro/nmujeresAdolescentes+ "%"+ System.getProperty("line.separator")
                                +"capitan America" +100*cap/nmujeresAdolescentes+ "%"+ System.getProperty("line.separator")
                                +"hulk" +100*hulk/nmujeresAdolescentes+ "%"+ System.getProperty("line.separator")
                                +"thor" +100*thor/nmujeresAdolescentes+ "%"+ System.getProperty("line.separator")
                                +"Viuda negra" +100*viuda/nmujeresAdolescentes+ "%"+System.getProperty("line.separator")
                                +"DoctorStrange" + 100*doctor/nmujeresAdolescentes+ "%"+ System.getProperty("line.separator")
                                + "Total Votos" + nmujeresAdolescentes;
                        txt_mujeresAdolescentes.setText(texto);

                        if(txt_mujeresAdolescentes.getVisibility() == View.VISIBLE){
                            txt_mujeresAdolescentes.setVisibility(View.GONE);
                        }else{
                            txt_mujeresAdolescentes.setVisibility(View.VISIBLE);
                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });

            }
        });

        hombresAdolescentes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                rtdb.getReference().child("hombresAdolescentes").addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                        double spi,iro,cap,hulk,viuda,thor,doctor;

                        spi=0;
                        iro=0;
                        cap=0;
                        hulk=0;
                        thor=0;
                        doctor=0;
                        viuda=0;

                        for(DataSnapshot sn: dataSnapshot.getChildren()){
                            nhombresAdolescentes++;

                            String hero=sn.getValue().toString();

                            if(hero.equals("spiderman")){
                                spi++;
                            }
                            else if(hero.equals("capitanamerica")){
                                cap++;
                            }

                            else if(hero.equals("ironman")){
                                iro++;
                            }

                            else if(hero.equals("hulk")){
                                hulk++;
                            }

                            else if(hero.equals("laviudanegra")){
                                viuda++;
                            }

                            else if(hero.equals("doctorstrage")){
                                doctor++;
                            }

                            else{
                                thor++;
                            }
                        }

                        String texto ="spiderman" + 100*spi/nhombresAdolescentes +"%"+ System.getProperty("line.separator")
                                +"ironMan" +100*iro/nhombresAdolescentes+ "%"+ System.getProperty("line.separator")
                                +"capitan America" +100*cap/nhombresAdolescentes+ "%"+ System.getProperty("line.separator")
                                +"hulk" +100*hulk/nhombresAdolescentes+ "%"+ System.getProperty("line.separator")
                                +"thor" +100*thor/nhombresAdolescentes+ "%"+ System.getProperty("line.separator")
                                +"Viuda negra" +100*viuda/nhombresAdolescentes+ "%"+System.getProperty("line.separator")
                                +"DoctorStrange" + 100*doctor/nhombresAdolescentes+ "%"+ System.getProperty("line.separator")
                                + "Total Votos" + nhombresAdolescentes;
                        txt_hombresAdolescentes.setText(texto);

                        if(txt_hombresAdolescentes.getVisibility() == View.VISIBLE){
                            txt_hombresAdolescentes.setVisibility(View.GONE);
                        }else{
                            txt_hombresAdolescentes.setVisibility(View.VISIBLE);
                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });

            }
        });

        niños.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                rtdb.getReference().child("niños").addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                        double spi,iro,cap,hulk,viuda,thor,doctor;

                        spi=0;
                        iro=0;
                        cap=0;
                        hulk=0;
                        thor=0;
                        doctor=0;
                        viuda=0;

                        for(DataSnapshot sn: dataSnapshot.getChildren()){
                            nniños++;

                            String hero=sn.getValue().toString();

                            if(hero.equals("spiderman")){
                                spi++;
                            }
                            else if(hero.equals("capitanamerica")){
                                cap++;
                            }

                            else if(hero.equals("ironman")){
                                iro++;
                            }

                            else if(hero.equals("hulk")){
                                hulk++;
                            }

                            else if(hero.equals("laviudanegra")){
                                viuda++;
                            }

                            else if(hero.equals("doctorstrage")){
                                doctor++;
                            }

                            else{
                                thor++;
                            }
                        }

                        String texto ="spiderman" +100*spi/nniños +"%"+ System.getProperty("line.separator")
                                +"ironMan" +100*iro/nniños+ "%"+ System.getProperty("line.separator")
                                +"capitan America" +100*cap/nniños+ "%"+ System.getProperty("line.separator")
                                +"hulk" +100*hulk/nniños+ "%"+ System.getProperty("line.separator")
                                +"thor" +100*thor/nniños+ "%"+ System.getProperty("line.separator")
                                +"Viuda negra" +100*viuda/nniños+ "%"+System.getProperty("line.separator")
                                +"DoctorStrange" + 100*doctor/nniños+ "%"+ System.getProperty("line.separator")
                                + "Total Votos" + nniños;
                        txt_niños.setText(texto);

                        if(txt_niños.getVisibility() == View.VISIBLE){
                            txt_niños.setVisibility(View.GONE);
                        }else{
                            txt_niños.setVisibility(View.VISIBLE);
                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });

            }
        });

        mujeresAdultas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                rtdb.getReference().child("mujeresAdultas").addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                        double spi,iro,cap,hulk,viuda,thor,doctor;

                        spi=0;
                        iro=0;
                        cap=0;
                        hulk=0;
                        thor=0;
                        doctor=0;
                        viuda=0;

                        for(DataSnapshot sn: dataSnapshot.getChildren()){
                            nmujeresAdultas++;

                            String hero=sn.getValue().toString();

                            if(hero.equals("spiderman")){
                                spi++;
                            }
                            else if(hero.equals("capitanamerica")){
                                cap++;
                            }

                            else if(hero.equals("ironman")){
                                iro++;
                            }

                            else if(hero.equals("hulk")){
                                hulk++;
                            }

                            else if(hero.equals("laviudanegra")){
                                viuda++;
                            }

                            else if(hero.equals("doctorstrage")){
                                doctor++;
                            }

                            else{
                                thor++;
                            }
                        }

                        String texto ="spiderman" + 100*spi/nmujeresAdultas +"%"+ System.getProperty("line.separator")
                                +"ironMan" +100*iro/nmujeresAdultas+ "%"+ System.getProperty("line.separator")
                                +"capitan America" +100*cap/nmujeresAdultas+ "%"+ System.getProperty("line.separator")
                                +"hulk" +100*hulk/nmujeresAdultas+ "%"+ System.getProperty("line.separator")
                                +"thor" +100*thor/nmujeresAdultas+ "%"+ System.getProperty("line.separator")
                                +"Viuda negra" +100*viuda/nmujeresAdultas+ "%"+System.getProperty("line.separator")
                                +"DoctorStrange" + 100*doctor/nmujeresAdultas+ "%"+ System.getProperty("line.separator")
                                + "Total Votos" + nmujeresAdultas;
                        txt_mujeresAdultas.setText(texto);

                        if(txt_mujeresAdultas.getVisibility() == View.VISIBLE){
                            txt_mujeresAdultas.setVisibility(View.GONE);
                        }else{
                            txt_mujeresAdultas.setVisibility(View.VISIBLE);
                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });

            }
        });

        todopublico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                rtdb.getReference().child("TodoPublico").addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                        double spi,iro,cap,hulk,viuda,thor,doctor;

                        spi=0;
                        iro=0;
                        cap=0;
                        hulk=0;
                        thor=0;
                        doctor=0;
                        viuda=0;

                        for(DataSnapshot sn: dataSnapshot.getChildren()){
                            ntodopublico++;

                            String hero=sn.getValue().toString();

                            if(hero.equals("spiderman")){
                                spi++;
                            }
                            else if(hero.equals("capitanamerica")){
                                cap++;
                            }

                            else if(hero.equals("ironman")){
                                iro++;
                            }

                            else if(hero.equals("hulk")){
                                hulk++;
                            }

                            else if(hero.equals("laviudanegra")){
                                viuda++;
                            }

                            else if(hero.equals("doctorstrage")){
                                doctor++;
                            }

                            else{
                                thor++;
                            }
                        }

                        String texto ="spiderman" + 100*spi/ntodopublico +"%"+ System.getProperty("line.separator")
                                +"ironMan" +100*iro/ntodopublico+ "%"+ System.getProperty("line.separator")
                                +"capitan America" +100*cap/ntodopublico+ "%"+ System.getProperty("line.separator")
                                +"hulk" +100*hulk/ntodopublico+ "%"+ System.getProperty("line.separator")
                                +"thor" +100*thor/ntodopublico+ "%"+ System.getProperty("line.separator")
                                +"Viuda negra" +100*viuda/ntodopublico+ "%"+System.getProperty("line.separator")
                                +"DoctorStrange" + 100*doctor/ntodopublico+ "%"+ System.getProperty("line.separator")
                                + "Total Votos" + ntodopublico;
                        txt_todopublico.setText(texto);

                        if(txt_todopublico.getVisibility() == View.VISIBLE){
                            txt_todopublico.setVisibility(View.GONE);
                        }else{
                            txt_todopublico.setVisibility(View.VISIBLE);
                        }
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });

            }
        });
    }
}
