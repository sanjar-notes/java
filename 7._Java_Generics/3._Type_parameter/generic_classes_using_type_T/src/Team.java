import java.util.ArrayList;

// public class<T extends Player & Coach & Manager>{ // for multiple player
public class Team<T extends Player> implements Comparable<Team<T>> {
    private String name;
    int played = 0, won = 0, lost = 0, tied = 0;
    private ArrayList<T> members = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public boolean addPlayer(T player) {
        if (members.contains(player)) {
            System.out.println(player.getName() + " already on the team");
            return false;
        } else {
            members.add(player);
            System.out.println(player.getName() + " picked for team " + this.name);
            return true;
        }
    }

    public int numPlayers() {
        return this.members.size();
    }

    public void matchResult(Team<T> opponent, int ourScore, int theirScore) {
        played++;
        if (ourScore > theirScore)
            won++;
        else if (ourScore < theirScore)
            lost++;
        else
            tied++;
        if (opponent != null) // score update for the opponent
            opponent.matchResult(null, theirScore, ourScore);
    }

    public int ranking() {
        return (won * 2) + tied;
    }

    @Override
    public int compareTo(Team<T> team) {
        Integer ourRank = this.ranking(), theirRank = team.ranking();

        if (ourRank > theirRank)
            return -1;
        else if (ourRank < theirRank)
            return 1;
        else
            return 0; // same rank
    }
}
