public class Player implements Information{
    public String nameOfPlayer,sportType,teamName;
    public int numberPosition;
    @Override
    public void getInfo() {
        System.out.println(nameOfPlayer);
    }

    @Override
    public void getTeamName() {
        System.out.println(teamName);
    }
}
