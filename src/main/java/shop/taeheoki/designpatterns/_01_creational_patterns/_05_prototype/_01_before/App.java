package shop.taeheoki.designpatterns._01_creational_patterns._05_prototype._01_before;

public class App {
    public static void main(String[] args) {
        GithubRepository repository = new GithubRepository();
        repository.setUser("taeheoki");
        repository.setName("live-study");

        GithubIssue githubIssue = new GithubIssue(repository);
        githubIssue.setId(1);
        githubIssue.setTitle("1주차 과제: JVM은 무엇이며 자바 코드는 어떻게 실행하는 것인가.");

        String url = githubIssue.getUrl();
        System.out.println(url);

//        GithubIssue githubIssue2 = new GithubIssue(repository); // 이렇게 코드를 작성하지 않는다.
        GithubIssue githubIssue2 = (GithubIssue) githubIssue.clone();
//        githubIssue2.setId(2);
//        githubIssue2.setTitle("2주차 과제: ");

        // TODO clone == githubIssue
        // TODO clone.equals(githubIssue) => true가 나와야 한다.
        System.out.println(githubIssue2 != githubIssue);
        System.out.println(githubIssue2.equals(githubIssue));
        System.out.println(githubIssue2.getClass() == githubIssue.getClass());
    }
}
