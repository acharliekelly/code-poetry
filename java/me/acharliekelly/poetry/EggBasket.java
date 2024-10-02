package me.acharliekelly.poetry;

import java.util.HashSet;
import java.util.Set;

public class EggBasket implements Basket {
  private final Set<Egg> eggs;

  public EggBasket() {
    eggs = new HashSet<>();
  }

  @Override
  public int getBirdCount() {
    int birds = 0;
    for (Egg egg : eggs) {
      if (egg.isHatched()) {
        birds++;
      }
    }
    return birds;
  }

  @Override
  public int getEggCount() {
    return eggs.size();
  }

  public void addEgg(Egg egg) {
    eggs.add(egg);
  }

  public void addEgg(long days) {
    Egg egg = new Egg(days);
    this.eggs.add(egg);
  }
  
}
