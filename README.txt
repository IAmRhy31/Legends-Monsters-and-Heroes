# CS 611 - Assignment 3
## Legends: Monsters and Heroes
---------------------------------------------------------------------------
Rhythm Deven Somaiya
rhythm@bu.edu
U84158310

## Files
---------------------------------------------------------------------------
- Weaponry.java: This is the class for item: Weapon.

- Armory.java: This is the class for item: Armor.

- Spell.java: This is the class for item: Spell. It includes information regarding various spell types and their effect on monsters.

- Potions.java: This is the class for item: Potion. It includes information regarding how potions affect the hero's specific attribute(s).

- Items.java: This is the abstract class for Items in general.

- Hero.java: This is the main class for Hero(es).

- HeroData.java: This is the class for storing hero data.

- Monster.java: This is the main class for Monster(s).

- MonsterData.java: This is the class for storing monster data.

- Legend.java: This is the common class for Hero and Monster to use.

- Board.java: Class for Board/Space/Universe.

- InfoUnitCell.java: Class to work on the single unit cell for a Board.

- GameUniverse.java: Main class for the game's world or map of the game.

- Market.java: Class for Market.

- Battle.java: This is the class for the battle between heroes and monsters.

- LMH.java: Main class for working of the game -> Legends: Monsters and Heroes (LMH).

- StartGame.java: This is the main class where our game begins.

## Notes
---------------------------------------------------------------------------
1. Some bits of the code for classes "Board" and "InfoUnitCell" are directly used from my Assignment 1 code due to its extendability to use the board in other board games (like building the board in this assignment).
2. The majority of basic game test cases are working but some might not be tested as the game has many possible scenarios.
3. The game board/universe in the README.txt file might look a little different from the actual output because I am working on a Mac and it doesn't handle .txt files properly (I copy-pasted the output directly from the IntelliJ terminal).
4. If you face any queries regarding my code, its working/running, or anything, please contact me.

## How to compile and run
---------------------------------------------------------------------------
A. Compile and Run in an IDE (eg. IntelliJ):
1) Create a new java project and add the above .java classes files in the "/src" folder of your created project.
2) Goto "StartGame.java" and click the "Run" button (Ctrl + R) to run this project.

B. Run in the Terminal (Mac):
1) cd towards the directory/folder where you have saved this project (after unzipping) in your Mac and press "Enter"
2) Type "javac StartGame.java" and press "Enter"
3) Type "java StartGame" and press "Enter"

## Input/Output Example
---------------------------------------------------------------------------

--------------------------------------------------------------------------------------
   WELCOME TO --> LEGENDS: MONSTERS AND HEROES   
--------------------------------------------------------------------------------------
In this universe, the heroes (1-3) will battle various monsters and to get an edge over monsters, heroes can:
1) Access the Market to buy Weapons, Spells, Armory or Potions.
2) The Hero(es) initially don't have any weapon, armor, etc. If you want to equip them (recommended), go to the market space and buy it.
3) Will roam the universe where they can reach an: a) Inaccessible Space, b) Market Space, or c) ready for it? Common Space!
Common Space a.k.a. BATTLE SPACE - where MONSTERS with various levels will attack the HEROES randomly.
Remember the basic controls to move around the universe:
W/w: Move Up         A/a: Move Left         S/s: Move Down         D/d: Move Right
Some extra controls -> I/i: Show Information         Q/q: Quit Game
READY FOR THE JOURNEY? SURE YOU ARE. HERE WE GO!
---------------------------------------------------------------------------------------
Please enter the number of heroes (1 to 3): 
x
x is a string and not a valid integer (1 to 3).
Please enter the number of heroes (1 to 3): 
4
Sorry, this is an invalid input! Select an integer from 1 to 3
Please enter the number of heroes (1 to 3): 
1
You have 1 hero(es) in your team!

