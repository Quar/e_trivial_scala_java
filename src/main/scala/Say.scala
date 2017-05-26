class SayHelloWorld {

    def say:Unit = println("Hello World!")

}

object SayHi {

    def say(h:Human):Unit = println(s"Hi, ${h.getName}!")

}