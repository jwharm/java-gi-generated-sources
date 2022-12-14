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
public class DBusInterfaceVTable extends Struct {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GDBusInterfaceVTable";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.ADDRESS.withName("method_call"),
            Interop.valueLayout.ADDRESS.withName("get_property"),
            Interop.valueLayout.ADDRESS.withName("set_property"),
            MemoryLayout.sequenceLayout(8, Interop.valueLayout.ADDRESS).withName("padding")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link DBusInterfaceVTable}
     * @return A new, uninitialized @{link DBusInterfaceVTable}
     */
    public static DBusInterfaceVTable allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        DBusInterfaceVTable newInstance = new DBusInterfaceVTable(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code method_call}
     * @return The value of the field {@code method_call}
     */
    public org.gtk.gio.DBusInterfaceMethodCallFunc getMethodCall() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("method_call"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return null /* Unsupported parameter type */;
        }
    }
    
    /**
     * Change the value of the field {@code method_call}
     * @param methodCall The new value of the field {@code method_call}
     */
    public void setMethodCall(org.gtk.gio.DBusInterfaceMethodCallFunc methodCall) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("method_call"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (methodCall == null ? MemoryAddress.NULL : (Addressable) methodCall.toCallback()));
        }
    }
    
    /**
     * Get the value of the field {@code get_property}
     * @return The value of the field {@code get_property}
     */
    public org.gtk.gio.DBusInterfaceGetPropertyFunc getGetProperty() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_property"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return null /* Unsupported parameter type */;
        }
    }
    
    /**
     * Change the value of the field {@code get_property}
     * @param getProperty The new value of the field {@code get_property}
     */
    public void setGetProperty(org.gtk.gio.DBusInterfaceGetPropertyFunc getProperty) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_property"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getProperty == null ? MemoryAddress.NULL : (Addressable) getProperty.toCallback()));
        }
    }
    
    /**
     * Get the value of the field {@code set_property}
     * @return The value of the field {@code set_property}
     */
    public org.gtk.gio.DBusInterfaceSetPropertyFunc getSetProperty() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_property"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return null /* Unsupported parameter type */;
        }
    }
    
    /**
     * Change the value of the field {@code set_property}
     * @param setProperty The new value of the field {@code set_property}
     */
    public void setSetProperty(org.gtk.gio.DBusInterfaceSetPropertyFunc setProperty) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_property"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (setProperty == null ? MemoryAddress.NULL : (Addressable) setProperty.toCallback()));
        }
    }
    
    /**
     * Create a DBusInterfaceVTable proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected DBusInterfaceVTable(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, DBusInterfaceVTable> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new DBusInterfaceVTable(input);
    
    /**
     * A {@link DBusInterfaceVTable.Builder} object constructs a {@link DBusInterfaceVTable} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link DBusInterfaceVTable.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final DBusInterfaceVTable struct;
        
        private Builder() {
            struct = DBusInterfaceVTable.allocate();
        }
        
        /**
         * Finish building the {@link DBusInterfaceVTable} struct.
         * @return A new instance of {@code DBusInterfaceVTable} with the fields 
         *         that were set in the Builder object.
         */
        public DBusInterfaceVTable build() {
            return struct;
        }
        
        /**
         * Function for handling incoming method calls.
         * @param methodCall The value for the {@code methodCall} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setMethodCall(org.gtk.gio.DBusInterfaceMethodCallFunc methodCall) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("method_call"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (methodCall == null ? MemoryAddress.NULL : (Addressable) methodCall.toCallback()));
                return this;
            }
        }
        
        /**
         * Function for getting a property.
         * @param getProperty The value for the {@code getProperty} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setGetProperty(org.gtk.gio.DBusInterfaceGetPropertyFunc getProperty) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("get_property"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getProperty == null ? MemoryAddress.NULL : (Addressable) getProperty.toCallback()));
                return this;
            }
        }
        
        /**
         * Function for setting a property.
         * @param setProperty The value for the {@code setProperty} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setSetProperty(org.gtk.gio.DBusInterfaceSetPropertyFunc setProperty) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("set_property"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (setProperty == null ? MemoryAddress.NULL : (Addressable) setProperty.toCallback()));
                return this;
            }
        }
        
        public Builder setPadding(java.lang.foreign.MemoryAddress[] padding) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("padding"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (padding == null ? MemoryAddress.NULL : Interop.allocateNativeArray(padding, false, SCOPE)));
                return this;
            }
        }
    }
}
