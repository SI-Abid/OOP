
public class Main {
    public static void main(String[] args) {
        Human absar = new Man();
        Worker.work(absar);
        Human afrin = new Woman();
        Worker.work(afrin);
        Human kid = new Child();
        Worker.work(kid);
    }
    static abstract class Human {
        public abstract void speak();
    }
    static class Man extends Human {
        @Override
        public void speak() {
            System.out.println("Hello, I am a man.");
        }
    }
    static class Woman extends Human {
        @Override
        public void speak() {
            System.out.println("Hello, I am a woman");
        }
    }
    static class Child extends Human {
        @Override
        public void speak() {
            System.out.println("waa..waa...");
        }
    }
    static class Worker {
        static void work(Human person) {
            if(person instanceof Man) {
                person.speak();
                System.out.println("My wage is 1000$");
            }
            else if(person instanceof Woman) {
                person.speak();
                System.out.println("My wage is 500$");
            }
            else {
                person.speak();
                System.out.println("I am not a worker");
            }
        }
    }
}