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
    
    private static final java.lang.String C_TYPE_NAME = "AdwCallbackAnimationTarget";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a CallbackAnimationTarget proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected CallbackAnimationTarget(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, CallbackAnimationTarget> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new CallbackAnimationTarget(input);
    
    private static MemoryAddress constructNew(org.gnome.adw.AnimationTargetFunc callback, org.gtk.glib.DestroyNotify destroy) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_callback_animation_target_new.invokeExact(
                    (Addressable) callback.toCallback(),
                    (Addressable) MemoryAddress.NULL,
                    (Addressable) destroy.toCallback());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code AdwAnimationTarget} that calls the given {@code callback} during
     * the animation.
     * @param callback the callback to call
     * @param destroy the function to be called when the
     *   callback action is finalized
     */
    public CallbackAnimationTarget(org.gnome.adw.AnimationTargetFunc callback, org.gtk.glib.DestroyNotify destroy) {
        super(constructNew(callback, destroy));
        this.takeOwnership();
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.adw_callback_animation_target_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link CallbackAnimationTarget.Builder} object constructs a {@link CallbackAnimationTarget} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link CallbackAnimationTarget.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gnome.adw.AnimationTarget.Builder {
        
        /**
         * Default constructor for a {@code Builder} object.
         */
        protected Builder() {
        }
        
        /**
         * Finish building the {@link CallbackAnimationTarget} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link CallbackAnimationTarget}.
         * @return A new instance of {@code CallbackAnimationTarget} with the properties 
         *         that were set in the Builder object.
         */
        public CallbackAnimationTarget build() {
            return (CallbackAnimationTarget) org.gtk.gobject.GObject.newWithProperties(
                CallbackAnimationTarget.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle adw_callback_animation_target_new = Interop.downcallHandle(
                "adw_callback_animation_target_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle adw_callback_animation_target_get_type = Interop.downcallHandle(
                "adw_callback_animation_target_get_type",
                FunctionDescriptor.of(Interop.valueLayout.C_LONG),
                false
        );
    }
    
    /**
     * Check whether the type is available on the runtime platform.
     * @return {@code true} when the type is available on the runtime platform
     */
    public static boolean isAvailable() {
        return DowncallHandles.adw_callback_animation_target_get_type != null;
    }
}
