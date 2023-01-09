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
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            Interop.valueLayout.C_INT.withName("ref_count"),
            MemoryLayout.paddingLayout(32),
            Interop.valueLayout.ADDRESS.withName("path"),
            Interop.valueLayout.ADDRESS.withName("interfaces"),
            Interop.valueLayout.ADDRESS.withName("nodes"),
            Interop.valueLayout.ADDRESS.withName("annotations")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link DBusNodeInfo}
     * @return A new, uninitialized @{link DBusNodeInfo}
     */
    public static DBusNodeInfo allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        DBusNodeInfo newInstance = new DBusNodeInfo(segment.address());
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
     * Get the value of the field {@code path}
     * @return The value of the field {@code path}
     */
    public java.lang.String getPath() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("path"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return Marshal.addressToString.marshal(RESULT, null);
        }
    }
    
    /**
     * Change the value of the field {@code path}
     * @param path The new value of the field {@code path}
     */
    public void setPath(java.lang.String path) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("path"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (path == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(path, SCOPE)));
        }
    }
    
    /**
     * Get the value of the field {@code interfaces}
     * @return The value of the field {@code interfaces}
     */
    public PointerProxy<org.gtk.gio.DBusInterfaceInfo> getInterfaces() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("interfaces"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return new PointerProxy<org.gtk.gio.DBusInterfaceInfo>(RESULT, org.gtk.gio.DBusInterfaceInfo.fromAddress);
        }
    }
    
    /**
     * Change the value of the field {@code interfaces}
     * @param interfaces The new value of the field {@code interfaces}
     */
    public void setInterfaces(org.gtk.gio.DBusInterfaceInfo[] interfaces) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("interfaces"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (interfaces == null ? MemoryAddress.NULL : Interop.allocateNativeArray(interfaces, org.gtk.gio.DBusInterfaceInfo.getMemoryLayout(), false, SCOPE)));
        }
    }
    
    /**
     * Get the value of the field {@code nodes}
     * @return The value of the field {@code nodes}
     */
    public PointerProxy<org.gtk.gio.DBusNodeInfo> getNodes() {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = (MemoryAddress) getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("nodes"))
                .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE));
            return new PointerProxy<org.gtk.gio.DBusNodeInfo>(RESULT, org.gtk.gio.DBusNodeInfo.fromAddress);
        }
    }
    
    /**
     * Change the value of the field {@code nodes}
     * @param nodes The new value of the field {@code nodes}
     */
    public void setNodes(org.gtk.gio.DBusNodeInfo[] nodes) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("nodes"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (nodes == null ? MemoryAddress.NULL : Interop.allocateNativeArray(nodes, org.gtk.gio.DBusNodeInfo.getMemoryLayout(), false, SCOPE)));
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
     * Create a DBusNodeInfo proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected DBusNodeInfo(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, DBusNodeInfo> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new DBusNodeInfo(input);
    
    private static MemoryAddress constructNewForXml(java.lang.String xmlData) throws GErrorException {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemorySegment GERROR = SCOPE.allocate(Interop.valueLayout.ADDRESS);
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_dbus_node_info_new_for_xml.invokeExact(Marshal.stringToAddress.marshal(xmlData, SCOPE),(Addressable) GERROR);
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT;
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
     * @param xmlData Valid D-Bus introspection XML.
     * @return A {@link DBusNodeInfo} structure or {@code null} if {@code error} is set. Free
     * with g_dbus_node_info_unref().
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public static DBusNodeInfo newForXml(java.lang.String xmlData) throws GErrorException {
        var RESULT = constructNewForXml(xmlData);
        var OBJECT = org.gtk.gio.DBusNodeInfo.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Appends an XML representation of {@code info} (and its children) to {@code string_builder}.
     * <p>
     * This function is typically used for generating introspection XML documents at run-time for
     * handling the {@code org.freedesktop.DBus.Introspectable.Introspect}  method.
     * @param indent Indentation level.
     * @param stringBuilder A {@link org.gtk.glib.GString} to to append XML data to.
     */
    public void generateXml(int indent, org.gtk.glib.GString stringBuilder) {
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
    public @Nullable org.gtk.gio.DBusInterfaceInfo lookupInterface(java.lang.String name) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            MemoryAddress RESULT;
            try {
                RESULT = (MemoryAddress) DowncallHandles.g_dbus_node_info_lookup_interface.invokeExact(
                        handle(),
                        Marshal.stringToAddress.marshal(name, SCOPE));
            } catch (Throwable ERR) {
                throw new AssertionError("Unexpected exception occured: ", ERR);
            }
            return org.gtk.gio.DBusInterfaceInfo.fromAddress.marshal(RESULT, null);
        }
    }
    
    /**
     * If {@code info} is statically allocated does nothing. Otherwise increases
     * the reference count.
     * @return The same {@code info}.
     */
    public org.gtk.gio.DBusNodeInfo ref() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_dbus_node_info_ref.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gtk.gio.DBusNodeInfo.fromAddress.marshal(RESULT, null);
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
            DowncallHandles.g_dbus_node_info_unref.invokeExact(handle());
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
     * A {@link DBusNodeInfo.Builder} object constructs a {@link DBusNodeInfo} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link DBusNodeInfo.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final DBusNodeInfo struct;
        
        private Builder() {
            struct = DBusNodeInfo.allocate();
        }
        
        /**
         * Finish building the {@link DBusNodeInfo} struct.
         * @return A new instance of {@code DBusNodeInfo} with the fields 
         *         that were set in the Builder object.
         */
        public DBusNodeInfo build() {
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
         * The path of the node or {@code null} if omitted. Note that this may be a relative path. See the D-Bus specification for more details.
         * @param path The value for the {@code path} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setPath(java.lang.String path) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("path"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (path == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(path, SCOPE)));
                return this;
            }
        }
        
        /**
         * A pointer to a {@code null}-terminated array of pointers to {@link DBusInterfaceInfo} structures or {@code null} if there are no interfaces.
         * @param interfaces The value for the {@code interfaces} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setInterfaces(org.gtk.gio.DBusInterfaceInfo[] interfaces) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("interfaces"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (interfaces == null ? MemoryAddress.NULL : Interop.allocateNativeArray(interfaces, org.gtk.gio.DBusInterfaceInfo.getMemoryLayout(), false, SCOPE)));
                return this;
            }
        }
        
        /**
         * A pointer to a {@code null}-terminated array of pointers to {@link DBusNodeInfo} structures or {@code null} if there are no nodes.
         * @param nodes The value for the {@code nodes} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setNodes(org.gtk.gio.DBusNodeInfo[] nodes) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("nodes"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (nodes == null ? MemoryAddress.NULL : Interop.allocateNativeArray(nodes, org.gtk.gio.DBusNodeInfo.getMemoryLayout(), false, SCOPE)));
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
