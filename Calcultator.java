import javax.swing.JOptionPane;

public class Calcultator {
    public Calcultator(){
        String mainMenu = "Main Menu\n\n0: Exit\n1: Addition\n2: Sutraction\n3: Multiply\n4: Division";
        String menuSelection = "";
        menuSelection = JOptionPane.showInputDialog(null, mainMenu + "\n\nEnter the operator here:");

        String firstNum = "";
        String secondNum = "";

        

        

        

        if(!isNumber(menuSelection)){
            JOptionPane.showMessageDialog(null, menuSelection + " is not a number");
        }

        for(int i = 5; i < 10; i++){
            if(Integer.parseInt(menuSelection) == i){
                JOptionPane.showMessageDialog(null, i + " is not a valid number");
            }

            if(Integer.parseInt(menuSelection) == 0){
                System.exit(0);
            }

            if(Integer.parseInt(menuSelection) == 1){
                int answer;

                firstNum = JOptionPane.showInputDialog(null, "Enter the first number:");
                secondNum = JOptionPane.showInputDialog(null, "Enter the second number:");

                answer = add(Integer.parseInt(firstNum), Integer.parseInt(secondNum));
                JOptionPane.showMessageDialog(null, "The answer is: " + answer);

                System.exit(0);
            }

            if(Integer.parseInt(menuSelection) == 2){
                int answer;
                
                firstNum = JOptionPane.showInputDialog(null, "Enter the first number:");
                secondNum = JOptionPane.showInputDialog(null, "Enter the second number:");

                answer = subtract(Integer.parseInt(firstNum), Integer.parseInt(secondNum));
                JOptionPane.showMessageDialog(null, "The answer is: " + answer);

                System.exit(0);
            }

            if(Integer.parseInt(menuSelection) == 3){
                int answer;
                
                firstNum = JOptionPane.showInputDialog(null, "Enter the first number:");
                secondNum = JOptionPane.showInputDialog(null, "Enter the second number:");

                answer = multiply(Integer.parseInt(firstNum), Integer.parseInt(secondNum));
                JOptionPane.showMessageDialog(null, "The answer is: " + answer);

                System.exit(0);
            }

            if(Integer.parseInt(menuSelection) == 1){
                double answer;

                firstNum = JOptionPane.showInputDialog(null, "Enter the first number:");
                secondNum = JOptionPane.showInputDialog(null, "Enter the second number:");

                answer = divide(Integer.parseInt(firstNum), Integer.parseInt(secondNum));
                JOptionPane.showMessageDialog(null, "The answer is: " + answer);

                System.exit(0);
            }

            
        }
    }

    public int add(int a, int b){
        return a + b;
    }

    public int subtract(int a, int b){
        return a - b;
    }

    public int multiply(int a, int b){
        return a * b;
    }

    public double divide(int a, int b){
        return a / b;
    }



    public boolean isNumber(String s)
    {
        for (int i = 0; i < s.length(); i++)
            if (Character.isDigit(s.charAt(i)) == false)
                return false;
 
        return true;
    }
}
