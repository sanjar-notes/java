import java.util.ArrayList;
// import java.util.Comparator;
import java.util.Collections;

public class League<T extends Team> {
    public String name;
    private ArrayList<T> teams;

    public League(String name) {
        this.name = name;
        teams = new ArrayList<>();
    }

    public boolean addTeam(T toBeAdded) {
        if (teams.contains(toBeAdded))
            return false;
        teams.add(toBeAdded);
        return true;
    }

    public void showLeagueTable() {
        Collections.sort(teams); // done automatically
        for (T team : teams)
            System.out.println(team.getName() + " : " + team.ranking());
    }
}
