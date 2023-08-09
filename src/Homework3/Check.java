package Homework3;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Check {
    private int code;

    public boolean checkLength(String[] arr) {
        int defaultLength = 6;
        if (arr.length < defaultLength) {
            code = -1;
            return false;
        } else if (arr.length > defaultLength) {
            code = -2;
            return false;
        }
        return true;
    }

    public void checkFullName(String s) {
        if (!s.matches("[а-яА-Я]+") || Character.isLowerCase(s.charAt(0))) {
            throw new FullNameException(
                    "Ошибка в строке: " + s + ". ФИО должно состоять только из букв и начинаться с заглавной.");
        }
    }

    public void checkDate(String s) {
        if (!isDateValid(s)) {
            throw new DateException("Ошибка в строке: " + s + ". Проверьте формат ввода и корректность даты.");
        }
    }

    private boolean isDateValid(String date) {
        String dateFormat = "dd.MM.yyyy";
        try {
            DateFormat df = new SimpleDateFormat(dateFormat);
            df.setLenient(false);
            df.parse(date);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }

    public void checkPhone(String s) {
        if (!s.matches("[0-9]+")) {
            throw new PhoneException("Ошибка в строке: " + s + ". Номер телефона должен состоять только из цифр.");
        }
    }

    public void checkGender(String s) {
        if (!s.equals("m") && !s.equals("f")) {
            throw new GenderException("Ошибка в строке: " + s + ". Пол может иметь значения только m или f.");
        }
    }

    public int getCode() {
        return code;
    }

}
