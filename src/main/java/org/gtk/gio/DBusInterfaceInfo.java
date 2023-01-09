package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Information about a D-Bus interface.
 * @version 2.26
 */
public class DBusInterfaceInfo extends Struct {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GDBusInterfaceInfo";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.C_INT.withName("ref_count"),
            MemoryLayout.paddingLayout(32),
            Interop.valueLayout.ADDRESS.withName("name"),
            Interop.valueLayout.ADDRESS.withName("methods"),
            Interop.valueLayout.ADDRESS.withName("signals"),
            Interop.valueLayout.ADDRESS.withName("properties"),
            Interop.valueLayout.ADDRESS.withName("annotations")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link DBusInterfaceInfo}
     * @return A new, uninitialized @{link DBusInterfaceInfo}
     */
    public static DBusInterfaceInfo allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        DBusInterfaceInfo newInstance = new DBusInterfaceInfo(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code ref_count}
     * @return The value of the field {@code ref_count}
     */
    public int getRefCount() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (int) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("ref_count"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return RESULT;
        }
    }
    
    /**
     * Change the value of the field {@code ref_count}
     * @param refCount The new value of the field {@code ref_count}
     */
    public void setRefCount(int refCount) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("ref_count"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), refCount);
        }
    }
    
    /**
     * Get the value of the field {@code name}
     * @return The value of the field {@code name}
     */
    public java.lang.String getName() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("name"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return Marshal.addressToString.marshal(RESULT, null);
        }
    }
    
    /**
     * Change the value of the field {@code name}
     * @param name The new value of the field {@code name}
     */
    public void setName(java.lang.String name) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("name"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (name == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(name, SCOPE)));
        }
    }
    
    /**
     * Get the value of the field {@code methods}
     * @return The value of the field {@code methods}
     */
    public PointerProxy<org.gtk.gio.DBusMethodInfo> getMethods() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("methods"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return new PointerProxy<org.gtk.gio.DBusMethodInfo>(RESULT, org.gtk.gio.DBusMethodInfo.fromAddress);
        }
    }
    
    /**
     * Change the value of the field {@code methods}
     * @param methods The new value of the field {@code methods}
     */
    public void setMethods(org.gtk.gio.DBusMethodInfo[] methods) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("methods"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (methods == null ? MemoryAddress.NULL : Interop.allocateNativeArray(methods, org.gtk.gio.DBusMethodInfo.getMemoryLayout(), false, SCOPE)));
        }
    }
    
    /**
     * Get the value of the field {@code signals}
     * @return The value of the field {@code signals}
     */
    public PointerProxy<org.gtk.gio.DBusSignalInfo> getSignals() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("signals"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return new PointerProxy<org.gtk.gio.DBusSignalInfo>(RESULT, org.gtk.gio.DBusSignalInfo.fromAddress);
        }
    }
    
    /**
     * Change the value of the field {@code signals}
     * @param signals The new value of the field {@code signals}
     */
    public void setSignals(org.gtk.gio.DBusSignalInfo[] signals) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("signals"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (signals == null ? MemoryAddress.NULL : Interop.allocateNativeArray(signals, org.gtk.gio.DBusSignalInfo.getMemoryLayout(), false, SCOPE)));
        }
    }
    
    /**
     * Get the value of the field {@code properties}
     * @return The value of the field {@code properties}
     */
    public PointerProxy<org.gtk.gio.DBusPropertyInfo> getProperties() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("properties"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return new PointerProxy<org.gtk.gio.DBusPropertyInfo>(RESULT, org.gtk.gio.DBusPropertyInfo.fromAddress);
        }
    }
    
    /**
     * Change the value of the field {@code properties}
     * @param properties The new value of the field {@code properties}
     */
    public void setProperties(org.gtk.gio.DBusPropertyInfo[] properties) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("properties"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (properties == null ? MemoryAddress.NULL : Interop.allocateNativeArray(properties, org.gtk.gio.DBusPropertyInfo.getMemoryLayout(), false, SCOPE)));
        }
    }
    
    /**
     * Get the value of the field {@code annotations}
     * @return The value of the field {@code annotations}
     */
    public PointerProxy<org.gtk.gio.DBusAnnotationInfo> getAnnotations() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("annotations"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return new PointerProxy<org.gtk.gio.DBusAnnotationInfo>(RESULT, org.gtk.gio.DBusAnnotationInfo.fromAddress);
        }
    }
    
    /**
     * Change the value of the field {@code annotations}
     * @param annotations The new value of the field {@code annotations}
     */
    public void setAnnotations(org.gtk.gio.DBusAnnotationInfo[] annotations) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("annotations"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (annotations == null ? MemoryAddress.NULL : Interop.allocateNativeArray(annotations, org.gtk.gio.DBusAnnotationInfo.getMemoryLayout(), false, SCOPE)));
        }
    }
    
    /**
     * Create a DBusInterfaceInfo proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected DBusInterfaceInfo(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, DBusInterfaceInfo> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new DBusInterfaceInfo(input);
    
    /**
     * Builds a lookup-cache to speed up
     * g_dbus_interface_info_lookup_method(),
     * g_dbus_interface_info_lookup_signal() and
     * g_dbus_interface_info_lookup_property().
     * <p>
     * If this has already been called with {@code info}, the existing cache is
     * used and its use count is increased.
     * <p>
     * Note that {@code info} cannot be modified until
     * g_dbus_interface_info_cache_release() is called.
     */
    public void cacheBuild() {
        try {
            DowncallHandles.g_dbus_interface_info_cache_build.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Decrements the usage count for the cache for {@code info} built by
     * g_dbus_interface_info_cache_build() (if any) and frees the
     * resources used by the cache if the usage count drops to zero.
     */
    public void cacheRelease() {
        try {
            DowncallHandles.g_dbus_interface_info_cache_release.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Appends an XML representation of {@code info} (and its children) to {@code string_builder}.
     * <p>
     * This function is typically used for generating introspection XML
     * documents at run-time for handling the
     * {@code org.freedesktop.DBus.Introspectable.Introspect}
     * method.
     * @param indent Indentation level.
     * @param stringBuilder A {@link org.gtk.glib.GString} to to append XML data to.
     */
    public void generateXml(int indent, org.gtk.glib.GString stringBuilder) {
        try {
            DowncallHandles.g_dbus_interface_info_generate_xml.invokeExact(
                    handle(),
                    indent,
                    stringBuilder.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Looks up information about a method.
     * <p>
     * The cost of this function is O(n) in number of methods unless
     * g_dbus_interface_info_cache_build() has been used on {@code info}.
     * @param name A D-Bus method name (typically in CamelCase)
     * @return A {@link DBusMethodInfo} or {@code null} if not found. Do not free, it is owned by {@code info}.
     */
    public @Nullable org.gtk.gio.DBusMethodInfo lookupMethod(java.lang.String name) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_dbus_interface_info_lookup_method.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(name, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return org.gtk.gio.DBusMethodInfo.fromAddress.marshal(RESULT, null);
        }
    }
    
    /**
     * Looks up information about a property.
     * <p>
     * The cost of this function is O(n) in number of properties unless
     * g_dbus_interface_info_cache_build() has been used on {@code info}.
     * @param name A D-Bus property name (typically in CamelCase).
     * @return A {@link DBusPropertyInfo} or {@code null} if not found. Do not free, it is owned by {@code info}.
     */
    public @Nullable org.gtk.gio.DBusPropertyInfo lookupProperty(java.lang.String name) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_dbus_interface_info_lookup_property.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(name, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return org.gtk.gio.DBusPropertyInfo.fromAddress.marshal(RESULT, null);
        }
    }
    
    /**
     * Looks up information about a signal.
     * <p>
     * The cost of this function is O(n) in number of signals unless
     * g_dbus_interface_info_cache_build() has been used on {@code info}.
     * @param name A D-Bus signal name (typically in CamelCase)
     * @return A {@link DBusSignalInfo} or {@code null} if not found. Do not free, it is owned by {@code info}.
     */
    public @Nullable org.gtk.gio.DBusSignalInfo lookupSignal(java.lang.String name) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_dbus_interface_info_lookup_signal.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(name, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return org.gtk.gio.DBusSignalInfo.fromAddress.marshal(RESULT, null);
        }
    }
    
    /**
     * If {@code info} is statically allocated does nothing. Otherwise increases
     * the reference count.
     * @return The same {@code info}.
     */
    public org.gtk.gio.DBusInterfaceInfo ref() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_dbus_interface_info_ref.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gtk.gio.DBusInterfaceInfo.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * If {@code info} is statically allocated, does nothing. Otherwise decreases
     * the reference count of {@code info}. When its reference count drops to 0,
     * the memory used is freed.
     */
    public void unref() {
        try {
            DowncallHandles.g_dbus_interface_info_unref.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_dbus_interface_info_cache_build = Interop.downcallHandle(
                "g_dbus_interface_info_cache_build",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_dbus_interface_info_cache_release = Interop.downcallHandle(
                "g_dbus_interface_info_cache_release",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_dbus_interface_info_generate_xml = Interop.downcallHandle(
                "g_dbus_interface_info_generate_xml",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_dbus_interface_info_lookup_method = Interop.downcallHandle(
                "g_dbus_interface_info_lookup_method",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_dbus_interface_info_lookup_property = Interop.downcallHandle(
                "g_dbus_interface_info_lookup_property",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_dbus_interface_info_lookup_signal = Interop.downcallHandle(
                "g_dbus_interface_info_lookup_signal",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_dbus_interface_info_ref = Interop.downcallHandle(
                "g_dbus_interface_info_ref",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_dbus_interface_info_unref = Interop.downcallHandle(
                "g_dbus_interface_info_unref",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
    }
    
    /**
     * A {@link DBusInterfaceInfo.Builder} object constructs a {@link DBusInterfaceInfo} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link DBusInterfaceInfo.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final DBusInterfaceInfo struct;
        
        private Builder() {
            struct = DBusInterfaceInfo.allocate();
        }
        
        /**
         * Finish building the {@link DBusInterfaceInfo} struct.
         * @return A new instance of {@code DBusInterfaceInfo} with the fields 
         *         that were set in the Builder object.
         */
        public DBusInterfaceInfo build() {
            return struct;
        }
        
        /**
         * The reference count or -1 if statically allocated.
         * @param refCount The value for the {@code refCount} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setRefCount(int refCount) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("ref_count"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), refCount);
                return this;
            }
        }
        
        /**
         * The name of the D-Bus interface, e.g. "org.freedesktop.DBus.Properties".
         * @param name The value for the {@code name} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setName(java.lang.String name) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("name"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (name == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(name, SCOPE)));
                return this;
            }
        }
        
        /**
         * A pointer to a {@code null}-terminated array of pointers to {@link DBusMethodInfo} structures or {@code null} if there are no methods.
         * @param methods The value for the {@code methods} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setMethods(org.gtk.gio.DBusMethodInfo[] methods) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("methods"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (methods == null ? MemoryAddress.NULL : Interop.allocateNativeArray(methods, org.gtk.gio.DBusMethodInfo.getMemoryLayout(), false, SCOPE)));
                return this;
            }
        }
        
        /**
         * A pointer to a {@code null}-terminated array of pointers to {@link DBusSignalInfo} structures or {@code null} if there are no signals.
         * @param signals The value for the {@code signals} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setSignals(org.gtk.gio.DBusSignalInfo[] signals) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("signals"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (signals == null ? MemoryAddress.NULL : Interop.allocateNativeArray(signals, org.gtk.gio.DBusSignalInfo.getMemoryLayout(), false, SCOPE)));
                return this;
            }
        }
        
        /**
         * A pointer to a {@code null}-terminated array of pointers to {@link DBusPropertyInfo} structures or {@code null} if there are no properties.
         * @param properties The value for the {@code properties} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setProperties(org.gtk.gio.DBusPropertyInfo[] properties) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("properties"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (properties == null ? MemoryAddress.NULL : Interop.allocateNativeArray(properties, org.gtk.gio.DBusPropertyInfo.getMemoryLayout(), false, SCOPE)));
                return this;
            }
        }
        
        /**
         * A pointer to a {@code null}-terminated array of pointers to {@link DBusAnnotationInfo} structures or {@code null} if there are no annotations.
         * @param annotations The value for the {@code annotations} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setAnnotations(org.gtk.gio.DBusAnnotationInfo[] annotations) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("annotations"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (annotations == null ? MemoryAddress.NULL : Interop.allocateNativeArray(annotations, org.gtk.gio.DBusAnnotationInfo.getMemoryLayout(), false, SCOPE)));
                return this;
            }
        }
    }
}
