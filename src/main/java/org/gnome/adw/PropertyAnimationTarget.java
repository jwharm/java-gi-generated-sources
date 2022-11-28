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
            return new PropertyAnimationTarget(gobject.handle(), gobject.yieldOwnership());
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
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.adw_property_animation_target_get_type.invokeExact();
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
         * A {@link PropertyAnimationTarget.Build} object constructs a {@link PropertyAnimationTarget} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link PropertyAnimationTarget} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link PropertyAnimationTarget} using {@link PropertyAnimationTarget#castFrom}.
         * @return A new instance of {@code PropertyAnimationTarget} with the properties 
         *         that were set in the Build object.
         */
        public PropertyAnimationTarget construct() {
            return PropertyAnimationTarget.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    PropertyAnimationTarget.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        /**
         * The object whose property will be animated.
         * <p>
         * The {@code AdwPropertyAnimationTarget} instance does not hold a strong reference
         * on the object; make sure the object is kept alive throughout the target's
         * lifetime.
         * @param object The value for the {@code object} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setObject(org.gtk.gobject.Object object) {
            names.add("object");
            values.add(org.gtk.gobject.Value.create(object));
            return this;
        }
        
        /**
         * The {@code GParamSpec} of the property to be animated.
         * @param pspec The value for the {@code pspec} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setPspec(org.gtk.gobject.ParamSpec pspec) {
            names.add("pspec");
            values.add(org.gtk.gobject.Value.create(pspec));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle adw_property_animation_target_new = Interop.downcallHandle(
            "adw_property_animation_target_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_property_animation_target_new_for_pspec = Interop.downcallHandle(
            "adw_property_animation_target_new_for_pspec",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_property_animation_target_get_object = Interop.downcallHandle(
            "adw_property_animation_target_get_object",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_property_animation_target_get_pspec = Interop.downcallHandle(
            "adw_property_animation_target_get_pspec",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle adw_property_animation_target_get_type = Interop.downcallHandle(
            "adw_property_animation_target_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
