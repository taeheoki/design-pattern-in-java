package shop.taeheoki.designpatterns._01_creational_patterns._05_prototype._03_java;

import org.modelmapper.ModelMapper;
import shop.taeheoki.designpatterns._01_creational_patterns._05_prototype._01_before.GithubIssue;
import shop.taeheoki.designpatterns._01_creational_patterns._05_prototype._01_before.GithubRepository;

public class ModelMapperExample {
    public static void main(String[] args) {
        GithubRepository repository = new GithubRepository();
        repository.setUser("taeheoki");
        repository.setName("live-study");

        GithubIssue githubIssue = new GithubIssue(repository);
        githubIssue.setId(1);
        githubIssue.setTitle("1주차 과제: JVM은 무엇이며 자바 코드는 어떻게 실행하는 것인가.");

        GithubIssueData githubIssueData = new GithubIssueData();
        githubIssueData.setId(githubIssueData.getId());
        githubIssueData.setRepositoryName(githubIssue.getRepository().getName());
        System.out.println(githubIssueData);

        // TODO ModelMapper

        ModelMapper modelMapper = new ModelMapper();
        GithubIssueData githubIssueData1 = modelMapper.map(githubIssue, GithubIssueData.class);
        System.out.println(githubIssueData1);
    }
}
