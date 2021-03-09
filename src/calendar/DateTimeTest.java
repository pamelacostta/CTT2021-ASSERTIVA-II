package calendar;

import java.text.DateFormat;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Calendar;
import java.util.zip.DataFormatException;

public class DateTimeTest {
    public static void main(String[] args) {
        Calendar data = Calendar.getInstance();

//        DateTimeFormatter formatter =
//                DateTimeFormatter.ofLocalizedDateTime(FormatStyle. FULL); // FULL, LONG, MEDIUM, SHORT
//        ZonedDateTime zdtNow = ZonedDateTime.now();
//
//        System.out.println("\t");
//        String format = formatter.format(zdtNow);
//        System.out.println(format);  //Pode excluir esses int abaixo e deixar só o que está comentado faz a mesma coisa.

        int ano = data.get(Calendar.YEAR);
        int mes = data.get(Calendar.MONTH);
        int dia = data.get(Calendar.DAY_OF_MONTH);
        int hora = data.get(Calendar.HOUR_OF_DAY);
        int minutos = data.get(Calendar.MINUTE);
        int segundos= data.get(Calendar.SECOND);


        System.out.printf("Hoje é dia: %02d/%02d/%d  %02d:%02d:%02d ", dia, (mes+1), ano, hora, minutos, segundos);

        if (hora > 6 && hora < 12) {
            System.out.println("Bom Dia!");
        } else if (hora > 12 && hora < 18) {
            System.out.println("Boa Tarde!");
        } else {
            System.out.println("Boa Noite!");
        }
    }
}