class Car {
  String name;
  int year;
  Car(this.name, this.year);

  @Deprecated('Use start() instead')
  void drive() => print("Vroom, I'm $name and I'm $year years old");

  void start() => print("Vroom, I'm $name and I'm $year years old");

  @override
  String toString() => "I'm $name and I'm $year years old";
}

class ElectricCar extends Car {
  int battery;
  ElectricCar(String name, int year, this.battery) : super(name, year);

  @override
  void start() => print(
      "Vroom, I'm $name and I'm $year years old and I have $battery% battery");

  @override
  String toString() =>
      "I'm $name and I'm $year years old and I have $battery% battery";
}

class Triplet {
  int a;
  int b;
  int c;
  Triplet(this.a, this.b, this.c);
  @override
  String toString() => "($a, $b, $c)";
}

void main(List<String> args) {
  final car = Car("Ferrari", 2020);
  final electricCar = ElectricCar("Tesla", 2020, 100);
  final triplet = Triplet(1, 2, 3);
  var list = List.empty(growable: true);
  list.add(car);
  list.add("Hello Brotha");
  list.add(3);
  list.add(electricCar);
  list.add(triplet);
  list.add({"a": 1, "b": 2, "c": 3});
  list.add([1, '2', 3]);
  list.add(1.0);
  print(list);
}
