
class HelloWorld {

    public static void main(String[] args) {

        new SayHelloWorld().say();

        SayHi$.MODULE$.say(new Student("Oculus Rift"));

        SayHi$.MODULE$.say(Student.apply("Oculus Rift"));

        SayHi$.MODULE$.say(new AnonymousHuman(){}); // instance of anonymous class inherit interface AnonymousHuman

        SayHi$.MODULE$.say(() -> "Holographics"); // lambda expression

    }

}