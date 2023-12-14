package ies.puerto;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Person class
 * @author Jose Maximiliano Boada Martin
 */
public class Person {
    public static void main(String[] args) throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date = dateFormat.parse("03/12/1995");
        Person person = new Person("Maxi", date);

        System.out.println(person.checkZodiacSign());
    }
    private String name;
    private Date dateOfBirth;

    public Person() {}

    public Person(String name, Date dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    public int calcAge() {
        Calendar currentDate = Calendar.getInstance();
        Calendar calendarDateOfBirth = Calendar.getInstance();
        calendarDateOfBirth.setTime(dateOfBirth);
        Calendar age = Calendar.getInstance();
        age.set(Calendar.DATE, Math.abs(currentDate.get(Calendar.DATE) - calendarDateOfBirth.get(Calendar.DATE)));
        age.set(Calendar.MONTH, Math.abs(currentDate.get(Calendar.MONTH) - calendarDateOfBirth.get(Calendar.MONTH)));
        age.set(Calendar.YEAR, Math.abs(currentDate.get(Calendar.YEAR) - calendarDateOfBirth.get(Calendar.YEAR)));
        return age.get(Calendar.YEAR);
    }

    public String checkZodiacSign() {
        Calendar calendarDateOfBirth = Calendar.getInstance();
        calendarDateOfBirth.setTime(dateOfBirth);
        int month = calendarDateOfBirth.get(Calendar.MONTH);
        int day = calendarDateOfBirth.get(Calendar.DATE);
        String zodiac;
        switch (month) {
            case 0:
                if (day < 20) {
                    zodiac = "Capricorn";
                } else {
                    zodiac = "Aquarius";
                }
                break;
            case 1:
                if (day < 19) {
                    zodiac = "Aquarius";
                } else {
                    zodiac = "Piscis";
                }
                break;
            case 2:
                if (day < 21) {
                    zodiac = "Piscis";
                } else {
                    zodiac = "Aries";
                }
                break;
            case 3:
                if (day < 20) {
                    zodiac = "Aries";
                } else {
                    zodiac = "Taurus";
                }
                break;
            case 4:
                if (day < 21) {
                    zodiac = "Taurus";
                } else {
                    zodiac = "Gemini";
                }
                break;
            case 5:
                if (day < 21) {
                    zodiac = "Gemini";
                } else {
                    zodiac = "Cancer";
                }
                break;
            case 6:
                if (day < 23) {
                    zodiac = "Cancer";
                } else {
                    zodiac = "Leo";
                }
                break;
            case 7:
                if (day < 23) {
                    zodiac = "Leo";
                } else {
                    zodiac = "Virgo";
                }
                break;
            case 8:
                if (day < 23) {
                    zodiac = "Virgo";
                } else {
                    zodiac = "Libra";
                }
                break;
            case 9:
                if (day < 23) {
                    zodiac = "Libra";
                } else {
                    zodiac = "Scorpio";
                }
                break;
            case 10:
                if (day < 22) {
                    zodiac = "Scorpio";
                } else {
                    zodiac = "Sagittarius";
                }
                break;
            case 11:
                if (day < 22) {
                    zodiac = "Sagittarius";
                } else {
                    zodiac = "Capricorn";
                }
                break;
            default:
                zodiac = "Invalid";
        }
        return zodiac;
    }
}
