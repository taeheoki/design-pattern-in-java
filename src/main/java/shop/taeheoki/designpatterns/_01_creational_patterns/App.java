package shop.taeheoki.designpatterns._01_creational_patterns;

import java.util.Objects;

public class App {
    public static void main(String[] args) {
        Settings settings = Settings.getInstance();
        Settings settings1 = Settings.getInstance();
        System.out.println(Objects.equals(settings1, settings));

//        for (int j = 0; j < 100; j++) {
//
//            ExecutorService executor = Executors.newFixedThreadPool(100);
//            List<Future<Settings>> futures = new ArrayList<>();
//
//            for (int i = 0; i < 100; i++) {
//                futures.add(executor.submit(Settings::getInstance));
//            }
//
//            // 모든 결과를 취합합니다.
//            List<Settings> results = new ArrayList<>();
//            for (Future<Settings> future : futures) {
//                try {
//                    results.add(future.get());
//                } catch (InterruptedException | ExecutionException e) {
//                    e.printStackTrace();
//                }
//            }
//
//            // 첫번째 결과와 모든 다른 결과를 비교합니다.
//            boolean allEqual = results.stream()
//                    .allMatch(settings -> Objects.equals(settings, results.get(0)));
//
//            // 결과 출력
//            System.out.println(allEqual ? "All instances are equal" : "Not all instances are equal");
//
//            executor.shutdown();
//        }
    }
}
