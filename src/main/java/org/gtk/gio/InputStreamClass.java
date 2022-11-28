package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class InputStreamClass extends Struct {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GInputStreamClass";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.ObjectClass.getMemoryLayout().withName("parent_class"),
        Interop.valueLayout.ADDRESS.withName("read_fn"),
        Interop.valueLayout.ADDRESS.withName("skip"),
        Interop.valueLayout.ADDRESS.withName("close_fn"),
        Interop.valueLayout.ADDRESS.withName("read_async"),
        Interop.valueLayout.ADDRESS.withName("read_finish"),
        Interop.valueLayout.ADDRESS.withName("skip_async"),
        Interop.valueLayout.ADDRESS.withName("skip_finish"),
        Interop.valueLayout.ADDRESS.withName("close_async"),
        Interop.valueLayout.ADDRESS.withName("close_finish"),
        Interop.valueLayout.ADDRESS.withName("_g_reserved1"),
        Interop.valueLayout.ADDRESS.withName("_g_reserved2"),
        Interop.valueLayout.ADDRESS.withName("_g_reserved3"),
        Interop.valueLayout.ADDRESS.withName("_g_reserved4"),
        Interop.valueLayout.ADDRESS.withName("_g_reserved5")
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
     * Allocate a new {@link InputStreamClass}
     * @return A new, uninitialized @{link InputStreamClass}
     */
    public static InputStreamClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        InputStreamClass newInstance = new InputStreamClass(segment.address(), Ownership.NONE);
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
     * Create a InputStreamClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public InputStreamClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private InputStreamClass struct;
        
         /**
         * A {@link InputStreamClass.Build} object constructs a {@link InputStreamClass} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = InputStreamClass.allocate();
        }
        
         /**
         * Finish building the {@link InputStreamClass} struct.
         * @return A new instance of {@code InputStreamClass} with the fields 
         *         that were set in the Build object.
         */
        public InputStreamClass construct() {
            return struct;
        }
        
        public Build setParentClass(org.gtk.gobject.ObjectClass parentClass) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
            return this;
        }
        
        public Build setReadFn(java.lang.foreign.MemoryAddress readFn) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("read_fn"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (readFn == null ? MemoryAddress.NULL : readFn));
            return this;
        }
        
        public Build setSkip(java.lang.foreign.MemoryAddress skip) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("skip"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (skip == null ? MemoryAddress.NULL : skip));
            return this;
        }
        
        public Build setCloseFn(java.lang.foreign.MemoryAddress closeFn) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("close_fn"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (closeFn == null ? MemoryAddress.NULL : closeFn));
            return this;
        }
        
        public Build setReadAsync(java.lang.foreign.MemoryAddress readAsync) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("read_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (readAsync == null ? MemoryAddress.NULL : readAsync));
            return this;
        }
        
        public Build setReadFinish(java.lang.foreign.MemoryAddress readFinish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("read_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (readFinish == null ? MemoryAddress.NULL : readFinish));
            return this;
        }
        
        public Build setSkipAsync(java.lang.foreign.MemoryAddress skipAsync) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("skip_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (skipAsync == null ? MemoryAddress.NULL : skipAsync));
            return this;
        }
        
        public Build setSkipFinish(java.lang.foreign.MemoryAddress skipFinish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("skip_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (skipFinish == null ? MemoryAddress.NULL : skipFinish));
            return this;
        }
        
        public Build setCloseAsync(java.lang.foreign.MemoryAddress closeAsync) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("close_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (closeAsync == null ? MemoryAddress.NULL : closeAsync));
            return this;
        }
        
        public Build setCloseFinish(java.lang.foreign.MemoryAddress closeFinish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("close_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (closeFinish == null ? MemoryAddress.NULL : closeFinish));
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
    }
}
