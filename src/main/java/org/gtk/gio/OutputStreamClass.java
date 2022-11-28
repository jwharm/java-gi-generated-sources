package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class OutputStreamClass extends Struct {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GOutputStreamClass";
    
    private static final GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.ObjectClass.getMemoryLayout().withName("parent_class"),
        Interop.valueLayout.ADDRESS.withName("write_fn"),
        Interop.valueLayout.ADDRESS.withName("splice"),
        Interop.valueLayout.ADDRESS.withName("flush"),
        Interop.valueLayout.ADDRESS.withName("close_fn"),
        Interop.valueLayout.ADDRESS.withName("write_async"),
        Interop.valueLayout.ADDRESS.withName("write_finish"),
        Interop.valueLayout.ADDRESS.withName("splice_async"),
        Interop.valueLayout.ADDRESS.withName("splice_finish"),
        Interop.valueLayout.ADDRESS.withName("flush_async"),
        Interop.valueLayout.ADDRESS.withName("flush_finish"),
        Interop.valueLayout.ADDRESS.withName("close_async"),
        Interop.valueLayout.ADDRESS.withName("close_finish"),
        Interop.valueLayout.ADDRESS.withName("writev_fn"),
        Interop.valueLayout.ADDRESS.withName("writev_async"),
        Interop.valueLayout.ADDRESS.withName("writev_finish"),
        Interop.valueLayout.ADDRESS.withName("_g_reserved4"),
        Interop.valueLayout.ADDRESS.withName("_g_reserved5"),
        Interop.valueLayout.ADDRESS.withName("_g_reserved6"),
        Interop.valueLayout.ADDRESS.withName("_g_reserved7"),
        Interop.valueLayout.ADDRESS.withName("_g_reserved8")
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
     * Allocate a new {@link OutputStreamClass}
     * @return A new, uninitialized @{link OutputStreamClass}
     */
    public static OutputStreamClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        OutputStreamClass newInstance = new OutputStreamClass(segment.address(), Ownership.NONE);
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
     * Create a OutputStreamClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public OutputStreamClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }

    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Build {
        
        private OutputStreamClass struct;
        
         /**
         * A {@link OutputStreamClass.Build} object constructs a {@link OutputStreamClass} 
         * struct using the <em>builder pattern</em> to set the field values. 
         * Use the various {@code set...()} methods to set field values, 
         * and finish construction with {@link #construct()}. 
         */
        public Build() {
            struct = OutputStreamClass.allocate();
        }
        
         /**
         * Finish building the {@link OutputStreamClass} struct.
         * @return A new instance of {@code OutputStreamClass} with the fields 
         *         that were set in the Build object.
         */
        public OutputStreamClass construct() {
            return struct;
        }
        
        public Build setParentClass(org.gtk.gobject.ObjectClass parentClass) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
            return this;
        }
        
        public Build setWriteFn(java.lang.foreign.MemoryAddress writeFn) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("write_fn"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (writeFn == null ? MemoryAddress.NULL : writeFn));
            return this;
        }
        
        public Build setSplice(java.lang.foreign.MemoryAddress splice) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("splice"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (splice == null ? MemoryAddress.NULL : splice));
            return this;
        }
        
        public Build setFlush(java.lang.foreign.MemoryAddress flush) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("flush"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (flush == null ? MemoryAddress.NULL : flush));
            return this;
        }
        
        public Build setCloseFn(java.lang.foreign.MemoryAddress closeFn) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("close_fn"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (closeFn == null ? MemoryAddress.NULL : closeFn));
            return this;
        }
        
        public Build setWriteAsync(java.lang.foreign.MemoryAddress writeAsync) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("write_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (writeAsync == null ? MemoryAddress.NULL : writeAsync));
            return this;
        }
        
        public Build setWriteFinish(java.lang.foreign.MemoryAddress writeFinish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("write_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (writeFinish == null ? MemoryAddress.NULL : writeFinish));
            return this;
        }
        
        public Build setSpliceAsync(java.lang.foreign.MemoryAddress spliceAsync) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("splice_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (spliceAsync == null ? MemoryAddress.NULL : spliceAsync));
            return this;
        }
        
        public Build setSpliceFinish(java.lang.foreign.MemoryAddress spliceFinish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("splice_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (spliceFinish == null ? MemoryAddress.NULL : spliceFinish));
            return this;
        }
        
        public Build setFlushAsync(java.lang.foreign.MemoryAddress flushAsync) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("flush_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (flushAsync == null ? MemoryAddress.NULL : flushAsync));
            return this;
        }
        
        public Build setFlushFinish(java.lang.foreign.MemoryAddress flushFinish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("flush_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (flushFinish == null ? MemoryAddress.NULL : flushFinish));
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
        
        public Build setWritevFn(java.lang.foreign.MemoryAddress writevFn) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("writev_fn"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (writevFn == null ? MemoryAddress.NULL : writevFn));
            return this;
        }
        
        public Build setWritevAsync(java.lang.foreign.MemoryAddress writevAsync) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("writev_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (writevAsync == null ? MemoryAddress.NULL : writevAsync));
            return this;
        }
        
        public Build setWritevFinish(java.lang.foreign.MemoryAddress writevFinish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("writev_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (writevFinish == null ? MemoryAddress.NULL : writevFinish));
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
    }
}
