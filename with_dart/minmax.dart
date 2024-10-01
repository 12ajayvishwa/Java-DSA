void main() {
  List<int> a = [24, 5, 67, 90, 200, 45];

  int maxValue = a[0]; // Assume first element is the max
  int minValue = a[0]; // Assume first element is the min

  for (int i = 1; i < a.length; i++) {
    if (a[i] > maxValue) {
      maxValue = a[i];
    }
    if (a[i] < minValue) {
      minValue = a[i];
    }
  }

  print('Max value: $maxValue');
  print('Min value: $minValue');
}