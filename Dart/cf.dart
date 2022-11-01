import 'dart:io';

void main(List<String> args) {
  int t = int.parse(stdin.readLineSync()!);
  while (t > 0) {
    t--;
    int n, m, k;
    List<String> line = stdin.readLineSync()!.split(' ');
    n = int.parse(line[0]);
    m = int.parse(line[1]);
    k = int.parse(line[2]);
    List<int> a = stdin.readLineSync()!.split(' ').map(int.parse).toList();
    // END OF INPUT
    Map<int, int> map = {};
    int available = n * m - 3;
    int required = k;
    for (var e in a) {
      map[e] = 1;
      if (map.containsKey(required)) {
        while (map.containsKey(required)) {
          required--;
        }
      } else {
        available--;
      }
      if (available == 0) {
        break;
      }
    }
    // print(required);
    if (required == 0) {
      print("YA");
    } else {
      print("TIDAK");
    }
  }
}
