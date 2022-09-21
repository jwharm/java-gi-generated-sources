package org.gtk.gtk;

/**
 * List of flags that can be passed to action activation.
 * <p>
 * More flags may be added in the future.
 */
public class ShortcutActionFlags {

    /**
     * The action is the only
     *   action that can be activated. If this flag is not set,
     *   a future activation may select a different action.
     */
    public static final int EXCLUSIVE = 1;
    
}
