package org.gtk.gio;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * Information about nodes in a remote object hierarchy.
 */
public class DBusNodeInfo extends io.github.jwharm.javagi.ResourceBase {

    public DBusNodeInfo(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    private static Reference constructNewForXml(java.lang.String xmlData) throws GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        Reference RESULT = References.get(gtk_h.g_dbus_node_info_new_for_xml(Interop.allocateNativeString(xmlData).handle(), GERROR), true);
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
     */
    public static DBusNodeInfo newForXml(java.lang.String xmlData) throws GErrorException {
        return new DBusNodeInfo(constructNewForXml(xmlData));
    }
    
    /**
     * Appends an XML representation of {@code info} (and its children) to {@code string_builder}.
     * <p>
     * This function is typically used for generating introspection XML documents at run-time for
     * handling the {@code org.freedesktop.DBus.Introspectable.Introspect}  method.
     */
    public void generateXml(int indent, org.gtk.glib.String stringBuilder) {
        gtk_h.g_dbus_node_info_generate_xml(handle(), indent, stringBuilder.handle());
    }
    
    /**
     * Looks up information about an interface.
     * <p>
     * The cost of this function is O(n) in number of interfaces.
     */
    public DBusInterfaceInfo lookupInterface(java.lang.String name) {
        var RESULT = gtk_h.g_dbus_node_info_lookup_interface(handle(), Interop.allocateNativeString(name).handle());
        return new DBusInterfaceInfo(References.get(RESULT, false));
    }
    
    /**
     * If {@code info} is statically allocated does nothing. Otherwise increases
     * the reference count.
     */
    public DBusNodeInfo ref() {
        var RESULT = gtk_h.g_dbus_node_info_ref(handle());
        return new DBusNodeInfo(References.get(RESULT, true));
    }
    
    /**
     * If {@code info} is statically allocated, does nothing. Otherwise decreases
     * the reference count of {@code info}. When its reference count drops to 0,
     * the memory used is freed.
     */
    public void unref() {
        gtk_h.g_dbus_node_info_unref(handle());
    }
    
}
