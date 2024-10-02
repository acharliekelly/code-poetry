package me.acharliekelly.poetry;

import java.time.LocalDateTime;

public class Egg {
  private static final long DEFAULT_DAYS = 10;

  private final long days;
  private final LocalDateTime hatchDate;

  public Egg() {
    days = DEFAULT_DAYS;
    hatchDate = LocalDateTime.now().plusDays(days);
  }

  public Egg(long days) {
    this.days = days;
    hatchDate = LocalDateTime.now().plusDays(days);
  }

  public boolean isHatched() {
    return hatchDate.isAfter(LocalDateTime.now());
  }

  public long getDays() { return days; }

  public LocalDateTime getHatchDate() { 
    return hatchDate; 
  }
}
