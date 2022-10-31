package org.gnome.adw;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Represents a value {@link Animation} can animate.
 * @version 1.0
 */
public class AnimationTarget extends org.gtk.gobject.Object {
    
    static {
        Adw.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "AdwAnimationTarget";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    @ApiStatus.Internal
    public AnimationTarget(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Cast object to AnimationTarget if its GType is a (or inherits from) "AdwAnimationTarget".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "AnimationTarget" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "AdwAnimationTarget", a ClassCastException will be thrown.
     */
    public static AnimationTarget castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("AdwAnimationTarget"))) {
            return new AnimationTarget(gobject.refcounted());
        } else {
            throw new ClassCastException("Object type is not an instance of AdwAnimationTarget");
        }
    }
}
