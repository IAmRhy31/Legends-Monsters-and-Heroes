import java.util.*;

public class LMH { //main class for our game -> Legends: Monsters and Heroes (LMH)

    private ArrayList<Hero> heroes;
    private GameUniverse world;
    private HeroData player;
    private Market market;
    private double fight_probability;
    private Battle battle;

    LMH() {
        this.heroes = new ArrayList<>();
        this.world = new GameUniverse(8);
        this.player = new HeroData();
        this.market = new Market();
        this.fight_probability = 0.3; //probability to face the monsters in the common space
        this.battle = new Battle(heroes);
    }

    public void begin() {

        System.out.println("---------------------------------------------------");
        System.out.println("   WELCOME TO --> LEGENDS: MONSTERS AND HEROES   ");
        System.out.println("---------------------------------------------------");
        System.out.println("In this universe, the heroes (1-3) will battle various monsters and to get an edge over monsters, heroes can:");
        System.out.print("1) Access the Market to buy Weapons, Spells, Armory or Potions.\n2) The Hero(es) initially don't have any weapon, armor, etc. If you want to equip them (recommended), go to the market space and buy it.\n3) Will roam the universe where they can reach an: a) Inaccessible Space, b) Market Space, or c) ready for it? Common Space!\n");
        System.out.println("Common Space a.k.a. BATTLE SPACE - where MONSTERS with various levels will attack the HEROES randomly.");
        System.out.println("Remember the basic controls to move around the universe:");
        System.out.println("W/w: Move Up         A/a: Move Left         S/s: Move Down         D/d: Move Right");
        System.out.println("Some extra controls -> I/i: Show Information         Q/q: Quit Game");
        System.out.println("READY FOR THE JOURNEY? SURE YOU ARE. HERE WE GO!");
        System.out.println("---------------------------------------------------------------------------------------");

        int hero_counter;
        Scanner scan = new Scanner(System.in);

        while (true) {

            System.out.println("Please enter the number of heroes (1 to 3): ");
            String input = scan.nextLine();

            if (input.equalsIgnoreCase("Q")) { //for quitting the game
                System.out.println("Leaving too soon? We will wait for you :) See you again!");
                System.exit(0);
            }

            try {
                hero_counter = Integer.parseInt(input);
            }
            catch (NumberFormatException e) {
                System.out.println(input + " is a string and not a valid integer (1 to 3).");
                continue;
            }

            if (hero_counter < 1 || hero_counter > 3) {
                System.out.println("Sorry, this is an invalid input! Select an integer from 1 to 3");
                continue;
            }
            break;

        }

        System.out.println("You have " + hero_counter + " hero(es) in your team!");

        System.out.println();

        System.out.println("Here is the list of heroes you can select: ");
        player.printListOfHeroes();

        int team_counter = 0;

        for (int i = 0; i < hero_counter; i++) {

            while (true) {

                System.out.println("Enter the # of heroes you want to select (1 to 18): ");
                String input = scan.nextLine();

                if (input.equalsIgnoreCase("Q")) {
                    System.out.println("Leaving too soon? We will wait for you :) See you again!");
                    System.exit(0);
                }

                try {
                    team_counter = Integer.parseInt(input);
                }
                catch (NumberFormatException e) {
                    System.out.println(input + " is a string and not a valid integer (1 to 18).");
                    continue;
                }

                if (team_counter > 18 || team_counter < 1) {
                    System.out.println("Sorry, this is an invalid input! Select an integer from 1 to 18.");
                    continue;
                }
                heroes.add(player.getHeroes().get(team_counter - 1));
                break;

            }

        }

        System.out.println();

        displayHeroInfo(heroes);

        System.out.println();

        world.gameUniverse();

        System.out.println("THE UNIVERSE IS IN FRONT OF YOU. JOURNEY BEGINS! GOOD LUCK ⚔️");
        System.out.println("I = Inaccessible Space, M = Market Space, H = Hero(s) Team, and the blank spaces are Common Spaces where battle with monster can randomly occur.");

        world.printGameUniverse();

        System.out.println();

        while (true) {

            String choice;
            System.out.println("I/i: Show Information         Q/q: Quit Game");
            System.out.println("M/m: Move");
            choice = scan.nextLine();

            if (choice.equals("q") || choice.equals("Q")) {
                System.out.println("Leaving too soon? We will wait for you :) See you again!");
                System.exit(0);
            }

            else if (choice.equals("i") || choice.equals("I")) {
                displayHeroInfo(heroes);
            }

            else if (choice.equals("m") || choice.equals("M")) {
                int movement;
                movement = move();

                if (movement == 0) {
                    move();
                }

                else if (movement == 2) {
                    for (Hero h: heroes) {
                        market.enterMarket(h);
                    }
                }

                else if (movement == 3) {
                    battle.init();
                }
            }

            else {
                System.out.println("Incorrect input! Try again.");
            }

        }

    }

