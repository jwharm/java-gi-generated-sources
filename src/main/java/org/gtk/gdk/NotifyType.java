package org.gtk.gdk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Specifies the kind of crossing for enter and leave events.
 * <p>
 * See the X11 protocol specification of LeaveNotify for
 * full details of crossing event generation.
 */
public class NotifyType extends io.github.jwharm.javagi.Enumeration {
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * the surface is entered from an ancestor or
     *   left towards an ancestor.
     */
    public static final NotifyType ANCESTOR = new NotifyType(0);
    
    /**
     * the pointer moves between an ancestor and an
     *   inferior of the surface.
     */
    public static final NotifyType VIRTUAL = new NotifyType(1);
    
    /**
     * the surface is entered from an inferior or
     *   left towards an inferior.
     */
    public static final NotifyType INFERIOR = new NotifyType(2);
    
    /**
     * the surface is entered from or left towards
     *   a surface which is neither an ancestor nor an inferior.
     */
    public static final NotifyType NONLINEAR = new NotifyType(3);
    
    /**
     * the pointer moves between two surfaces
     *   which are not ancestors of each other and the surface is part of
     *   the ancestor chain between one of these surfaces and their least
     *   common ancestor.
     */
    public static final NotifyType NONLINEAR_VIRTUAL = new NotifyType(4);
    
    /**
     * an unknown type of enter/leave event occurred.
     */
    public static final NotifyType UNKNOWN = new NotifyType(5);
    
    public NotifyType(int value) {
        super(value);
    }
}
