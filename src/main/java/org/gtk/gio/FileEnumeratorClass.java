package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class FileEnumeratorClass extends Struct {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GFileEnumeratorClass";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.ObjectClass.getMemoryLayout().withName("parent_class"),
        Interop.valueLayout.ADDRESS.withName("next_file"),
        Interop.valueLayout.ADDRESS.withName("close_fn"),
        Interop.valueLayout.ADDRESS.withName("next_files_async"),
        Interop.valueLayout.ADDRESS.withName("next_files_finish"),
        Interop.valueLayout.ADDRESS.withName("close_async"),
        Interop.valueLayout.ADDRESS.withName("close_finish"),
        Interop.valueLayout.ADDRESS.withName("_g_reserved1"),
        Interop.valueLayout.ADDRESS.withName("_g_reserved2"),
        Interop.valueLayout.ADDRESS.withName("_g_reserved3"),
        Interop.valueLayout.ADDRESS.withName("_g_reserved4"),
        Interop.valueLayout.ADDRESS.withName("_g_reserved5"),
        Interop.valueLayout.ADDRESS.withName("_g_reserved6"),
        Interop.valueLayout.ADDRESS.withName("_g_reserved7")
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
     * Allocate a new {@link FileEnumeratorClass}
     * @return A new, uninitialized @{link FileEnumeratorClass}
     */
    public static FileEnumeratorClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        FileEnumeratorClass newInstance = new FileEnumeratorClass(segment.address(), Ownership.NONE);
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
     * Create a FileEnumeratorClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public FileEnumeratorClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private FileEnumeratorClass struct;
        
         /**
         * A {@link FileEnumeratorClass.Build} object constructs a {@link FileEnumeratorClass} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = FileEnumeratorClass.allocate();
        }
        
         /**
         * Finish building the {@link FileEnumeratorClass} struct.
         * @return A new instance of {@code FileEnumeratorClass} with the fields 
         *         that were set in the Build object.
         */
        public FileEnumeratorClass construct() {
            return struct;
        }
        
        public Build setParentClass(org.gtk.gobject.ObjectClass parent_class) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parent_class == null ? MemoryAddress.NULL : parent_class.handle()));
            return this;
        }
        
        public Build setNextFile(java.lang.foreign.MemoryAddress next_file) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("next_file"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (next_file == null ? MemoryAddress.NULL : next_file));
            return this;
        }
        
        public Build setCloseFn(java.lang.foreign.MemoryAddress close_fn) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("close_fn"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (close_fn == null ? MemoryAddress.NULL : close_fn));
            return this;
        }
        
        public Build setNextFilesAsync(java.lang.foreign.MemoryAddress next_files_async) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("next_files_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (next_files_async == null ? MemoryAddress.NULL : next_files_async));
            return this;
        }
        
        public Build setNextFilesFinish(java.lang.foreign.MemoryAddress next_files_finish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("next_files_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (next_files_finish == null ? MemoryAddress.NULL : next_files_finish));
            return this;
        }
        
        public Build setCloseAsync(java.lang.foreign.MemoryAddress close_async) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("close_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (close_async == null ? MemoryAddress.NULL : close_async));
            return this;
        }
        
        public Build setCloseFinish(java.lang.foreign.MemoryAddress close_finish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("close_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (close_finish == null ? MemoryAddress.NULL : close_finish));
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
        
        public Build setGReserved7(java.lang.foreign.MemoryAddress _g_reserved7) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_g_reserved7"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (_g_reserved7 == null ? MemoryAddress.NULL : _g_reserved7));
            return this;
        }
    }
}
