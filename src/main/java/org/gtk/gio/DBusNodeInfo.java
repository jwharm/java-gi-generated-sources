package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Information about nodes in a remote object hierarchy.
 */
public class DBusNodeInfo extends io.github.jwharm.javagi.ResourceBase {

    public DBusNodeInfo(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    private static final MethodHandle g_dbus_node_info_new_for_xml = Interop.downcallHandle(
        "g_dbus_node_info_new_for_xml",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNewForXml(@NotNull java.lang.String xmlData) throws GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) g_dbus_node_info_new_for_xml.invokeExact(Interop.allocateNativeString(xmlData), (Addressable) GERROR), true);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     */
    public static DBusNodeInfo newForXml(@NotNull java.lang.String xmlData) throws GErrorException {
        return new DBusNodeInfo(constructNewForXml(xmlData));
    }
    
    private static final MethodHandle g_dbus_node_info_generate_xml = Interop.downcallHandle(
        "g_dbus_node_info_generate_xml",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Appends an XML representation of {@code info} (and its children) to {@code string_builder}.
     * <p>
     * This function is typically used for generating introspection XML documents at run-time for
     * handling the {@code org.freedesktop.DBus.Introspectable.Introspect}  method.
     */
    public @NotNull void generateXml(@NotNull int indent, @NotNull org.gtk.glib.String stringBuilder) {
        try {
            g_dbus_node_info_generate_xml.invokeExact(handle(), indent, stringBuilder.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_dbus_node_info_lookup_interface = Interop.downcallHandle(
        "g_dbus_node_info_lookup_interface",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Looks up information about an interface.
     * <p>
     * The cost of this function is O(n) in number of interfaces.
     */
    public @Nullable DBusInterfaceInfo lookupInterface(@NotNull java.lang.String name) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_dbus_node_info_lookup_interface.invokeExact(handle(), Interop.allocateNativeString(name));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new DBusInterfaceInfo(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle g_dbus_node_info_ref = Interop.downcallHandle(
        "g_dbus_node_info_ref",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * If {@code info} is statically allocated does nothing. Otherwise increases
     * the reference count.
     */
    public @NotNull DBusNodeInfo ref() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_dbus_node_info_ref.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new DBusNodeInfo(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle g_dbus_node_info_unref = Interop.downcallHandle(
        "g_dbus_node_info_unref",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * If {@code info} is statically allocated, does nothing. Otherwise decreases
     * the reference count of {@code info}. When its reference count drops to 0,
     * the memory used is freed.
     */
    public @NotNull void unref() {
        try {
            g_dbus_node_info_unref.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
