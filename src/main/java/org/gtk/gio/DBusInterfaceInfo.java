package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Information about a D-Bus interface.
 * @version 2.26
 */
public class DBusInterfaceInfo extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GDBusInterfaceInfo";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        ValueLayout.JAVA_INT.withName("ref_count"),
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
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    public static DBusInterfaceInfo allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        DBusInterfaceInfo newInstance = new DBusInterfaceInfo(Refcounted.get(segment.address()));
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
    
    @ApiStatus.Internal
    public DBusInterfaceInfo(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
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
        return new org.gtk.gio.DBusMethodInfo(Refcounted.get(RESULT, false));
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
        return new org.gtk.gio.DBusPropertyInfo(Refcounted.get(RESULT, false));
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
        return new org.gtk.gio.DBusSignalInfo(Refcounted.get(RESULT, false));
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
        return new org.gtk.gio.DBusInterfaceInfo(Refcounted.get(RESULT, true));
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
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_dbus_interface_info_cache_release = Interop.downcallHandle(
            "g_dbus_interface_info_cache_release",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_dbus_interface_info_generate_xml = Interop.downcallHandle(
            "g_dbus_interface_info_generate_xml",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_dbus_interface_info_lookup_method = Interop.downcallHandle(
            "g_dbus_interface_info_lookup_method",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_dbus_interface_info_lookup_property = Interop.downcallHandle(
            "g_dbus_interface_info_lookup_property",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_dbus_interface_info_lookup_signal = Interop.downcallHandle(
            "g_dbus_interface_info_lookup_signal",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_dbus_interface_info_ref = Interop.downcallHandle(
            "g_dbus_interface_info_ref",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_dbus_interface_info_unref = Interop.downcallHandle(
            "g_dbus_interface_info_unref",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
        );
    }
}
