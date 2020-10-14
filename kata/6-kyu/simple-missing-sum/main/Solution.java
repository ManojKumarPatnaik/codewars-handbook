import static java.util.stream.IntStream.of;

interface Solution {
  static int solve(int[] arr) {
    int[] sum = {1};
    of(arr).sorted().forEach(i -> sum[0] += i > sum[0] ? 0 : i);
    return sum[0];
  }
}
