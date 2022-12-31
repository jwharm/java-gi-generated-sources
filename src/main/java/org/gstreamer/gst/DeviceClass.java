package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The class structure for a {@link Device} object.
 * @version 1.4
 */
public class DeviceClass extends Struct {
    
    static {
        Gst.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GstDeviceClass";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gstreamer.gst.ObjectClass.getMemoryLayout().withName("parent_class"),
            Interop.valueLayout.ADDRESS.withName("create_element"),
            Interop.valueLayout.ADDRESS.withName("reconfigure_element"),
            MemoryLayout.sequenceLayout(4, Interop.valueLayout.ADDRESS).withName("_gst_reserved")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link DeviceClass}
     * @return A new, uninitialized @{link DeviceClass}
     */
    public static DeviceClass allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        DeviceClass newInstance = new DeviceClass(segment.address(), Ownership.NONE);
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
    public interface CreateElementCallback {
        @Nullable org.gstreamer.gst.Element run(org.gstreamer.gst.Device device, @Nullable java.lang.String name);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress device, MemoryAddress name) {
            var RESULT = run((org.gstreamer.gst.Device) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(device)), org.gstreamer.gst.Device.fromAddress).marshal(device, Ownership.NONE), Marshal.addressToString.marshal(name, null));
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(CreateElementCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code create_element}
     * @param createElement The new value of the field {@code create_element}
     */
    public void setCreateElement(CreateElementCallback createElement) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("create_element"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (createElement == null ? MemoryAddress.NULL : createElement.toCallback()));
    }
    
    @FunctionalInterface
    public interface ReconfigureElementCallback {
        boolean run(org.gstreamer.gst.Device device, org.gstreamer.gst.Element element);

        @ApiStatus.Internal default int upcall(MemoryAddress device, MemoryAddress element) {
            var RESULT = run((org.gstreamer.gst.Device) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(device)), org.gstreamer.gst.Device.fromAddress).marshal(device, Ownership.NONE), (org.gstreamer.gst.Element) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(element)), org.gstreamer.gst.Element.fromAddress).marshal(element, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ReconfigureElementCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code reconfigure_element}
     * @param reconfigureElement The new value of the field {@code reconfigure_element}
     */
    public void setReconfigureElement(ReconfigureElementCallback reconfigureElement) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("reconfigure_element"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (reconfigureElement == null ? MemoryAddress.NULL : reconfigureElement.toCallback()));
    }
    
    /**
     * Create a DeviceClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected DeviceClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, DeviceClass> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new DeviceClass(input, ownership);
    
    /**
     * A {@link DeviceClass.Builder} object constructs a {@link DeviceClass} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link DeviceClass.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final DeviceClass struct;
        
        private Builder() {
            struct = DeviceClass.allocate();
        }
        
         /**
         * Finish building the {@link DeviceClass} struct.
         * @return A new instance of {@code DeviceClass} with the fields 
         *         that were set in the Builder object.
         */
        public DeviceClass build() {
            return struct;
        }
        
        /**
         * The parent {@link ObjectClass} structure.
         * @param parentClass The value for the {@code parentClass} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setParentClass(org.gstreamer.gst.ObjectClass parentClass) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
            return this;
        }
        
        public Builder setCreateElement(CreateElementCallback createElement) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("create_element"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (createElement == null ? MemoryAddress.NULL : createElement.toCallback()));
            return this;
        }
        
        public Builder setReconfigureElement(ReconfigureElementCallback reconfigureElement) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("reconfigure_element"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (reconfigureElement == null ? MemoryAddress.NULL : reconfigureElement.toCallback()));
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