Here is the list of heroes you can select: 
----------------------------------------------------------------------------------------------------------------
No.        Type          Name             Mana       Strength     Agility     Dexterity    Money    Experience
----------------------------------------------------------------------------------------------------------------
1        Warrior    Gaerdal_Ironhand       100           700          500          600          1354         7
2        Warrior    Sehanine_Monnbow       600           700          800          500          2500         8
3        Warrior    Muamman_Duathall       300           900          500          750          2546         6
4        Warrior    Flandal_Steelskin       200           750          650          700          2500         7
5        Warrior    Undefeated_Yoj       400           800          400          700          2500         7
6        Warrior    Eunoia_Cyn       400           700          800          600          2500         6
7        Sorcerer    Rillifane_Rallathil       1300           750          450          500          2500         9
8        Sorcerer    Segojan_Earthcaller       900           800          500          650          2500         5
9        Sorcerer    Reign_Havoc       800           800          800          800          2500         8
10        Sorcerer    Reverie_Ashels       900           800          700          400          2500         7
11        Sorcerer    Kalabar       800           850          400          600          2500         6
12        Sorcerer    Skye_Soar       1000           700          400          500          2500         5
13        Paladin    Parzival       300           750          650          700          2500         7
14        Paladin    Sehanine_Moonbow       300           750          700          700          2500         7
15        Paladin    Skoraeus_Stonebones       250           650          600          350          2500         4
16        Paladin    Garl_Glittergold       100           600          500          400          2500         5
17        Paladin    Amaryllis_Astra       500           500          500          500          2500         5
18        Paladin    Caliber_Heist       400           400          400          400          2500         8

Enter the # of heroes you want to select (1 to 18): 
16

--------------------------------------------------------------------------------------------------------------------------------------------------------------------
No.          Type          Name                    Mana          Strength          Agility          Dexterity          Money          Experience          Condition
--------------------------------------------------------------------------------------------------------------------------------------------------------------------
1          Paladin          Garl_Glittergold                    100          600          500          400          2500          5          false


THE UNIVERSE IS IN FRONT OF YOU. JOURNEY BEGINS! GOOD LUCK ⚔️
I = Inaccessible Space, M = Market Space, H = Hero(s) Team, and the blank spaces are Common Spaces where battle with monster can randomly occur.
+---+---+---+---+---+---+---+---+
| I |   | I | I | M | H |   | I |
+---+---+---+---+---+---+---+---+
|   |   |   | M | M |   |   | I |
+---+---+---+---+---+---+---+---+
|   | M |   | M |   |   | M | M |
+---+---+---+---+---+---+---+---+
|   |   |   | M | I |   |   | M |
+---+---+---+---+---+---+---+---+
|   | M |   |   | I |   | M |   |
+---+---+---+---+---+---+---+---+
| M | M | M |   | I |   |   |   |
+---+---+---+---+---+---+---+---+
|   |   | I |   | M | M |   | M |
+---+---+---+---+---+---+---+---+
|   |   | I | M | I | I | M |   |
+---+---+---+---+---+---+---+---+

