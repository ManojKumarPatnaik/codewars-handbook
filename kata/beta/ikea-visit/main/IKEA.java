class IKEA {
  static boolean checkEnoughScrews(int tables, int screws) {
    return tables * ++tables / 2 <= screws;
  }
}