public interface Human {
    String name();
    default String getName() {
        if (name() == null) 
            return "<anonymous>";
        else
            return name();
    }
}