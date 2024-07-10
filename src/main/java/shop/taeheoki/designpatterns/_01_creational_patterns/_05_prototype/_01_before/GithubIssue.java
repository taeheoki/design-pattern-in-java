package shop.taeheoki.designpatterns._01_creational_patterns._05_prototype._01_before;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
public class GithubIssue implements Cloneable {
    private int id;
    private String title;
    private GithubRepository repository;

    public GithubIssue(GithubRepository repository) {
        this.repository = repository;
    }

    public String getUrl() {
        StringBuilder builder = new StringBuilder();
        return builder.append("https://github.com/")
                .append(repository.getUser())
                .append("/")
                .append(repository.getName())
                .append("/")
                .append("issues")
                .append("/")
                .append(id).toString();
    }


    @Override
    protected Object clone() {
        try {
            GithubIssue cloned = (GithubIssue) super.clone();
            cloned.repository = (GithubRepository) this.repository.clone();  // Copy the mutable GithubRepository
            return cloned;
        } catch (CloneNotSupportedException ex) {
            throw new RuntimeException("Clone is not supported", ex);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GithubIssue that = (GithubIssue) o;
        return getId() == that.getId() && Objects.equals(getTitle(), that.getTitle()) && Objects.equals(getRepository(), that.getRepository());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getTitle(), getRepository());
    }
}
