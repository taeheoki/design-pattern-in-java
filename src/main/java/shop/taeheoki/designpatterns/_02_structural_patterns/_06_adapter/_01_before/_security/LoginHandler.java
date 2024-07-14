package shop.taeheoki.designpatterns._02_structural_patterns._06_adapter._01_before._security;

public class LoginHandler {

    UserDetailsService userDetailsService;

    public LoginHandler(UserDetailsService userDetailsService) {
        this.userDetailsService = userDetailsService;
    }

    public String login(String username, String password) {
        UserDetails userDetails = userDetailsService.loadUser(username);
        if (userDetails.getPassword().equals(password)) {
            return userDetails.getUserName();
        } else {
            throw new IllegalArgumentException();
        }
    }
}
