package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

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
 * @version 2.26
 */
public class DBusInterfaceVTable extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GDBusInterfaceVTable";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.ADDRESS.withName("method_call"),
        Interop.valueLayout.ADDRESS.withName("get_property"),
        Interop.valueLayout.ADDRESS.withName("set_property"),
        MemoryLayout.paddingLayout(320),
        MemoryLayout.sequenceLayout(8, ValueLayout.ADDRESS).withName("padding")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    public static DBusInterfaceVTable allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        DBusInterfaceVTable newInstance = new DBusInterfaceVTable(Refcounted.get(segment.address()));
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code method_call}
     * @return The value of the field {@code method_call}
     */
    public org.gtk.gio.DBusInterfaceMethodCallFunc method_call$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("method_call"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return null /* Unsupported parameter type */;
    }
    
    /**
     * Get the value of the field {@code get_property}
     * @return The value of the field {@code get_property}
     */
    public org.gtk.gio.DBusInterfaceGetPropertyFunc get_property$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("get_property"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return null /* Unsupported parameter type */;
    }
    
    /**
     * Get the value of the field {@code set_property}
     * @return The value of the field {@code set_property}
     */
    public org.gtk.gio.DBusInterfaceSetPropertyFunc set_property$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("set_property"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return null /* Unsupported parameter type */;
    }
    
    @ApiStatus.Internal
    public DBusInterfaceVTable(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
}
