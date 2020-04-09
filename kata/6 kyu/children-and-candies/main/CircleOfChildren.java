import static java.util.stream.IntStream.of;

class CircleOfChildren {

  static int[] distributionOfCandy(int[] candies) {
    int times = 0;
    while (of(candies).distinct().count() != 1) {
      int prev = (candies[0] + candies[0] % 2) / 2;
      for (int i = candies.length - 1; i >= 0; i--) {
        candies[i] = prev + (prev = (candies[i] + candies[i] % 2) / 2);
      }
      times++;
    }
    return new int[]{times, candies[0]};
  }
}