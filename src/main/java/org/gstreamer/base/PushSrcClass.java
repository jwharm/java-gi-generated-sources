package org.gstreamer.base;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Subclasses can override any of the available virtual methods or not, as
 * needed. At the minimum, the {@code fill} method should be overridden to produce
 * buffers.
 */
public class PushSrcClass extends Struct {
    
    static {
        GstBase.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstPushSrcClass";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.base.BaseSrcClass.getMemoryLayout().withName("parent_class"),
            Interop.valueLayout.ADDRESS.withName("create"),
            Interop.valueLayout.ADDRESS.withName("alloc"),
            Interop.valueLayout.ADDRESS.withName("fill"),
            MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_gst_reserved")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link PushSrcClass}
     * @return A new, uninitialized @{link PushSrcClass}
     */
    public static PushSrcClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        PushSrcClass newInstance = new PushSrcClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent_class}
     * @return The value of the field {@code parent_class}
     */
    public org.gstreamer.base.BaseSrcClass getParentClass() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_class"));
        return org.gstreamer.base.BaseSrcClass.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code parent_class}
     * @param parentClass The new value of the field {@code parent_class}
     */
    public void setParentClass(org.gstreamer.base.BaseSrcClass parentClass) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
    }
    
    @FunctionalInterface
    public interface CreateCallback {
        org.gstreamer.gst.FlowReturn run(org.gstreamer.base.PushSrc src, Out<org.gstreamer.gst.Buffer> buf);

        @ApiStatus.Internal default int upcall(MemoryAddress src, MemoryAddress buf) {
            Out<org.gstreamer.gst.Buffer> bufOUT = new Out<>(org.gstreamer.gst.Buffer.fromAddress.marshal(buf, Ownership.FULL));
            var RESULT = run((org.gstreamer.base.PushSrc) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(src)), org.gstreamer.base.PushSrc.fromAddress).marshal(src, Ownership.NONE), bufOUT);
            buf.set(Interop.valueLayout.ADDRESS, 0, bufOUT.get().handle());
            return RESULT.getValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(CreateCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code create}
     * @param create The new value of the field {@code create}
     */
    public void setCreate(CreateCallback create) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("create"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (create == null ? MemoryAddress.NULL : create.toCallback()));
    }
    
    @FunctionalInterface
    public interface AllocCallback {
        org.gstreamer.gst.FlowReturn run(org.gstreamer.base.PushSrc src, Out<org.gstreamer.gst.Buffer> buf);

        @ApiStatus.Internal default int upcall(MemoryAddress src, MemoryAddress buf) {
            Out<org.gstreamer.gst.Buffer> bufOUT = new Out<>(org.gstreamer.gst.Buffer.fromAddress.marshal(buf, Ownership.FULL));
            var RESULT = run((org.gstreamer.base.PushSrc) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(src)), org.gstreamer.base.PushSrc.fromAddress).marshal(src, Ownership.NONE), bufOUT);
            buf.set(Interop.valueLayout.ADDRESS, 0, bufOUT.get().handle());
            return RESULT.getValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(AllocCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code alloc}
     * @param alloc The new value of the field {@code alloc}
     */
    public void setAlloc(AllocCallback alloc) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("alloc"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (alloc == null ? MemoryAddress.NULL : alloc.toCallback()));
    }
    
    @FunctionalInterface
    public interface FillCallback {
        org.gstreamer.gst.FlowReturn run(org.gstreamer.base.PushSrc src, org.gstreamer.gst.Buffer buf);

        @ApiStatus.Internal default int upcall(MemoryAddress src, MemoryAddress buf) {
            var RESULT = run((org.gstreamer.base.PushSrc) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(src)), org.gstreamer.base.PushSrc.fromAddress).marshal(src, Ownership.NONE), org.gstreamer.gst.Buffer.fromAddress.marshal(buf, Ownership.NONE));
            return RESULT.getValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(FillCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code fill}
     * @param fill The new value of the field {@code fill}
     */
    public void setFill(FillCallback fill) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("fill"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (fill == null ? MemoryAddress.NULL : fill.toCallback()));
    }
    
    /**
     * Create a PushSrcClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected PushSrcClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, PushSrcClass> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new PushSrcClass(input, ownership);
    
    /**
     * A {@link PushSrcClass.Builder} object constructs a {@link PushSrcClass} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link PushSrcClass.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final PushSrcClass struct;
        
        private Builder() {
            struct = PushSrcClass.allocate();
        }
        
         /**
         * Finish building the {@link PushSrcClass} struct.
         * @return A new instance of {@code PushSrcClass} with the fields 
         *         that were set in the Builder object.
         */
        public PushSrcClass build() {
            return struct;
        }
        
        /**
         * Element parent class
         * @param parentClass The value for the {@code parentClass} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setParentClass(org.gstreamer.base.BaseSrcClass parentClass) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
            return this;
        }
        
        public Builder setCreate(CreateCallback create) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("create"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (create == null ? MemoryAddress.NULL : create.toCallback()));
            return this;
        }
        
        public Builder setAlloc(AllocCallback alloc) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("alloc"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (alloc == null ? MemoryAddress.NULL : alloc.toCallback()));
            return this;
        }
        
        public Builder setFill(FillCallback fill) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("fill"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (fill == null ? MemoryAddress.NULL : fill.toCallback()));
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
