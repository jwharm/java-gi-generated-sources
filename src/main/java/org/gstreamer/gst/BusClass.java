package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * GStreamer bus class.
 */
public class BusClass extends Struct {
    
    static {
        Gst.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstBusClass";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.gst.ObjectClass.getMemoryLayout().withName("parent_class"),
            Interop.valueLayout.ADDRESS.withName("message"),
            Interop.valueLayout.ADDRESS.withName("sync_message"),
            MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_gst_reserved")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link BusClass}
     * @return A new, uninitialized @{link BusClass}
     */
    public static BusClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        BusClass newInstance = new BusClass(segment.address(), Ownership.NONE);
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
    public interface MessageCallback {
        void run(org.gstreamer.gst.Bus bus, org.gstreamer.gst.Message message);

        @ApiStatus.Internal default void upcall(MemoryAddress bus, MemoryAddress message) {
            run((org.gstreamer.gst.Bus) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(bus)), org.gstreamer.gst.Bus.fromAddress).marshal(bus, Ownership.NONE), org.gstreamer.gst.Message.fromAddress.marshal(message, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MessageCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code message}
     * @param message The new value of the field {@code message}
     */
    public void setMessage(MessageCallback message) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("message"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (message == null ? MemoryAddress.NULL : message.toCallback()));
    }
    
    @FunctionalInterface
    public interface SyncMessageCallback {
        void run(org.gstreamer.gst.Bus bus, org.gstreamer.gst.Message message);

        @ApiStatus.Internal default void upcall(MemoryAddress bus, MemoryAddress message) {
            run((org.gstreamer.gst.Bus) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(bus)), org.gstreamer.gst.Bus.fromAddress).marshal(bus, Ownership.NONE), org.gstreamer.gst.Message.fromAddress.marshal(message, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(SyncMessageCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code sync_message}
     * @param syncMessage The new value of the field {@code sync_message}
     */
    public void setSyncMessage(SyncMessageCallback syncMessage) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("sync_message"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (syncMessage == null ? MemoryAddress.NULL : syncMessage.toCallback()));
    }
    
    /**
     * Create a BusClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected BusClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, BusClass> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new BusClass(input, ownership);
    
    /**
     * A {@link BusClass.Builder} object constructs a {@link BusClass} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link BusClass.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final BusClass struct;
        
        private Builder() {
            struct = BusClass.allocate();
        }
        
         /**
         * Finish building the {@link BusClass} struct.
         * @return A new instance of {@code BusClass} with the fields 
         *         that were set in the Builder object.
         */
        public BusClass build() {
            return struct;
        }
        
        /**
         * the parent class structure
         * @param parentClass The value for the {@code parentClass} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setParentClass(org.gstreamer.gst.ObjectClass parentClass) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
            return this;
        }
        
        public Builder setMessage(MessageCallback message) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("message"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (message == null ? MemoryAddress.NULL : message.toCallback()));
            return this;
        }
        
        public Builder setSyncMessage(SyncMessageCallback syncMessage) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("sync_message"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (syncMessage == null ? MemoryAddress.NULL : syncMessage.toCallback()));
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
