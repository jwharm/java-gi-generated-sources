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
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.C_INT.withName("ref_count"),
        MemoryLayout.paddingLayout(32),
        Interop.valueLayout.ADDRESS.withName("name"),
        Interop.valueLayout.ADDRESS.withName("methods"),
        Interop.valueLayout.ADDRESS.withName("signals"),
        Interop.valueLayout.ADDRESS.withName("properties"),
        Interop.valueLayout.ADDRESS.withName("annotations")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link DBusInterfaceInfo}
     * @return A new, uninitialized @{link DBusInterfaceInfo}
     */
    public static DBusInterfaceInfo allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        DBusInterfaceInfo newInstance = new DBusInterfaceInfo(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code ref_count}
     * @return The value of the field {@code ref_count}
     */
    public int ref_count$get() {
        var RESULT = (int) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("ref_count"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return RESULT;
    }
    
    /**
     * Change the value of the field {@code ref_count}
     * @param ref_count The new value of the field {@code ref_count}
     */
    public void ref_count$set(int ref_count) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("ref_count"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), ref_count);
    }
    
    /**
     * Get the value of the field {@code name}
     * @return The value of the field {@code name}
     */
    public java.lang.String name$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("name"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Change the value of the field {@code name}
     * @param name The new value of the field {@code name}
     */
    public void name$set(java.lang.String name) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("name"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), Interop.allocateNativeString(name));
    }
    
    /**
     * Create a DBusInterfaceInfo proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public DBusInterfaceInfo(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
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
            DowncallHandles.g_dbus_interface_info_cache_build.invokeExact(
                    handle());
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
            DowncallHandles.g_dbus_interface_info_cache_release.invokeExact(
                    handle());
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
     * @param stringBuilder A {@link org.gtk.glib.String} to to append XML data to.
     */
    public void generateXml(int indent, @NotNull org.gtk.glib.String stringBuilder) {
        java.util.Objects.requireNonNull(stringBuilder, "Parameter 'stringBuilder' must not be null");
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
    public @Nullable org.gtk.gio.DBusMethodInfo lookupMethod(@NotNull java.lang.String name) {
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_dbus_interface_info_lookup_method.invokeExact(
                    handle(),
                    Interop.allocateNativeString(name));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.DBusMethodInfo(RESULT, Ownership.NONE);
    }
    
    /**
     * Looks up information about a property.
     * <p>
     * The cost of this function is O(n) in number of properties unless
     * g_dbus_interface_info_cache_build() has been used on {@code info}.
     * @param name A D-Bus property name (typically in CamelCase).
     * @return A {@link DBusPropertyInfo} or {@code null} if not found. Do not free, it is owned by {@code info}.
     */
    public @Nullable org.gtk.gio.DBusPropertyInfo lookupProperty(@NotNull java.lang.String name) {
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_dbus_interface_info_lookup_property.invokeExact(
                    handle(),
                    Interop.allocateNativeString(name));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.DBusPropertyInfo(RESULT, Ownership.NONE);
    }
    
    /**
     * Looks up information about a signal.
     * <p>
     * The cost of this function is O(n) in number of signals unless
     * g_dbus_interface_info_cache_build() has been used on {@code info}.
     * @param name A D-Bus signal name (typically in CamelCase)
     * @return A {@link DBusSignalInfo} or {@code null} if not found. Do not free, it is owned by {@code info}.
     */
    public @Nullable org.gtk.gio.DBusSignalInfo lookupSignal(@NotNull java.lang.String name) {
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_dbus_interface_info_lookup_signal.invokeExact(
                    handle(),
                    Interop.allocateNativeString(name));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.DBusSignalInfo(RESULT, Ownership.NONE);
    }
    
    /**
     * If {@code info} is statically allocated does nothing. Otherwise increases
     * the reference count.
     * @return The same {@code info}.
     */
    public @NotNull org.gtk.gio.DBusInterfaceInfo ref() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_dbus_interface_info_ref.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.DBusInterfaceInfo(RESULT, Ownership.FULL);
    }
    
    /**
     * If {@code info} is statically allocated, does nothing. Otherwise decreases
     * the reference count of {@code info}. When its reference count drops to 0,
     * the memory used is freed.
     */
    public void unref() {
        try {
            DowncallHandles.g_dbus_interface_info_unref.invokeExact(
                    handle());
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
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private DBusInterfaceInfo struct;
        
         /**
         * A {@link DBusInterfaceInfo.Build} object constructs a {@link DBusInterfaceInfo} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = DBusInterfaceInfo.allocate();
        }
        
         /**
         * Finish building the {@link DBusInterfaceInfo} struct.
         * @return A new instance of {@code DBusInterfaceInfo} with the fields 
         *         that were set in the Build object.
         */
        public DBusInterfaceInfo construct() {
            return struct;
        }
        
        /**
         * The reference count or -1 if statically allocated.
         * @param ref_count The value for the {@code ref_count} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setRefCount(int ref_count) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("ref_count"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), ref_count);
            return this;
        }
        
        /**
         * The name of the D-Bus interface, e.g. "org.freedesktop.DBus.Properties".
         * @param name The value for the {@code name} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setName(java.lang.String name) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("name"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (name == null ? MemoryAddress.NULL : Interop.allocateNativeString(name)));
            return this;
        }
        
        /**
         * A pointer to a {@code null}-terminated array of pointers to {@link DBusMethodInfo} structures or {@code null} if there are no methods.
         * @param methods The value for the {@code methods} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setMethods(org.gtk.gio.DBusMethodInfo[] methods) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("methods"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (methods == null ? MemoryAddress.NULL : Interop.allocateNativeArray(methods, false)));
            return this;
        }
        
        /**
         * A pointer to a {@code null}-terminated array of pointers to {@link DBusSignalInfo} structures or {@code null} if there are no signals.
         * @param signals The value for the {@code signals} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setSignals(org.gtk.gio.DBusSignalInfo[] signals) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("signals"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (signals == null ? MemoryAddress.NULL : Interop.allocateNativeArray(signals, false)));
            return this;
        }
        
        /**
         * A pointer to a {@code null}-terminated array of pointers to {@link DBusPropertyInfo} structures or {@code null} if there are no properties.
         * @param properties The value for the {@code properties} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setProperties(org.gtk.gio.DBusPropertyInfo[] properties) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("properties"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (properties == null ? MemoryAddress.NULL : Interop.allocateNativeArray(properties, false)));
            return this;
        }
        
        /**
         * A pointer to a {@code null}-terminated array of pointers to {@link DBusAnnotationInfo} structures or {@code null} if there are no annotations.
         * @param annotations The value for the {@code annotations} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setAnnotations(org.gtk.gio.DBusAnnotationInfo[] annotations) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("annotations"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (annotations == null ? MemoryAddress.NULL : Interop.allocateNativeArray(annotations, false)));
            return this;
        }
    }
}
