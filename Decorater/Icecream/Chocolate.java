/**
 * The Chocolate class represents a decorator that adds "chocolate" to an existing Icecream object.
 * It extends the Ice_Decorator abstract class and overrides the getCost() and getDescription() methods.
 */
public class Chocolate extends Ice_Decorator {

    /**
     * Constructs a new Chocolate object with the provided Icecream object to be wrapped.
     *
     * @param ic The Icecream object to be wrapped by this decorator.
     */
    public Chocolate(Icecream ic) {
        super(ic);
    }

    /**
     * Gets the cost of the ice cream with "chocolate" added.
     *
     * @return The cost of the ice cream with "chocolate" added.
     */
    @Override
    public double getCost() {
        return ic.getCost() + 25;
    }

    /**
     * Gets the description of the ice cream with "chocolate" added.
     *
     * @return The description of the ice cream with "chocolate" added.
     */
    @Override
    public String getDescription() {
        return ic.getDescription() + " chocolate";
    }
}
