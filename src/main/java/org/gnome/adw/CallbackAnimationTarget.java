package org.gnome.adw;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

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
    
    private static final MethodHandle adw_callback_animation_target_new = Interop.downcallHandle(
        "adw_callback_animation_target_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew(@Nullable AnimationTargetFunc callback) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) adw_callback_animation_target_new.invokeExact(
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Adw.class, "__cbAnimationTargetFunc",
                            MethodType.methodType(void.class, double.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(ValueLayout.JAVA_DOUBLE, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(callback)), 
                    Interop.cbDestroyNotifySymbol()), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@code AdwAnimationTarget} that calls the given {@code callback} during
     * the animation.
     */
    public CallbackAnimationTarget(@Nullable AnimationTargetFunc callback) {
        super(constructNew(callback));
    }
    
}
