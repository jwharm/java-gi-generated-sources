package org.pango;

/**
 * An enumeration specifying capitalization variant of the font.
 */
public class Variant extends io.github.jwharm.javagi.Enumeration {

    /**
     * A normal font.
     */
    public static final Variant NORMAL = new Variant(0);
    
    /**
     * A font with the lower case characters
     *   replaced by smaller variants of the capital characters.
     */
    public static final Variant SMALL_CAPS = new Variant(1);
    
    /**
     * A font with all characters
     *   replaced by smaller variants of the capital characters. Since: 1.50
     */
    public static final Variant ALL_SMALL_CAPS = new Variant(2);
    
    /**
     * A font with the lower case characters
     *   replaced by smaller variants of the capital characters.
     *   Petite Caps can be even smaller than Small Caps. Since: 1.50
     */
    public static final Variant PETITE_CAPS = new Variant(3);
    
    /**
     * A font with all characters
     *   replaced by smaller variants of the capital characters.
     *   Petite Caps can be even smaller than Small Caps. Since: 1.50
     */
    public static final Variant ALL_PETITE_CAPS = new Variant(4);
    
    /**
     * A font with the upper case characters
     *   replaced by smaller variants of the capital letters. Since: 1.50
     */
    public static final Variant UNICASE = new Variant(5);
    
    /**
     * A font with capital letters that
     *   are more suitable for all-uppercase titles. Since: 1.50
     */
    public static final Variant TITLE_CAPS = new Variant(6);
    
    public Variant(int value) {
        super(value);
    }
    
}
