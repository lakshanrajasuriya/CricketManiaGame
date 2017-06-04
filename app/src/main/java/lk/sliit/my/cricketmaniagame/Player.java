package lk.sliit.my.cricketmaniagame;

import java.util.Random;

/**
 * Created by Lakshan on 25-May-17.
 */

public class Player {
    private String name;
    private int score;

    public Player(String n)
    {
        name=n;
        score=0;
    }

    public String getName()
    {
        return name;
    }

    public int getScore()
    {
        return score;
    }

    public int bat()
    {
        Random random=new Random();
        int runs=random.nextInt(7);
        if(runs!=5)
        {
            score+=runs;
        }
        return runs;
    }


}
