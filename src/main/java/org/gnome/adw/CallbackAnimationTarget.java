package org.gnome.adw;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * An {@link AnimationTarget} that calls a given callback during the
 * animation.
 */
public class CallbackAnimationTarget extends AnimationTarget {

    public CallbackAnimationTarget(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to CallbackAnimationTarget */
    public static CallbackAnimationTarget castFrom(org.gtk.gobject.Object gobject) {
        return new CallbackAnimationTarget(gobject.refcounted());
    }
    
    private static Refcounted constructNew(AnimationTargetFunc callback) {
        try {
            Refcounted RESULT = Refcounted.get(gtk_h.adw_callback_animation_target_new(
                    Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Adw.class, "__cbAnimationTargetFunc",
                            MethodType.methodType(void.class, double.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(callback.hashCode(), callback)), 
                    Interop.cbDestroyNotifySymbol()), true);
            return RESULT;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * Creates a new {@code AdwAnimationTarget} that calls the given {@code callback} during
     * the animation.
     */
    public CallbackAnimationTarget(AnimationTargetFunc callback) {
        super(constructNew(callback));
    }
    
}
