package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A {@link PropertyAction} is a way to get a {@link Action} with a state value
 * reflecting and controlling the value of a {@link org.gtk.gobject.Object} property.
 * <p>
 * The state of the action will correspond to the value of the property.
 * Changing it will change the property (assuming the requested value
 * matches the requirements as specified in the {@link org.gtk.gobject.ParamSpec}).
 * <p>
 * Only the most common types are presently supported.  Booleans are
 * mapped to booleans, strings to strings, signed/unsigned integers to
 * int32/uint32 and floats and doubles to doubles.
 * <p>
 * If the property is an enum then the state will be string-typed and
 * conversion will automatically be performed between the enum value and
 * "nick" string as per the {@link org.gtk.gobject.EnumValue} table.
 * <p>
 * Flags types are not currently supported.
 * <p>
 * Properties of object types, boxed types and pointer types are not
 * supported and probably never will be.
 * <p>
 * Properties of {@link org.gtk.glib.Variant} types are not currently supported.
 * <p>
 * If the property is boolean-valued then the action will have a NULL
 * parameter type, and activating the action (with no parameter) will
 * toggle the value of the property.
 * <p>
 * In all other cases, the parameter type will correspond to the type of
 * the property.
 * <p>
 * The general idea here is to reduce the number of locations where a
 * particular piece of state is kept (and therefore has to be synchronised
 * between). {@link PropertyAction} does not have a separate state that is kept
 * in sync with the property value -- its state is the property value.
 * <p>
 * For example, it might be useful to create a {@link Action} corresponding to
 * the "visible-child-name" property of a {@code GtkStack} so that the current
 * page can be switched from a menu.  The active radio indication in the
 * menu is then directly determined from the active page of the
 * {@code GtkStack}.
 * <p>
 * An anti-example would be binding the "active-id" property on a
 * {@code GtkComboBox}.  This is because the state of the combobox itself is
 * probably uninteresting and is actually being used to control
 * something else.
 * <p>
 * Another anti-example would be to bind to the "visible-child-name"
 * property of a {@code GtkStack} if this value is actually stored in
 * {@link Settings}.  In that case, the real source of the value is
 * {@link Settings}.  If you want a {@link Action} to control a setting stored in
 * {@link Settings}, see g_settings_create_action() instead, and possibly
 * combine its use with g_settings_bind().
 * @version 2.38
 */
public class PropertyAction extends org.gtk.gobject.Object implements org.gtk.gio.Action {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GPropertyAction";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    /**
     * Create a PropertyAction proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public PropertyAction(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to PropertyAction if its GType is a (or inherits from) "GPropertyAction".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code PropertyAction} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GPropertyAction", a ClassCastException will be thrown.
     */
    public static PropertyAction castFrom(org.gtk.gobject.Object gobject) {
            return new PropertyAction(gobject.handle(), gobject.yieldOwnership());
    }
    
    private static Addressable constructNew(@NotNull java.lang.String name, @NotNull org.gtk.gobject.Object object, @NotNull java.lang.String propertyName) {
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        java.util.Objects.requireNonNull(object, "Parameter 'object' must not be null");
        java.util.Objects.requireNonNull(propertyName, "Parameter 'propertyName' must not be null");
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_property_action_new.invokeExact(
                    Interop.allocateNativeString(name),
                    object.handle(),
                    Interop.allocateNativeString(propertyName));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a {@link Action} corresponding to the value of property
     * {@code property_name} on {@code object}.
     * <p>
     * The property must be existent and readable and writable (and not
     * construct-only).
     * <p>
     * This function takes a reference on {@code object} and doesn't release it
     * until the action is destroyed.
     * @param name the name of the action to create
     * @param object the object that has the property
     *   to wrap
     * @param propertyName the name of the property
     */
    public PropertyAction(@NotNull java.lang.String name, @NotNull org.gtk.gobject.Object object, @NotNull java.lang.String propertyName) {
        super(constructNew(name, object, propertyName), Ownership.FULL);
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static @NotNull org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_property_action_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * GObjects with properties.
     */
    public static class Build extends org.gtk.gobject.Object.Build {
        
         /**
         * A {@link PropertyAction.Build} object constructs a {@link PropertyAction} 
         * using the <em>builder pattern</em> to set property values. 
         * Use the various {@code set...()} methods to set properties, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
        }
        
         /**
         * Finish building the {@link PropertyAction} object.
         * Internally, a call to {@link org.gtk.gobject.GObject#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link PropertyAction} using {@link PropertyAction#castFrom}.
         * @return A new instance of {@code PropertyAction} with the properties 
         *         that were set in the Build object.
         */
        public PropertyAction construct() {
            return PropertyAction.castFrom(
                org.gtk.gobject.Object.newWithProperties(
                    PropertyAction.getType(),
                    names.size(),
                    names.toArray(new String[0]),
                    values.toArray(new org.gtk.gobject.Value[0])
                )
            );
        }
        
        /**
         * If {@code action} is currently enabled.
         * <p>
         * If the action is disabled then calls to g_action_activate() and
         * g_action_change_state() have no effect.
         * @param enabled The value for the {@code enabled} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setEnabled(boolean enabled) {
            names.add("enabled");
            values.add(org.gtk.gobject.Value.create(enabled));
            return this;
        }
        
        /**
         * If {@code true}, the state of the action will be the negation of the
         * property value, provided the property is boolean.
         * @param invertBoolean The value for the {@code invert-boolean} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setInvertBoolean(boolean invertBoolean) {
            names.add("invert-boolean");
            values.add(org.gtk.gobject.Value.create(invertBoolean));
            return this;
        }
        
        /**
         * The name of the action.  This is mostly meaningful for identifying
         * the action once it has been added to a {@link ActionMap}.
         * @param name The value for the {@code name} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setName(java.lang.String name) {
            names.add("name");
            values.add(org.gtk.gobject.Value.create(name));
            return this;
        }
        
        /**
         * The object to wrap a property on.
         * <p>
         * The object must be a non-{@code null} {@link org.gtk.gobject.Object} with properties.
         * @param object The value for the {@code object} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setObject(org.gtk.gobject.Object object) {
            names.add("object");
            values.add(org.gtk.gobject.Value.create(object));
            return this;
        }
        
        /**
         * The type of the parameter that must be given when activating the
         * action.
         * @param parameterType The value for the {@code parameter-type} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setParameterType(org.gtk.glib.VariantType parameterType) {
            names.add("parameter-type");
            values.add(org.gtk.gobject.Value.create(parameterType));
            return this;
        }
        
        /**
         * The name of the property to wrap on the object.
         * <p>
         * The property must exist on the passed-in object and it must be
         * readable and writable (and not construct-only).
         * @param propertyName The value for the {@code property-name} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setPropertyName(java.lang.String propertyName) {
            names.add("property-name");
            values.add(org.gtk.gobject.Value.create(propertyName));
            return this;
        }
        
        /**
         * The state of the action, or {@code null} if the action is stateless.
         * @param state The value for the {@code state} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setState(org.gtk.glib.Variant state) {
            names.add("state");
            values.add(org.gtk.gobject.Value.create(state));
            return this;
        }
        
        /**
         * The {@link org.gtk.glib.VariantType} of the state that the action has, or {@code null} if the
         * action is stateless.
         * @param stateType The value for the {@code state-type} property
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setStateType(org.gtk.glib.VariantType stateType) {
            names.add("state-type");
            values.add(org.gtk.gobject.Value.create(stateType));
            return this;
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_property_action_new = Interop.downcallHandle(
            "g_property_action_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_property_action_get_type = Interop.downcallHandle(
            "g_property_action_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
