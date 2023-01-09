package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class NativeVolumeMonitorClass extends Struct {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GNativeVolumeMonitorClass";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gio.VolumeMonitorClass.getMemoryLayout().withName("parent_class"),
            Interop.valueLayout.ADDRESS.withName("get_mount_for_mount_path")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link NativeVolumeMonitorClass}
     * @return A new, uninitialized @{link NativeVolumeMonitorClass}
     */
    public static NativeVolumeMonitorClass allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        NativeVolumeMonitorClass newInstance = new NativeVolumeMonitorClass(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent_class}
     * @return The value of the field {@code parent_class}
     */
    public org.gtk.gio.VolumeMonitorClass getParentClass() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_class"));
        return org.gtk.gio.VolumeMonitorClass.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), null);
    }
    
    /**
     * Change the value of the field {@code parent_class}
     * @param parentClass The new value of the field {@code parent_class}
     */
    public void setParentClass(org.gtk.gio.VolumeMonitorClass parentClass) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GetMountForMountPathCallback} callback.
     */
    @FunctionalInterface
    public interface GetMountForMountPathCallback {
    
        org.gtk.gio.Mount run(java.lang.String mountPath, org.gtk.gio.Cancellable cancellable);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress mountPath, MemoryAddress cancellable) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                var RESULT = run(Marshal.addressToString.marshal(mountPath, null), (org.gtk.gio.Cancellable) Interop.register(cancellable, org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, null));
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
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GetMountForMountPathCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_mount_for_mount_path}
     * @param getMountForMountPath The new value of the field {@code get_mount_for_mount_path}
     */
    public void setGetMountForMountPath(GetMountForMountPathCallback getMountForMountPath) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_mount_for_mount_path"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getMountForMountPath == null ? MemoryAddress.NULL : getMountForMountPath.toCallback()));
        }
    }
    
    /**
     * Create a NativeVolumeMonitorClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected NativeVolumeMonitorClass(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, NativeVolumeMonitorClass> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new NativeVolumeMonitorClass(input);
    
    /**
     * A {@link NativeVolumeMonitorClass.Builder} object constructs a {@link NativeVolumeMonitorClass} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link NativeVolumeMonitorClass.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final NativeVolumeMonitorClass struct;
        
        private Builder() {
            struct = NativeVolumeMonitorClass.allocate();
        }
        
        /**
         * Finish building the {@link NativeVolumeMonitorClass} struct.
         * @return A new instance of {@code NativeVolumeMonitorClass} with the fields 
         *         that were set in the Builder object.
         */
        public NativeVolumeMonitorClass build() {
            return struct;
        }
        
        public Builder setParentClass(org.gtk.gio.VolumeMonitorClass parentClass) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
                return this;
            }
        }
        
        public Builder setGetMountForMountPath(GetMountForMountPathCallback getMountForMountPath) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("get_mount_for_mount_path"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getMountForMountPath == null ? MemoryAddress.NULL : getMountForMountPath.toCallback()));
                return this;
            }
        }
    }
}
