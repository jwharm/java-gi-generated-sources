package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class PadClass extends Struct {
    
    static {
        Gst.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstPadClass";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.gst.ObjectClass.getMemoryLayout().withName("parent_class"),
            Interop.valueLayout.ADDRESS.withName("linked"),
            Interop.valueLayout.ADDRESS.withName("unlinked"),
            MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_gst_reserved")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link PadClass}
     * @return A new, uninitialized @{link PadClass}
     */
    public static PadClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        PadClass newInstance = new PadClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent_class}
     * @return The value of the field {@code parent_class}
     */
    public org.gstreamer.gst.ObjectClass getParentClass() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_class"));
        return org.gstreamer.gst.ObjectClass.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code parent_class}
     * @param parentClass The new value of the field {@code parent_class}
     */
    public void setParentClass(org.gstreamer.gst.ObjectClass parentClass) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
    }
    
    @FunctionalInterface
    public interface LinkedCallback {
        void run(org.gstreamer.gst.Pad pad, org.gstreamer.gst.Pad peer);

        @ApiStatus.Internal default void upcall(MemoryAddress pad, MemoryAddress peer) {
            run((org.gstreamer.gst.Pad) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(pad)), org.gstreamer.gst.Pad.fromAddress).marshal(pad, Ownership.NONE), (org.gstreamer.gst.Pad) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(peer)), org.gstreamer.gst.Pad.fromAddress).marshal(peer, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(LinkedCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code linked}
     * @param linked The new value of the field {@code linked}
     */
    public void setLinked(LinkedCallback linked) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("linked"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (linked == null ? MemoryAddress.NULL : linked.toCallback()));
    }
    
    @FunctionalInterface
    public interface UnlinkedCallback {
        void run(org.gstreamer.gst.Pad pad, org.gstreamer.gst.Pad peer);

        @ApiStatus.Internal default void upcall(MemoryAddress pad, MemoryAddress peer) {
            run((org.gstreamer.gst.Pad) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(pad)), org.gstreamer.gst.Pad.fromAddress).marshal(pad, Ownership.NONE), (org.gstreamer.gst.Pad) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(peer)), org.gstreamer.gst.Pad.fromAddress).marshal(peer, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(UnlinkedCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code unlinked}
     * @param unlinked The new value of the field {@code unlinked}
     */
    public void setUnlinked(UnlinkedCallback unlinked) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("unlinked"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (unlinked == null ? MemoryAddress.NULL : unlinked.toCallback()));
    }
    
    /**
     * Create a PadClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected PadClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, PadClass> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new PadClass(input, ownership);
    
    /**
     * A {@link PadClass.Builder} object constructs a {@link PadClass} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link PadClass.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final PadClass struct;
        
        private Builder() {
            struct = PadClass.allocate();
        }
        
         /**
         * Finish building the {@link PadClass} struct.
         * @return A new instance of {@code PadClass} with the fields 
         *         that were set in the Builder object.
         */
        public PadClass build() {
            return struct;
        }
        
        public Builder setParentClass(org.gstreamer.gst.ObjectClass parentClass) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
            return this;
        }
        
        public Builder setLinked(LinkedCallback linked) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("linked"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (linked == null ? MemoryAddress.NULL : linked.toCallback()));
            return this;
        }
        
        public Builder setUnlinked(UnlinkedCallback unlinked) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("unlinked"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (unlinked == null ? MemoryAddress.NULL : unlinked.toCallback()));
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
