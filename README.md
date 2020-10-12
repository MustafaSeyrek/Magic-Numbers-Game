# Magic-Numbers-Game
Write a Java program for the game MagicNumbers.   MagicNumbers is a game played by two players: user1 and user2. There are three single linked lists (SLL) with 8 in size. At the beginning of the game, all SLLs are empty. Players take turns to add a digit (randomly generated between 1 and 5) to any list (randomly determined). In other words, the program should determine the digit and list randomly.  The aim of the game is for each player to attempt to create a triple consecutive sequence (incremental or decremental) among connected squares (horizontally or vertically or diagonally).   If a player succeeds in creating a sequence, the game is over. The winner is the player who made the first sequence. Otherwise turns alternate between players after each move. If all lists are filled up and there is no any sequence, then the game is a draw.  The program must display all steps until the game is over. 


Sample outputs:

Sample output 1:

User1:
SLL1 4
SLL2 
SLL3 

User2:
SLL1 4
SLL2 5
SLL3 

User1:
SLL1 4
SLL2 5 2
SLL3 

User2:
SLL1 4 1
SLL2 5 2
SLL3 

User1:
SLL1 4 1
SLL2 5 2 3
SLL3 

User2:
SLL1 4 1
SLL2 5 2 3
SLL3 4

User1:
SLL1 4 1
SLL2 5 2 3 4
SLL3 4

winner: User1	

Sample output 2:

User1:
SLL1 
SLL2 3
SLL3 

User2:
SLL1 
SLL2 3
SLL3 1

User1:
SLL1 1
SLL2 3
SLL3 1 

User2:
SLL1 1
SLL2 3
SLL3 1 3  

User1:
SLL1 1 
SLL2 3 4
SLL3 1 3

User2:
SLL1 1
SLL2 3 4
SLL3 1 3 3

User1:
SLL1 1
SLL2 3 4
SLL3 1 3 3 3

User2:
SLL1 1
SLL2 3 4 4
SLL3 1 3 3 3

User1:
SLL1 1 5
SLL2 3 4 4
SLL3 1 3 3 3

winner: User1	

Sample output 3:

User1:
SLL1 
SLL2 3
SLL3 

User2:
SLL1 
SLL2 3
SLL3 1

User1:
SLL1 5
SLL2 3
SLL3 1 

User2:
SLL1 5
SLL2 3
SLL3 1 1  

User1:
SLL1 5 
SLL2 3 4
SLL3 1 1

User2:
SLL1 5
SLL2 3 4
SLL3 1 1 1

User1:
SLL1 5
SLL2 3 4
SLL3 1 1 1 3

User2:
SLL1 5
SLL2 3 4 4
SLL3 1 1 1 3

User1:
SLL1 5 5
SLL2 3 4 4
SLL3 1 1 1 3

winner: User1	

Sample output 4:

User1:
SLL1 
SLL2 3
SLL3 

User2:
SLL1 
SLL2 3
SLL3 3

User1:
SLL1 5
SLL2 3
SLL3 3 

User2:
SLL1 5 1
SLL2 3
SLL3 3   

User1:
SLL1 5 1
SLL2 3 2
SLL3 3 

User2:
SLL1 5 1
SLL2 3 2
SLL3 3 2 

User1:
SLL1 5 1
SLL2 3 2
SLL3 3 2 2

User2:
SLL1 5 1 1
SLL2 3 2 
SLL3 3 2 2

winner: User2	

Sample output 5:

User1:
SLL1 
SLL2 
SLL3 5

User2:
SLL1 
SLL2 5
SLL3 5

User1:
SLL1 
SLL2 5
SLL3 5 3

User2:
SLL1 4
SLL2 5
SLL3 5 3

User1:
SLL1 4
SLL2 5
SLL3 5 3 1

...

User1:
SLL1 4 4 2 1 2 2 4 1
SLL2 5 3 5 1 1 5 2 1
SLL3 5 3 1 1 2 5 2 1

Tie