I/i: Show Information         Q/q: Quit Game
M/m: Move
m
W/w: Move Up         A/a: Move Left         S/s: Move Down         D/d: Move Right
+---+---+---+---+---+---+---+---+
| I |   | I | I | M | H |   | I |
+---+---+---+---+---+---+---+---+
|   |   |   | M | M |   |   | I |
+---+---+---+---+---+---+---+---+
|   | M |   | M |   |   | M | M |
+---+---+---+---+---+---+---+---+
|   |   |   | M | I |   |   | M |
+---+---+---+---+---+---+---+---+
|   | M |   |   | I |   | M |   |
+---+---+---+---+---+---+---+---+
| M | M | M |   | I |   |   |   |
+---+---+---+---+---+---+---+---+
|   |   | I |   | M | M |   | M |
+---+---+---+---+---+---+---+---+
|   |   | I | M | I | I | M |   |
+---+---+---+---+---+---+---+---+
w
Uh Oh! Dead end. Make a new move please.
W/w: Move Up         A/a: Move Left         S/s: Move Down         D/d: Move Right
+---+---+---+---+---+---+---+---+
| I |   | I | I | M | H |   | I |
+---+---+---+---+---+---+---+---+
|   |   |   | M | M |   |   | I |
+---+---+---+---+---+---+---+---+
|   | M |   | M |   |   | M | M |
+---+---+---+---+---+---+---+---+
|   |   |   | M | I |   |   | M |
+---+---+---+---+---+---+---+---+
|   | M |   |   | I |   | M |   |
+---+---+---+---+---+---+---+---+
| M | M | M |   | I |   |   |   |
+---+---+---+---+---+---+---+---+
|   |   | I |   | M | M |   | M |
+---+---+---+---+---+---+---+---+
|   |   | I | M | I | I | M |   |
+---+---+---+---+---+---+---+---+
D
I/i: Show Information         Q/q: Quit Game
M/m: Move
m
W/w: Move Up         A/a: Move Left         S/s: Move Down         D/d: Move Right
+---+---+---+---+---+---+---+---+
| I |   | I | I | M |   | H | I |
+---+---+---+---+---+---+---+---+
|   |   |   | M | M |   |   | I |
+---+---+---+---+---+---+---+---+
|   | M |   | M |   |   | M | M |
+---+---+---+---+---+---+---+---+
|   |   |   | M | I |   |   | M |
+---+---+---+---+---+---+---+---+
|   | M |   |   | I |   | M |   |
+---+---+---+---+---+---+---+---+
| M | M | M |   | I |   |   |   |
+---+---+---+---+---+---+---+---+
|   |   | I |   | M | M |   | M |
+---+---+---+---+---+---+---+---+
|   |   | I | M | I | I | M |   |
+---+---+---+---+---+---+---+---+
d
You cannot enter Inaccessible Space. Next move please.
W/w: Move Up         A/a: Move Left         S/s: Move Down         D/d: Move Right
+---+---+---+---+---+---+---+---+
| I |   | I | I | M |   | H | I |
+---+---+---+---+---+---+---+---+
|   |   |   | M | M |   |   | I |
+---+---+---+---+---+---+---+---+
|   | M |   | M |   |   | M | M |
+---+---+---+---+---+---+---+---+
|   |   |   | M | I |   |   | M |
+---+---+---+---+---+---+---+---+
|   | M |   |   | I |   | M |   |
+---+---+---+---+---+---+---+---+
| M | M | M |   | I |   |   |   |
+---+---+---+---+---+---+---+---+
|   |   | I |   | M | M |   | M |
+---+---+---+---+---+---+---+---+
|   |   | I | M | I | I | M |   |
+---+---+---+---+---+---+---+---+
s
I/i: Show Information         Q/q: Quit Game
M/m: Move
m
W/w: Move Up         A/a: Move Left         S/s: Move Down         D/d: Move Right
+---+---+---+---+---+---+---+---+
| I |   | I | I | M |   |   | I |
+---+---+---+---+---+---+---+---+
|   |   |   | M | M |   | H | I |
+---+---+---+---+---+---+---+---+
|   | M |   | M |   |   | M | M |
+---+---+---+---+---+---+---+---+
|   |   |   | M | I |   |   | M |
+---+---+---+---+---+---+---+---+
|   | M |   |   | I |   | M |   |
+---+---+---+---+---+---+---+---+
| M | M | M |   | I |   |   |   |
+---+---+---+---+---+---+---+---+
|   |   | I |   | M | M |   | M |
+---+---+---+---+---+---+---+---+
|   |   | I | M | I | I | M |   |
+---+---+---+---+---+---+---+---+
s
Welcome to the MARKET PLACE!
What do you know want to do?
0. Leave
1. Buy
2. Sell
Q. Quit Game
1
Choose what you want to buy: 
1. Weaponry
2. Armory
3. Spells
4. Potions
5. Go Back
1
Choose the weapon which you want to buy: 
---------------------------------------------------------------------------------------------------
No.          Name                    Price          Level          Damage          Required Hands
---------------------------------------------------------------------------------------------------
1          Sword                    500          1          800          1
2          Bow                    300          2          500          2
3          Scythe                    1000          6          1100          2
4          Axe                    550          5          850          1
5          TSwords                    1400          8          1600          2
6          Dagger                    200          1          250          1

