package dataaccess;

import model.AuthData;

import java.util.ArrayList;

public class AuthDataDAO implements AuthDAO {
  private ArrayList<AuthData> tokenList = new ArrayList<>();

  public AuthData addAuthToken(String username) {
    AuthData newUser = new AuthData(username);
    tokenList.add(newUser);
    return newUser;
  }

  @Override
  public AuthData findToken(String token) throws DataAccessException {
    return null;
  }

  @Override
  public void removeAuthToken(AuthData token) throws DataAccessException {

  }

  public void clearAllAuth() {
    tokenList.clear();
  }
}
