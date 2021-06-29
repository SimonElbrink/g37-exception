package se.lexicon.simon;

import se.lexicon.simon.exception.DividingByZeroException;
import se.lexicon.simon.model.Person;

import java.time.LocalDate;

/**
 * Hello world!
 *
 */
public class App 
{
    // Not Allowed to add "throws Exception" on main method!
    public static void main( String[] args )
    {

//        triggerArrayIndexOutOfBoundsException();
//        handleArrayIndexOutOfBoundsException();

        try{
            throwsCheckedException();
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }

//        try{
//            initPerson();
//        }catch (Exception e){
//            e.printStackTrace();
//        }

        System.out.println(division(10,10));
        System.out.println(division(10,0));


    }

    public static void throwsCheckedException() throws Exception{
        System.out.println("This method throws exception!");
    }

    private static void triggerArrayIndexOutOfBoundsException() {
        int[] numbers = {1,2,3,4,5,6,7,8,9};

        System.out.println("numbers[10] = " + numbers[10]);
    }

    private static void handleArrayIndexOutOfBoundsException(){

        int[] numbers = {1,2,3,4,5,6,7,8,9};

        try{
            System.out.println("numbers[10] = " + numbers[10]);

        } catch (ArrayIndexOutOfBoundsException exception ){
            System.out.println("Sorry cant Access Index of Array number: " + exception.getMessage());
        } catch (RuntimeException exception ){
            exception.printStackTrace();
        }

    }


    public static void initPerson() throws NullPointerException,IllegalArgumentException{

        Person newPerson = new Person("Simon", "simon@lexicon.se");
//        newPerson.setBirthDate(LocalDate.parse("1997-03-18"));
        newPerson.setBirthDate(null);

        System.out.println(newPerson.getBirthDate().getYear());

//        Person badPerson = new Person(null, "    dfg   ");

        System.out.println("newPerson = " + newPerson);
//        System.out.println("badPerson = " + badPerson);


    }

    public static double division(double number1, double number2) throws DividingByZeroException{

        if (number2 == 0){
            throw new DividingByZeroException("Not allowed to Divide by 0 in this program");
        }

        return number1 / number2;
    }





}
