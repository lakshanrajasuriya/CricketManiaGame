package lk.sliit.my.cricketmaniagame;

/**
 * Created by Lakshan on 25-May-17.
 */

public class Team {
    private String teamName;
    private int wickets;
    private int total;
    Player [] players;

    public Team(String tn,String [] names)
    {
        teamName=tn;
        wickets=0;
        total=0;

        int size=names.length;
        players=new Player[size];
            for (int i = 0; i < size; i++)
            {
                players[i] = new Player(names[i]);
            }
    }

    public String getTeamName()
    {
        return teamName;
    }

    public void setTeamName(String st)
    {
        teamName=st;
    }

    public int getTotal()
    {
        return total;
    }

    public int play()
    {
        int runs;
        for(int overs=1;overs<=10;overs++)
        {
            for(int balls=1;balls<=6;balls++)
            {
                runs=players[wickets].bat();
                if(runs==5)
                {
                    wickets++;
                }
                else
                {
                    total+=runs;
                }
                if(wickets==players.length-1)
                {
                    return total;
                }
            }
        }
        return total;
    }
}
