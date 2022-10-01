package org.gtk.gtk;

/**
 * List of flags that can be passed to action activation.
 * <p>
 * More flags may be added in the future.
 */
public class ShortcutActionFlags extends io.github.jwharm.javagi.Bitfield {

    /**
     * The action is the only
     *   action that can be activated. If this flag is not set,
     *   a future activation may select a different action.
     */
    public static final ShortcutActionFlags EXCLUSIVE = new ShortcutActionFlags(1);
    
    public ShortcutActionFlags(int value) {
        super(value);
    }
    
}
