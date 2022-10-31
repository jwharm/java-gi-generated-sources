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
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    @ApiStatus.Internal
    public PropertyAnimationTarget(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /**
     * Cast object to PropertyAnimationTarget if its GType is a (or inherits from) "AdwPropertyAnimationTarget".
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "PropertyAnimationTarget" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "AdwPropertyAnimationTarget", a ClassCastException will be thrown.
     */
    public static PropertyAnimationTarget castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("AdwPropertyAnimationTarget"))) {
            return new PropertyAnimationTarget(gobject.refcounted());
        } else {
            throw new ClassCastException("Object type is not an instance of AdwPropertyAnimationTarget");
        }
    }
    
    private static Refcounted constructNew(@NotNull org.gtk.gobject.Object object, @NotNull java.lang.String propertyName) {
        java.util.Objects.requireNonNull(object, "Parameter 'object' must not be null");
        java.util.Objects.requireNonNull(propertyName, "Parameter 'propertyName' must not be null");
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.adw_property_animation_target_new.invokeExact(
                    object.handle(),
                    Interop.allocateNativeString(propertyName)), true);
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
        super(constructNew(object, propertyName));
    }
    
    private static Refcounted constructNewForPspec(@NotNull org.gtk.gobject.Object object, @NotNull org.gtk.gobject.ParamSpec pspec) {
        java.util.Objects.requireNonNull(object, "Parameter 'object' must not be null");
        java.util.Objects.requireNonNull(pspec, "Parameter 'pspec' must not be null");
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.adw_property_animation_target_new_for_pspec.invokeExact(
                    object.handle(),
                    pspec.handle()), true);
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
        return new PropertyAnimationTarget(constructNewForPspec(object, pspec));
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
        return new org.gtk.gobject.Object(Refcounted.get(RESULT, false));
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
        return new org.gtk.gobject.ParamSpec(Refcounted.get(RESULT, false));
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle adw_property_animation_target_new = Interop.downcallHandle(
            "adw_property_animation_target_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_property_animation_target_new_for_pspec = Interop.downcallHandle(
            "adw_property_animation_target_new_for_pspec",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_property_animation_target_get_object = Interop.downcallHandle(
            "adw_property_animation_target_get_object",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle adw_property_animation_target_get_pspec = Interop.downcallHandle(
            "adw_property_animation_target_get_pspec",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
    }
}
