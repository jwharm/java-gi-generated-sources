package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * Virtual table for handling properties and method calls for a D-Bus
 * interface.
 * <p>
 * Since 2.38, if you want to handle getting/setting D-Bus properties
 * asynchronously, give {@code null} as your get_property() or set_property()
 * function. The D-Bus call will be directed to your {@code method_call} function,
 * with the provided {@code interface_name} set to "org.freedesktop.DBus.Properties".
 * <p>
 * Ownership of the {@link DBusMethodInvocation} object passed to the
 * method_call() function is transferred to your handler; you must
 * call one of the methods of {@link DBusMethodInvocation} to return a reply
 * (possibly empty), or an error. These functions also take ownership
 * of the passed-in invocation object, so unless the invocation
 * object has otherwise been referenced, it will be then be freed.
 * Calling one of these functions may be done within your
 * method_call() implementation but it also can be done at a later
 * point to handle the method asynchronously.
 * <p>
 * The usual checks on the validity of the calls is performed. For
 * {@code Get} calls, an error is automatically returned if the property does
 * not exist or the permissions do not allow access. The same checks are
 * performed for {@code Set} calls, and the provided value is also checked for
 * being the correct type.
 * <p>
 * For both {@code Get} and {@code Set} calls, the {@link DBusMethodInvocation}
 * passed to the {@code method_call} handler can be queried with
 * g_dbus_method_invocation_get_property_info() to get a pointer
 * to the {@link DBusPropertyInfo} of the property.
 * <p>
 * If you have readable properties specified in your interface info,
 * you must ensure that you either provide a non-{@code null} {@code get_property}()
 * function or provide implementations of both the {@code Get} and {@code GetAll}
 * methods on org.freedesktop.DBus.Properties interface in your {@code method_call}
 * function. Note that the required return type of the {@code Get} call is
 * {@code (v)}, not the type of the property. {@code GetAll} expects a return value
 * of type {@code a{sv}}.
 * <p>
 * If you have writable properties specified in your interface info,
 * you must ensure that you either provide a non-{@code null} {@code set_property}()
 * function or provide an implementation of the {@code Set} call. If implementing
 * the call, you must return the value of type {@code G_VARIANT_TYPE_UNIT}.
 */
public class DBusInterfaceVTable extends io.github.jwharm.javagi.ResourceBase {

    public DBusInterfaceVTable(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    public DBusInterfaceVTable() {
        super(References.get(io.github.jwharm.javagi.interop.jextract.GDBusInterfaceVTable.allocate(Interop.getAllocator()).address()));
    }
    
}
