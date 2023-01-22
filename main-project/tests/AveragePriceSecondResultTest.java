import domain.TelephoneConversations;
import domain.Utility;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class AveragePriceSecondResultTest {
    List <TelephoneConversations> telephoneConversationsListTest;
    @BeforeEach
    public void init()  {
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        telephoneConversationsListTest = new ArrayList<>();
        Arrays.stream(Utility.conversationStrings).map(conversationStrings -> conversationStrings.split("\\s+"))
                .forEach(conversationStringsData -> {
                    TelephoneConversations telephoneConversations = new TelephoneConversations();
                    telephoneConversations.setNumber(conversationStringsData[0]);
                    telephoneConversations.setDate(LocalDate.from(timeFormatter.parse(conversationStringsData[1])));
                    telephoneConversations.setTime(LocalTime.parse(conversationStringsData[2]));
                    telephoneConversations.setDuration(LocalTime.parse(conversationStringsData[3]));
                    telephoneConversations.setRate(conversationStringsData[4]);
                    telephoneConversations.setPrice(Double.parseDouble(conversationStringsData[5]));
                    telephoneConversationsListTest.add(telephoneConversations);
                });
    }
    @AfterEach
    public void clear() {
        telephoneConversationsListTest.clear();
    }

    @Test
    public void averagePriceSecondTest() {
        Assertions.assertEquals(0.0014068147415896945, Utility.averagePriceSecond(telephoneConversationsListTest));
    }

    @Test
    public void averagePriceSecondTestNotAveragePriceSecondTest() {
        Assertions.assertNotEquals(0, Utility.averagePriceSecond(telephoneConversationsListTest));
    }


}
