package org.gnome.adw;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Describes the adaptive modes of {@link ViewSwitcher}.
 */
public class ViewSwitcherPolicy extends io.github.jwharm.javagi.Enumeration {
    
    private static final java.lang.String C_TYPE_NAME = "AdwViewSwitcherPolicy";
    
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
