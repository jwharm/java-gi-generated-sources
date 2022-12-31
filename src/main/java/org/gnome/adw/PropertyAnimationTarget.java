package org.gnome.adw;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * An {@link AnimationTarget} changing the value of a property of a
 * {@link org.gtk.gobject.GObject} instance.
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
    protected PropertyAnimationTarget(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, PropertyAnimationTarget> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new PropertyAnimationTarget(input, ownership);
    
    private static MemoryAddress constructNew(org.gtk.gobject.GObject object, java.lang.String propertyName) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_property_animation_target_new.invokeExact(
                    object.handle(),
                    Marshal.stringToAddress.marshal(propertyName, null));
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
    public PropertyAnimationTarget(org.gtk.gobject.GObject object, java.lang.String propertyName) {
        super(constructNew(object, propertyName), Ownership.FULL);
    }
    
    private static MemoryAddress constructNewForPspec(org.gtk.gobject.GObject object, org.gtk.gobject.ParamSpec pspec) {
        MemoryAddress RESULT;
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
    public static PropertyAnimationTarget newForPspec(org.gtk.gobject.GObject object, org.gtk.gobject.ParamSpec pspec) {
        var RESULT = constructNewForPspec(object, pspec);
        return (org.gnome.adw.PropertyAnimationTarget) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gnome.adw.PropertyAnimationTarget.fromAddress).marshal(RESULT, Ownership.FULL);
    }
    
    /**
     * Gets the object animated by {@code self}.
     * <p>
     * The {@code AdwPropertyAnimationTarget} instance does not hold a strong reference on
     * the object; make sure the object is kept alive throughout the target's
     * lifetime.
     * @return the animated object
     */
    public org.gtk.gobject.GObject getObject() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_property_animation_target_get_object.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gobject.GObject) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gobject.GObject.fromAddress).marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Gets the {@code GParamSpec} of the property animated by {@code self}.
     * @return the animated property's {@code GParamSpec}
     */
    public org.gtk.gobject.ParamSpec getPspec() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.adw_property_animation_target_get_pspec.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return (org.gtk.gobject.ParamSpec) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(RESULT)), org.gtk.gobject.ParamSpec.fromAddress).marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.adw_property_animation_target_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    /**
     * A {@link PropertyAnimationTarget.Builder} object constructs a {@link PropertyAnimationTarget} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link PropertyAnimationTarget.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gnome.adw.AnimationTarget.Builder {
        
        protected Builder() {
        }
        
        /**
         * Finish building the {@link PropertyAnimationTarget} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link PropertyAnimationTarget}.
         * @return A new instance of {@code PropertyAnimationTarget} with the properties 
         *         that were set in the Builder object.
         */
        public PropertyAnimationTarget build() {
            return (PropertyAnimationTarget) org.gtk.gobject.GObject.newWithProperties(
                PropertyAnimationTarget.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
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
        public Builder setObject(org.gtk.gobject.GObject object) {
            names.add("object");
            values.add(org.gtk.gobject.Value.create(object));
            return this;
        }
        
        /**
         * The {@code GParamSpec} of the property to be animated.
         * @param pspec The value for the {@code pspec} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setPspec(org.gtk.gobject.ParamSpec pspec) {
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
