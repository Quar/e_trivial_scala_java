
class HelloWorld {

    public static void main(String[] args) {

        new SayHelloWorld().say();

        SayHi$.MODULE$.say(new Student("Oculus Rift"));

        SayHi$.MODULE$.say(Student.apply("Oculus Rift"));

        SayHi$.MODULE$.say(new Human(){}); // instance of anonymous class inherit interface Human

    }

}