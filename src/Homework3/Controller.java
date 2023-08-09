package Homework3;

import java.io.IOException;

public class Controller {
    private final Input str = new Input();
    private final Check check = new Check();
    private final SaveData save = new SaveData();

    public void start() {
        System.out.println("Введите данный одной строкой без запятых.");
        System.out.println("Фамилия Имя Отчество, дата рождения (dd.mm.yyyy), номер телефона, пол (m/f).");
        System.out.print(">> ");
        String[] dataArr = str.scan();
        if (!check.checkLength(dataArr)) {
            if (check.getCode() == -1) {
                System.out.println("Вы ввели не всю информацию.");
            } else if (check.getCode() == -2) {
                System.out.println("Вы ввели лишнию информацию.");
            }
        } else {
            try {
                check.checkFullName(dataArr[0]);
                check.checkFullName(dataArr[1]);
                check.checkFullName(dataArr[2]);
                check.checkDate(dataArr[3]);
                check.checkPhone(dataArr[4]);
                check.checkGender(dataArr[5]);
                Data data = new Data(dataArr);
                save.saveToFile(data.getLastName() + ".txt", data);
                System.out.println("Данные успешно добавлены.");
            } catch (FullNameException | DateException | PhoneException | GenderException e) {
                System.out.println(e.getMessage());
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }

        }
    }
}
