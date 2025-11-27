package Lesson13;
import java.util.Scanner;

public class MyMain {
        public static void main(String[] args) throws WrongLoginExeption {
               verification();
        }


    public static void verification() throws WrongLoginExeption{
        try{
            System.out.print("Please, enter your USERNAME: ");
            String login = new Scanner(System.in).nextLine();
            System.out.print("Please, enter your PASSWORD: ");
            String password = new Scanner(System.in).nextLine();
            System.out.print("Please confirm PASSWORD: ");
            String confirmPassword = new Scanner(System.in).nextLine();
            verifyLogin(login);
            verifyPassword(password, confirmPassword);


            // initializeException() -> MODIFIED
            // Когда вы сделаете ПРАВИЛЬНЫЙ ВЫЗОВ СЛЕДУЮЩИЙ КОД ЗАРАБОТАЕТ
        } catch (WrongLoginExeption | WrongPasswordExeption e){
           System.out.print(e.getMessage());
            // CODE
        }


    }

        // Должен быть МЕТОД, который проинициализирует вас собственный КЛАСС ИСКЛЮЧЕНИЕ
        public static void verifyLogin(String login) throws WrongLoginExeption{

            if (login.length() >= 20){
                throw new WrongLoginExeption("Wrong login длинна должна быть менее 20 символов");
                }
            if(login.contains(" ")){
                throw new WrongLoginExeption("Wrong login не должен содержать пробелы");
                 }

        }

            public static void verifyPassword(String password, String confirmPassword) throws WrongPasswordExeption{

                if (password == null || password.length() >= 20 || password.contains(" ") ||
                        !password.matches(".*\\d.*") || !password.equals(confirmPassword)) {
                    throw new WrongPasswordExeption("Пароль должен быть короче 20 символов, не содержать пробелы, " +
                            "содержать хотя бы одну цифру и совпадать с подтверждением.");
                }


            // КОД
            // ЕСЛИ что-то
            // throw UserPassException("Your username is WRONG!");
            // Если что-то
            // throw UserPassException("Your password is WRONG!");
        }
    }

