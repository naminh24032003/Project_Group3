package org.swp391.valuationdiamond.service;

import org.swp391.valuationdiamond.entity.Account;

public interface IAccountService {
  public Account createAccount(Account account);

  public Account getAccount(String id);

  public Account updateAccount(Account account);

  public boolean deleteAccount(String id);

  public Account login(String email, String password);

  public Account changePassword(String id, String newPassword);

  public Account changeEmail(String id, String newEmail);

}
