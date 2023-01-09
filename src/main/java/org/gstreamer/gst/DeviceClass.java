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
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        DeviceClass newInstance = new DeviceClass(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent_class}
     * @return The value of the field {@code parent_class}
     */
    public org.gstreamer.gst.ObjectClass getParentClass() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_class"));
        return org.gstreamer.gst.ObjectClass.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), null);
    }
    
    /**
     * Change the value of the field {@code parent_class}
     * @param parentClass The new value of the field {@code parent_class}
     */
    public void setParentClass(org.gstreamer.gst.ObjectClass parentClass) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code CreateElementCallback} callback.
     */
    @FunctionalInterface
    public interface CreateElementCallback {
    
        @Nullable org.gstreamer.gst.Element run(org.gstreamer.gst.Device device, @Nullable java.lang.String name);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress device, MemoryAddress name) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                var RESULT = run((org.gstreamer.gst.Device) Interop.register(device, org.gstreamer.gst.Device.fromAddress).marshal(device, null), Marshal.addressToString.marshal(name, null));
                return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), CreateElementCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code create_element}
     * @param createElement The new value of the field {@code create_element}
     */
    public void setCreateElement(CreateElementCallback createElement) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("create_element"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (createElement == null ? MemoryAddress.NULL : createElement.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code ReconfigureElementCallback} callback.
     */
    @FunctionalInterface
    public interface ReconfigureElementCallback {
    
        boolean run(org.gstreamer.gst.Device device, org.gstreamer.gst.Element element);
        
        @ApiStatus.Internal default int upcall(MemoryAddress device, MemoryAddress element) {
            var RESULT = run((org.gstreamer.gst.Device) Interop.register(device, org.gstreamer.gst.Device.fromAddress).marshal(device, null), (org.gstreamer.gst.Element) Interop.register(element, org.gstreamer.gst.Element.fromAddress).marshal(element, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ReconfigureElementCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code reconfigure_element}
     * @param reconfigureElement The new value of the field {@code reconfigure_element}
     */
    public void setReconfigureElement(ReconfigureElementCallback reconfigureElement) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("reconfigure_element"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (reconfigureElement == null ? MemoryAddress.NULL : reconfigureElement.toCallback()));
        }
    }
    
    /**
     * Create a DeviceClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected DeviceClass(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, DeviceClass> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new DeviceClass(input);
    
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
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
                return this;
            }
        }
        
        public Builder setCreateElement(CreateElementCallback createElement) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("create_element"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (createElement == null ? MemoryAddress.NULL : createElement.toCallback()));
                return this;
            }
        }
        
        public Builder setReconfigureElement(ReconfigureElementCallback reconfigureElement) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("reconfigure_element"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (reconfigureElement == null ? MemoryAddress.NULL : reconfigureElement.toCallback()));
                return this;
            }
        }
        
        public Builder setGstReserved(java.lang.foreign.MemoryAddress[] GstReserved) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("_gst_reserved"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (GstReserved == null ? MemoryAddress.NULL : Interop.allocateNativeArray(GstReserved, false, SCOPE)));
                return this;
            }
        }
    }
}
