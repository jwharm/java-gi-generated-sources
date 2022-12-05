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
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public CallbackAnimationTarget(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to CallbackAnimationTarget if its GType is a (or inherits from) "AdwCallbackAnimationTarget".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code CallbackAnimationTarget} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "AdwCallbackAnimationTarget", a ClassCastException will be thrown.
     */
    public static CallbackAnimationTarget castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(new org.gtk.gobject.TypeInstance(gobject.handle(), Ownership.NONE), CallbackAnimationTarget.getType())) {
            return new CallbackAnimationTarget(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of AdwCallbackAnimationTarget");
        }
    }
    
    private static Addressable constructNew(@NotNull org.gnome.adw.AnimationTargetFunc callback) {
        java.util.Objects.requireNonNull(callback, "Parameter 'callback' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_callback_animation_target_new.invokeExact(
                    (Addressable) Linker.nativeLinker().upcallStub(
                        MethodHandles.lookup().findStatic(Adw.Callbacks.class, "cbAnimationTargetFunc",
                            MethodType.methodType(void.class, double.class, MemoryAddress.class)),
                        FunctionDescriptor.ofVoid(Interop.valueLayout.C_DOUBLE, Interop.valueLayout.ADDRESS),
                        Interop.getScope()),
                    (Addressable) (Interop.registerCallback(callback)),
                    Interop.cbDestroyNotifySymbol());
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
    public CallbackAnimationTarget(@NotNull org.gnome.adw.AnimationTargetFunc callback) {
        super(constructNew(callback), Ownership.FULL);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.adw_callback_animation_target_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gnome.adw.AnimationTarget.Build {
        
         /**
         * A {@link CallbackAnimationTarget.Build} object constructs a {@link CallbackAnimationTarget} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link CallbackAnimationTarget} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link CallbackAnimationTarget} using {@link CallbackAnimationTarget#castFrom}.
         * @return A new instance of {@code CallbackAnimationTarget} with the properties 
         *         that were set in the Build object.
         */
        public CallbackAnimationTarget construct() {
            return CallbackAnimationTarget.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    CallbackAnimationTarget.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
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
}
