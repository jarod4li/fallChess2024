package serviceTests;

import dataaccess.*;

import org.junit.jupiter.api.BeforeEach;

public class GameServiceTest {
  private UserDAO user=new UserDataDAO();
  private GameDAO game=new GameDataDAO();
  private AuthDAO auth=new AuthDataDAO();

  @BeforeEach
  public void setup() throws DataAccessException {
    user.clearAllUsers();
    game.clearAllGames();
    auth.clearAllAuth();
  }

}