1
Weapon Sword has been purchased.
Choose what you want to buy: 
1. Weaponry
2. Armory
3. Spells
4. Potions
5. Go Back
2
Choose the armor which you want to buy: 
------------------------------------------------------------------------------------
No.          Name                    Price          Level          Damage Reduction
------------------------------------------------------------------------------------
1          Platinum_Sheild                    150          1          200
2          Breastplate                    350          2          600
3          Full_Body_Armor                    1000          6          1100
4          Wizard_Shield                    1200          5          1500
5          Guradian_Angel                    1000          8          1000

3
Required level to buy this item doesn't match your level yet :( Keep trying and winning!
Choose what you want to buy: 
1. Weaponry
2. Armory
3. Spells
4. Potions
5. Go Back
2
Choose the armor which you want to buy: 
------------------------------------------------------------------------------------
No.          Name                    Price          Level          Damage Reduction
------------------------------------------------------------------------------------
1          Platinum_Sheild                    150          1          200
2          Breastplate                    350          2          600
3          Full_Body_Armor                    1000          6          1100
4          Wizard_Shield                    1200          5          1500
5          Guradian_Angel                    1000          8          1000

1
Armor Platinum_Sheild has been purchased.
Choose what you want to buy: 
1. Weaponry
2. Armory
3. Spells
4. Potions
5. Go Back
3
Choose the spell which you want to buy: 
-----------------------------------------------------------------------------------------------------------
No.          Name                    Type          Price          Level          Damage          Mana Cost
-----------------------------------------------------------------------------------------------------------
1          Snow_Cannon                    Ice          500          2          650          250
2          Ice_Blade                    Ice          250          1          450          100
3          Frost_Blizzard                    Ice          750          5          850          350
4          Arctic_Storm                    Ice          700          6          800          300
5          Flame_Tornada                    Fire          700          4          850          300
6          Breath_of_Fire                    Fire          350          1          450          100
7          Heat_Wave                    Fire          450          2          600          150
8          Lava_Comet                    Fire          800          7          1000          550
9          Hell_Storm                    Fire          600          3          950          600
10          Lighting_Dagger                    Lightning          400          1          500          150
11          Thunder_Blast                    Lightning          750          4          950          400
12          Electric_Arrows                    Lightning          550          5          650          200
13          Spark_Needles                    Lightning          500          2          600          200

2
Spell Ice_Blade has been purchased.
Choose what you want to buy: 
1. Weaponry
2. Armory
3. Spells
4. Potions
5. Go Back
4
Choose the potion which you want to buy: 
------------------------------------------------------------------------------------------------------------------
No.          Name                    Price          Level          Attribute Increase          Attribute Affected
------------------------------------------------------------------------------------------------------------------
1          Healing_Potion                    250          1          100          Health
2          Strength_Potion                    200          1          75          Strength
3          Magic_Potion                    350          2          100          Mana
4          Luck_Elixir                    500          4          65          Agility
5          Mermaid_Tears                    850          5          100          Health/Mana/Strength/Agility
6          Ambrosia                    1000          8          150          Health/Mana/Strength/Dexterity/Defense/Agility

