package org.gnome.adw;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Represents a value {@link Animation} can animate.
 * <p>
 * Currently the only implementation is {@link CallbackAnimationTarget}.
 * @version 1.0
 */
public class AnimationTarget extends org.gtk.gobject.Object {
    
    static {
        Adw.javagi$ensureInitialized();
    }
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    public AnimationTarget(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to AnimationTarget */
    public static AnimationTarget castFrom(org.gtk.gobject.Object gobject) {
        return new AnimationTarget(gobject.refcounted());
    }
}
