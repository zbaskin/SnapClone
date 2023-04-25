public class Game {
    int totalScore;
    final int gameID = 1;
    Profile[] userIDs;

    public Game() {
        this.totalScore = 0;
    }

    public Game(Profile[] userIDs) {
        this.userIDs = userIDs;
    }
}
