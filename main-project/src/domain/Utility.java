package domain;

import java.util.List;

public class Utility {
    public static final String[] conversationStrings = {"+375332341234 01.12.2007 10:10:10 12:12:01 город 10.04",
            "+372232341234 12.07.2027 12:10:10 11:10:01 межгород 09.04",
            "+375332334634 01.12.2007 10:10:10 08:09:01 международный 12.04",
            "+375332341124 11.12.2017 11:10:10 11:12:01 мобильный 101.04",
            "+375312341234 12.11.2021 11:10:10 09:13:01 мобильный 121.04",
            "+375317774534 11.11.2021 12:11:10 02:01:01 межгород 20.04"};

    public static double averagePriceSecond(List<TelephoneConversations> array) {
        int totalDuration = 0;
        double generalPrice = 0;

        for (TelephoneConversations telephoneConversations : array
        ) {
            generalPrice = generalPrice + telephoneConversations.getPrice();
            totalDuration = totalDuration + telephoneConversations.getDuration().getHour() * 3600 + telephoneConversations.getDuration().getMinute() * 60 + telephoneConversations.getDuration().getSecond();
        }
        double averagePriceSecond = generalPrice / totalDuration;
        return averagePriceSecond;
    }
}