1
Potion Healing_Potion has been purchased.
Choose what you want to buy: 
1. Weaponry
2. Armory
3. Spells
4. Potions
5. Go Back
5
I/i: Show Information         Q/q: Quit Game
M/m: Move
m
W/w: Move Up         A/a: Move Left         S/s: Move Down         D/d: Move Right
+---+---+---+---+---+---+---+---+
| I |   | I | I | M |   |   | I |
+---+---+---+---+---+---+---+---+
|   |   |   | M | M |   |   | I |
+---+---+---+---+---+---+---+---+
|   | M |   | M |   |   | H | M |
+---+---+---+---+---+---+---+---+
|   |   |   | M | I |   |   | M |
+---+---+---+---+---+---+---+---+
|   | M |   |   | I |   | M |   |
+---+---+---+---+---+---+---+---+
| M | M | M |   | I |   |   |   |
+---+---+---+---+---+---+---+---+
|   |   | I |   | M | M |   | M |
+---+---+---+---+---+---+---+---+
|   |   | I | M | I | I | M |   |
+---+---+---+---+---+---+---+---+
a
I/i: Show Information         Q/q: Quit Game
M/m: Move
m
W/w: Move Up         A/a: Move Left         S/s: Move Down         D/d: Move Right
+---+---+---+---+---+---+---+---+
| I |   | I | I | M |   |   | I |
+---+---+---+---+---+---+---+---+
|   |   |   | M | M |   |   | I |
+---+---+---+---+---+---+---+---+
|   | M |   | M |   | H |   | M |
+---+---+---+---+---+---+---+---+
|   |   |   | M | I |   |   | M |
+---+---+---+---+---+---+---+---+
|   | M |   |   | I |   | M |   |
+---+---+---+---+---+---+---+---+
| M | M | M |   | I |   |   |   |
+---+---+---+---+---+---+---+---+
|   |   | I |   | M | M |   | M |
+---+---+---+---+---+---+---+---+
|   |   | I | M | I | I | M |   |
+---+---+---+---+---+---+---+---+
w
I/i: Show Information         Q/q: Quit Game
M/m: Move
m
W/w: Move Up         A/a: Move Left         S/s: Move Down         D/d: Move Right
+---+---+---+---+---+---+---+---+
| I |   | I | I | M |   |   | I |
+---+---+---+---+---+---+---+---+
|   |   |   | M | M | H |   | I |
+---+---+---+---+---+---+---+---+
|   | M |   | M |   |   |   | M |
+---+---+---+---+---+---+---+---+
|   |   |   | M | I |   |   | M |
+---+---+---+---+---+---+---+---+
|   | M |   |   | I |   | M |   |
+---+---+---+---+---+---+---+---+
| M | M | M |   | I |   |   |   |
+---+---+---+---+---+---+---+---+
|   |   | I |   | M | M |   | M |
+---+---+---+---+---+---+---+---+
|   |   | I | M | I | I | M |   |
+---+---+---+---+---+---+---+---+
w
*******************GET READY************************
MONSTER CONFRONTED. GOOD LUCK!!
Current Round commencing: 1
Monster info is as follows 👇
-----------------------------------------------------------------------------------------------------------------------------------
No.          Type          Name                    Level          Damage          Defense          Dodge Chance          Condition
-----------------------------------------------------------------------------------------------------------------------------------
1          Dragon          Desghidorrah                    3          300          400          35.0          false

Hero info is as follows 👇
--------------------------------------------------------------------------------------------------------------------------------------------------------------------
No.          Type          Name                    Mana          Strength          Agility          Dexterity          Money          Experience          Condition
--------------------------------------------------------------------------------------------------------------------------------------------------------------------
1          Paladin          Garl_Glittergold                    100          600          500          400          1350          5          false

