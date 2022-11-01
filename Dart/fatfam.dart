import 'dart:math';

void main(List<String> args) {
  // I want a empty list with dynamic size
  // [1, hello, 3]
  var list = List.empty(growable: true);
  list.add(1);
  list.add('hello');
  list.add(3);
  print(list);
  // I want a list with 10 2's
  // [2, 2, 2, 2, 2, 2, 2, 2, 2, 2]
  var list2 = List.filled(10, 2);
  print(list2);
  // I want a list with 10 odd numbers
  // [1, 3, 5, 7, 9, 11, 13, 15, 17, 19]
  var list3 = List.generate(10, (index) => index * 2 + 1);
  print(list3);
  // I want a list with 10 random numbers
  // [1.0, 2.0, 0.0, 1.0, 0.0, 0.0, 1.0, 0.0, 1.0, 0.0]
  var list4 = List.generate(10, (index) => Random().nextDouble());
  print(list4);
  // I want an immutable list
  // [1, 2, 3]
  var list5 = List.unmodifiable([1, 2, 3]);
  // list5.add(4); // Error
  print(list5);
  // I want a list coppied from another list
  // [1, 2, 3]
  var list6 = List.from(list5);
  list6.add(4); // OK
  print(list6);
}
