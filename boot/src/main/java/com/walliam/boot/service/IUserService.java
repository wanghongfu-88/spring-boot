package com.walliam.boot.service;

import com.walliam.boot.domain.sys.User;

public interface IUserService {

   User getUserOne(long id);

   User updateUser(User user);

   void deleteUser(User user);

   User getUserByJob(User user);
}
