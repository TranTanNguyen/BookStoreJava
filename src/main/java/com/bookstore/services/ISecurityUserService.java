package com.bookstore.services;

public interface ISecurityUserService {
    String validatePasswordResetToken(long id, String token);
}
