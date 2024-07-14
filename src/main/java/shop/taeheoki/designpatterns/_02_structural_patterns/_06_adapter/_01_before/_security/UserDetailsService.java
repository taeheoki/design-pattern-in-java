package shop.taeheoki.designpatterns._02_structural_patterns._06_adapter._01_before._security;

public interface UserDetailsService {
    UserDetails loadUser(String username);
}
