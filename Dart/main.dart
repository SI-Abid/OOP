class Animal {
  final String name;
  final int age;
  Animal(this.name, this.age);
  void speak() {
    print("Hello, I'm $name and I'm $age years old");
  }
}

class Dog extends Animal {
  Dog(String name, int age) : super(name, age);
  void speak() {
    print("Woof, I'm $name and I'm $age years old");
  }
}
void main() {
  final animal = Dog("Rex", 5);
  animal.speak();
}