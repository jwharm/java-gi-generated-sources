package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * Virtual table for handling properties and method calls for a D-Bus
 * interface.
 * <p>
 * Since 2.38, if you want to handle getting/setting D-Bus properties
 * asynchronously, give <code>null</code> as your get_property() or set_property()
 * function. The D-Bus call will be directed to your @method_call function,
 * with the provided @interface_name set to &#34;org.freedesktop.DBus.Properties&#34;.
 * <p>
 * Ownership of the #GDBusMethodInvocation object passed to the
 * method_call() function is transferred to your handler; you must
 * call one of the methods of #GDBusMethodInvocation to return a reply
 * (possibly empty), or an error. These functions also take ownership
 * of the passed-in invocation object, so unless the invocation
 * object has otherwise been referenced, it will be then be freed.
 * Calling one of these functions may be done within your
 * method_call() implementation but it also can be done at a later
 * point to handle the method asynchronously.
 * <p>
 * The usual checks on the validity of the calls is performed. For<code>Get</code> calls, an error is automatically returned if the property does
 * not exist or the permissions do not allow access. The same checks are
 * performed for <code>Set</code> calls, and the provided value is also checked for
 * being the correct type.
 * <p>
 * For both <code>Get</code> and <code>Set</code> calls, the #GDBusMethodInvocation
 * passed to the @method_call handler can be queried with
 * g_dbus_method_invocation_get_property_info() to get a pointer
 * to the #GDBusPropertyInfo of the property.
 * <p>
 * If you have readable properties specified in your interface info,
 * you must ensure that you either provide a non-<code>null</code> @get_property()
 * function or provide implementations of both the <code>Get</code> and <code>GetAll</code>
 * methods on org.freedesktop.DBus.Properties interface in your @method_call
 * function. Note that the required return type of the <code>Get</code> call is<code>(v)</code>, not the type of the property. <code>GetAll</code> expects a return value
 * of type <code>a{sv}</code>.
 * <p>
 * If you have writable properties specified in your interface info,
 * you must ensure that you either provide a non-<code>null</code> @set_property()
 * function or provide an implementation of the <code>Set</code> call. If implementing
 * the call, you must return the value of type @set_property()
 * function or provide an implementation of the <code>Set</code> call. If implementing
 * the call, you must return the value of type %G_VARIANT_TYPE_UNIT.
 */
public class DBusInterfaceVTable extends io.github.jwharm.javagi.ResourceBase {

    public DBusInterfaceVTable(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
}
