package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Information about nodes in a remote object hierarchy.
 * @version 2.26
 */
public class DBusNodeInfo extends io.github.jwharm.javagi.ResourceBase {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        ValueLayout.JAVA_INT.withName("ref_count"),
        Interop.valueLayout.ADDRESS.withName("path"),
        Interop.valueLayout.ADDRESS.withName("interfaces"),
        Interop.valueLayout.ADDRESS.withName("nodes"),
        Interop.valueLayout.ADDRESS.withName("annotations")
    ).withName("GDBusNodeInfo");
    
    /**
     * Memory layout of the native struct is unknown (no fields in the GIR file).
     * @return always {code Interop.valueLayout.ADDRESS}
     */
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    public DBusNodeInfo(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    private static Refcounted constructNewForXml(@NotNull java.lang.String xmlData) throws GErrorException {
        java.util.Objects.requireNonNull(xmlData, "Parameter 'xmlData' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        Refcounted RESULT;
        try {
            RESULT = Refcounted.get((MemoryAddress) DowncallHandles.g_dbus_node_info_new_for_xml.invokeExact(Interop.allocateNativeString(xmlData), (Addressable) GERROR), true);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
    }
    
    /**
     * Parses {@code xml_data} and returns a {@link DBusNodeInfo} representing the data.
     * <p>
     * The introspection XML must contain exactly one top-level
     * &lt;node&gt; element.
     * <p>
     * Note that this routine is using a
     * [GMarkup][glib-Simple-XML-Subset-Parser.description]-based
     * parser that only accepts a subset of valid XML documents.
     * @param xmlData Valid D-Bus introspection XML.
     * @return A {@link DBusNodeInfo} structure or {@code null} if {@code error} is set. Free
     * with g_dbus_node_info_unref().
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public static DBusNodeInfo newForXml(@NotNull java.lang.String xmlData) throws GErrorException {
        return new DBusNodeInfo(constructNewForXml(xmlData));
    }
    
    /**
     * Appends an XML representation of {@code info} (and its children) to {@code string_builder}.
     * <p>
     * This function is typically used for generating introspection XML documents at run-time for
     * handling the {@code org.freedesktop.DBus.Introspectable.Introspect}  method.
     * @param indent Indentation level.
     * @param stringBuilder A {@link org.gtk.glib.String} to to append XML data to.
     */
    public void generateXml(int indent, @NotNull org.gtk.glib.String stringBuilder) {
        java.util.Objects.requireNonNull(stringBuilder, "Parameter 'stringBuilder' must not be null");
        try {
            DowncallHandles.g_dbus_node_info_generate_xml.invokeExact(handle(), indent, stringBuilder.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Looks up information about an interface.
     * <p>
     * The cost of this function is O(n) in number of interfaces.
     * @param name A D-Bus interface name.
     * @return A {@link DBusInterfaceInfo} or {@code null} if not found. Do not free, it is owned by {@code info}.
     */
    public @Nullable org.gtk.gio.DBusInterfaceInfo lookupInterface(@NotNull java.lang.String name) {
        java.util.Objects.requireNonNull(name, "Parameter 'name' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_dbus_node_info_lookup_interface.invokeExact(handle(), Interop.allocateNativeString(name));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.DBusInterfaceInfo(Refcounted.get(RESULT, false));
    }
    
    /**
     * If {@code info} is statically allocated does nothing. Otherwise increases
     * the reference count.
     * @return The same {@code info}.
     */
    public @NotNull org.gtk.gio.DBusNodeInfo ref() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_dbus_node_info_ref.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.DBusNodeInfo(Refcounted.get(RESULT, true));
    }
    
    /**
     * If {@code info} is statically allocated, does nothing. Otherwise decreases
     * the reference count of {@code info}. When its reference count drops to 0,
     * the memory used is freed.
     */
    public void unref() {
        try {
            DowncallHandles.g_dbus_node_info_unref.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_dbus_node_info_new_for_xml = Interop.downcallHandle(
            "g_dbus_node_info_new_for_xml",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_dbus_node_info_generate_xml = Interop.downcallHandle(
            "g_dbus_node_info_generate_xml",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_dbus_node_info_lookup_interface = Interop.downcallHandle(
            "g_dbus_node_info_lookup_interface",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_dbus_node_info_ref = Interop.downcallHandle(
            "g_dbus_node_info_ref",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
        );
        
        private static final MethodHandle g_dbus_node_info_unref = Interop.downcallHandle(
            "g_dbus_node_info_unref",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
        );
    }
}
