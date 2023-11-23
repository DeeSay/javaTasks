import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
* Программа работает только для номеров региона: Татарстан, Удмуртия, Хабаровский край (1б, 116, 716, 18, 27)
* В записи возможны 0 или 1 пробел (но не более) между частями номера например "М435ЕС716" или "А 123 ВМ 16" и вариации.
* Проводится проверка на правильность использования букв.
* Если номер соответствует и регион есть в числе рассматриваемых - выводится наименование региона.
* Если номера региона нет в числе рассматриваемых - выводится "Такого региона нет в базе."
* Если есть кейсы неудовлетворяющие проверкам - выводится сообщение: "Неправильный формат записи номера."
* Для выхода из программы нужно ввести: exit или выход
* */


public class Main {
    public static void main(String[] args) {
        //HashMap для кода и наименования региона
        Map<String, String> reg = new HashMap<String, String>();
        reg.put("16", "Республика Татарстан");
        reg.put("116", "Республика Татарстан");
        reg.put("716", "Республика Татарстан");
        reg.put("18", "Удмуртская Республика");
        reg.put("27", "Хабаровский край");

        final String PATTERN = "^[АВЕКМНОРСТУХ]{1}\\s?\\d{3}(?<!000)\\s?([АВЕКМНОРСТУХ]{2}|[АВЕКМНОРСТУХ]{2}\\s?RUS)\\s?\\d{2,3}$";
        Scanner in = new Scanner(System.in);
        System.out.print("Input: ");
        String input = in.nextLine();

        while(true) {
            if(input.equals("exit") ||input.equals("выход")) {
                break;
            }
            else {
                if(input.matches(PATTERN)) {
                    Pattern pattern = Pattern.compile("\\d+$");
                    Matcher matcher = pattern.matcher(input);
                    String numberReg = "";
                    String regName = "";
                    if (matcher.find()) {
                        numberReg = matcher.group();
                        if(reg.containsKey(numberReg)) {
                            regName = reg.get(numberReg);
                        } else {
                            regName = "Такого региона нет в базе.";
                        }

                    }
                    System.out.println("Соответсвует." + "\n" + "Регион: " + regName);
                }
                else{
                    if (input.matches(".*" + "[БГДЁЖЗИЙЛПФЦЧШЩЪЫЬЭЮЯ]" + ".*")) {
                        System.out.println("Недопустимая буква в номере.");
                    }
                    else if(input.matches(".*" + "\\s{2,}" + ".*")) {
                        System.out.println("Допустимо не более 1 пробела.");
                    }
                    else {
                        System.out.println("Неправильный формат записи номера.");
                    }
                }
                input = in.nextLine();
            }
        }
        in.close();
    }
}
