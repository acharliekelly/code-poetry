package me.acharliekelly.poetry;

public class Again {

  public static final String SUCCESS = "SUCCESS";

  private int attemptCount = 0;

  public boolean attempt(String value) {
    attemptCount = 0;
    return attempt(value, 0);
  }

  private boolean attempt(String value, int tries) {
    attemptCount = tries;
    if (value.equals(SUCCESS)) {
      return true;
    } else {
      attemptCount++;
      try {
        return attempt(value, attemptCount);
      } catch (Exception e) {
        System.out.println(e);
        return false;
      }
    }
  }

  public int getAttempts() {
    return attemptCount;
  }

  
}
