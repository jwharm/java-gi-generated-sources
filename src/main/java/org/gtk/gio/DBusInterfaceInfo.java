package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Information about a D-Bus interface.
 */
public class DBusInterfaceInfo extends io.github.jwharm.javagi.ResourceBase {

    public DBusInterfaceInfo(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    private static final MethodHandle g_dbus_interface_info_cache_build = Interop.downcallHandle(
        "g_dbus_interface_info_cache_build",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
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
    public @NotNull void cacheBuild() {
        try {
            g_dbus_interface_info_cache_build.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_dbus_interface_info_cache_release = Interop.downcallHandle(
        "g_dbus_interface_info_cache_release",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Decrements the usage count for the cache for {@code info} built by
     * g_dbus_interface_info_cache_build() (if any) and frees the
     * resources used by the cache if the usage count drops to zero.
     */
    public @NotNull void cacheRelease() {
        try {
            g_dbus_interface_info_cache_release.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_dbus_interface_info_generate_xml = Interop.downcallHandle(
        "g_dbus_interface_info_generate_xml",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Appends an XML representation of {@code info} (and its children) to {@code string_builder}.
     * <p>
     * This function is typically used for generating introspection XML
     * documents at run-time for handling the
     * {@code org.freedesktop.DBus.Introspectable.Introspect}
     * method.
     */
    public @NotNull void generateXml(@NotNull int indent, @NotNull org.gtk.glib.String stringBuilder) {
        try {
            g_dbus_interface_info_generate_xml.invokeExact(handle(), indent, stringBuilder.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_dbus_interface_info_lookup_method = Interop.downcallHandle(
        "g_dbus_interface_info_lookup_method",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Looks up information about a method.
     * <p>
     * The cost of this function is O(n) in number of methods unless
     * g_dbus_interface_info_cache_build() has been used on {@code info}.
     */
    public @Nullable DBusMethodInfo lookupMethod(@NotNull java.lang.String name) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_dbus_interface_info_lookup_method.invokeExact(handle(), Interop.allocateNativeString(name));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new DBusMethodInfo(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle g_dbus_interface_info_lookup_property = Interop.downcallHandle(
        "g_dbus_interface_info_lookup_property",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Looks up information about a property.
     * <p>
     * The cost of this function is O(n) in number of properties unless
     * g_dbus_interface_info_cache_build() has been used on {@code info}.
     */
    public @Nullable DBusPropertyInfo lookupProperty(@NotNull java.lang.String name) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_dbus_interface_info_lookup_property.invokeExact(handle(), Interop.allocateNativeString(name));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new DBusPropertyInfo(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle g_dbus_interface_info_lookup_signal = Interop.downcallHandle(
        "g_dbus_interface_info_lookup_signal",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Looks up information about a signal.
     * <p>
     * The cost of this function is O(n) in number of signals unless
     * g_dbus_interface_info_cache_build() has been used on {@code info}.
     */
    public @Nullable DBusSignalInfo lookupSignal(@NotNull java.lang.String name) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_dbus_interface_info_lookup_signal.invokeExact(handle(), Interop.allocateNativeString(name));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new DBusSignalInfo(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle g_dbus_interface_info_ref = Interop.downcallHandle(
        "g_dbus_interface_info_ref",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * If {@code info} is statically allocated does nothing. Otherwise increases
     * the reference count.
     */
    public @NotNull DBusInterfaceInfo ref() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_dbus_interface_info_ref.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new DBusInterfaceInfo(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle g_dbus_interface_info_unref = Interop.downcallHandle(
        "g_dbus_interface_info_unref",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * If {@code info} is statically allocated, does nothing. Otherwise decreases
     * the reference count of {@code info}. When its reference count drops to 0,
     * the memory used is freed.
     */
    public @NotNull void unref() {
        try {
            g_dbus_interface_info_unref.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
