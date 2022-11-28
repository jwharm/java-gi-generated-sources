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
    public org.gtk.gobject.ObjectClass parentClass$get() {
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
        
        public Build setParentClass(org.gtk.gobject.ObjectClass parentClass) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
            return this;
        }
        
        public Build setIsActive(java.lang.foreign.MemoryAddress isActive) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("is_active"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (isActive == null ? MemoryAddress.NULL : isActive));
            return this;
        }
        
        public Build setGetFileForPath(java.lang.foreign.MemoryAddress getFileForPath) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_file_for_path"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getFileForPath == null ? MemoryAddress.NULL : getFileForPath));
            return this;
        }
        
        public Build setGetFileForUri(java.lang.foreign.MemoryAddress getFileForUri) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_file_for_uri"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getFileForUri == null ? MemoryAddress.NULL : getFileForUri));
            return this;
        }
        
        public Build setGetSupportedUriSchemes(java.lang.foreign.MemoryAddress getSupportedUriSchemes) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_supported_uri_schemes"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getSupportedUriSchemes == null ? MemoryAddress.NULL : getSupportedUriSchemes));
            return this;
        }
        
        public Build setParseName(java.lang.foreign.MemoryAddress parseName) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parse_name"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parseName == null ? MemoryAddress.NULL : parseName));
            return this;
        }
        
        public Build setLocalFileAddInfo(java.lang.foreign.MemoryAddress localFileAddInfo) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("local_file_add_info"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (localFileAddInfo == null ? MemoryAddress.NULL : localFileAddInfo));
            return this;
        }
        
        public Build setAddWritableNamespaces(java.lang.foreign.MemoryAddress addWritableNamespaces) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("add_writable_namespaces"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (addWritableNamespaces == null ? MemoryAddress.NULL : addWritableNamespaces));
            return this;
        }
        
        public Build setLocalFileSetAttributes(java.lang.foreign.MemoryAddress localFileSetAttributes) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("local_file_set_attributes"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (localFileSetAttributes == null ? MemoryAddress.NULL : localFileSetAttributes));
            return this;
        }
        
        public Build setLocalFileRemoved(java.lang.foreign.MemoryAddress localFileRemoved) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("local_file_removed"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (localFileRemoved == null ? MemoryAddress.NULL : localFileRemoved));
            return this;
        }
        
        public Build setLocalFileMoved(java.lang.foreign.MemoryAddress localFileMoved) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("local_file_moved"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (localFileMoved == null ? MemoryAddress.NULL : localFileMoved));
            return this;
        }
        
        public Build setDeserializeIcon(java.lang.foreign.MemoryAddress deserializeIcon) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("deserialize_icon"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (deserializeIcon == null ? MemoryAddress.NULL : deserializeIcon));
            return this;
        }
        
        public Build setGReserved1(java.lang.foreign.MemoryAddress GReserved1) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_g_reserved1"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (GReserved1 == null ? MemoryAddress.NULL : GReserved1));
            return this;
        }
        
        public Build setGReserved2(java.lang.foreign.MemoryAddress GReserved2) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_g_reserved2"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (GReserved2 == null ? MemoryAddress.NULL : GReserved2));
            return this;
        }
        
        public Build setGReserved3(java.lang.foreign.MemoryAddress GReserved3) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_g_reserved3"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (GReserved3 == null ? MemoryAddress.NULL : GReserved3));
            return this;
        }
        
        public Build setGReserved4(java.lang.foreign.MemoryAddress GReserved4) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_g_reserved4"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (GReserved4 == null ? MemoryAddress.NULL : GReserved4));
            return this;
        }
        
        public Build setGReserved5(java.lang.foreign.MemoryAddress GReserved5) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_g_reserved5"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (GReserved5 == null ? MemoryAddress.NULL : GReserved5));
            return this;
        }
        
        public Build setGReserved6(java.lang.foreign.MemoryAddress GReserved6) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_g_reserved6"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (GReserved6 == null ? MemoryAddress.NULL : GReserved6));
            return this;
        }
    }
}