    public void displayHeroInfo(ArrayList<Hero> hero) {

        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("No.          Type          Name                    Mana          Strength          Agility          Dexterity          Money          Experience          Condition");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        int i = 0;

        for (Hero h : hero) {
            System.out.println((++i) + "          " + h.getType() + "          " + h.getName() + "                    " + h.getMana() + "          " + h.getStrength() + "          " + h.getAgility() + "          " + h.getDexterity() + "          " + h.getMoney() + "          " + h.getExperience() + "          " + h.getFainted());
            System.out.println();
        }

    }

    public int move() {

        String move_choice;
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int movement = 0;
        System.out.println("W/w: Move Up         A/a: Move Left         S/s: Move Down         D/d: Move Right");
        world.printGameUniverse();
        move_choice = scan.nextLine();

        if (move_choice.equals("w") || move_choice.equals("W")) {
            int x = world.getX(); int y = world.getY();
            if (x == 0) {
                System.out.println("Uh Oh! Dead end. Make a new move please.");
            }
            else {
                if (world.board[x - 1][y].getType() == 'I') {
                    System.out.println("You cannot enter Inaccessible Space. Next move please.");
                }
                else if (world.board[x - 1][y].getType() == 'M') {
                    world.board[x][y].setContent(' ');
                    world.board[x - 1][y].setContent('H');
                    world.setX(x - 1);

                    movement = 2;
                }
                else if (world.board[x - 1][y].getType() == ' ') {
                    world.board[x][y].setContent(' ');
                    world.board[x - 1][y].setContent('H');
                    world.setX(x - 1);

                    if (random.nextInt(10) < (int)(fight_probability * 10)) {
                        movement = 3;
                    }
                    else {
                        movement = -1;
                    }
                }
            }
        }

        else if (move_choice.equals("s") || move_choice.equals("S")) {
            int sx = world.getX(); int sy = world.getY();
            if ((world.getSizeOfBoard() - 1) != sx) {
                if (world.board[sx + 1][sy].getType() == 'I') {
                    System.out.println("You cannot enter Inaccessible Space. Next move please.");
                }
                else if (world.board[sx + 1][sy].getType() == 'M') {
                    world.board[sx][sy].setContent(' ');
                    world.board[sx + 1][sy].setContent('H');
                    world.setX(sx + 1);

                    movement = 2;
                }
                else if (world.board[sx + 1][sy].getType() == ' ') {
                    world.board[sx][sy].setContent(' ');
                    world.board[sx + 1][sy].setContent('H');
                    world.setX(sx + 1);

                    if (random.nextInt(10) < (int)(fight_probability * 10)) {
                        movement = 3;
                    }
                    else {
                        movement = -1;
                    }
                }
            }
            else {
                System.out.println("Uh Oh! Dead end. Make a new move please.");
            }
        }

        else if (move_choice.equals("a") || move_choice.equals("A")) {
            int ax = world.getX(); int ay = world.getY();
            if (ay == 0) {
                System.out.println("Uh Oh! Dead end. Make a new move please.");
            }
            else {
                if (world.board[ax][ay - 1].getType() == 'I') {
                    System.out.println("You cannot enter Inaccessible Space. Next move please.");
                }
                else if (world.board[ax][ay - 1].getType() == 'M') {
                    world.board[ax][ay].setContent(' ');
                    world.board[ax][ay - 1].setContent('H');
                    world.setY(ay - 1);

                    movement = 2;
                }
                else if (world.board[ax][ay - 1].getType() == ' ') {
                    world.board[ax][ay].setContent(' ');
                    world.board[ax][ay - 1].setContent('H');
                    world.setY(ay - 1);

                    if (random.nextInt(10) < (int)(fight_probability * 10)) {
                        movement = 3;
                    }
                    else {
                        movement = -1;
                    }
                }
            }
        }

        else if (move_choice.equals("d") || move_choice.equals("D")) {
            int dx = world.getX(); int dy = world.getY();
            if ((world.getSizeOfBoard() - 1) != dy) {
                if (world.board[dx][dy + 1].getType() == 'I') {
                    System.out.println("You cannot enter Inaccessible Space. Next move please.");
                }
                else if (world.board[dx][dy + 1].getType() == 'M') {
                    world.board[dx][dy].setContent(' ');
                    world.board[dx][dy + 1].setContent('H');
                    world.setY(dy + 1);

                    movement = 2;
                }
                else if (world.board[dx][dy + 1].getType() == ' ') {
                    world.board[dx][dy].setContent(' ');
                    world.board[dx][dy + 1].setContent('H');
                    world.setY(dy + 1);

                    if (random.nextInt(10) < (int)(fight_probability * 10)) {
                        movement = 3;
                    }
                    else {
                        movement = -1;
                    }
                }
            }
            else {
                System.out.println("Uh Oh! Dead end. Make a new move please.");
            }
        }

        return movement;

    }

}