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
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        NativeVolumeMonitorClass newInstance = new NativeVolumeMonitorClass(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code parent_class}
     * @return The value of the field {@code parent_class}
     */
    public org.gtk.gio.VolumeMonitorClass getParentClass() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_class"));
        return org.gtk.gio.VolumeMonitorClass.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code parent_class}
     * @param parentClass The new value of the field {@code parent_class}
     */
    public void setParentClass(org.gtk.gio.VolumeMonitorClass parentClass) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
    }
    
    @FunctionalInterface
    public interface GetMountForMountPathCallback {
        org.gtk.gio.Mount run(java.lang.String mountPath, org.gtk.gio.Cancellable cancellable);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress mountPath, MemoryAddress cancellable) {
            var RESULT = run(Marshal.addressToString.marshal(mountPath, null), (org.gtk.gio.Cancellable) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(cancellable)), org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, Ownership.NONE));
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GetMountForMountPathCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_mount_for_mount_path}
     * @param getMountForMountPath The new value of the field {@code get_mount_for_mount_path}
     */
    public void setGetMountForMountPath(GetMountForMountPathCallback getMountForMountPath) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("get_mount_for_mount_path"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getMountForMountPath == null ? MemoryAddress.NULL : getMountForMountPath.toCallback()));
    }
    
    /**
     * Create a NativeVolumeMonitorClass proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected NativeVolumeMonitorClass(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, NativeVolumeMonitorClass> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new NativeVolumeMonitorClass(input, ownership);
    
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
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("parent_class"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (parentClass == null ? MemoryAddress.NULL : parentClass.handle()));
            return this;
        }
        
        public Builder setGetMountForMountPath(GetMountForMountPathCallback getMountForMountPath) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_mount_for_mount_path"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getMountForMountPath == null ? MemoryAddress.NULL : getMountForMountPath.toCallback()));
            return this;
        }
    }
}
