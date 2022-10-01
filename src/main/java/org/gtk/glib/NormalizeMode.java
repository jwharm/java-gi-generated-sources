package org.gtk.glib;

/**
 * Defines how a Unicode string is transformed in a canonical
 * form, standardizing such issues as whether a character with
 * an accent is represented as a base character and combining
 * accent or as a single precomposed character. Unicode strings
 * should generally be normalized before comparing them.
 */
public class NormalizeMode extends io.github.jwharm.javagi.Enumeration {

    /**
     * standardize differences that do not affect the
     *     text content, such as the above-mentioned accent representation
     */
    public static final NormalizeMode DEFAULT = new NormalizeMode(0);
    
    /**
     * another name for {@link NormalizeMode#DEFAULT}
     */
    public static final NormalizeMode NFD = new NormalizeMode(0);
    
    /**
     * like {@link NormalizeMode#DEFAULT}, but with
     *     composed forms rather than a maximally decomposed form
     */
    public static final NormalizeMode DEFAULT_COMPOSE = new NormalizeMode(1);
    
    /**
     * another name for {@link NormalizeMode#DEFAULT_COMPOSE}
     */
    public static final NormalizeMode NFC = new NormalizeMode(1);
    
    /**
     * beyond {@link NormalizeMode#DEFAULT} also standardize the
     *     "compatibility" characters in Unicode, such as SUPERSCRIPT THREE
     *     to the standard forms (in this case DIGIT THREE). Formatting
     *     information may be lost but for most text operations such
     *     characters should be considered the same
     */
    public static final NormalizeMode ALL = new NormalizeMode(2);
    
    /**
     * another name for {@link NormalizeMode#ALL}
     */
    public static final NormalizeMode NFKD = new NormalizeMode(2);
    
    /**
     * like {@link NormalizeMode#ALL}, but with composed
     *     forms rather than a maximally decomposed form
     */
    public static final NormalizeMode ALL_COMPOSE = new NormalizeMode(3);
    
    /**
     * another name for {@link NormalizeMode#ALL_COMPOSE}
     */
    public static final NormalizeMode NFKC = new NormalizeMode(3);
    
    public NormalizeMode(int value) {
        super(value);
    }
    
}
