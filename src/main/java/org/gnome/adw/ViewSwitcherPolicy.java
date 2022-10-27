package org.gnome.adw;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Describes the adaptive modes of {@link ViewSwitcher}.
 */
public class ViewSwitcherPolicy extends io.github.jwharm.javagi.Enumeration {
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
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
