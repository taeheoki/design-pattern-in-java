package shop.taeheoki.designpatterns._02_structural_patterns._06_adapter._02_after;

import shop.taeheoki.designpatterns._02_structural_patterns._06_adapter._01_before.Account;
import shop.taeheoki.designpatterns._02_structural_patterns._06_adapter._01_before.AccountService;
import shop.taeheoki.designpatterns._02_structural_patterns._06_adapter._01_before._security.UserDetails;
import shop.taeheoki.designpatterns._02_structural_patterns._06_adapter._01_before._security.UserDetailsService;

public class AccountUserDetailsService implements UserDetailsService {

    AccountService accountService;

    public AccountUserDetailsService(AccountService accountService) {
        this.accountService = accountService;
    }

    @Override
    public UserDetails loadUser(String username) {
        Account account = accountService.findAccountByUsername(username);
        return new AccountUserDetails(account);
    }
}
