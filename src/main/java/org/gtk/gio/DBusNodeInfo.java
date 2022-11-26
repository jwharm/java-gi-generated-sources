package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Information about nodes in a remote object hierarchy.
 * @version 2.26
 */
public class DBusNodeInfo extends Struct {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GDBusNodeInfo";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        Interop.valueLayout.C_INT.withName("ref_count"),
        MemoryLayout.paddingLayout(32),
        Interop.valueLayout.ADDRESS.withName("path"),
        Interop.valueLayout.ADDRESS.withName("interfaces"),
        Interop.valueLayout.ADDRESS.withName("nodes"),
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
     * Allocate a new {@link DBusNodeInfo}
     * @return A new, uninitialized @{link DBusNodeInfo}
     */
    public static DBusNodeInfo allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        DBusNodeInfo newInstance = new DBusNodeInfo(segment.address(), Ownership.NONE);
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
     * Get the value of the field {@code path}
     * @return The value of the field {@code path}
     */
    public java.lang.String path$get() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("path"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Change the value of the field {@code path}
     * @param path The new value of the field {@code path}
     */
    public void path$set(java.lang.String path) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("path"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), Interop.allocateNativeString(path));
    }
    
    /**
     * Create a DBusNodeInfo proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public DBusNodeInfo(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    private static Addressable constructNewForXml(@NotNull java.lang.String xmlData) throws GErrorException {
        java.util.Objects.requireNonNull(xmlData, "Parameter 'xmlData' must not be null");
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_dbus_node_info_new_for_xml.invokeExact(
                    Interop.allocateNativeString(xmlData),
                    (Addressable) GERROR);
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
        return new DBusNodeInfo(constructNewForXml(xmlData), Ownership.FULL);
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
            DowncallHandles.g_dbus_node_info_generate_xml.invokeExact(
                    handle(),
                    indent,
                    stringBuilder.handle());
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
            RESULT = (MemoryAddress) DowncallHandles.g_dbus_node_info_lookup_interface.invokeExact(
                    handle(),
                    Interop.allocateNativeString(name));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.DBusInterfaceInfo(RESULT, Ownership.NONE);
    }
    
    /**
     * If {@code info} is statically allocated does nothing. Otherwise increases
     * the reference count.
     * @return The same {@code info}.
     */
    public @NotNull org.gtk.gio.DBusNodeInfo ref() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_dbus_node_info_ref.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.gio.DBusNodeInfo(RESULT, Ownership.FULL);
    }
    
    /**
     * If {@code info} is statically allocated, does nothing. Otherwise decreases
     * the reference count of {@code info}. When its reference count drops to 0,
     * the memory used is freed.
     */
    public void unref() {
        try {
            DowncallHandles.g_dbus_node_info_unref.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_dbus_node_info_new_for_xml = Interop.downcallHandle(
            "g_dbus_node_info_new_for_xml",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_dbus_node_info_generate_xml = Interop.downcallHandle(
            "g_dbus_node_info_generate_xml",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_dbus_node_info_lookup_interface = Interop.downcallHandle(
            "g_dbus_node_info_lookup_interface",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_dbus_node_info_ref = Interop.downcallHandle(
            "g_dbus_node_info_ref",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_dbus_node_info_unref = Interop.downcallHandle(
            "g_dbus_node_info_unref",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private DBusNodeInfo struct;
        
         /**
         * A {@link DBusNodeInfo.Build} object constructs a {@link DBusNodeInfo} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = DBusNodeInfo.allocate();
        }
        
         /**
         * Finish building the {@link DBusNodeInfo} struct.
         * @return A new instance of {@code DBusNodeInfo} with the fields 
         *         that were set in the Build object.
         */
        public DBusNodeInfo construct() {
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
         * The path of the node or {@code null} if omitted. Note that this may be a relative path. See the D-Bus specification for more details.
         * @param path The value for the {@code path} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setPath(java.lang.String path) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("path"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (path == null ? MemoryAddress.NULL : Interop.allocateNativeString(path)));
            return this;
        }
        
        /**
         * A pointer to a {@code null}-terminated array of pointers to {@link DBusInterfaceInfo} structures or {@code null} if there are no interfaces.
         * @param interfaces The value for the {@code interfaces} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setInterfaces(org.gtk.gio.DBusInterfaceInfo[] interfaces) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("interfaces"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (interfaces == null ? MemoryAddress.NULL : Interop.allocateNativeArray(interfaces, false)));
            return this;
        }
        
        /**
         * A pointer to a {@code null}-terminated array of pointers to {@link DBusNodeInfo} structures or {@code null} if there are no nodes.
         * @param nodes The value for the {@code nodes} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Build setNodes(org.gtk.gio.DBusNodeInfo[] nodes) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("nodes"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (nodes == null ? MemoryAddress.NULL : Interop.allocateNativeArray(nodes, false)));
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
