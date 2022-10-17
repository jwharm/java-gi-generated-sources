package org.gnome.adw;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Represents a value {@link Animation} can animate.
 * <p>
 * Currently the only implementation is {@link CallbackAnimationTarget}.
 */
public class AnimationTarget extends org.gtk.gobject.Object {

    public AnimationTarget(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to AnimationTarget */
    public static AnimationTarget castFrom(org.gtk.gobject.Object gobject) {
        return new AnimationTarget(gobject.refcounted());
    }
    
}
