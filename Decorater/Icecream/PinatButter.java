/**
 * The PinatButter class represents a decorator that adds "PinatButter" to an existing Icecream object.
 * It extends the Ice_Decorator abstract class and overrides the getCost() and getDescription() methods.
 */
public class PinatButter extends Ice_Decorator {

    /**
     * Constructs a new PinatButter object with the provided Icecream object to be wrapped.
     *
     * @param ic The Icecream object to be wrapped by this decorator.
     */
    public PinatButter(Icecream ic) {
        super(ic);
    }

    /**
     * Gets the cost of the ice cream with "PinatButter" added.
     *
     * @return The cost of the ice cream with "PinatButter" added.
     */
    @Override
    public double getCost() {
        return ic.getCost() + 80;
    }

    /**
     * Gets the description of the ice cream with "PinatButter" added.
     *
     * @return The description of the ice cream with "PinatButter" added.
     */
    @Override
    public String getDescription() {
        return ic.getDescription() + " PinatButter";
    }
}
