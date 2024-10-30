package dataaccess;

import model.UserData;

public class SQLUserDAO implements UserDAO{
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
