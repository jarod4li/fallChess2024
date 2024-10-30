package dataaccess;

import model.UserData;

public class SQLUserDAO implements UserDAO{
  private static final String[] USERS_TABLE_QUERY = {
          "CREATE TABLE IF NOT EXISTS users (" +
                  "username VARCHAR(50) NOT NULL, " +
                  "password VARCHAR(255) NOT NULL, " +
                  "email VARCHAR(100) NOT NULL, " +
                  "PRIMARY KEY (username)" +
                  ")"
  };

  @Override
  public UserData getUserWithUsername(String username) throws DataAccessException {
    return null;
  }

  @Override
  public UserData getUserWithEmail(String email) throws DataAccessException {
    return null;
  }

  @Override
  public void addUser(String username, String password, String email) throws DataAccessException {

  }

  @Override
  public void clearAllUsers() throws DataAccessException {

  }
}
