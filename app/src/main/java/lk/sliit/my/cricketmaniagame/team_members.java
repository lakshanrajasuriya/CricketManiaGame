package lk.sliit.my.cricketmaniagame;

import android.content.Intent;
import android.graphics.Color;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class team_members extends AppCompatActivity {

    EditText txt1,txt2,txt3,txt4,txt5;
    Button btnStart;
    String teamName=null;
    ConstraintLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_team_members);

        Bundle team=getIntent().getExtras();
        teamName=team.getString("TeamName");

        layout= (ConstraintLayout) findViewById(R.id.Layout);
        layout.setBackgroundColor(Color.parseColor("#FFFFFF"));

        txt1= (EditText) findViewById(R.id.editMember1);
        txt2= (EditText) findViewById(R.id.editMember2);
        txt3= (EditText) findViewById(R.id.editMember3);
        txt4= (EditText) findViewById(R.id.editMember4);
        txt5= (EditText) findViewById(R.id.editMember5);
        btnStart= (Button) findViewById(R.id.btnStart);
    }

    public void btnClickStart(View view) {
        String member1=txt1.getText().toString();
        String member2=txt2.getText().toString();
        String member3=txt3.getText().toString();
        String member4=txt4.getText().toString();
        String member5=txt5.getText().toString();

        String [] names={member1,member2,member3,member4,member5};

        Intent intent=new Intent(this,Main2Activity.class);
        Bundle bundle=new Bundle();
        bundle.putStringArray("names",names);
        intent.putExtras(bundle);
        Bundle tN=new Bundle();
        tN.putString("teamName",teamName);
        intent.putExtras(tN);
        startActivity(intent);
    }
}