Time to fight, Garl_Glittergold
Below are your options:
1. Attack
2. Change Weapon
3. Change Armor
4. Cast Spell
5. Use Potion
6. Quit Game
1
Hero Garl_Glittergold caused 3 damage to Monster Desghidorrah!
Hero Garl_Glittergold has dodged the attack from monster.
Current Round commencing: 2
Monster info is as follows 👇
-----------------------------------------------------------------------------------------------------------------------------------
No.          Type          Name                    Level          Damage          Defense          Dodge Chance          Condition
-----------------------------------------------------------------------------------------------------------------------------------
1          Dragon          Desghidorrah                    3          300          400          35.0          false

Hero info is as follows 👇
--------------------------------------------------------------------------------------------------------------------------------------------------------------------
No.          Type          Name                    Mana          Strength          Agility          Dexterity          Money          Experience          Condition
--------------------------------------------------------------------------------------------------------------------------------------------------------------------
1          Paladin          Garl_Glittergold                    110          600          500          400          1350          5          false

Time to fight, Garl_Glittergold
Below are your options:
1. Attack
2. Change Weapon
3. Change Armor
4. Cast Spell
5. Use Potion
6. Quit Game
3
Armor list is as follows 👇
------------------------------------------------------------------------
Name                    Price          Level          Damage Reduction
------------------------------------------------------------------------
Platinum_Sheild                    150          1          200

Enter the # of armor which you wish to equip: 1
Your current equipped armor is Platinum_Sheild
Hero Garl_Glittergold has dodged the attack from monster.
Current Round commencing: 3
Monster info is as follows 👇
-----------------------------------------------------------------------------------------------------------------------------------
No.          Type          Name                    Level          Damage          Defense          Dodge Chance          Condition
-----------------------------------------------------------------------------------------------------------------------------------
1          Dragon          Desghidorrah                    3          300          400          35.0          false

Hero info is as follows 👇
--------------------------------------------------------------------------------------------------------------------------------------------------------------------
No.          Type          Name                    Mana          Strength          Agility          Dexterity          Money          Experience          Condition
--------------------------------------------------------------------------------------------------------------------------------------------------------------------
1          Paladin          Garl_Glittergold                    121          600          500          400          1350          5          false

Time to fight, Garl_Glittergold
Below are your options:
1. Attack
2. Change Weapon
3. Change Armor
4. Cast Spell
5. Use Potion
6. Quit Game
1
Monster Desghidorrah has dodged this attack.
Hero Garl_Glittergold has dodged the attack from monster.
Current Round commencing: 4
Monster info is as follows 👇
-----------------------------------------------------------------------------------------------------------------------------------
No.          Type          Name                    Level          Damage          Defense          Dodge Chance          Condition
-----------------------------------------------------------------------------------------------------------------------------------
1          Dragon          Desghidorrah                    3          300          400          35.0          false

Hero info is as follows 👇
--------------------------------------------------------------------------------------------------------------------------------------------------------------------
No.          Type          Name                    Mana          Strength          Agility          Dexterity          Money          Experience          Condition
--------------------------------------------------------------------------------------------------------------------------------------------------------------------
1          Paladin          Garl_Glittergold                    133          600          500          400          1350          5          false

Time to fight, Garl_Glittergold
Below are your options:
1. Attack
2. Change Weapon
3. Change Armor
4. Cast Spell
5. Use Potion
6. Quit Game
4
Spell list is as follows 👇
----------------------------------------------------------------------------------------------
Name                    Type          Price          Level          Damage          Mana Cost
----------------------------------------------------------------------------------------------
Ice_Blade                    Ice          250          1          450          100

Enter the # of spell which you wish to equip: 1
You have utilized Spell Ice_Blade
Hero Garl_Glittergold has dodged the attack from monster.
Current Round commencing: 5
Monster info is as follows 👇
-----------------------------------------------------------------------------------------------------------------------------------
No.          Type          Name                    Level          Damage          Defense          Dodge Chance          Condition
-----------------------------------------------------------------------------------------------------------------------------------
1          Dragon          Desghidorrah                    3          30          400          35.0          false

