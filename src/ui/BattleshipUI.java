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

        System.out.println("\nWelcome " + args[0]);
        System.out.println("Let's play a game");

        BattleshipUI cmd = new BattleshipUI(args[0], System.out, System.in);
        cmd.printUsage();
        cmd.startREPL();
    }

    public void startREPL() {
        boolean active = true;
        this.outStream.println("Hi " + playerName + "! Please enter a command:\n");
        while (active) {
            try {
                String userInput = inBufferedReader.readLine();
                userInput = userInput.trim();
                String action;
                String params = null;
                if (userInput.contains(" ")) {
                    String[] commands = userInput.split(" ");
                    if (commands.length > 2) continue;
                    action = commands[0];
                    params = commands[1];
                } else {
                    action = userInput;
                }

                switch (action) {
                    case Commands.CONNECT -> this.connectToHost(params);
                    case Commands.HOST -> this.hostGame();
                    case Commands.SHOOT -> this.shootCoordinates(params);
                    case Commands.PRINT -> this.printBoard();
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

    private void connectToHost(String hostIP) {
        if (hostIP == null) {
            printError("Please provide the host ip!");
        }
        this.outStream.println("Connecting to " + hostIP + " ...");
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

    private void shootCoordinates(String coords) {
        if (coords == null) {
            printError("Please provide coordinates!");
            return;
        }

        // TODO: Check board
        this.outStream.println("Shooting at coordinate " + coords);
        // TODO: Update board & give feedback
    }

    private void deployShips() {
        // TODO: Deploy ships
        // deploy ships randomly on the board
        this.outStream.println("Ships have been deployed");
        // TODO: Update board & give feedback
    }

    /**
     * Get current player scores
     *
     * @return scores as String
     */
    public String getCurrentScores() {
        return null;
    }

    private void printBoard() {
        printError("No board available, yet.");
    }

    private void printBoard2() {
        printError("No board2 available, yet.");
    }

    private void terminate() {
        try {
            // perform necessary engine shutdowns
            this.inBufferedReader.close();
            this.outStream.close();
        } catch (IOException e) {
            // just for debugging
            printError("Caught an exception");
        }
    }

    public void printUsage() {
        StringBuilder instructions = new StringBuilder();
        instructions.append("\n");
        instructions.append("\n");
        instructions.append("VALID COMMANDS:");
        instructions.append("\n");
        instructions.append(Commands.CONNECT);
        instructions.append(" --> connect to the tcp host by IP");
        instructions.append("\n");
        instructions.append(Commands.HOST);
        instructions.append(" --> host a new game session via TCP");
        instructions.append("\n");
        instructions.append(Commands.PRINT);
        instructions.append(" --> print board");
        instructions.append("\n");
        instructions.append(Commands.SHOOT);
        instructions.append(" --> shoot a coordinate (e.g. a3)");
        instructions.append("\n");
        instructions.append(Commands.EXIT);
        instructions.append(" --> exit the game");
        this.outStream.println(instructions);
    }

    public void printError(String errorMessage) {
        String RED = "\u001b[31m";
        String RESET = "\u001b[0m";
        this.outStream.println(RED + errorMessage + RESET);
    }
}
