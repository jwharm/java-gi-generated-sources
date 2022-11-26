package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class VfsClass extends Struct {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GVfsClass";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.ObjectClass.getMemoryLayout().withName("parent_class"),
        Interop.valueLayout.ADDRESS.withName("is_active"),
        Interop.valueLayout.ADDRESS.withName("get_file_for_path"),
        Interop.valueLayout.ADDRESS.withName("get_file_for_uri"),
        Interop.valueLayout.ADDRESS.withName("get_supported_uri_schemes"),
        Interop.valueLayout.ADDRESS.withName("parse_name"),
        Interop.valueLayout.ADDRESS.withName("local_file_add_info"),
        Interop.valueLayout.ADDRESS.withName("add_writable_namespaces"),
        Interop.valueLayout.ADDRESS.withName("local_file_set_attributes"),
        Interop.valueLayout.ADDRESS.withName("local_file_removed"),
        Interop.valueLayout.ADDRESS.withName("local_file_moved"),
        Interop.valueLayout.ADDRESS.withName("deserialize_icon"),
        Interop.valueLayout.ADDRESS.withName("_g_reserved1"),
        Interop.valueLayout.ADDRESS.withName("_g_reserved2"),
        Interop.valueLayout.ADDRESS.withName("_g_reserved3"),
        Interop.valueLayout.ADDRESS.withName("_g_reserved4"),
        Interop.valueLayout.ADDRESS.withName("_g_reserved5"),
        Interop.valueLayout.ADDRESS.withName("_g_reserved6")
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
     * Allocate a new {@link VfsClass}
     * @return A new, uninitialized @{link VfsClass}
     */
    public static VfsClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        VfsClass newInstance = new VfsClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent_class}
     * @return The value of the field {@code parent_class}
     */
    public org.gtk.gobject.ObjectClass parent_class$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_class"));
        return new org.gtk.gobject.ObjectClass(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Create a VfsClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public VfsClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private VfsClass struct;
        
         /**
         * A {@link VfsClass.Build} object constructs a {@link VfsClass} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = VfsClass.allocate();
        }
        
         /**
         * Finish building the {@link VfsClass} struct.
         * @return A new instance of {@code VfsClass} with the fields 
         *         that were set in the Build object.
         */
        public VfsClass construct() {
            return struct;
        }
        
        public Build setParentClass(org.gtk.gobject.ObjectClass parent_class) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parent_class == null ? MemoryAddress.NULL : parent_class.handle()));
            return this;
        }
        
        public Build setIsActive(java.lang.foreign.MemoryAddress is_active) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("is_active"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (is_active == null ? MemoryAddress.NULL : is_active));
            return this;
        }
        
        public Build setGetFileForPath(java.lang.foreign.MemoryAddress get_file_for_path) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_file_for_path"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (get_file_for_path == null ? MemoryAddress.NULL : get_file_for_path));
            return this;
        }
        
        public Build setGetFileForUri(java.lang.foreign.MemoryAddress get_file_for_uri) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_file_for_uri"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (get_file_for_uri == null ? MemoryAddress.NULL : get_file_for_uri));
            return this;
        }
        
        public Build setGetSupportedUriSchemes(java.lang.foreign.MemoryAddress get_supported_uri_schemes) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_supported_uri_schemes"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (get_supported_uri_schemes == null ? MemoryAddress.NULL : get_supported_uri_schemes));
            return this;
        }
        
        public Build setParseName(java.lang.foreign.MemoryAddress parse_name) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parse_name"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parse_name == null ? MemoryAddress.NULL : parse_name));
            return this;
        }
        
        public Build setLocalFileAddInfo(java.lang.foreign.MemoryAddress local_file_add_info) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("local_file_add_info"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (local_file_add_info == null ? MemoryAddress.NULL : local_file_add_info));
            return this;
        }
        
        public Build setAddWritableNamespaces(java.lang.foreign.MemoryAddress add_writable_namespaces) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("add_writable_namespaces"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (add_writable_namespaces == null ? MemoryAddress.NULL : add_writable_namespaces));
            return this;
        }
        
        public Build setLocalFileSetAttributes(java.lang.foreign.MemoryAddress local_file_set_attributes) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("local_file_set_attributes"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (local_file_set_attributes == null ? MemoryAddress.NULL : local_file_set_attributes));
            return this;
        }
        
        public Build setLocalFileRemoved(java.lang.foreign.MemoryAddress local_file_removed) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("local_file_removed"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (local_file_removed == null ? MemoryAddress.NULL : local_file_removed));
            return this;
        }
        
        public Build setLocalFileMoved(java.lang.foreign.MemoryAddress local_file_moved) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("local_file_moved"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (local_file_moved == null ? MemoryAddress.NULL : local_file_moved));
            return this;
        }
        
        public Build setDeserializeIcon(java.lang.foreign.MemoryAddress deserialize_icon) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("deserialize_icon"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (deserialize_icon == null ? MemoryAddress.NULL : deserialize_icon));
            return this;
        }
        
        public Build setGReserved1(java.lang.foreign.MemoryAddress _g_reserved1) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_g_reserved1"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (_g_reserved1 == null ? MemoryAddress.NULL : _g_reserved1));
            return this;
        }
        
        public Build setGReserved2(java.lang.foreign.MemoryAddress _g_reserved2) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_g_reserved2"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (_g_reserved2 == null ? MemoryAddress.NULL : _g_reserved2));
            return this;
        }
        
        public Build setGReserved3(java.lang.foreign.MemoryAddress _g_reserved3) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_g_reserved3"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (_g_reserved3 == null ? MemoryAddress.NULL : _g_reserved3));
            return this;
        }
        
        public Build setGReserved4(java.lang.foreign.MemoryAddress _g_reserved4) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_g_reserved4"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (_g_reserved4 == null ? MemoryAddress.NULL : _g_reserved4));
            return this;
        }
        
        public Build setGReserved5(java.lang.foreign.MemoryAddress _g_reserved5) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_g_reserved5"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (_g_reserved5 == null ? MemoryAddress.NULL : _g_reserved5));
            return this;
        }
        
        public Build setGReserved6(java.lang.foreign.MemoryAddress _g_reserved6) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_g_reserved6"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (_g_reserved6 == null ? MemoryAddress.NULL : _g_reserved6));
            return this;
        }
    }
}
