import java.util.ArrayList;
public class Team {
    private String name;
    int played = 0, won = 0, lost = 0, tied = 0;
    private ArrayList<Player> members = new ArrayList<>();

    public Team(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return this.name;
    }

    public boolean addPlayer(Player player)
    {
        if(members.contains(player))
        {
            System.out.println(player.getName()+" already on the team");
            return false;
        }
        else
        {
            members.add(player);
            System.out.println(player.getName() + " picked for team " + this.name);
            return true;
        }
    }

    public int numPlayers()
    {
        return this.members.size();
    }

    public void matchResult(Team opponent, int ourScore, int theirScore)
    {
        played++;
        if (ourScore > theirScore)
            won++;
        else if (ourScore < theirScore)
            lost++;
        else
            tied++;
        if (opponent != null)
            opponent.matchResult(null, theirScore, ourScore);
    }

    public int ranking()
    {
        return (won * 2) + tied;
    }
}
