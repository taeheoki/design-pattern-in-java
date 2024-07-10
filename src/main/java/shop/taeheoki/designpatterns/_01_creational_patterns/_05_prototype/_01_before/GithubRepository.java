package shop.taeheoki.designpatterns._01_creational_patterns._05_prototype._01_before;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
public class GithubRepository implements Cloneable {
    private String user;
    private String name;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        try {
            GithubRepository cloned = (GithubRepository) super.clone();
            return cloned;
        } catch (CloneNotSupportedException ex) {
            throw new RuntimeException("Clone is not supported", ex);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GithubRepository that = (GithubRepository) o;
        return Objects.equals(getUser(), that.getUser()) && Objects.equals(getName(), that.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUser(), getName());
    }
}
