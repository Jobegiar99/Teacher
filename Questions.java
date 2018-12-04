import java.util.Scanner;
public class Questions{

    private String[] questions=new String[10];
    private String[] answers=new String[10];
    private short len;

    /**
     * This method creates the set of questions and answers.
     * @param Input Allows the user to write in this method.
     */
    public void createQuestions(Scanner input){
        System.out.println("Please type the amount of questions you wish to create.\nIn this version the maximum amount of questions you can create is: 10");
        String numberOfQuestions=input.nextLine();
        boolean isValid=false;
        do{
            switch(numberOfQuestions){
                case "0": case "1": case "2" : case "3": case "4": case "5": case "6": case "7": case "8": case "9": case "10": 
                    this.len=Short.parseShort(numberOfQuestions);
                    isValid=true;
                    System.out.println("Thanks");
                    break;
                default:
                        System.out.println("Please, write a valid amount of questions.");
                        numberOfQuestions=input.nextLine();

            }
        }while(isValid!=true);

        for (int i=0;i<this.len;i++){
            System.out.println("Please write question number " + (i+1));
            this.questions[i]=input.nextLine();
            this.questions[i]=this.questions[i].toLowerCase();
            System.out.println("Please write the answer for question number " + (i+1));
            this.answers[i]=input.nextLine();
            this.answers[i]=this.answers[i].toLowerCase();
        }

        System.out.println("Thanks for writing your questions and answer.Please, choose a game mode.");

    }

    /**
     * This method allows other classes to access len variable.
     * @return
     */
    public short getLength(){
        return this.len;
    }

    /**
     * This method allows other classes to access questions array.
     * @param randomNumber
     * @return
     */
    public String getQuestion(int randomNumber){
        return this.questions[randomNumber];
    }

    /**
     * This method allows other classes to access answers array.
     * @param randomNumber
     * @return
     */
    public String getAnswer(int randomNumber){
        return this.answers[randomNumber];
    }

    

}