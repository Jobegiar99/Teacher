import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class Teacher{

    public static void gunFiresNoBullet(){
        System.out.println(
        "\n\nRRRRRRRRRRRRRRRRRRRRRRRRRRRR  /    \n"+
        "RRRRRRRRRRRRRRRRRRRRRRRRRRRR  -   \n"+
        "RRRRRRRRRRRRRRRRRRRRRRRR      -\n"+
        "RRRRRRRRRRRRRRRRRRRR          \\\n"+
        "RRRRRR     /|\n"+
        "RRRRRR    / |\n"+
        "RRRRRR__ /__|\n"+
        "RRRR\n"+
        "RRRR\n"+
        "RRRR");
    }
    public static void gunFiresBullet(){
        System.out.print( 
        "\n\nRRRRRRRRRRRRRRRRRRRRRRRRRRRR      -------------------       __________\n"+
        "RRRRRRRRRRRRRRRRRRRRRRRRRRRR      ------------             (          |  \n"+
        "RRRRRRRRRRRRRRRRRRRRRRRR          ---------------          (__________|  \n"+
        "RRRRRRRRRRRRRRRRRRRR              ----------------\n"+
        "RRRRRR     /|\n"+
        "RRRRRR    / |\n"+
        "RRRRRR__ /__|\n"+
        "RRRR\n"+
        "RRRR\n"+
        "RRRR\n");
    }

    public static void hangMan1(){
        System.out.println(
         "   __________"+
        "\n  |         |"+
        "\n  |         |"+
        "\n  |         "+
        "\n  |          "+
        "\n  |          "+
        "\n _|_         ");
    }
    public static void hangMan2(){
        System.out.println(
         "   __________"+
        "\n  |         |"+
        "\n  |         |"+
        "\n  |         O"+
        "\n  |          "+
        "\n  |          "+
        "\n _|_         ");
    }
    public static void hangMan3(){
        System.out.println(
         "   __________"+
        "\n  |         |"+
        "\n  |         |"+
        "\n  |         O/"+
        "\n  |          "+
        "\n  |          "+
        "\n _|_         ");
    }
    public static void hangMan4(){
        System.out.println(
         "   __________"+
        "\n  |         |"+
        "\n  |         |"+
        "\n  |        \\O/"+
        "\n  |          "+
        "\n  |          "+
        "\n _|_         ");
    }
    public static void hangMan5(){
        System.out.println(
         "   __________"+
        "\n  |         |"+
        "\n  |         |"+
        "\n  |        \\O/"+
        "\n  |         |"+
        "\n  |          "+
        "\n _|_         ");
    }
    public static void hangMan6(){
        System.out.println(
         "   __________"+
        "\n  |         |"+
        "\n  |         |"+
        "\n  |        \\O/"+
        "\n  |         | "+
        "\n  |          \\"+
        "\n _|_         ");
    }
    public static void hangMan7(){
        System.out.println(
         "   __________"+
        "\n  |         |"+
        "\n  |         |"+
        "\n  |        \\O/"+
        "\n  |         | "+
        "\n  |        / \\ "+
        "\n _|_         ");
    }
    public static void youWon(){
      System.out.println(
       "\n_____.___.                                  ._._._."+
       "\n\\__ |   | ____  __ __  __  _  ______   ____| | | |"+
       "\n/   |   |/  _ \\|  |  \\ \\ \\/ \\/ /  _ \\ /    \\ | | |" +
       "\n\\____   (  <_> )  |  /  \\     (  <_> )   |  \\|\\|\\|"+
        "\n/ ______|\\____/|____/    \\/\\_/ \\____/|___|  /|_|_|"+
         "\n\\/                                        \\/\\/\\/\\/");
    }

    public static void youLost(){
        System.out.println(
        "  _____.___.              .__                  __  ._._._.      ___   \n "+
        "\\__  |   | ____  __ __  |  |   ____  _______/  |_| | | |  /\\  \\  \\  \n "+
        " /   |   |/  _ \\|  |  \\ |  |  /  _ \\/  ___/\\   __\\ | | |  \\/   \\  \\  \n"+
        "  \\____   (  <_> )  |  / |  |_(  <_> )___ \\  |  |  \\|\\|\\|  /\\    )  )  \n"+
        "  / ______|\\____/|____/  |____/\\____/____  > |__|  ______  \\/   /  /   \n"+
        "  \\/                                     \\/        \\/\\/\\/      /__/   \n");
    }
    public static void rock(){
        System.out.println(
            "    _______"+
           "\n---   ____)"+
            "\n     (_____)"+
            "\n     (_____)"+
            "\n     (____)"+
            "\n---.__(___)");
    }

    public static void paper(){
        System.out.println(    
            "     _______\n"+
            " ---    ____)____"+
            "\n           ______)"+
            "\n         _______)"+
            "\n        _______)"+
            "\n---.__________)");
    }

    public static void scissor(){
        System.out.println(
       "    _______\n"+
       "---    ____)____\n"+
       "          ______)\n"+
       "       __________)\n"+
       "      (____)\n"+
       "---.__(___)");
    }

    //All of the above are methods containing graphics used in various minigames.
    
    /**
     * This method lets the user choose a modality.
     * @param input Lets the user write.
     * @param modality stores the modality that will be chosen.
     * @return the modality.
     */    
    public static String changeModality(Scanner input){
        String modality;
        System.out.println("\nAvailable options in the current version are:\n"+
                           "(1) Flashcards (Practice with your questions and answers!)\n"+
                           "(2) Number mania (Practice your mathemathical abilities!\n"+
                           "(3) Russian Roulette (Answer as much questions as you can before you die!)\n"+
                           "(4) Hangman (Guess which letters form the answer for a given questions!)\n"+
                           "(5) Roch, Paper or Scissor (Try to beat the I.A. to get as much lives you can to answer a question!)\n"+
                           "(6) Create a new set of questions\n"+
                           "Exit (exit)\n"
                           +"Enter the number of the mini game you wish to load, or write \"exit\" to leave Teacher.app");
        modality=input.nextLine();
        while(true){
            switch(modality){
                case "1":case "2":case "3":case "4": case "5": case "6": case "exit":
                return modality;
                default:
                    System.out.println("Write a valid option");
                    modality=input.nextLine();
            }
        }
    }


    /**
     * This method initializes flashcard game with current set. The user decides the number of questions.
     * @param input Let's the user write.
     * @param questions This array contains all the questions created by the user.
     * @param answers This array contains all the answers for the questions the user has written.
     * @param length Contains the length of the arrays.
     * @param modality This 
     */ 
    public static void learnWithFlaschcards(Scanner input,String modality,Questions thisSession){
        Random rand=new Random();
        int randomNumber=rand.nextInt(thisSession.getLength());
        String answer;
        short forLength;
        String decision;
        boolean isPlaying=false;
        System.out.println(" _______________________________________\n"+
                           "|              FLASHCARDS              |\n"+
                           "|                 Game                 |\n"+
                           "|                Begins                |\n"+
                           "|______________________________________|");

            System.out.println("How many questions would you like your teacher to do?");
            forLength=input.nextShort();
            
            System.out.println("Okay. Lets start!\nRemember your answer has to be written exactly as you wrote it when you created your question set(upper and lower case won't affect the answer) .");
            System.out.println(thisSession.getQuestion(randomNumber));
            input.nextLine();
            for (int i=0;i<forLength;i++){
                if (i!=0){
                    System.out.println(thisSession.getQuestion(randomNumber));
                }
                answer=input.nextLine();
                if (answer.equals(thisSession.getAnswer(randomNumber))){ 
                    System.out.println("That's the answer!");
                }else {
                    System.out.println("Wrong. The answer is: " + thisSession.getAnswer(randomNumber)); //agregar la devolucion de la respuesta.;
                }
                randomNumber=rand.nextInt(thisSession.getLength());
            }
        System.out.println("Thanks for playing! Returning to main menu...");

    }
    /**
    *This method chooses how hard Number Mania is going to be. Thus allowing the player to practice with smaller or bigger numbers.
    *@param Input Allows the player to write input.
    */
    public static void numberManiaDifficulty(Scanner input){
        Random rand= new Random();
        byte difficulty=0;
        String userInput;
        boolean difficultyHasBeenChosen=false;
            System.out.println("Easy from number 1 to 1000. (1)\nMedium from number 1 to 5000 (2)\nHard from number 1 to 10000 (3)");
            do{
                userInput=input.nextLine();
                switch(userInput){
                    case "1":
                            difficulty=1;
                            difficultyHasBeenChosen=true;
                            break;
                    case "2":
                            difficulty=2;
                            difficultyHasBeenChosen=true;
                            break;
                    case "3":
                            difficulty=3;
                            difficultyHasBeenChosen=true;
                            break;
                    default:
                            System.out.println("Please write a valid option");
                }
                
            }while (difficultyHasBeenChosen==false);
            numberManiaGame(input, difficulty);
    }

    /**
     * This method is Number Mania gameplay.
     * @param input Allows the user to write input.
     * @param difficulty Allows the program to choose number limit.
     */
    public static void numberManiaGame(Scanner input, byte difficulty){
        Random rand=new Random();
        int numberLimit=0,operation,number1,number2,total=0,userNumber;
        boolean isTheNumber=false;
            System.out.println("How many numbers would you like to guess? Maximum amount of questions allowed in this version are 128");
            byte amountOfQuestions=input.nextByte();
            switch (difficulty){
                case 1:
                        numberLimit=1000;
                        break;
                case 2: 
                        numberLimit=5000;
                        break;
                case 3:
                        numberLimit=10000;
                        break;
            }
            System.out.println("Great, let's start our game.");
            for(int i=0;i<amountOfQuestions;i++){
                operation=rand.nextInt(2)-0;
                switch(operation){
                    case 0:
                            number1=rand.nextInt((numberLimit/2));
                            number2=rand.nextInt((numberLimit/2));
                            total=(number1+number2);
                                System.out.println("Which number + " + number1 + " gives you " + total);
                                userNumber=input.nextInt();
                                do{ 
                                    if (userNumber==number2){
                                        System.out.println("Congratulations, that is the number.");
                                        isTheNumber=true;
                                    }else{
                                        System.out.println("That is not the number. Please write another number");
                                        userNumber=input.nextInt();
                                    }
                                }while (isTheNumber==false);
                                isTheNumber=false;
                                break;
                    case 1:
                            number1=rand.nextInt((numberLimit/2));
                            number2=rand.nextInt((numberLimit/2));
                            total=(number1-number2);
                                System.out.println("Which number - " + number1 + " gives you " + total);
                                userNumber=input.nextInt();
                                do{ 
                                    if (userNumber==number2){
                                        System.out.println("Congratulations, that is the number.");
                                        isTheNumber=true;
                                    }else{
                                        System.out.println("That is not the number. Please write another number");
                                        userNumber=input.nextInt();
                                    }
                                }while (isTheNumber==false);
                                isTheNumber=false;
                                break;
                }
            }

            System.out.println("Thanks for playing! Returning to main menu...");
            
    }

    /**
     * This method is Russian Roulette game.
     * @param input Allows the user to write his or her input.
     * @param thisSession Allows russianRoulette to access Questions class methods.
     */
    public static void russianRoulette(Scanner input,Questions thisSession){
        boolean isAlive=true;
        Random rand=new Random();
        int randomNumber,score=0;
        byte numberOfWeaponSlots=6,bullet,weaponFire;
        String userAnswer;
            System.out.println("Welcome to russian roulette, the game where you need to see how long can you survive."+
                           "\nA random question from the ones you created will be shown on screen.\nYou need to write your answer.\n"+
                           "If your answer is wrong, the gun will fire, and if the bullet comes out, you will lose.\nLet's Begin!");
            
            randomNumber=rand.nextInt(thisSession.getLength());               
            do{
                System.out.println(thisSession.getQuestion(randomNumber));
                userAnswer=input.nextLine();
                userAnswer=userAnswer.toLowerCase();
                    if (userAnswer.equals(thisSession.getAnswer(randomNumber))){
                        randomNumber=rand.nextInt(thisSession.getLength());
                        System.out.println("That's the answer!");
                        numberOfWeaponSlots=6;
                        score++;
                    }else{
                        System.out.println("Wrong answer.");
                        bullet=(byte) rand.nextInt(numberOfWeaponSlots);
                        weaponFire=(byte) rand.nextInt(numberOfWeaponSlots);
                        if (bullet==weaponFire){
                            gunFiresBullet();
                            System.out.println("Game over");
                            isAlive=false;
                        }else{
                            gunFiresNoBullet();
                            numberOfWeaponSlots--;
                            System.out.println("Try again");
                        }

                    }

            }while (isAlive);
            System.out.println("Final score: " + score+"\nThanks for playing! Returning to main menu...");
    }

    /**
     * This method is Hang man Game.
     * @param input Allows the user to write his or her input.
     * @param thisSession Allows hangMan to access Questions class methods.
     */
    public static void hangMan(Scanner input, Questions thisSession){
        hangMan1();
        Random rand=new Random();
        int randomNumber=rand.nextInt(thisSession.getLength());
        String userInput;
        byte lives=6,givenLetterscontrol=0;
        boolean letterIsInAnswer=false,playerWon=false;
            System.out.println("Welcome. Please type just one letter and press enter. You have 5 lives to guess the sentence. The questions is:\n"+
                            thisSession.getQuestion(randomNumber));
            String answerSentence=(thisSession.getAnswer(randomNumber));
            String[] sentence=new String[answerSentence.length()];
            String [] lowDiagonal=new String[answerSentence.length()], givenLetter=new String[lives];
            sentence=answerSentence.split("");
            for (int i=0;i<sentence.length;i++){
                if (sentence[i].equals(" ")){
                    lowDiagonal[i]=" ";
                }else{ 
                    lowDiagonal[i]="_";
                }
                System.out.print(lowDiagonal[i]+ " ");
            }
            do{
                System.out.println("\nWrite a letter and press enter to send the letter");
                userInput=input.nextLine();
                userInput=userInput.toLowerCase();
                letterIsInAnswer=false;
                    if (givenLetterscontrol>0){ //checks if user input has already been given.
                        for (int i=0;i<6;i++){
                            if (givenLetter[i].equals(userInput)){
                                do{
                                    System.out.println("That letter has already been given. Please write another one.");
                                    userInput=input.nextLine();
                                }while (givenLetter[i].equals(userInput));
                            }
                        }
                    }
                    givenLetter[givenLetterscontrol]=userInput;
                    for (int i=0;i<sentence.length;i++){ //checks if the letter is in the answer.
                        if (sentence[i].equals(userInput)){
                            letterIsInAnswer=true;
                            lowDiagonal[i]=userInput;
                        }
                    }
                    if (letterIsInAnswer==false){ //If letter was not in the answer, a life is lost.
                        lives--;
                        switch(lives){
                            case 5:
                                    hangMan2();
                                    break;
                            case 4:
                                    hangMan3();
                                    break;
                            case 3:
                                    hangMan4();
                                    break;  
                            case 2:
                                    hangMan5();
                                    break;
                            case 1:
                                    hangMan6();
                                    break;
                            case 0:
                                    hangMan7();
                                    youLost();
                                    lives=-1;
                                    break;
                        }
                        System.out.println("That letter is not in the answer.");
                    }
                    if (letterIsInAnswer){
                        if (Arrays.equals(lowDiagonal,sentence)){
                                playerWon=true;
                                for (int i=0;i<sentence.length;i++){ 
                                    System.out.print(lowDiagonal[i]+ " ");
                                }   
                                youWon();
                        }else{
                            for (int i=0;i<sentence.length;i++){ 
                            System.out.print(lowDiagonal[i]+ " ");
                            }   
                        }
                    }

            }while (lives>=0 && playerWon==false);
            System.out.println("Thanks for playing! Returning to main menu...");
    }

    /**
     * This method is Rock, Paper Scissors Game.
     * @param input Allows the user to write his or her input.
     * @param thisSession Allows rPS to access Questions class methods.
     */
    public static void rPS(Scanner input, Questions thisSession){
        String userInput=""; 
        boolean playerLost=false;
        Random rand=new Random(); 
        byte action,enemy,lives=0;
        int randomNumber=rand.nextInt(thisSession.getLength());  
            System.out.println("You will fight against the machine choosing rock, paper or scissors five times.The amount of times you win against the IA are going to be"+
                            " the amount of opportunities you will have to answer the question. "+
                           "Your enemy in this rock paper scissor round is the question: " + thisSession.getQuestion(randomNumber)+ " \nMake your first move");
            for (int i=0;i<5;i++){
                action=(byte) rPSChoose(input, userInput);
                enemy=(byte) ((byte) rand.nextInt(3-1)+1);
                switch (action){
                    case 1://rock
                            switch(enemy){ 
                            case 1:
                                rock();
                                System.out.println("Tie, try again.");
                                i--;
                                break;
                            case 2:
                                paper();
                                System.out.println("You lost! Enemy chosed paper.");
                                break;
                            case 3:
                                scissor();
                                System.out.println("You win! Enemy chosed scissor");
                                lives++;
                                break;
                            }
                            break;
                    case 2://paper
                            switch(enemy){ 
                                case 2:
                                    paper();
                                    System.out.println("Tie, try again.");
                                    i--;
                                    break;
                                case 3:
                                    scissor();
                                    System.out.println("You lost! Enemy chosed Scissor.");
                                    break;
                                case 1:
                                    rock();
                                    System.out.println("You win! Enemy chosed rock.");
                                    lives++;
                                    break;
                            }
                            break;
                    case 3://scissor
                            switch(enemy){ 
                                case 3:
                                    scissor();
                                    System.out.println("Tie, try again.");
                                    i--;
                                    break;
                                case 1:
                                    rock();
                                    System.out.println("You lost!Enemy chosed rock.");
                                    break;
                                case 2:
                                    paper();
                                    System.out.println("You win! Enemy chosed paper");
                                    lives++;
                                    break;
                            }
                }
            }

            System.out.println("It's now your turn to write the answer for the question, remember that you have " + lives + " lives!");
            while (lives>0){
                userInput=input.nextLine();
                if (userInput.equals(thisSession.getAnswer(randomNumber))){
                    youWon();
                    lives=0;
                }else {
                    System.out.println("Wrong answer");
                    lives--;
                    if (lives==0){
                        youLost();
                    }
                }
            }

            System.out.println("Thanks for playing. Returning to main menu");

    }

    /**
     * This method is rPS Input, in which the user decides to use rock, paper or scissor.
     * @param input Allows the user to write his or her input.
     * @param userInput Allows rPSChoose to access Questions class methods.
     * @return returns user decission.
     */
    public static byte rPSChoose(Scanner input, String userInput){
        System.out.println("1-Rock\n2-Paper\n3-Scissor");
        do{ 
            userInput=input.nextLine();
            switch(userInput){
                case "1": 
                         rock();
                         return 1;
                case "2": 
                         paper();
                         return 2;
                case "3":   
                         scissor();
                         return 3;
                default:
                        System.out.println("Type a valid option");

            }
        }while (true);
        
    }

    /**
     * Hi, this is the main method :D.
     * @param args
     */
    public static void main(String[] args){
         
        Scanner input=new Scanner(System.in);
        String modality,decision;
        short length=0;
        Questions thisSession=new Questions();
            System.out.println("\nWelcome. This program is your personal teacher.\nEach time you need to study for any subject, your teacher will help you."
                              +"\nTo start you need to create your question set.");
            thisSession.createQuestions(input);

            do{ 
                modality=changeModality(input);
                switch(modality){
                    
                    case "1":
                                System.out.println("Flaschard initializing...");
                                System.out.println("\nWelcome to Flashcards!" );
                                learnWithFlaschcards(input, modality, thisSession);
                                break;
                    case "2":
                                System.out.println("Number mania initializing..."+
                                                   "\nWelcome to Number Mania!");
                                numberManiaDifficulty(input);
                                break;
                    case "3":
                                System.out.println("Russian roulette initializing..."+
                                                   "\nWelcome to Russian Roulette!");
                                russianRoulette(input, thisSession);
                                break;
                    case "4":
                                System.out.println("Hangman Initializing..."+
                                                   "\nWelcome to Hangman!");
                                hangMan(input, thisSession);
                                break;
                    case "5":
                                System.out.println("Rock, Paper, Scissor Initializing..."+
                                                    "\nWelcome to R.P.S!");
                                rPS(input, thisSession);
                                break;
                    case "6":
                                thisSession.createQuestions(input);
                                break;
                    case "exit":
                                System.out.println("Closing all current processes...\n"+
                                                   "Closing scanner...");
                                input.close();
                                System.exit(400);
                                break;
                    default:
                            System.out.println("Ingrese una opcion valida");
                            input.next();
                }
            }while (modality!="exit");
        
    }
}

//Agregar: Ahorcado, ruleta rusa con susticiones,piedra papel y tijera.
