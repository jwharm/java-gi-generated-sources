package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Interface for implementing operations for mountable volumes.
 */
public class VolumeIface extends Struct {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GVolumeIface";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.TypeInterface.getMemoryLayout().withName("g_iface"),
            Interop.valueLayout.ADDRESS.withName("changed"),
            Interop.valueLayout.ADDRESS.withName("removed"),
            Interop.valueLayout.ADDRESS.withName("get_name"),
            Interop.valueLayout.ADDRESS.withName("get_icon"),
            Interop.valueLayout.ADDRESS.withName("get_uuid"),
            Interop.valueLayout.ADDRESS.withName("get_drive"),
            Interop.valueLayout.ADDRESS.withName("get_mount"),
            Interop.valueLayout.ADDRESS.withName("can_mount"),
            Interop.valueLayout.ADDRESS.withName("can_eject"),
            Interop.valueLayout.ADDRESS.withName("mount_fn"),
            Interop.valueLayout.ADDRESS.withName("mount_finish"),
            Interop.valueLayout.ADDRESS.withName("eject"),
            Interop.valueLayout.ADDRESS.withName("eject_finish"),
            Interop.valueLayout.ADDRESS.withName("get_identifier"),
            Interop.valueLayout.ADDRESS.withName("enumerate_identifiers"),
            Interop.valueLayout.ADDRESS.withName("should_automount"),
            Interop.valueLayout.ADDRESS.withName("get_activation_root"),
            Interop.valueLayout.ADDRESS.withName("eject_with_operation"),
            Interop.valueLayout.ADDRESS.withName("eject_with_operation_finish"),
            Interop.valueLayout.ADDRESS.withName("get_sort_key"),
            Interop.valueLayout.ADDRESS.withName("get_symbolic_icon")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link VolumeIface}
     * @return A new, uninitialized @{link VolumeIface}
     */
    public static VolumeIface allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        VolumeIface newInstance = new VolumeIface(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code g_iface}
     * @return The value of the field {@code g_iface}
     */
    public org.gtk.gobject.TypeInterface getGIface() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("g_iface"));
        return org.gtk.gobject.TypeInterface.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), null);
    }
    
    /**
     * Change the value of the field {@code g_iface}
     * @param gIface The new value of the field {@code g_iface}
     */
    public void setGIface(org.gtk.gobject.TypeInterface gIface) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("g_iface"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (gIface == null ? MemoryAddress.NULL : gIface.handle()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code ChangedCallback} callback.
     */
    @FunctionalInterface
    public interface ChangedCallback {
    
        void run(org.gtk.gio.Volume volume);
        
        @ApiStatus.Internal default void upcall(MemoryAddress volume) {
            run((org.gtk.gio.Volume) Interop.register(volume, org.gtk.gio.Volume.fromAddress).marshal(volume, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ChangedCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code changed}
     * @param changed The new value of the field {@code changed}
     */
    public void setChanged(ChangedCallback changed) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("changed"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (changed == null ? MemoryAddress.NULL : changed.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code RemovedCallback} callback.
     */
    @FunctionalInterface
    public interface RemovedCallback {
    
        void run(org.gtk.gio.Volume volume);
        
        @ApiStatus.Internal default void upcall(MemoryAddress volume) {
            run((org.gtk.gio.Volume) Interop.register(volume, org.gtk.gio.Volume.fromAddress).marshal(volume, null));
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), RemovedCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code removed}
     * @param removed The new value of the field {@code removed}
     */
    public void setRemoved(RemovedCallback removed) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("removed"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (removed == null ? MemoryAddress.NULL : removed.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GetNameCallback} callback.
     */
    @FunctionalInterface
    public interface GetNameCallback {
    
        java.lang.String run(org.gtk.gio.Volume volume);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress volume) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                var RESULT = run((org.gtk.gio.Volume) Interop.register(volume, org.gtk.gio.Volume.fromAddress).marshal(volume, null));
                return RESULT == null ? MemoryAddress.NULL.address() : (Marshal.stringToAddress.marshal(RESULT, SCOPE)).address();
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GetNameCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_name}
     * @param getName The new value of the field {@code get_name}
     */
    public void setGetName(GetNameCallback getName) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_name"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getName == null ? MemoryAddress.NULL : getName.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GetIconCallback} callback.
     */
    @FunctionalInterface
    public interface GetIconCallback {
    
        org.gtk.gio.Icon run(org.gtk.gio.Volume volume);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress volume) {
            var RESULT = run((org.gtk.gio.Volume) Interop.register(volume, org.gtk.gio.Volume.fromAddress).marshal(volume, null));
            RESULT.yieldOwnership();
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GetIconCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_icon}
     * @param getIcon The new value of the field {@code get_icon}
     */
    public void setGetIcon(GetIconCallback getIcon) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_icon"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getIcon == null ? MemoryAddress.NULL : getIcon.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GetUuidCallback} callback.
     */
    @FunctionalInterface
    public interface GetUuidCallback {
    
        @Nullable java.lang.String run(org.gtk.gio.Volume volume);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress volume) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                var RESULT = run((org.gtk.gio.Volume) Interop.register(volume, org.gtk.gio.Volume.fromAddress).marshal(volume, null));
                return RESULT == null ? MemoryAddress.NULL.address() : (Marshal.stringToAddress.marshal(RESULT, SCOPE)).address();
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GetUuidCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_uuid}
     * @param getUuid The new value of the field {@code get_uuid}
     */
    public void setGetUuid(GetUuidCallback getUuid) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_uuid"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getUuid == null ? MemoryAddress.NULL : getUuid.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GetDriveCallback} callback.
     */
    @FunctionalInterface
    public interface GetDriveCallback {
    
        @Nullable org.gtk.gio.Drive run(org.gtk.gio.Volume volume);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress volume) {
            var RESULT = run((org.gtk.gio.Volume) Interop.register(volume, org.gtk.gio.Volume.fromAddress).marshal(volume, null));
            RESULT.yieldOwnership();
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GetDriveCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_drive}
     * @param getDrive The new value of the field {@code get_drive}
     */
    public void setGetDrive(GetDriveCallback getDrive) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_drive"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getDrive == null ? MemoryAddress.NULL : getDrive.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GetMountCallback} callback.
     */
    @FunctionalInterface
    public interface GetMountCallback {
    
        @Nullable org.gtk.gio.Mount run(org.gtk.gio.Volume volume);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress volume) {
            var RESULT = run((org.gtk.gio.Volume) Interop.register(volume, org.gtk.gio.Volume.fromAddress).marshal(volume, null));
            RESULT.yieldOwnership();
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GetMountCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_mount}
     * @param getMount The new value of the field {@code get_mount}
     */
    public void setGetMount(GetMountCallback getMount) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_mount"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getMount == null ? MemoryAddress.NULL : getMount.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code CanMountCallback} callback.
     */
    @FunctionalInterface
    public interface CanMountCallback {
    
        boolean run(org.gtk.gio.Volume volume);
        
        @ApiStatus.Internal default int upcall(MemoryAddress volume) {
            var RESULT = run((org.gtk.gio.Volume) Interop.register(volume, org.gtk.gio.Volume.fromAddress).marshal(volume, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), CanMountCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code can_mount}
     * @param canMount The new value of the field {@code can_mount}
     */
    public void setCanMount(CanMountCallback canMount) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("can_mount"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (canMount == null ? MemoryAddress.NULL : canMount.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code CanEjectCallback} callback.
     */
    @FunctionalInterface
    public interface CanEjectCallback {
    
        boolean run(org.gtk.gio.Volume volume);
        
        @ApiStatus.Internal default int upcall(MemoryAddress volume) {
            var RESULT = run((org.gtk.gio.Volume) Interop.register(volume, org.gtk.gio.Volume.fromAddress).marshal(volume, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), CanEjectCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code can_eject}
     * @param canEject The new value of the field {@code can_eject}
     */
    public void setCanEject(CanEjectCallback canEject) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("can_eject"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (canEject == null ? MemoryAddress.NULL : canEject.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code MountFnCallback} callback.
     */
    @FunctionalInterface
    public interface MountFnCallback {
    
        void run(org.gtk.gio.Volume volume, org.gtk.gio.MountMountFlags flags, @Nullable org.gtk.gio.MountOperation mountOperation, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback);
        
        @ApiStatus.Internal default void upcall(MemoryAddress volume, int flags, MemoryAddress mountOperation, MemoryAddress cancellable, MemoryAddress callback, MemoryAddress userData) {
            run((org.gtk.gio.Volume) Interop.register(volume, org.gtk.gio.Volume.fromAddress).marshal(volume, null), new org.gtk.gio.MountMountFlags(flags), (org.gtk.gio.MountOperation) Interop.register(mountOperation, org.gtk.gio.MountOperation.fromAddress).marshal(mountOperation, null), (org.gtk.gio.Cancellable) Interop.register(cancellable, org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, null), null /* Unsupported parameter type */);
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), MountFnCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code mount_fn}
     * @param mountFn The new value of the field {@code mount_fn}
     */
    public void setMountFn(MountFnCallback mountFn) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("mount_fn"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (mountFn == null ? MemoryAddress.NULL : mountFn.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code MountFinishCallback} callback.
     */
    @FunctionalInterface
    public interface MountFinishCallback {
    
        boolean run(org.gtk.gio.Volume volume, org.gtk.gio.AsyncResult result);
        
        @ApiStatus.Internal default int upcall(MemoryAddress volume, MemoryAddress result) {
            var RESULT = run((org.gtk.gio.Volume) Interop.register(volume, org.gtk.gio.Volume.fromAddress).marshal(volume, null), (org.gtk.gio.AsyncResult) Interop.register(result, org.gtk.gio.AsyncResult.fromAddress).marshal(result, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), MountFinishCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code mount_finish}
     * @param mountFinish The new value of the field {@code mount_finish}
     */
    public void setMountFinish(MountFinishCallback mountFinish) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("mount_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (mountFinish == null ? MemoryAddress.NULL : mountFinish.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code EjectCallback} callback.
     */
    @FunctionalInterface
    public interface EjectCallback {
    
        void run(org.gtk.gio.Volume volume, org.gtk.gio.MountUnmountFlags flags, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback);
        
        @ApiStatus.Internal default void upcall(MemoryAddress volume, int flags, MemoryAddress cancellable, MemoryAddress callback, MemoryAddress userData) {
            run((org.gtk.gio.Volume) Interop.register(volume, org.gtk.gio.Volume.fromAddress).marshal(volume, null), new org.gtk.gio.MountUnmountFlags(flags), (org.gtk.gio.Cancellable) Interop.register(cancellable, org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, null), null /* Unsupported parameter type */);
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), EjectCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code eject}
     * @param eject The new value of the field {@code eject}
     */
    public void setEject(EjectCallback eject) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("eject"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (eject == null ? MemoryAddress.NULL : eject.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code EjectFinishCallback} callback.
     */
    @FunctionalInterface
    public interface EjectFinishCallback {
    
        boolean run(org.gtk.gio.Volume volume, org.gtk.gio.AsyncResult result);
        
        @ApiStatus.Internal default int upcall(MemoryAddress volume, MemoryAddress result) {
            var RESULT = run((org.gtk.gio.Volume) Interop.register(volume, org.gtk.gio.Volume.fromAddress).marshal(volume, null), (org.gtk.gio.AsyncResult) Interop.register(result, org.gtk.gio.AsyncResult.fromAddress).marshal(result, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), EjectFinishCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code eject_finish}
     * @param ejectFinish The new value of the field {@code eject_finish}
     */
    public void setEjectFinish(EjectFinishCallback ejectFinish) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("eject_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (ejectFinish == null ? MemoryAddress.NULL : ejectFinish.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GetIdentifierCallback} callback.
     */
    @FunctionalInterface
    public interface GetIdentifierCallback {
    
        @Nullable java.lang.String run(org.gtk.gio.Volume volume, java.lang.String kind);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress volume, MemoryAddress kind) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                var RESULT = run((org.gtk.gio.Volume) Interop.register(volume, org.gtk.gio.Volume.fromAddress).marshal(volume, null), Marshal.addressToString.marshal(kind, null));
                return RESULT == null ? MemoryAddress.NULL.address() : (Marshal.stringToAddress.marshal(RESULT, SCOPE)).address();
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GetIdentifierCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_identifier}
     * @param getIdentifier The new value of the field {@code get_identifier}
     */
    public void setGetIdentifier(GetIdentifierCallback getIdentifier) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_identifier"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getIdentifier == null ? MemoryAddress.NULL : getIdentifier.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code EnumerateIdentifiersCallback} callback.
     */
    @FunctionalInterface
    public interface EnumerateIdentifiersCallback {
    
        java.lang.String[] run(org.gtk.gio.Volume volume);
        
        @ApiStatus.Internal default void upcall(MemoryAddress volume) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                run((org.gtk.gio.Volume) Interop.register(volume, org.gtk.gio.Volume.fromAddress).marshal(volume, null));
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), EnumerateIdentifiersCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code enumerate_identifiers}
     * @param enumerateIdentifiers The new value of the field {@code enumerate_identifiers}
     */
    public void setEnumerateIdentifiers(EnumerateIdentifiersCallback enumerateIdentifiers) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("enumerate_identifiers"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (enumerateIdentifiers == null ? MemoryAddress.NULL : enumerateIdentifiers.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code ShouldAutomountCallback} callback.
     */
    @FunctionalInterface
    public interface ShouldAutomountCallback {
    
        boolean run(org.gtk.gio.Volume volume);
        
        @ApiStatus.Internal default int upcall(MemoryAddress volume) {
            var RESULT = run((org.gtk.gio.Volume) Interop.register(volume, org.gtk.gio.Volume.fromAddress).marshal(volume, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ShouldAutomountCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code should_automount}
     * @param shouldAutomount The new value of the field {@code should_automount}
     */
    public void setShouldAutomount(ShouldAutomountCallback shouldAutomount) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("should_automount"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (shouldAutomount == null ? MemoryAddress.NULL : shouldAutomount.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GetActivationRootCallback} callback.
     */
    @FunctionalInterface
    public interface GetActivationRootCallback {
    
        @Nullable org.gtk.gio.File run(org.gtk.gio.Volume volume);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress volume) {
            var RESULT = run((org.gtk.gio.Volume) Interop.register(volume, org.gtk.gio.Volume.fromAddress).marshal(volume, null));
            RESULT.yieldOwnership();
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GetActivationRootCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_activation_root}
     * @param getActivationRoot The new value of the field {@code get_activation_root}
     */
    public void setGetActivationRoot(GetActivationRootCallback getActivationRoot) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_activation_root"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getActivationRoot == null ? MemoryAddress.NULL : getActivationRoot.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code EjectWithOperationCallback} callback.
     */
    @FunctionalInterface
    public interface EjectWithOperationCallback {
    
        void run(org.gtk.gio.Volume volume, org.gtk.gio.MountUnmountFlags flags, @Nullable org.gtk.gio.MountOperation mountOperation, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback);
        
        @ApiStatus.Internal default void upcall(MemoryAddress volume, int flags, MemoryAddress mountOperation, MemoryAddress cancellable, MemoryAddress callback, MemoryAddress userData) {
            run((org.gtk.gio.Volume) Interop.register(volume, org.gtk.gio.Volume.fromAddress).marshal(volume, null), new org.gtk.gio.MountUnmountFlags(flags), (org.gtk.gio.MountOperation) Interop.register(mountOperation, org.gtk.gio.MountOperation.fromAddress).marshal(mountOperation, null), (org.gtk.gio.Cancellable) Interop.register(cancellable, org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, null), null /* Unsupported parameter type */);
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), EjectWithOperationCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code eject_with_operation}
     * @param ejectWithOperation The new value of the field {@code eject_with_operation}
     */
    public void setEjectWithOperation(EjectWithOperationCallback ejectWithOperation) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("eject_with_operation"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (ejectWithOperation == null ? MemoryAddress.NULL : ejectWithOperation.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code EjectWithOperationFinishCallback} callback.
     */
    @FunctionalInterface
    public interface EjectWithOperationFinishCallback {
    
        boolean run(org.gtk.gio.Volume volume, org.gtk.gio.AsyncResult result);
        
        @ApiStatus.Internal default int upcall(MemoryAddress volume, MemoryAddress result) {
            var RESULT = run((org.gtk.gio.Volume) Interop.register(volume, org.gtk.gio.Volume.fromAddress).marshal(volume, null), (org.gtk.gio.AsyncResult) Interop.register(result, org.gtk.gio.AsyncResult.fromAddress).marshal(result, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), EjectWithOperationFinishCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code eject_with_operation_finish}
     * @param ejectWithOperationFinish The new value of the field {@code eject_with_operation_finish}
     */
    public void setEjectWithOperationFinish(EjectWithOperationFinishCallback ejectWithOperationFinish) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("eject_with_operation_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (ejectWithOperationFinish == null ? MemoryAddress.NULL : ejectWithOperationFinish.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GetSortKeyCallback} callback.
     */
    @FunctionalInterface
    public interface GetSortKeyCallback {
    
        @Nullable java.lang.String run(org.gtk.gio.Volume volume);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress volume) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                var RESULT = run((org.gtk.gio.Volume) Interop.register(volume, org.gtk.gio.Volume.fromAddress).marshal(volume, null));
                return RESULT == null ? MemoryAddress.NULL.address() : (Marshal.stringToAddress.marshal(RESULT, SCOPE)).address();
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GetSortKeyCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_sort_key}
     * @param getSortKey The new value of the field {@code get_sort_key}
     */
    public void setGetSortKey(GetSortKeyCallback getSortKey) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_sort_key"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getSortKey == null ? MemoryAddress.NULL : getSortKey.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GetSymbolicIconCallback} callback.
     */
    @FunctionalInterface
    public interface GetSymbolicIconCallback {
    
        org.gtk.gio.Icon run(org.gtk.gio.Volume volume);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress volume) {
            var RESULT = run((org.gtk.gio.Volume) Interop.register(volume, org.gtk.gio.Volume.fromAddress).marshal(volume, null));
            RESULT.yieldOwnership();
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GetSymbolicIconCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_symbolic_icon}
     * @param getSymbolicIcon The new value of the field {@code get_symbolic_icon}
     */
    public void setGetSymbolicIcon(GetSymbolicIconCallback getSymbolicIcon) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_symbolic_icon"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getSymbolicIcon == null ? MemoryAddress.NULL : getSymbolicIcon.toCallback()));
        }
    }
    
    /**
     * Create a VolumeIface proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected VolumeIface(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, VolumeIface> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new VolumeIface(input);
    
    /**
     * A {@link VolumeIface.Builder} object constructs a {@link VolumeIface} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link VolumeIface.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final VolumeIface struct;
        
        private Builder() {
            struct = VolumeIface.allocate();
        }
        
        /**
         * Finish building the {@link VolumeIface} struct.
         * @return A new instance of {@code VolumeIface} with the fields 
         *         that were set in the Builder object.
         */
        public VolumeIface build() {
            return struct;
        }
        
        /**
         * The parent interface.
         * @param gIface The value for the {@code gIface} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setGIface(org.gtk.gobject.TypeInterface gIface) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("g_iface"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (gIface == null ? MemoryAddress.NULL : gIface.handle()));
                return this;
            }
        }
        
        public Builder setChanged(ChangedCallback changed) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("changed"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (changed == null ? MemoryAddress.NULL : changed.toCallback()));
                return this;
            }
        }
        
        public Builder setRemoved(RemovedCallback removed) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("removed"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (removed == null ? MemoryAddress.NULL : removed.toCallback()));
                return this;
            }
        }
        
        public Builder setGetName(GetNameCallback getName) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("get_name"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getName == null ? MemoryAddress.NULL : getName.toCallback()));
                return this;
            }
        }
        
        public Builder setGetIcon(GetIconCallback getIcon) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("get_icon"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getIcon == null ? MemoryAddress.NULL : getIcon.toCallback()));
                return this;
            }
        }
        
        public Builder setGetUuid(GetUuidCallback getUuid) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("get_uuid"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getUuid == null ? MemoryAddress.NULL : getUuid.toCallback()));
                return this;
            }
        }
        
        public Builder setGetDrive(GetDriveCallback getDrive) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("get_drive"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getDrive == null ? MemoryAddress.NULL : getDrive.toCallback()));
                return this;
            }
        }
        
        public Builder setGetMount(GetMountCallback getMount) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("get_mount"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getMount == null ? MemoryAddress.NULL : getMount.toCallback()));
                return this;
            }
        }
        
        public Builder setCanMount(CanMountCallback canMount) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("can_mount"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (canMount == null ? MemoryAddress.NULL : canMount.toCallback()));
                return this;
            }
        }
        
        public Builder setCanEject(CanEjectCallback canEject) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("can_eject"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (canEject == null ? MemoryAddress.NULL : canEject.toCallback()));
                return this;
            }
        }
        
        public Builder setMountFn(MountFnCallback mountFn) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("mount_fn"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (mountFn == null ? MemoryAddress.NULL : mountFn.toCallback()));
                return this;
            }
        }
        
        public Builder setMountFinish(MountFinishCallback mountFinish) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("mount_finish"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (mountFinish == null ? MemoryAddress.NULL : mountFinish.toCallback()));
                return this;
            }
        }
        
        public Builder setEject(EjectCallback eject) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("eject"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (eject == null ? MemoryAddress.NULL : eject.toCallback()));
                return this;
            }
        }
        
        public Builder setEjectFinish(EjectFinishCallback ejectFinish) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("eject_finish"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (ejectFinish == null ? MemoryAddress.NULL : ejectFinish.toCallback()));
                return this;
            }
        }
        
        public Builder setGetIdentifier(GetIdentifierCallback getIdentifier) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("get_identifier"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getIdentifier == null ? MemoryAddress.NULL : getIdentifier.toCallback()));
                return this;
            }
        }
        
        public Builder setEnumerateIdentifiers(EnumerateIdentifiersCallback enumerateIdentifiers) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("enumerate_identifiers"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (enumerateIdentifiers == null ? MemoryAddress.NULL : enumerateIdentifiers.toCallback()));
                return this;
            }
        }
        
        public Builder setShouldAutomount(ShouldAutomountCallback shouldAutomount) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("should_automount"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (shouldAutomount == null ? MemoryAddress.NULL : shouldAutomount.toCallback()));
                return this;
            }
        }
        
        public Builder setGetActivationRoot(GetActivationRootCallback getActivationRoot) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("get_activation_root"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getActivationRoot == null ? MemoryAddress.NULL : getActivationRoot.toCallback()));
                return this;
            }
        }
        
        public Builder setEjectWithOperation(EjectWithOperationCallback ejectWithOperation) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("eject_with_operation"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (ejectWithOperation == null ? MemoryAddress.NULL : ejectWithOperation.toCallback()));
                return this;
            }
        }
        
        public Builder setEjectWithOperationFinish(EjectWithOperationFinishCallback ejectWithOperationFinish) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("eject_with_operation_finish"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (ejectWithOperationFinish == null ? MemoryAddress.NULL : ejectWithOperationFinish.toCallback()));
                return this;
            }
        }
        
        public Builder setGetSortKey(GetSortKeyCallback getSortKey) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("get_sort_key"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getSortKey == null ? MemoryAddress.NULL : getSortKey.toCallback()));
                return this;
            }
        }
        
        public Builder setGetSymbolicIcon(GetSymbolicIconCallback getSymbolicIcon) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("get_symbolic_icon"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getSymbolicIcon == null ? MemoryAddress.NULL : getSymbolicIcon.toCallback()));
                return this;
            }
        }
    }
}
