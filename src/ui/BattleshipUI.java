package ui;

import java.io.*;

public class BattleshipUI {
    private final PrintStream outStream;
    private final BufferedReader inBufferedReader;
    private final String playerName;

    public BattleshipUI(String name, PrintStream out, InputStream in) {
        this.playerName = name;
        this.outStream = out;
        this.inBufferedReader = new BufferedReader(new InputStreamReader(in));
        // TODO: Initiate game engine, board, and network setup
    }

    public static void main(String[] args) {
        System.out.println(Commands.SPLASH_SCREEN);

        if (args.length < 1) {
            System.err.println("Please restart with playerName as parameter");
            System.exit(1);
        }

        System.out.println("Welcome " + args[0]);
        System.out.println("Let's play a game");

        BattleshipUI gameUI = new BattleshipUI(args[0], System.out, System.in);
        gameUI.printUsage();
        gameUI.startREPL();
    }

    public void startREPL() {
        boolean active = true;
        this.outStream.println("Hi " + playerName + "! Please enter a command:");
        while (active) {
            try {
                String userInput = inBufferedReader.readLine();

                if (userInput == null) break;

                userInput = userInput.trim();
                if (!userInput.contains(" ")) continue;
                String[] commands = userInput.split(" ");
                if (commands.length > 2) continue;

                String action = commands[0];
                String params = commands[1];

                switch (action) {
                    case Commands.CONNECT -> this.connectToHost(params);
                    case Commands.HOST -> this.hostGame();
                    case Commands.SHOOT -> this.shootCoordinates(params);
                    case Commands.EXIT -> {
                        active = false;
                        this.terminate();
                        return;
                    }
                    default -> {
                        this.outStream.println("Invalid command.");
                        this.printUsage();
                    }
                }
            } catch (IOException e) {
                this.outStream.println("Cannot read from input stream - terminating connection...");
                this.terminate();
            }
        }
    }

    private void connectToHost(String params){
        String hostName = params;
        this.outStream.println("Connecting to " + hostName + " ...");
        // TODO: Setup network connection
    }

    private void hostGame() {
        // TODO: Open socket, wait for requests...
        StringBuilder sb = new StringBuilder();
        sb.append("Starting a new game session on your machine...");
        sb.append("\n");
        sb.append("Waiting for your opponent...");
        this.outStream.println(sb);
    }

    private void shootCoordinates(String params) {
        String coords = params;
        // TODO: Check board
        this.outStream.println("Shooting at coordinate " + coords);
        // TODO: Update board & give feedback
    }

    private void terminate() {
        try {
            // perform necessary engine shutdowns
            this.inBufferedReader.close();
            this.outStream.close();
        } catch (IOException e) {
            // swallow exception
        }
    }

    private void printUsage() {
        this.outStream.println("Usage....");
    }
}
