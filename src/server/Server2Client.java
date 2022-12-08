package server;
import java.io.Serializable;
import server.Handler;

public class Server2Client implements Task {
	private static final long serialVersionUID = -7386258182412348165L;
	protected StringBuffer word;
        protected int FailAttempts;
        protected int score;
        protected int games;
        protected String message;
        protected String info;
        public void execute(){
	}

    public int getFailAttempts() {
        return FailAttempts;
    }

    public void setFailAttempts(int FailAttempts) {
        this.FailAttempts = FailAttempts;
    }

    public int getGames() {
        return games;
    }

    public void setGames(int games) {
        this.games = games;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public StringBuffer getWord() {
        return word;
    }

    public void setWord(StringBuffer word) {
        this.word = word;
    }

    
}
