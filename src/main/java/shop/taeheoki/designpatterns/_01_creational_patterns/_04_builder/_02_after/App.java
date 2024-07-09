package shop.taeheoki.designpatterns._01_creational_patterns._04_builder._02_after;

import shop.taeheoki.designpatterns._01_creational_patterns._04_builder._01_before.TourPlan;

import java.time.LocalDate;

public class App {

    public static void main(String[] args) {
//        TourPlanBuilder builder = new DefaultTourBuilder();
//        TourPlan plan = builder.title("칸쿤 여행")
//                .nightsAndDays(2, 1)
//                .startDate(LocalDate.of(2020, 12, 9))
//                .whereToStay("리조트")
//                .addPlan(0, "체크인하고 짐 풀기")
//                .addPlan(0, "저녁 식사")
//                .getPlan();
//        System.out.println(plan);
//
//        TourPlan longBeachTrip = builder.title("롱비치")
//                .startDate(LocalDate.of(2021, 7, 15))
//                .getPlan();
//        System.out.println(longBeachTrip);

        TourDirector director = new TourDirector(new DefaultTourBuilder());
        TourPlan tourPlan = director.cancunTrip();
        TourPlan tourPlan1 = director.longBeachTrip();
        System.out.println("tourPlan = " + tourPlan);
        System.out.println("tourPlan1 = " + tourPlan1);
    }
}