Hero info is as follows 👇
--------------------------------------------------------------------------------------------------------------------------------------------------------------------
No.          Type          Name                    Mana          Strength          Agility          Dexterity          Money          Experience          Condition
--------------------------------------------------------------------------------------------------------------------------------------------------------------------
1          Paladin          Garl_Glittergold                    36          600          500          400          1350          5          false

Time to fight, Garl_Glittergold
Below are your options:
1. Attack
2. Change Weapon
3. Change Armor
4. Cast Spell
5. Use Potion
6. Quit Game
1
Hero Garl_Glittergold caused 3 damage to Monster Desghidorrah!
Hero Garl_Glittergold has dodged the attack from monster.
Current Round commencing: 6
Monster info is as follows 👇
-----------------------------------------------------------------------------------------------------------------------------------
No.          Type          Name                    Level          Damage          Defense          Dodge Chance          Condition
-----------------------------------------------------------------------------------------------------------------------------------
1          Dragon          Desghidorrah                    3          30          400          35.0          false

Hero info is as follows 👇
--------------------------------------------------------------------------------------------------------------------------------------------------------------------
No.          Type          Name                    Mana          Strength          Agility          Dexterity          Money          Experience          Condition
--------------------------------------------------------------------------------------------------------------------------------------------------------------------
1          Paladin          Garl_Glittergold                    39          600          500          400          1350          5          false

Time to fight, Garl_Glittergold
Below are your options:
1. Attack
2. Change Weapon
3. Change Armor
4. Cast Spell
5. Use Potion
6. Quit Game
5
Potion list is as follows 👇
-----------------------------------------------------------------------------------------------------
Name                    Price          Level          Attribute Increase          Attribute Affected
-----------------------------------------------------------------------------------------------------
Healing_Potion                    250          1          100          Health

Enter the # of potion which you wish to equip: 1
You have utilized Potion Healing_Potion
Hero Garl_Glittergold has dodged the attack from monster.
Current Round commencing: 7
Monster info is as follows 👇
-----------------------------------------------------------------------------------------------------------------------------------
No.          Type          Name                    Level          Damage          Defense          Dodge Chance          Condition
-----------------------------------------------------------------------------------------------------------------------------------
1          Dragon          Desghidorrah                    3          30          400          35.0          false

Hero info is as follows 👇
--------------------------------------------------------------------------------------------------------------------------------------------------------------------
No.          Type          Name                    Mana          Strength          Agility          Dexterity          Money          Experience          Condition
--------------------------------------------------------------------------------------------------------------------------------------------------------------------
1          Paladin          Garl_Glittergold                    42          600          500          400          1350          5          false

Time to fight, Garl_Glittergold
Below are your options:
1. Attack
2. Change Weapon
3. Change Armor
4. Cast Spell
5. Use Potion
6. Quit Game
1
Hero Garl_Glittergold caused 3 damage to Monster Desghidorrah!
Hero Garl_Glittergold has dodged the attack from monster.
Current Round commencing: 8
Monster info is as follows 👇
-----------------------------------------------------------------------------------------------------------------------------------
No.          Type          Name                    Level          Damage          Defense          Dodge Chance          Condition
-----------------------------------------------------------------------------------------------------------------------------------
1          Dragon          Desghidorrah                    3          30          400          35.0          false

Hero info is as follows 👇
--------------------------------------------------------------------------------------------------------------------------------------------------------------------
No.          Type          Name                    Mana          Strength          Agility          Dexterity          Money          Experience          Condition
--------------------------------------------------------------------------------------------------------------------------------------------------------------------
1          Paladin          Garl_Glittergold                    46          600          500          400          1350          5          false

Time to fight, Garl_Glittergold
Below are your options:
1. Attack
2. Change Weapon
3. Change Armor
4. Cast Spell
5. Use Potion
6. Quit Game
6
Leaving too soon? We will wait for you :) See you again!