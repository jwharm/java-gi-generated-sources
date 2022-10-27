package org.gnome.adw;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * An {@link AnimationTarget} that calls a given callback during the
 * animation.
 * @version 1.0
 */
public class CallbackAnimationTarget extends org.gnome.adw.AnimationTarget {
    
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
    
    public CallbackAnimationTarget(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to CallbackAnimationTarget */
    public static CallbackAnimationTarget castFrom(org.gtk.gobject.Object gobject) {
        return new CallbackAnimationTarget(gobject.refcounted());
    }
    
    private static Refcounted constructNew(@Nullable org.gnome.adw.AnimationTargetFunc callback) {
        java.util.Objects.requireNonNullElse(callback, MemoryAddress.NULL);
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.adw_callback_animation_target_new.invokeExact(
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Adw.Callbacks.class, "cbAnimationTargetFunc",
                            MethodType.methodType(void.class, double.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                   (Addressable) (callback == null ? MemoryAddress.NULL : Interop.registerCallback(callback)), 
                    Interop.cbDestroyNotifySymbol()), true);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code AdwAnimationTarget} that calls the given {@code callback} during
     * the animation.
     * @param callback the callback to call
     */
    public CallbackAnimationTarget(@Nullable org.gnome.adw.AnimationTargetFunc callback) {
        super(constructNew(callback));
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle adw_callback_animation_target_new = Interop.downcallHandle(
            "adw_callback_animation_target_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
    }
}
