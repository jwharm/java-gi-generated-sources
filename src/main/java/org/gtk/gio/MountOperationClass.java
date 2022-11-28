package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class MountOperationClass extends Struct {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GMountOperationClass";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.ObjectClass.getMemoryLayout().withName("parent_class"),
        Interop.valueLayout.ADDRESS.withName("ask_password"),
        Interop.valueLayout.ADDRESS.withName("ask_question"),
        Interop.valueLayout.ADDRESS.withName("reply"),
        Interop.valueLayout.ADDRESS.withName("aborted"),
        Interop.valueLayout.ADDRESS.withName("show_processes"),
        Interop.valueLayout.ADDRESS.withName("show_unmount_progress"),
        Interop.valueLayout.ADDRESS.withName("_g_reserved1"),
        Interop.valueLayout.ADDRESS.withName("_g_reserved2"),
        Interop.valueLayout.ADDRESS.withName("_g_reserved3"),
        Interop.valueLayout.ADDRESS.withName("_g_reserved4"),
        Interop.valueLayout.ADDRESS.withName("_g_reserved5"),
        Interop.valueLayout.ADDRESS.withName("_g_reserved6"),
        Interop.valueLayout.ADDRESS.withName("_g_reserved7"),
        Interop.valueLayout.ADDRESS.withName("_g_reserved8"),
        Interop.valueLayout.ADDRESS.withName("_g_reserved9")
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
     * Allocate a new {@link MountOperationClass}
     * @return A new, uninitialized @{link MountOperationClass}
     */
    public static MountOperationClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        MountOperationClass newInstance = new MountOperationClass(segment.address(), Ownership.NONE);
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
     * Create a MountOperationClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public MountOperationClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private MountOperationClass struct;
        
         /**
         * A {@link MountOperationClass.Build} object constructs a {@link MountOperationClass} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = MountOperationClass.allocate();
        }
        
         /**
         * Finish building the {@link MountOperationClass} struct.
         * @return A new instance of {@code MountOperationClass} with the fields 
         *         that were set in the Build object.
         */
        public MountOperationClass construct() {
            return struct;
        }
        
        public Build setParentClass(org.gtk.gobject.ObjectClass parentClass) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
            return this;
        }
        
        public Build setAskPassword(java.lang.foreign.MemoryAddress askPassword) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("ask_password"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (askPassword == null ? MemoryAddress.NULL : askPassword));
            return this;
        }
        
        public Build setAskQuestion(java.lang.foreign.MemoryAddress askQuestion) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("ask_question"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (askQuestion == null ? MemoryAddress.NULL : askQuestion));
            return this;
        }
        
        public Build setReply(java.lang.foreign.MemoryAddress reply) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("reply"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (reply == null ? MemoryAddress.NULL : reply));
            return this;
        }
        
        public Build setAborted(java.lang.foreign.MemoryAddress aborted) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("aborted"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (aborted == null ? MemoryAddress.NULL : aborted));
            return this;
        }
        
        public Build setShowProcesses(java.lang.foreign.MemoryAddress showProcesses) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("show_processes"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (showProcesses == null ? MemoryAddress.NULL : showProcesses));
            return this;
        }
        
        public Build setShowUnmountProgress(java.lang.foreign.MemoryAddress showUnmountProgress) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("show_unmount_progress"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (showUnmountProgress == null ? MemoryAddress.NULL : showUnmountProgress));
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
        
        public Build setGReserved7(java.lang.foreign.MemoryAddress GReserved7) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_g_reserved7"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (GReserved7 == null ? MemoryAddress.NULL : GReserved7));
            return this;
        }
        
        public Build setGReserved8(java.lang.foreign.MemoryAddress GReserved8) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_g_reserved8"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (GReserved8 == null ? MemoryAddress.NULL : GReserved8));
            return this;
        }
        
        public Build setGReserved9(java.lang.foreign.MemoryAddress GReserved9) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_g_reserved9"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (GReserved9 == null ? MemoryAddress.NULL : GReserved9));
            return this;
        }
    }
}
