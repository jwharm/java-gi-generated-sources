package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * A {@link org.gtk.gio.PropertyAction} is a way to get a {@link org.gtk.gio.Action} with a state value
 * reflecting and controlling the value of a {@link org.gtk.gobject.Object} property.
 * 
 * The state of the action will correspond to the value of the property.
 * Changing it will change the property (assuming the requested value
 * matches the requirements as specified in the {@link org.gtk.gobject.ParamSpec} .
 * 
 * Only the most common types are presently supported.  Booleans are
 * mapped to booleans, strings to strings, signed/unsigned integers to
 * int32/uint32 and floats and doubles to doubles.
 * 
 * If the property is an enum then the state will be string-typed and
 * conversion will automatically be performed between the enum value and
 * &<code>#34</code> nick&<code>#34</code>  string as per the {@link org.gtk.gobject.EnumValue} table.
 * 
 * Flags types are not currently supported.
 * 
 * Properties of object types, boxed types and pointer types are not
 * supported and probably never will be.
 * 
 * Properties of {@link org.gtk.glib.Variant} types are not currently supported.
 * 
 * If the property is boolean-valued then the action will have a NULL
 * parameter type, and activating the action (with no parameter) will
 * toggle the value of the property.
 * 
 * In all other cases, the parameter type will correspond to the type of
 * the property.
 * 
 * The general idea here is to reduce the number of locations where a
 * particular piece of state is kept (and therefore has to be synchronised
 * between). {@link org.gtk.gio.PropertyAction} does not have a separate state that is kept
 * in sync with the property value -- its state is the property value.
 * 
 * For example, it might be useful to create a {@link org.gtk.gio.Action} corresponding to
 * the &<code>#34</code> visible-child-name&<code>#34</code>  property of a {@link org.gtk.gtk.Stack} so that the current
 * page can be switched from a menu.  The active radio indication in the
 * menu is then directly determined from the active page of the
 * {@link org.gtk.gtk.Stack} 
 * 
 * An anti-example would be binding the &<code>#34</code> active-id&<code>#34</code>  property on a
 * {@link org.gtk.gtk.ComboBox}   This is because the state of the combobox itself is
 * probably uninteresting and is actually being used to control
 * something else.
 * 
 * Another anti-example would be to bind to the &<code>#34</code> visible-child-name&<code>#34</code> 
 * property of a {@link org.gtk.gtk.Stack} if this value is actually stored in
 * {@link org.gtk.gio.Settings}   In that case, the real source of the value is
 * {@link org.gtk.gio.Settings}   If you want a {@link org.gtk.gio.Action} to control a setting stored in
 * {@link org.gtk.gio.Settings}  see g_settings_create_action() instead, and possibly
 * combine its use with g_settings_bind().
 */
public class PropertyAction extends org.gtk.gobject.Object implements Action {

    public PropertyAction(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to PropertyAction */
    public static PropertyAction castFrom(org.gtk.gobject.Object gobject) {
        return new PropertyAction(gobject.getReference());
    }
    
    private static Reference constructNew(java.lang.String name, org.gtk.gobject.Object object, java.lang.String propertyName) {
        Reference RESULT = References.get(gtk_h.g_property_action_new(Interop.allocateNativeString(name).handle(), object.handle(), Interop.allocateNativeString(propertyName).handle()), true);
        return RESULT;
    }
    
    /**
     * Creates a {@link org.gtk.gio.Action} corresponding to the value of property
     * @property_name on @object.
     * 
     * The property must be existent and readable and writable (and not
     * construct-only).
     * 
     * This function takes a reference on @object and doesn&<code>#39</code> t release it
     * until the action is destroyed.
     */
    public PropertyAction(java.lang.String name, org.gtk.gobject.Object object, java.lang.String propertyName) {
        super(constructNew(name, object, propertyName));
    }
    
}
