/**
 * The Icecream interface represents an ice cream item with two basic properties: cost and description.
 * Any class implementing this interface must provide concrete implementations for these methods.
 */
public interface Icecream {
    /**
     * Gets the cost of the ice cream.
     *
     * @return The cost of the ice cream.
     */
    double getCost();

    /**
     * Gets the description of the ice cream.
     *
     * @return The description of the ice cream.
     */
    String getDescription();
}
