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
 * the "visible-child-name" property of a {@link org.gtk.gtk.Stack} so that the current
 * page can be switched from a menu.  The active radio indication in the
 * menu is then directly determined from the active page of the
 * {@link org.gtk.gtk.Stack}.
 * <p>
 * An anti-example would be binding the "active-id" property on a
 * {@link org.gtk.gtk.ComboBox}.  This is because the state of the combobox itself is
 * probably uninteresting and is actually being used to control
 * something else.
 * <p>
 * Another anti-example would be to bind to the "visible-child-name"
 * property of a {@link org.gtk.gtk.Stack} if this value is actually stored in
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
     * @param  gobject            An object that inherits from GObject
     * @return                    An instance of "PropertyAction" that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GPropertyAction", a ClassCastException will be thrown.
     */
    public static PropertyAction castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GPropertyAction"))) {
            return new PropertyAction(gobject.handle(), gobject.refcounted().getOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GPropertyAction");
        }
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
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_property_action_new = Interop.downcallHandle(
            "g_property_action_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
    }
}
