package shop.taeheoki.designpatterns._02_structural_patterns._06_adapter._02_after;

import shop.taeheoki.designpatterns._02_structural_patterns._06_adapter._01_before.AccountService;
import shop.taeheoki.designpatterns._02_structural_patterns._06_adapter._01_before._security.LoginHandler;
import shop.taeheoki.designpatterns._02_structural_patterns._06_adapter._01_before._security.UserDetailsService;

public class App {
    public static void main(String[] args) {
        AccountService accountService = new AccountService();
        UserDetailsService userDetailsService = new AccountUserDetailsService(accountService);
        LoginHandler loginHandler = new LoginHandler(userDetailsService);
        String login = loginHandler.login("taeheoki", "taeheoki");
        System.out.println(login);
    }
}
