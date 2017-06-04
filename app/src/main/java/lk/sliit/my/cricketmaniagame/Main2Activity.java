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
import android.widget.TextView;

import java.util.Random;

public class Main2Activity extends AppCompatActivity {

    TextView txtTotA,txtTotB,txtTotal;
    TextView A1,A2,A3,A4,A5;
    TextView B1,B2,B3,B4,B5;
    TextView txtWon;
    ConstraintLayout layout;
    Button BtnNew,BtnPlay,BtnToss;

    String [] B=null;

    Team yourTeam;
    Team teamB;
    String yourTeamName=null,teamBName=null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_main2);
        super.onCreate(savedInstanceState);

        Bundle names=getIntent().getExtras();
        String [] A=names.getStringArray("names");

        Bundle teamN=getIntent().getExtras();
        yourTeamName=teamN.getString("teamName");

        B=generateTeam();
        teamBName=generateTeamName();

        yourTeam=new Team("Team A",A);
        teamB=new Team(teamBName,B);

        yourTeam.setTeamName(yourTeamName);

        layout= (ConstraintLayout) findViewById(R.id.Layout);
        layout.setBackgroundColor(Color.parseColor("#FFFFFF"));

        txtTotA= (TextView) findViewById(R.id.txtTotA);
        txtTotB= (TextView) findViewById(R.id.txtTotB);
        txtTotal= (TextView) findViewById(R.id.txtTotal);
        txtWon= (TextView) findViewById(R.id.txtWon);
        BtnNew= (Button) findViewById(R.id.btnReset);
        BtnPlay= (Button) findViewById(R.id.btnPlay);
        BtnToss= (Button) findViewById(R.id.btnToss);


        BtnPlay.setVisibility(View.INVISIBLE);
        BtnNew.setVisibility(View.INVISIBLE);
        txtWon.setVisibility(View.INVISIBLE);

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

        txtTotA.setText(yourTeam.getTeamName()+"");
        txtTotB.setText(teamB.getTeamName()+"");

        A1.setText(yourTeam.players[0].getName()+": "+yourTeam.players[0].getScore());
        A2.setText(yourTeam.players[1].getName()+": "+yourTeam.players[1].getScore());
        A3.setText(yourTeam.players[2].getName()+": "+yourTeam.players[2].getScore());
        A4.setText(yourTeam.players[3].getName()+": "+yourTeam.players[3].getScore());
        A5.setText(yourTeam.players[4].getName()+": "+yourTeam.players[4].getScore());


        B1.setText(teamB.players[0].getName()+": "+teamB.players[0].getScore());
        B2.setText(teamB.players[1].getName()+": "+teamB.players[1].getScore());
        B3.setText(teamB.players[2].getName()+": "+teamB.players[2].getScore());
        B4.setText(teamB.players[3].getName()+": "+teamB.players[3].getScore());
        B5.setText(teamB.players[4].getName()+": "+teamB.players[4].getScore());


        //playGame();

    }



    public void btnClickReset(View view) {

        Intent i = getBaseContext().getPackageManager()
                .getLaunchIntentForPackage( getBaseContext().getPackageName() );
        i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(i);
    }

    String [] generateTeam()
    {
        String [] team1={"Shahid","Mushtaq","Shoaib","Hashim","James"};
        String [] team2={"Warwick","Mike","Jonathan","Harold","Henry"};
        String [] team3={"Ian","Billy","Steve","Bill","Ramiz"};
        String [] team4={"Wasim","Waqar","Robin","Brian","David"};
        String [] team5={"Craig","Mpumelelo","Christopher","Mosey","David"};
        String [] team6={"Alan","Simon","Nasser","Mark","Rahul"};

        Random r=new Random();
        int x=r.nextInt(6);

        switch (x)
        {
            case 0:return team1;
            case 1:return team2;
            case 2:return team3;
            case 3:return team4;
            case 4:return team5;
            case 5:return team6;
            default:
        }
        return team1;
    }

    String  generateTeamName()
    {
        String name1="Tigers";
        String name2="Blues";
        String name3="Gorkhas";
        String name4="Chevrons";
        String name5="Windies";
        String name6="Invincibles";


        Random r=new Random();
        int x=r.nextInt(6);

        switch (x)
        {
            case 0:return name1;
            case 1:return name2;
            case 2:return name3;
            case 3:return name4;
            case 4:return name5;
            case 5:return name6;
            default:
        }
        return name1;
    }

    public void btnClickToss(View view) {

    }

    public void btnClickPlay(View view) {
        //playGame();
        BtnPlay.setVisibility(View.INVISIBLE);
        BtnNew.setVisibility(View.VISIBLE);
    }
}
