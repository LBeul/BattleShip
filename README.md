# BattleShip

## Ideation Battleship
### Phases of the Game

1. Start Phase
    - start the Game
    - enter your name
    - select if host or joiner
        - if host -> show IP address and listen to port
        - if joiner -> ask for host IP, then connect
2. Connection Phase
    - Show pending status
    - Give feedback when connection successful (or timeout)
3. Game Play
    - Show the battleship game
    - Request shooting coordinates from each player in turn
    - update both boards when shots were fired
