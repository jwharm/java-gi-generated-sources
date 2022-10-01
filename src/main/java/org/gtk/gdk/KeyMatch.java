package org.gtk.gdk;

/**
 * Describes how well an event matches a given keyval and modifiers.
 * <p>
 * {@code GdkKeyMatch} values are returned by {@link KeyEvent#matches}.
 */
public class KeyMatch extends io.github.jwharm.javagi.Enumeration {

    /**
     * The key event does not match
     */
    public static final KeyMatch NONE = new KeyMatch(0);
    
    /**
     * The key event matches if keyboard state
     *   (specifically, the currently active group) is ignored
     */
    public static final KeyMatch PARTIAL = new KeyMatch(1);
    
    /**
     * The key event matches
     */
    public static final KeyMatch EXACT = new KeyMatch(2);
    
    public KeyMatch(int value) {
        super(value);
    }
    
}
