package domain;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MassData {
    public static List<TelephoneConversations> massData() throws FileNotFoundException {
        try (
                FileReader fr = new FileReader("I:\\Основы программной инженерии\\OPI.lab-1\\main-project\\src\\data.txt");
                Scanner scan = new Scanner(fr);
        ) {
            scan.useDelimiter(System.getProperty("line.separator"));
            DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
            List <TelephoneConversations> telephoneConversationsList = new ArrayList<>();
            while (scan.hasNext()) {
                String next = scan.next();
                String[] nextMass = next.split("\\s+");
                TelephoneConversations telephoneConversations = new TelephoneConversations();
                telephoneConversations.setNumber(nextMass[0]);
                telephoneConversations.setDate(LocalDate.from(timeFormatter.parse(nextMass[1])));
                telephoneConversations.setTime(LocalTime.parse(nextMass[2]));
                telephoneConversations.setDuration(LocalTime.parse(nextMass[3]));
                telephoneConversations.setRate(nextMass[4]);
                telephoneConversations.setPrice(Double.parseDouble(nextMass[5]));

                telephoneConversationsList.add(telephoneConversations);

            }
            return (telephoneConversationsList);
        } catch (Exception exeption) {
            exeption.printStackTrace();
        }
    return null;
    }
}


