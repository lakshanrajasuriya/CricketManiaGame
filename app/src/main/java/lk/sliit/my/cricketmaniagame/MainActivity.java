package lk.sliit.my.cricketmaniagame;

import android.content.Intent;
import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {


    TextView txtTotA,txtTotB,txtTotal;
    TextView A1,A2,A3,A4,A5;
    TextView B1,B2,B3,B4,B5;
    Button btnStart;
    EditText editName;

    String [] A={"Lakshan","Chamil","Atha","Asiri","Ranuka"};
    String [] B={"Kasun","Luvina","PK","Pinja","Saloon"};

    Team teamA=new Team("Team A",A);
    Team teamB=new Team("Team B",B);
    ConstraintLayout layout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layout= (ConstraintLayout) findViewById(R.id.Layout);
        layout.setBackgroundColor(Color.parseColor("#FFFFFF"));



        btnStart= (Button) findViewById(R.id.btnStart);
        editName =  (EditText) findViewById(R.id.editName);
        A1= (TextView) findViewById(R.id.txtA1);
        A2= (TextView) findViewById(R.id.txtA2);
        A3= (TextView) findViewById(R.id.txtA3);
        A4= (TextView) findViewById(R.id.txtA4);
        A5= (TextView) findViewById(R.id.txtA5);

        B1= (TextView) findViewById(R.id.txtB1);
        B2= (TextView) findViewById(R.id.txtB2);
        B3= (TextView) findViewById(R.id.txtB3);
        B4= (TextView) findViewById(R.id.txtB4);
        B5= (TextView) findViewById(R.id.txtB5);


    }


    public void btnClickStart(View view) {
        /*
        int totA=teamA.play();
        int totB=teamB.play();

        txtTotA.setText(teamA.getTeamName()+": "+totA);
        txtTotB.setText(teamB.getTeamName()+": "+totB);
        if(totA>totB)
        {
            txtTotal.setText(teamA.getTeamName()+" Wins with score: "+teamA.getTotal());
        }
        else if(totA<totB)
        {
            txtTotal.setText(teamB.getTeamName()+" Wins with score: "+teamB.getTotal());
        }
        else
        {
            txtTotal.setText("Draw");
        }

        A1.setText(teamA.players[0].getName()+": "+teamA.players[0].getScore());
        A2.setText(teamA.players[1].getName()+": "+teamA.players[1].getScore());
        A3.setText(teamA.players[2].getName()+": "+teamA.players[2].getScore());
        A4.setText(teamA.players[3].getName()+": "+teamA.players[3].getScore());
        A5.setText(teamA.players[4].getName()+": "+teamA.players[4].getScore());


        B1.setText(teamB.players[0].getName()+": "+teamB.players[0].getScore());
        B2.setText(teamB.players[1].getName()+": "+teamB.players[1].getScore());
        B3.setText(teamB.players[2].getName()+": "+teamB.players[2].getScore());
        B4.setText(teamB.players[3].getName()+": "+teamB.players[3].getScore());
        B5.setText(teamB.players[4].getName()+": "+teamB.players[4].getScore());
        */
        /*
        String [] teamList;

        chkKasun.isChecked();

        for(int x=0;x<5;x++)
        {
            if(chkKasun.isChecked())
            namelist[x]="";
        }*/


        String teamName=editName.getText().toString();
        Intent team = new Intent(this, team_members.class);
        Bundle bundle = new Bundle();
        bundle.putString("TeamName",teamName);
        team.putExtras(bundle);
        startActivity(team);

    }

}
