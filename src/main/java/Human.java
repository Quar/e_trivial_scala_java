// boilerplate to show why case class is a good idea
interface Human {
    default public String getName() {
        return "<anonymous>";
    };
}