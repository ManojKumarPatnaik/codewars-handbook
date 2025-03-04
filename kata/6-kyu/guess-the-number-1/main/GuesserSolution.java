class GuesserSolution extends Guesser {
  int getNumber() {
    int down = 1;
    int up = 1000;
    int mid;
    while (true) {
      mid = down + (up - down) / 2;
      switch (guess(mid)) {
        case "Too high!":
          up = --mid;
          break;
        case "Too low!":
          down = ++mid;
          break;
        default:
          return mid;
      }
    }
  }
}
