package shop.taeheoki.designpatterns._02_structural_patterns._06_adapter._02_after;

import shop.taeheoki.designpatterns._02_structural_patterns._06_adapter._01_before.Account;
import shop.taeheoki.designpatterns._02_structural_patterns._06_adapter._01_before._security.UserDetails;

public class AccountUserDetails implements UserDetails {
    private Account account;

    public AccountUserDetails(Account account) {
        this.account = account;
    }

    @Override
    public String getUserName() {
        return account.getName();
    }

    @Override
    public String getPassword() {
        return account.getPassword();
    }
}
