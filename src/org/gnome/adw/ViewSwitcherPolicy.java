package org.gnome.adw;

/**
 * Describes the adaptive modes of {@link ViewSwitcher}.
 */
public class ViewSwitcherPolicy extends io.github.jwharm.javagi.Enumeration {

    /**
     * Force the narrow mode
     */
    public static final ViewSwitcherPolicy NARROW = new ViewSwitcherPolicy(0);
    
    /**
     * Force the wide mode
     */
    public static final ViewSwitcherPolicy WIDE = new ViewSwitcherPolicy(1);
    
    public ViewSwitcherPolicy(int value) {
        super(value);
    }
    
}
