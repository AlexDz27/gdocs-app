import java.util.ArrayList;
import java.util.HashMap;

public class App {
  public static void main(String[] args) {
    String gdocString = "08\n" +
      "1227 - погашение овердрафта (перевёл на овердрафтную карту)\n" +
      "10.73 - еда\n" +
      "\n" +
      "09\n" +
      "12.12 - билет на поезд до минска\n" +
      "14.15 - билет на поезд до бреста\n" +
      "\n" +
      "10\n" +
      "3.80 - такси до вокзала \n" +
      "5.50 - еда (бургер, junkfood)\n" +
      "5 - еда (кофе, кафе)\n" +
      "2 - челику до Витебске (милостыня)\n" +
      "\n" +
      "4.37 - смажанки (junkfood)\n" +
      "3.68 - лепешка сырная с грибами (junkfood)\n" +
      "1.25 - лепешка сырная (junkfood)\n" +
      "6.43 - котлеты покиевски (готовое)\n" +
      "\n" +
      "11\n" +
      "204.30 - маме 200 р закинул\n" +
      "\n" +
      "13\n" +
      "2.18 - хлебцы\n" +
      "0.99 - вода питьевая\n" +
      "10.28 - филе куриное с грибами (готовое)\n" +
      "1.49 - салат греческий (готовое)\n" +
      "\n" +
      "14\n" +
      "1.95 - салат венегрет овощной (готовое)\n" +
      "0.34 - контейнеры для салата и суши (разное)\n" +
      "4.58 - суши (готовое)\n" +
      "\n" +
      "15\n" +
      "6 - на телефон\n" +
      "8.38 - на овердрафт (овердрафт)\n" +
      "\n" +
      "16\n" +
      "7.4 - самокат (транспорт)\n" +
      "7.90 - два бургера (еда, готовое, вредное)\n" +
      "2.39 - пиво (алкоголь)\n" +
      "3.19 - чай черный в пакетиках\n" +
      "\n" +
      "17\n" +
      "2.19 - салфетки для уборки (разное)\n" +
      "2.50 - лепешки сырные (еда, готовое, вредное)\n" +
      "2.50 - такси (транспорт)\n" +
      "5.40 - бильярд (развлечения)\n" +
      "\n" +
      "18\n" +
      "2140 - айфон Ане (подарок)\n" +
      "6.60 - такси (транспорт)\n" +
      "4.60 - маршрутка до кобрина (транспорт)\n" +
      "2.12 - зубная щётка (дефолт)\n" +
      "4.70 - пиво в пирамиде (алкоголь)\n" +
      "\n" +
      "\n" +
      "19\n" +
      "15.12 - билет до минск (транспорт работа)\n" +
      "15.12 - билет до бреста обратно (транспорт работа)\n" +
      "30 - в магазине для дома закупился (разное)\n" +
      "28 - Ане чехол и стекло поставили (подарок)\n" +
      "\n" +
      "20\n" +
      "8.5 - такси (транспорт)\n" +
      "3.40 - еда (готовое)\n" +
      "2.40 - бургер (еда, готовое, вредное)\n" +
      "14.15 - поезд до бреста (транспорт)\n" +
      "\n" +
      "21\n" +
      "25 - репик для Ани (разное) \n" +
      "5 - порошок (разное)\n" +
      "9 - филе с сыром (еда, готовое)\n" +
      "\n" +
      "22\n" +
      "6.04 - котлета по-киевски (еда, готовое)\n" +
      "3.04 - оладьи картофельные (еда, готовое)\n" +
      "1.22 - сырки шоколадные (еда, вредное)\n" +
      "\n" +
      "5.90 - такси (транспорт)\n" +
      "\n" +
      "+240 - получил от хозяина, потому что съезжаю\n" +
      "\n" +
      "23\n" +
      "7 - оплата интернета в кв в Бресте (бытовое, коммуналка, интернет)\n" +
      "3.70 - такси (транспорт)\n" +
      "43.11 - лекарства\n" +
      "\n" +
      "24\n" +
      "4.29 - пиво (алкоголь)\n" +
      "\n" +
      "25\n" +
      "5.59 - чай (еда)\n" +
      "5.30 - филе куриное (еда, готовое)\n" +
      "1.09 - хлебцы (еда)\n" +
      "\n" +
      "26\n" +
      "15.44 - экзодерил (лекарства)\n" +
      "19.44 - продукты домой (еда)\n" +
      "\n" +
      "27\n" +
      "8 - на телефон (на телефон)\n" +
      "\n" +
      "28\n" +
      "27 - ане репик (разное)\n" +
      "\n" +
      "29\n" +
      "6 - на телефон (на телефон)\n" +
      "2.53 - вода (еда)\n" +
      "3.11 - филе курицы (еда)\n" +
      "1.08 - хлебцы (еда)\n" +
      "\n" +
      "30\n" +
      "32 - Ане репик (подарок, Аня)\n" +
      "\n" +
      "1\n" +
      "40 - маме (маме)\n" +
      "\n" +
      "2\n" +
      "10 - машина шина (машина)\n" +
      "30 - машина бензин (машина)\n" +
      "2.7 - капучино (еда, кафе)\n" +
      "11 - бургер и кофе (еда, готовое, вредное)\n" +
      "2.53 - вода (еда)\n" +
      "9.72 - глина для волос (разное)\n" +
      "1.16 - сникерс (еда, вредное)\n" +
      "3.09 - торт шоколадный с творогом (еда, вредное)\n" +
      "\n" +
      "4\n" +
      "4 - на телефон (на телефон)\n" +
      "\n" +
      "6\n" +
      "53.79 - еда (мне и в дом)\n" +
      "\n" +
      "8\n" +
      "30 - Ане репик (подарок?)\n";

    String[] splitted = gdocString.split("\n");

    HashMap<String, HashMap<String, ArrayList<String>>> resultData = new HashMap<>();

    HashMap<String, ArrayList<String>> septemberDays = new HashMap<>();
    HashMap<String, ArrayList<String>> octoberDays = new HashMap<>();
    double sum = 0;
    for (int i = 0; i < splitted.length; i++) {
      String day = splitted[i];

      if (day.matches("\\d+")) {
        if (i >= 115) {
          ArrayList<String> descriptions = new ArrayList<>();
          for (int j = i + 1; j < splitted.length; j++) {
            String description = splitted[j];
            if (description.isEmpty()) break;

            descriptions.add(description);
          }

          octoberDays.put(day, descriptions);

          continue;
        }

        ArrayList<String> descriptions = new ArrayList<>();
        for (int j = i + 1; j < splitted.length; j++) {
          String description = splitted[j];
          if (description.isEmpty()) break;

          descriptions.add(description);
        }

        septemberDays.put(day, descriptions);
      }
    }

    resultData.put("September", septemberDays);
    resultData.put("October", octoberDays);

//    System.out.println(resultData);

    HashMap<String, ArrayList<String>> septemberDays2 = resultData.get("September");
    double sumForSeptember = 0;
    for (ArrayList<String> value : septemberDays2.values()) {
//      System.out.println(value);

      for (String entry : value) {
        System.out.println(entry);

        double num = Double.parseDouble(entry.split(" -")[0]);
        
        sumForSeptember += num;
      }
    }

    HashMap<String, ArrayList<String>> octoberDays2 = resultData.get("October");
    double sumForOctober = 0;
    for (ArrayList<String> value : octoberDays2.values()) {
      for (String entry : value) {
        System.out.println(entry);

        double num = Double.parseDouble(entry.split(" -")[0]);

        sumForOctober += num;
      }
    }
    
    System.out.println(sumForSeptember - 1227 - 2140 + sumForOctober);
  }
}
