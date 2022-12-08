package server;

public class Hangme {

    public Hangme() {
    }

    public void calculate(String chosenword, Server2Client serveranswer, Client2Server clientanswer) {

        if (clientanswer.clientword.isEmpty()) {
            serveranswer.message = "";
            serveranswer.info = "Click on a letter first!";
        } else if (clientanswer.clientword.length() == 1) {
               
            if (chosenword.indexOf(clientanswer.clientword) == -1) {
                serveranswer.message = "Letter does not exist";
                serveranswer.FailAttempts--;
                serveranswer.info = String.valueOf(serveranswer.FailAttempts)+" attempts are left!";
                if (serveranswer.FailAttempts == 0) {
                    serveranswer.message = "You lost!!!";
                    serveranswer.word = new StringBuffer(chosenword);
                    serveranswer.info = "Click on New Game for another chance!";
                    serveranswer.games++;

                }


            }

            char[] c = new char[clientanswer.clientword.length()];
            c = clientanswer.clientword.toCharArray();

            if ((serveranswer.word.toString()).indexOf(clientanswer.clientword) != -1) {
                serveranswer.message = "Letter has already been guessed.";
                serveranswer.info = "Try another one!";

            } else {
                for (int i = 0; i < chosenword.length(); i++) {
                    if (String.valueOf(chosenword.charAt(i)).equalsIgnoreCase(String.valueOf(c[0]))) {
                        serveranswer.word.setCharAt(i, c[0]);
                        if (serveranswer.word.indexOf("-") == -1) {
                            serveranswer.word = new StringBuffer(chosenword);
                            serveranswer.message = "You win!!!";
                            serveranswer.info = "Click on New Game for another word";
                            serveranswer.score++;
                            serveranswer.games++;
                        } else {
                            serveranswer.message = "Letter correct!";
                            serveranswer.info = "Keep guessing :D";
                        }
                    }

                }
            }
        } else if (clientanswer.clientword.equalsIgnoreCase(chosenword)) {
            serveranswer.word = new StringBuffer(chosenword);
            System.out.println("win word: " + serveranswer.word);
            serveranswer.message = "You win!!!";
            serveranswer.info = "Click on New Game for another word";
            serveranswer.score++;
            serveranswer.games++;

        } else {
            serveranswer.message = "Word is not correct";
            serveranswer.info = "Try again!";
            serveranswer.FailAttempts--;
            if (serveranswer.FailAttempts == 0) {
                serveranswer.message = "You lost!!!";
                serveranswer.word = new StringBuffer(chosenword);
                serveranswer.info = "Click on New Game for another chance!";
                serveranswer.games++;

            }
        }
    }
}