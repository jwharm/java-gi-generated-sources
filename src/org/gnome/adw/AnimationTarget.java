package org.gnome.adw;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * Represents a value {@link Animation} can animate.
 * <p>
 * Currently the only implementation is {@link CallbackAnimationTarget}.
 */
public class AnimationTarget extends org.gtk.gobject.Object {

    public AnimationTarget(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to AnimationTarget */
    public static AnimationTarget castFrom(org.gtk.gobject.Object gobject) {
        return new AnimationTarget(gobject.getReference());
    }
    
}
