package org.gstreamer.base;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class AggregatorPadClass extends Struct {
    
    static {
        GstBase.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstAggregatorPadClass";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.gst.PadClass.getMemoryLayout().withName("parent_class"),
            Interop.valueLayout.ADDRESS.withName("flush"),
            Interop.valueLayout.ADDRESS.withName("skip_buffer"),
            MemoryLayout.sequenceLayout(20, Interop.valueLayout.ADDRESS).withName("_gst_reserved")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link AggregatorPadClass}
     * @return A new, uninitialized @{link AggregatorPadClass}
     */
    public static AggregatorPadClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        AggregatorPadClass newInstance = new AggregatorPadClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent_class}
     * @return The value of the field {@code parent_class}
     */
    public org.gstreamer.gst.PadClass getParentClass() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_class"));
        return org.gstreamer.gst.PadClass.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code parent_class}
     * @param parentClass The new value of the field {@code parent_class}
     */
    public void setParentClass(org.gstreamer.gst.PadClass parentClass) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
    }
    
    @FunctionalInterface
    public interface FlushCallback {
        org.gstreamer.gst.FlowReturn run(org.gstreamer.base.AggregatorPad aggpad, org.gstreamer.base.Aggregator aggregator);

        @ApiStatus.Internal default int upcall(MemoryAddress aggpad, MemoryAddress aggregator) {
            var RESULT = run((org.gstreamer.base.AggregatorPad) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(aggpad)), org.gstreamer.base.AggregatorPad.fromAddress).marshal(aggpad, Ownership.NONE), (org.gstreamer.base.Aggregator) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(aggregator)), org.gstreamer.base.Aggregator.fromAddress).marshal(aggregator, Ownership.NONE));
            return RESULT.getValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(FlushCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code flush}
     * @param flush The new value of the field {@code flush}
     */
    public void setFlush(FlushCallback flush) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("flush"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (flush == null ? MemoryAddress.NULL : flush.toCallback()));
    }
    
    @FunctionalInterface
    public interface SkipBufferCallback {
        boolean run(org.gstreamer.base.AggregatorPad aggpad, org.gstreamer.base.Aggregator aggregator, org.gstreamer.gst.Buffer buffer);

        @ApiStatus.Internal default int upcall(MemoryAddress aggpad, MemoryAddress aggregator, MemoryAddress buffer) {
            var RESULT = run((org.gstreamer.base.AggregatorPad) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(aggpad)), org.gstreamer.base.AggregatorPad.fromAddress).marshal(aggpad, Ownership.NONE), (org.gstreamer.base.Aggregator) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(aggregator)), org.gstreamer.base.Aggregator.fromAddress).marshal(aggregator, Ownership.NONE), org.gstreamer.gst.Buffer.fromAddress.marshal(buffer, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(SkipBufferCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code skip_buffer}
     * @param skipBuffer The new value of the field {@code skip_buffer}
     */
    public void setSkipBuffer(SkipBufferCallback skipBuffer) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("skip_buffer"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (skipBuffer == null ? MemoryAddress.NULL : skipBuffer.toCallback()));
    }
    
    /**
     * Create a AggregatorPadClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected AggregatorPadClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, AggregatorPadClass> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new AggregatorPadClass(input, ownership);
    
    /**
     * A {@link AggregatorPadClass.Builder} object constructs a {@link AggregatorPadClass} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link AggregatorPadClass.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final AggregatorPadClass struct;
        
        private Builder() {
            struct = AggregatorPadClass.allocate();
        }
        
         /**
         * Finish building the {@link AggregatorPadClass} struct.
         * @return A new instance of {@code AggregatorPadClass} with the fields 
         *         that were set in the Builder object.
         */
        public AggregatorPadClass build() {
            return struct;
        }
        
        public Builder setParentClass(org.gstreamer.gst.PadClass parentClass) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
            return this;
        }
        
        public Builder setFlush(FlushCallback flush) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("flush"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (flush == null ? MemoryAddress.NULL : flush.toCallback()));
            return this;
        }
        
        public Builder setSkipBuffer(SkipBufferCallback skipBuffer) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("skip_buffer"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (skipBuffer == null ? MemoryAddress.NULL : skipBuffer.toCallback()));
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
