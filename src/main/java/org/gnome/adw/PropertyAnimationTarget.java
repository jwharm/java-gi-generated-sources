package org.gnome.adw;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * An {@link AnimationTarget} changing the value of a property of a
 * {@link org.gtk.gobject.Object} instance.
 * @version 1.2
 */
public class PropertyAnimationTarget extends org.gnome.adw.AnimationTarget {
    
    static {
        Adw.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "AdwPropertyAnimationTarget";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a PropertyAnimationTarget proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public PropertyAnimationTarget(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to PropertyAnimationTarget if its GType is a (or inherits from) "AdwPropertyAnimationTarget".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code PropertyAnimationTarget} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "AdwPropertyAnimationTarget", a ClassCastException will be thrown.
     */
    public static PropertyAnimationTarget castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("AdwPropertyAnimationTarget"))) {
            return new PropertyAnimationTarget(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of AdwPropertyAnimationTarget");
        }
    }
    
    private static Addressable constructNew(@NotNull org.gtk.gobject.Object object, @NotNull java.lang.String propertyName) {
        java.util.Objects.requireNonNull(object, "Parameter 'object' must not be null");
        java.util.Objects.requireNonNull(propertyName, "Parameter 'propertyName' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_property_animation_target_new.invokeExact(
                    object.handle(),
                    Interop.allocateNativeString(propertyName));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code AdwPropertyAnimationTarget} for the {@code property_name} property on
     * {@code object}.
     * @param object an object to be animated
     * @param propertyName the name of the property on {@code object} to animate
     */
    public PropertyAnimationTarget(@NotNull org.gtk.gobject.Object object, @NotNull java.lang.String propertyName) {
        super(constructNew(object, propertyName), Ownership.FULL);
    }
    
    private static Addressable constructNewForPspec(@NotNull org.gtk.gobject.Object object, @NotNull org.gtk.gobject.ParamSpec pspec) {
        java.util.Objects.requireNonNull(object, "Parameter 'object' must not be null");
        java.util.Objects.requireNonNull(pspec, "Parameter 'pspec' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_property_animation_target_new_for_pspec.invokeExact(
                    object.handle(),
                    pspec.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@code AdwPropertyAnimationTarget} for the {@code pspec} property on
     * {@code object}.
     * @param object an object to be animated
     * @param pspec the param spec of the property on {@code object} to animate
     * @return new newly created {@code AdwPropertyAnimationTarget}
     */
    public static PropertyAnimationTarget newForPspec(@NotNull org.gtk.gobject.Object object, @NotNull org.gtk.gobject.ParamSpec pspec) {
        return new PropertyAnimationTarget(constructNewForPspec(object, pspec), Ownership.FULL);
    }
    
    /**
     * Gets the object animated by {@code self}.
     * <p>
     * The {@code AdwPropertyAnimationTarget} instance does not hold a strong reference on
     * the object; make sure the object is kept alive throughout the target's
     * lifetime.
     * @return the animated object
     */
    public @NotNull org.gtk.gobject.Object getObject() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_property_animation_target_get_object.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gobject.Object(RESULT, Ownership.NONE);
    }
    
    /**
     * Gets the {@code GParamSpec} of the property animated by {@code self}.
     * @return the animated property's {@code GParamSpec}
     */
    public @NotNull org.gtk.gobject.ParamSpec getPspec() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_property_animation_target_get_pspec.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gobject.ParamSpec(RESULT, Ownership.NONE);
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle adw_property_animation_target_new = Interop.downcallHandle(
            "adw_property_animation_target_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_property_animation_target_new_for_pspec = Interop.downcallHandle(
            "adw_property_animation_target_new_for_pspec",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_property_animation_target_get_object = Interop.downcallHandle(
            "adw_property_animation_target_get_object",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_property_animation_target_get_pspec = Interop.downcallHandle(
            "adw_property_animation_target_get_pspec",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
    }
}
