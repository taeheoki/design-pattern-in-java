package shop.taeheoki.designpatterns._01_creational_patterns._04_builder._01_before;

import lombok.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class TourPlan {
    private String title;
    private int nights;
    private int days;
    private LocalDate startDate;
    private String whereToStay;
    private List<DetailPlan> plans = new ArrayList<>();

    public void addPlan(int day, String plan) {
        plans.add(new DetailPlan(day, plan));
    }
}
