package org.gstreamer.base;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class DataQueueClass extends Struct {
    
    static {
        GstBase.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstDataQueueClass";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.ObjectClass.getMemoryLayout().withName("parent_class"),
            Interop.valueLayout.ADDRESS.withName("empty"),
            Interop.valueLayout.ADDRESS.withName("full"),
            MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_gst_reserved")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link DataQueueClass}
     * @return A new, uninitialized @{link DataQueueClass}
     */
    public static DataQueueClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        DataQueueClass newInstance = new DataQueueClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent_class}
     * @return The value of the field {@code parent_class}
     */
    public org.gtk.gobject.ObjectClass getParentClass() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_class"));
        return org.gtk.gobject.ObjectClass.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code parent_class}
     * @param parentClass The new value of the field {@code parent_class}
     */
    public void setParentClass(org.gtk.gobject.ObjectClass parentClass) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
    }
    
    @FunctionalInterface
    public interface EmptyCallback {
        void run(org.gstreamer.base.DataQueue queue);

        @ApiStatus.Internal default void upcall(MemoryAddress queue) {
            run((org.gstreamer.base.DataQueue) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(queue)), org.gstreamer.base.DataQueue.fromAddress).marshal(queue, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(EmptyCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code empty}
     * @param empty The new value of the field {@code empty}
     */
    public void setEmpty(EmptyCallback empty) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("empty"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (empty == null ? MemoryAddress.NULL : empty.toCallback()));
    }
    
    @FunctionalInterface
    public interface FullCallback {
        void run(org.gstreamer.base.DataQueue queue);

        @ApiStatus.Internal default void upcall(MemoryAddress queue) {
            run((org.gstreamer.base.DataQueue) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(queue)), org.gstreamer.base.DataQueue.fromAddress).marshal(queue, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(FullCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code full}
     * @param full The new value of the field {@code full}
     */
    public void setFull(FullCallback full) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("full"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (full == null ? MemoryAddress.NULL : full.toCallback()));
    }
    
    /**
     * Get the value of the field {@code _gst_reserved}
     * @return The value of the field {@code _gst_reserved}
     */
    public java.lang.foreign.MemoryAddress[] getGstReserved() {
        var RESULT = (MemoryAddress) getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("_gst_reserved"))
            .get(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()));
        return Interop.getAddressArrayFrom(RESULT, 4);
    }
    
    /**
     * Change the value of the field {@code _gst_reserved}
     * @param GstReserved The new value of the field {@code _gst_reserved}
     */
    public void setGstReserved(java.lang.foreign.MemoryAddress[] GstReserved) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("_gst_reserved"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (GstReserved == null ? MemoryAddress.NULL : Interop.allocateNativeArray(GstReserved, false)));
    }
    
    /**
     * Create a DataQueueClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected DataQueueClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, DataQueueClass> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new DataQueueClass(input, ownership);
    
    /**
     * A {@link DataQueueClass.Builder} object constructs a {@link DataQueueClass} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link DataQueueClass.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final DataQueueClass struct;
        
        private Builder() {
            struct = DataQueueClass.allocate();
        }
        
         /**
         * Finish building the {@link DataQueueClass} struct.
         * @return A new instance of {@code DataQueueClass} with the fields 
         *         that were set in the Builder object.
         */
        public DataQueueClass build() {
            return struct;
        }
        
        public Builder setParentClass(org.gtk.gobject.ObjectClass parentClass) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
            return this;
        }
        
        public Builder setEmpty(EmptyCallback empty) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("empty"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (empty == null ? MemoryAddress.NULL : empty.toCallback()));
            return this;
        }
        
        public Builder setFull(FullCallback full) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("full"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (full == null ? MemoryAddress.NULL : full.toCallback()));
            return this;
        }
        
        public Builder setGstReserved(java.lang.foreign.MemoryAddress[] GstReserved) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("_gst_reserved"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (GstReserved == null ? MemoryAddress.NULL : Interop.allocateNativeArray(GstReserved, false)));
            return this;
        }
    }
}
