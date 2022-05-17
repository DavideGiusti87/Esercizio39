/*
If Statement 02
Exercise: If Statement 2

define a variable called mySurname and assign your surname to it
using the ternary operator, determine if your surname contains the sequence of letters ni
print the result in this way: Your surname [contains|doesn't contain] the sequence of letters 'ni'
 */
public class Main {
    public static void main(String[] args) {
        var mySurname = "Giusti";

        String contain = mySurname.contains("ni")? "contains":"doesn't contain";

        System.out.printf("Your surname %s the sequence of letters 'ni'",contain);
    }

}
