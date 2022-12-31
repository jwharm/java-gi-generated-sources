package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Interface for implementing operations for mounts.
 */
public class MountIface extends Struct {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GMountIface";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.TypeInterface.getMemoryLayout().withName("g_iface"),
            Interop.valueLayout.ADDRESS.withName("changed"),
            Interop.valueLayout.ADDRESS.withName("unmounted"),
            Interop.valueLayout.ADDRESS.withName("get_root"),
            Interop.valueLayout.ADDRESS.withName("get_name"),
            Interop.valueLayout.ADDRESS.withName("get_icon"),
            Interop.valueLayout.ADDRESS.withName("get_uuid"),
            Interop.valueLayout.ADDRESS.withName("get_volume"),
            Interop.valueLayout.ADDRESS.withName("get_drive"),
            Interop.valueLayout.ADDRESS.withName("can_unmount"),
            Interop.valueLayout.ADDRESS.withName("can_eject"),
            Interop.valueLayout.ADDRESS.withName("unmount"),
            Interop.valueLayout.ADDRESS.withName("unmount_finish"),
            Interop.valueLayout.ADDRESS.withName("eject"),
            Interop.valueLayout.ADDRESS.withName("eject_finish"),
            Interop.valueLayout.ADDRESS.withName("remount"),
            Interop.valueLayout.ADDRESS.withName("remount_finish"),
            Interop.valueLayout.ADDRESS.withName("guess_content_type"),
            Interop.valueLayout.ADDRESS.withName("guess_content_type_finish"),
            Interop.valueLayout.ADDRESS.withName("guess_content_type_sync"),
            Interop.valueLayout.ADDRESS.withName("pre_unmount"),
            Interop.valueLayout.ADDRESS.withName("unmount_with_operation"),
            Interop.valueLayout.ADDRESS.withName("unmount_with_operation_finish"),
            Interop.valueLayout.ADDRESS.withName("eject_with_operation"),
            Interop.valueLayout.ADDRESS.withName("eject_with_operation_finish"),
            Interop.valueLayout.ADDRESS.withName("get_default_location"),
            Interop.valueLayout.ADDRESS.withName("get_sort_key"),
            Interop.valueLayout.ADDRESS.withName("get_symbolic_icon")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link MountIface}
     * @return A new, uninitialized @{link MountIface}
     */
    public static MountIface allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        MountIface newInstance = new MountIface(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Get the value of the field {@code g_iface}
     * @return The value of the field {@code g_iface}
     */
    public org.gtk.gobject.TypeInterface getGIface() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("g_iface"));
        return org.gtk.gobject.TypeInterface.fromAddress.marshal(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Change the value of the field {@code g_iface}
     * @param gIface The new value of the field {@code g_iface}
     */
    public void setGIface(org.gtk.gobject.TypeInterface gIface) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("g_iface"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (gIface == null ? MemoryAddress.NULL : gIface.handle()));
    }
    
    @FunctionalInterface
    public interface ChangedCallback {
        void run(org.gtk.gio.Mount mount);

        @ApiStatus.Internal default void upcall(MemoryAddress mount) {
            run((org.gtk.gio.Mount) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(mount)), org.gtk.gio.Mount.fromAddress).marshal(mount, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ChangedCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code changed}
     * @param changed The new value of the field {@code changed}
     */
    public void setChanged(ChangedCallback changed) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("changed"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (changed == null ? MemoryAddress.NULL : changed.toCallback()));
    }
    
    @FunctionalInterface
    public interface UnmountedCallback {
        void run(org.gtk.gio.Mount mount);

        @ApiStatus.Internal default void upcall(MemoryAddress mount) {
            run((org.gtk.gio.Mount) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(mount)), org.gtk.gio.Mount.fromAddress).marshal(mount, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(UnmountedCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code unmounted}
     * @param unmounted The new value of the field {@code unmounted}
     */
    public void setUnmounted(UnmountedCallback unmounted) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("unmounted"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (unmounted == null ? MemoryAddress.NULL : unmounted.toCallback()));
    }
    
    @FunctionalInterface
    public interface GetRootCallback {
        org.gtk.gio.File run(org.gtk.gio.Mount mount);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress mount) {
            var RESULT = run((org.gtk.gio.Mount) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(mount)), org.gtk.gio.Mount.fromAddress).marshal(mount, Ownership.NONE));
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GetRootCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_root}
     * @param getRoot The new value of the field {@code get_root}
     */
    public void setGetRoot(GetRootCallback getRoot) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("get_root"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getRoot == null ? MemoryAddress.NULL : getRoot.toCallback()));
    }
    
    @FunctionalInterface
    public interface GetNameCallback {
        java.lang.String run(org.gtk.gio.Mount mount);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress mount) {
            var RESULT = run((org.gtk.gio.Mount) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(mount)), org.gtk.gio.Mount.fromAddress).marshal(mount, Ownership.NONE));
            return RESULT == null ? MemoryAddress.NULL.address() : (Marshal.stringToAddress.marshal(RESULT, null)).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GetNameCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_name}
     * @param getName The new value of the field {@code get_name}
     */
    public void setGetName(GetNameCallback getName) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("get_name"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getName == null ? MemoryAddress.NULL : getName.toCallback()));
    }
    
    @FunctionalInterface
    public interface GetIconCallback {
        org.gtk.gio.Icon run(org.gtk.gio.Mount mount);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress mount) {
            var RESULT = run((org.gtk.gio.Mount) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(mount)), org.gtk.gio.Mount.fromAddress).marshal(mount, Ownership.NONE));
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GetIconCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_icon}
     * @param getIcon The new value of the field {@code get_icon}
     */
    public void setGetIcon(GetIconCallback getIcon) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("get_icon"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getIcon == null ? MemoryAddress.NULL : getIcon.toCallback()));
    }
    
    @FunctionalInterface
    public interface GetUuidCallback {
        @Nullable java.lang.String run(org.gtk.gio.Mount mount);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress mount) {
            var RESULT = run((org.gtk.gio.Mount) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(mount)), org.gtk.gio.Mount.fromAddress).marshal(mount, Ownership.NONE));
            return RESULT == null ? MemoryAddress.NULL.address() : (Marshal.stringToAddress.marshal(RESULT, null)).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GetUuidCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_uuid}
     * @param getUuid The new value of the field {@code get_uuid}
     */
    public void setGetUuid(GetUuidCallback getUuid) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("get_uuid"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getUuid == null ? MemoryAddress.NULL : getUuid.toCallback()));
    }
    
    @FunctionalInterface
    public interface GetVolumeCallback {
        @Nullable org.gtk.gio.Volume run(org.gtk.gio.Mount mount);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress mount) {
            var RESULT = run((org.gtk.gio.Mount) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(mount)), org.gtk.gio.Mount.fromAddress).marshal(mount, Ownership.NONE));
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GetVolumeCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_volume}
     * @param getVolume The new value of the field {@code get_volume}
     */
    public void setGetVolume(GetVolumeCallback getVolume) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("get_volume"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getVolume == null ? MemoryAddress.NULL : getVolume.toCallback()));
    }
    
    @FunctionalInterface
    public interface GetDriveCallback {
        @Nullable org.gtk.gio.Drive run(org.gtk.gio.Mount mount);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress mount) {
            var RESULT = run((org.gtk.gio.Mount) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(mount)), org.gtk.gio.Mount.fromAddress).marshal(mount, Ownership.NONE));
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GetDriveCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_drive}
     * @param getDrive The new value of the field {@code get_drive}
     */
    public void setGetDrive(GetDriveCallback getDrive) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("get_drive"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getDrive == null ? MemoryAddress.NULL : getDrive.toCallback()));
    }
    
    @FunctionalInterface
    public interface CanUnmountCallback {
        boolean run(org.gtk.gio.Mount mount);

        @ApiStatus.Internal default int upcall(MemoryAddress mount) {
            var RESULT = run((org.gtk.gio.Mount) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(mount)), org.gtk.gio.Mount.fromAddress).marshal(mount, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(CanUnmountCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code can_unmount}
     * @param canUnmount The new value of the field {@code can_unmount}
     */
    public void setCanUnmount(CanUnmountCallback canUnmount) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("can_unmount"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (canUnmount == null ? MemoryAddress.NULL : canUnmount.toCallback()));
    }
    
    @FunctionalInterface
    public interface CanEjectCallback {
        boolean run(org.gtk.gio.Mount mount);

        @ApiStatus.Internal default int upcall(MemoryAddress mount) {
            var RESULT = run((org.gtk.gio.Mount) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(mount)), org.gtk.gio.Mount.fromAddress).marshal(mount, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(CanEjectCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code can_eject}
     * @param canEject The new value of the field {@code can_eject}
     */
    public void setCanEject(CanEjectCallback canEject) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("can_eject"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (canEject == null ? MemoryAddress.NULL : canEject.toCallback()));
    }
    
    @FunctionalInterface
    public interface UnmountCallback {
        void run(org.gtk.gio.Mount mount, org.gtk.gio.MountUnmountFlags flags, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback);

        @ApiStatus.Internal default void upcall(MemoryAddress mount, int flags, MemoryAddress cancellable, MemoryAddress callback, MemoryAddress userData) {
            run((org.gtk.gio.Mount) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(mount)), org.gtk.gio.Mount.fromAddress).marshal(mount, Ownership.NONE), new org.gtk.gio.MountUnmountFlags(flags), (org.gtk.gio.Cancellable) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(cancellable)), org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, Ownership.NONE), null /* Unsupported parameter type */);
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(UnmountCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code unmount}
     * @param unmount The new value of the field {@code unmount}
     */
    public void setUnmount(UnmountCallback unmount) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("unmount"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (unmount == null ? MemoryAddress.NULL : unmount.toCallback()));
    }
    
    @FunctionalInterface
    public interface UnmountFinishCallback {
        boolean run(org.gtk.gio.Mount mount, org.gtk.gio.AsyncResult result);

        @ApiStatus.Internal default int upcall(MemoryAddress mount, MemoryAddress result) {
            var RESULT = run((org.gtk.gio.Mount) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(mount)), org.gtk.gio.Mount.fromAddress).marshal(mount, Ownership.NONE), (org.gtk.gio.AsyncResult) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(result)), org.gtk.gio.AsyncResult.fromAddress).marshal(result, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(UnmountFinishCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code unmount_finish}
     * @param unmountFinish The new value of the field {@code unmount_finish}
     */
    public void setUnmountFinish(UnmountFinishCallback unmountFinish) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("unmount_finish"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (unmountFinish == null ? MemoryAddress.NULL : unmountFinish.toCallback()));
    }
    
    @FunctionalInterface
    public interface EjectCallback {
        void run(org.gtk.gio.Mount mount, org.gtk.gio.MountUnmountFlags flags, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback);

        @ApiStatus.Internal default void upcall(MemoryAddress mount, int flags, MemoryAddress cancellable, MemoryAddress callback, MemoryAddress userData) {
            run((org.gtk.gio.Mount) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(mount)), org.gtk.gio.Mount.fromAddress).marshal(mount, Ownership.NONE), new org.gtk.gio.MountUnmountFlags(flags), (org.gtk.gio.Cancellable) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(cancellable)), org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, Ownership.NONE), null /* Unsupported parameter type */);
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(EjectCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code eject}
     * @param eject The new value of the field {@code eject}
     */
    public void setEject(EjectCallback eject) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("eject"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (eject == null ? MemoryAddress.NULL : eject.toCallback()));
    }
    
    @FunctionalInterface
    public interface EjectFinishCallback {
        boolean run(org.gtk.gio.Mount mount, org.gtk.gio.AsyncResult result);

        @ApiStatus.Internal default int upcall(MemoryAddress mount, MemoryAddress result) {
            var RESULT = run((org.gtk.gio.Mount) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(mount)), org.gtk.gio.Mount.fromAddress).marshal(mount, Ownership.NONE), (org.gtk.gio.AsyncResult) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(result)), org.gtk.gio.AsyncResult.fromAddress).marshal(result, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(EjectFinishCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code eject_finish}
     * @param ejectFinish The new value of the field {@code eject_finish}
     */
    public void setEjectFinish(EjectFinishCallback ejectFinish) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("eject_finish"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (ejectFinish == null ? MemoryAddress.NULL : ejectFinish.toCallback()));
    }
    
    @FunctionalInterface
    public interface RemountCallback {
        void run(org.gtk.gio.Mount mount, org.gtk.gio.MountMountFlags flags, @Nullable org.gtk.gio.MountOperation mountOperation, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback);

        @ApiStatus.Internal default void upcall(MemoryAddress mount, int flags, MemoryAddress mountOperation, MemoryAddress cancellable, MemoryAddress callback, MemoryAddress userData) {
            run((org.gtk.gio.Mount) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(mount)), org.gtk.gio.Mount.fromAddress).marshal(mount, Ownership.NONE), new org.gtk.gio.MountMountFlags(flags), (org.gtk.gio.MountOperation) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(mountOperation)), org.gtk.gio.MountOperation.fromAddress).marshal(mountOperation, Ownership.NONE), (org.gtk.gio.Cancellable) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(cancellable)), org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, Ownership.NONE), null /* Unsupported parameter type */);
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(RemountCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code remount}
     * @param remount The new value of the field {@code remount}
     */
    public void setRemount(RemountCallback remount) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("remount"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (remount == null ? MemoryAddress.NULL : remount.toCallback()));
    }
    
    @FunctionalInterface
    public interface RemountFinishCallback {
        boolean run(org.gtk.gio.Mount mount, org.gtk.gio.AsyncResult result);

        @ApiStatus.Internal default int upcall(MemoryAddress mount, MemoryAddress result) {
            var RESULT = run((org.gtk.gio.Mount) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(mount)), org.gtk.gio.Mount.fromAddress).marshal(mount, Ownership.NONE), (org.gtk.gio.AsyncResult) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(result)), org.gtk.gio.AsyncResult.fromAddress).marshal(result, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(RemountFinishCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code remount_finish}
     * @param remountFinish The new value of the field {@code remount_finish}
     */
    public void setRemountFinish(RemountFinishCallback remountFinish) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("remount_finish"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (remountFinish == null ? MemoryAddress.NULL : remountFinish.toCallback()));
    }
    
    @FunctionalInterface
    public interface GuessContentTypeCallback {
        void run(org.gtk.gio.Mount mount, boolean forceRescan, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback);

        @ApiStatus.Internal default void upcall(MemoryAddress mount, int forceRescan, MemoryAddress cancellable, MemoryAddress callback, MemoryAddress userData) {
            run((org.gtk.gio.Mount) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(mount)), org.gtk.gio.Mount.fromAddress).marshal(mount, Ownership.NONE), Marshal.integerToBoolean.marshal(forceRescan, null).booleanValue(), (org.gtk.gio.Cancellable) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(cancellable)), org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, Ownership.NONE), null /* Unsupported parameter type */);
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GuessContentTypeCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code guess_content_type}
     * @param guessContentType The new value of the field {@code guess_content_type}
     */
    public void setGuessContentType(GuessContentTypeCallback guessContentType) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("guess_content_type"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (guessContentType == null ? MemoryAddress.NULL : guessContentType.toCallback()));
    }
    
    @FunctionalInterface
    public interface GuessContentTypeFinishCallback {
        java.lang.String[] run(org.gtk.gio.Mount mount, org.gtk.gio.AsyncResult result);

        @ApiStatus.Internal default void upcall(MemoryAddress mount, MemoryAddress result) {
            run((org.gtk.gio.Mount) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(mount)), org.gtk.gio.Mount.fromAddress).marshal(mount, Ownership.NONE), (org.gtk.gio.AsyncResult) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(result)), org.gtk.gio.AsyncResult.fromAddress).marshal(result, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GuessContentTypeFinishCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code guess_content_type_finish}
     * @param guessContentTypeFinish The new value of the field {@code guess_content_type_finish}
     */
    public void setGuessContentTypeFinish(GuessContentTypeFinishCallback guessContentTypeFinish) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("guess_content_type_finish"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (guessContentTypeFinish == null ? MemoryAddress.NULL : guessContentTypeFinish.toCallback()));
    }
    
    @FunctionalInterface
    public interface GuessContentTypeSyncCallback {
        java.lang.String[] run(org.gtk.gio.Mount mount, boolean forceRescan, @Nullable org.gtk.gio.Cancellable cancellable);

        @ApiStatus.Internal default void upcall(MemoryAddress mount, int forceRescan, MemoryAddress cancellable) {
            run((org.gtk.gio.Mount) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(mount)), org.gtk.gio.Mount.fromAddress).marshal(mount, Ownership.NONE), Marshal.integerToBoolean.marshal(forceRescan, null).booleanValue(), (org.gtk.gio.Cancellable) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(cancellable)), org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GuessContentTypeSyncCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code guess_content_type_sync}
     * @param guessContentTypeSync The new value of the field {@code guess_content_type_sync}
     */
    public void setGuessContentTypeSync(GuessContentTypeSyncCallback guessContentTypeSync) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("guess_content_type_sync"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (guessContentTypeSync == null ? MemoryAddress.NULL : guessContentTypeSync.toCallback()));
    }
    
    @FunctionalInterface
    public interface PreUnmountCallback {
        void run(org.gtk.gio.Mount mount);

        @ApiStatus.Internal default void upcall(MemoryAddress mount) {
            run((org.gtk.gio.Mount) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(mount)), org.gtk.gio.Mount.fromAddress).marshal(mount, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(PreUnmountCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code pre_unmount}
     * @param preUnmount The new value of the field {@code pre_unmount}
     */
    public void setPreUnmount(PreUnmountCallback preUnmount) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("pre_unmount"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (preUnmount == null ? MemoryAddress.NULL : preUnmount.toCallback()));
    }
    
    @FunctionalInterface
    public interface UnmountWithOperationCallback {
        void run(org.gtk.gio.Mount mount, org.gtk.gio.MountUnmountFlags flags, @Nullable org.gtk.gio.MountOperation mountOperation, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback);

        @ApiStatus.Internal default void upcall(MemoryAddress mount, int flags, MemoryAddress mountOperation, MemoryAddress cancellable, MemoryAddress callback, MemoryAddress userData) {
            run((org.gtk.gio.Mount) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(mount)), org.gtk.gio.Mount.fromAddress).marshal(mount, Ownership.NONE), new org.gtk.gio.MountUnmountFlags(flags), (org.gtk.gio.MountOperation) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(mountOperation)), org.gtk.gio.MountOperation.fromAddress).marshal(mountOperation, Ownership.NONE), (org.gtk.gio.Cancellable) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(cancellable)), org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, Ownership.NONE), null /* Unsupported parameter type */);
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(UnmountWithOperationCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code unmount_with_operation}
     * @param unmountWithOperation The new value of the field {@code unmount_with_operation}
     */
    public void setUnmountWithOperation(UnmountWithOperationCallback unmountWithOperation) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("unmount_with_operation"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (unmountWithOperation == null ? MemoryAddress.NULL : unmountWithOperation.toCallback()));
    }
    
    @FunctionalInterface
    public interface UnmountWithOperationFinishCallback {
        boolean run(org.gtk.gio.Mount mount, org.gtk.gio.AsyncResult result);

        @ApiStatus.Internal default int upcall(MemoryAddress mount, MemoryAddress result) {
            var RESULT = run((org.gtk.gio.Mount) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(mount)), org.gtk.gio.Mount.fromAddress).marshal(mount, Ownership.NONE), (org.gtk.gio.AsyncResult) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(result)), org.gtk.gio.AsyncResult.fromAddress).marshal(result, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(UnmountWithOperationFinishCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code unmount_with_operation_finish}
     * @param unmountWithOperationFinish The new value of the field {@code unmount_with_operation_finish}
     */
    public void setUnmountWithOperationFinish(UnmountWithOperationFinishCallback unmountWithOperationFinish) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("unmount_with_operation_finish"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (unmountWithOperationFinish == null ? MemoryAddress.NULL : unmountWithOperationFinish.toCallback()));
    }
    
    @FunctionalInterface
    public interface EjectWithOperationCallback {
        void run(org.gtk.gio.Mount mount, org.gtk.gio.MountUnmountFlags flags, @Nullable org.gtk.gio.MountOperation mountOperation, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback);

        @ApiStatus.Internal default void upcall(MemoryAddress mount, int flags, MemoryAddress mountOperation, MemoryAddress cancellable, MemoryAddress callback, MemoryAddress userData) {
            run((org.gtk.gio.Mount) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(mount)), org.gtk.gio.Mount.fromAddress).marshal(mount, Ownership.NONE), new org.gtk.gio.MountUnmountFlags(flags), (org.gtk.gio.MountOperation) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(mountOperation)), org.gtk.gio.MountOperation.fromAddress).marshal(mountOperation, Ownership.NONE), (org.gtk.gio.Cancellable) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(cancellable)), org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, Ownership.NONE), null /* Unsupported parameter type */);
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(EjectWithOperationCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code eject_with_operation}
     * @param ejectWithOperation The new value of the field {@code eject_with_operation}
     */
    public void setEjectWithOperation(EjectWithOperationCallback ejectWithOperation) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("eject_with_operation"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (ejectWithOperation == null ? MemoryAddress.NULL : ejectWithOperation.toCallback()));
    }
    
    @FunctionalInterface
    public interface EjectWithOperationFinishCallback {
        boolean run(org.gtk.gio.Mount mount, org.gtk.gio.AsyncResult result);

        @ApiStatus.Internal default int upcall(MemoryAddress mount, MemoryAddress result) {
            var RESULT = run((org.gtk.gio.Mount) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(mount)), org.gtk.gio.Mount.fromAddress).marshal(mount, Ownership.NONE), (org.gtk.gio.AsyncResult) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(result)), org.gtk.gio.AsyncResult.fromAddress).marshal(result, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(EjectWithOperationFinishCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code eject_with_operation_finish}
     * @param ejectWithOperationFinish The new value of the field {@code eject_with_operation_finish}
     */
    public void setEjectWithOperationFinish(EjectWithOperationFinishCallback ejectWithOperationFinish) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("eject_with_operation_finish"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (ejectWithOperationFinish == null ? MemoryAddress.NULL : ejectWithOperationFinish.toCallback()));
    }
    
    @FunctionalInterface
    public interface GetDefaultLocationCallback {
        org.gtk.gio.File run(org.gtk.gio.Mount mount);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress mount) {
            var RESULT = run((org.gtk.gio.Mount) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(mount)), org.gtk.gio.Mount.fromAddress).marshal(mount, Ownership.NONE));
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GetDefaultLocationCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_default_location}
     * @param getDefaultLocation The new value of the field {@code get_default_location}
     */
    public void setGetDefaultLocation(GetDefaultLocationCallback getDefaultLocation) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("get_default_location"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getDefaultLocation == null ? MemoryAddress.NULL : getDefaultLocation.toCallback()));
    }
    
    @FunctionalInterface
    public interface GetSortKeyCallback {
        @Nullable java.lang.String run(org.gtk.gio.Mount mount);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress mount) {
            var RESULT = run((org.gtk.gio.Mount) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(mount)), org.gtk.gio.Mount.fromAddress).marshal(mount, Ownership.NONE));
            return RESULT == null ? MemoryAddress.NULL.address() : (Marshal.stringToAddress.marshal(RESULT, null)).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GetSortKeyCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_sort_key}
     * @param getSortKey The new value of the field {@code get_sort_key}
     */
    public void setGetSortKey(GetSortKeyCallback getSortKey) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("get_sort_key"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getSortKey == null ? MemoryAddress.NULL : getSortKey.toCallback()));
    }
    
    @FunctionalInterface
    public interface GetSymbolicIconCallback {
        org.gtk.gio.Icon run(org.gtk.gio.Mount mount);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress mount) {
            var RESULT = run((org.gtk.gio.Mount) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(mount)), org.gtk.gio.Mount.fromAddress).marshal(mount, Ownership.NONE));
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GetSymbolicIconCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_symbolic_icon}
     * @param getSymbolicIcon The new value of the field {@code get_symbolic_icon}
     */
    public void setGetSymbolicIcon(GetSymbolicIconCallback getSymbolicIcon) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("get_symbolic_icon"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getSymbolicIcon == null ? MemoryAddress.NULL : getSymbolicIcon.toCallback()));
    }
    
    /**
     * Create a MountIface proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected MountIface(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, MountIface> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new MountIface(input, ownership);
    
    /**
     * A {@link MountIface.Builder} object constructs a {@link MountIface} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link MountIface.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final MountIface struct;
        
        private Builder() {
            struct = MountIface.allocate();
        }
        
         /**
         * Finish building the {@link MountIface} struct.
         * @return A new instance of {@code MountIface} with the fields 
         *         that were set in the Builder object.
         */
        public MountIface build() {
            return struct;
        }
        
        /**
         * The parent interface.
         * @param gIface The value for the {@code gIface} field
         * @return The {@code Build} instance is returned, to allow method chaining
         */
        public Builder setGIface(org.gtk.gobject.TypeInterface gIface) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("g_iface"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (gIface == null ? MemoryAddress.NULL : gIface.handle()));
            return this;
        }
        
        public Builder setChanged(ChangedCallback changed) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("changed"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (changed == null ? MemoryAddress.NULL : changed.toCallback()));
            return this;
        }
        
        public Builder setUnmounted(UnmountedCallback unmounted) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("unmounted"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (unmounted == null ? MemoryAddress.NULL : unmounted.toCallback()));
            return this;
        }
        
        public Builder setGetRoot(GetRootCallback getRoot) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_root"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getRoot == null ? MemoryAddress.NULL : getRoot.toCallback()));
            return this;
        }
        
        public Builder setGetName(GetNameCallback getName) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_name"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getName == null ? MemoryAddress.NULL : getName.toCallback()));
            return this;
        }
        
        public Builder setGetIcon(GetIconCallback getIcon) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_icon"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getIcon == null ? MemoryAddress.NULL : getIcon.toCallback()));
            return this;
        }
        
        public Builder setGetUuid(GetUuidCallback getUuid) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_uuid"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getUuid == null ? MemoryAddress.NULL : getUuid.toCallback()));
            return this;
        }
        
        public Builder setGetVolume(GetVolumeCallback getVolume) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_volume"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getVolume == null ? MemoryAddress.NULL : getVolume.toCallback()));
            return this;
        }
        
        public Builder setGetDrive(GetDriveCallback getDrive) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_drive"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getDrive == null ? MemoryAddress.NULL : getDrive.toCallback()));
            return this;
        }
        
        public Builder setCanUnmount(CanUnmountCallback canUnmount) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("can_unmount"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (canUnmount == null ? MemoryAddress.NULL : canUnmount.toCallback()));
            return this;
        }
        
        public Builder setCanEject(CanEjectCallback canEject) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("can_eject"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (canEject == null ? MemoryAddress.NULL : canEject.toCallback()));
            return this;
        }
        
        public Builder setUnmount(UnmountCallback unmount) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("unmount"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (unmount == null ? MemoryAddress.NULL : unmount.toCallback()));
            return this;
        }
        
        public Builder setUnmountFinish(UnmountFinishCallback unmountFinish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("unmount_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (unmountFinish == null ? MemoryAddress.NULL : unmountFinish.toCallback()));
            return this;
        }
        
        public Builder setEject(EjectCallback eject) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("eject"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (eject == null ? MemoryAddress.NULL : eject.toCallback()));
            return this;
        }
        
        public Builder setEjectFinish(EjectFinishCallback ejectFinish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("eject_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (ejectFinish == null ? MemoryAddress.NULL : ejectFinish.toCallback()));
            return this;
        }
        
        public Builder setRemount(RemountCallback remount) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("remount"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (remount == null ? MemoryAddress.NULL : remount.toCallback()));
            return this;
        }
        
        public Builder setRemountFinish(RemountFinishCallback remountFinish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("remount_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (remountFinish == null ? MemoryAddress.NULL : remountFinish.toCallback()));
            return this;
        }
        
        public Builder setGuessContentType(GuessContentTypeCallback guessContentType) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("guess_content_type"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (guessContentType == null ? MemoryAddress.NULL : guessContentType.toCallback()));
            return this;
        }
        
        public Builder setGuessContentTypeFinish(GuessContentTypeFinishCallback guessContentTypeFinish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("guess_content_type_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (guessContentTypeFinish == null ? MemoryAddress.NULL : guessContentTypeFinish.toCallback()));
            return this;
        }
        
        public Builder setGuessContentTypeSync(GuessContentTypeSyncCallback guessContentTypeSync) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("guess_content_type_sync"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (guessContentTypeSync == null ? MemoryAddress.NULL : guessContentTypeSync.toCallback()));
            return this;
        }
        
        public Builder setPreUnmount(PreUnmountCallback preUnmount) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("pre_unmount"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (preUnmount == null ? MemoryAddress.NULL : preUnmount.toCallback()));
            return this;
        }
        
        public Builder setUnmountWithOperation(UnmountWithOperationCallback unmountWithOperation) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("unmount_with_operation"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (unmountWithOperation == null ? MemoryAddress.NULL : unmountWithOperation.toCallback()));
            return this;
        }
        
        public Builder setUnmountWithOperationFinish(UnmountWithOperationFinishCallback unmountWithOperationFinish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("unmount_with_operation_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (unmountWithOperationFinish == null ? MemoryAddress.NULL : unmountWithOperationFinish.toCallback()));
            return this;
        }
        
        public Builder setEjectWithOperation(EjectWithOperationCallback ejectWithOperation) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("eject_with_operation"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (ejectWithOperation == null ? MemoryAddress.NULL : ejectWithOperation.toCallback()));
            return this;
        }
        
        public Builder setEjectWithOperationFinish(EjectWithOperationFinishCallback ejectWithOperationFinish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("eject_with_operation_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (ejectWithOperationFinish == null ? MemoryAddress.NULL : ejectWithOperationFinish.toCallback()));
            return this;
        }
        
        public Builder setGetDefaultLocation(GetDefaultLocationCallback getDefaultLocation) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_default_location"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getDefaultLocation == null ? MemoryAddress.NULL : getDefaultLocation.toCallback()));
            return this;
        }
        
        public Builder setGetSortKey(GetSortKeyCallback getSortKey) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_sort_key"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getSortKey == null ? MemoryAddress.NULL : getSortKey.toCallback()));
            return this;
        }
        
        public Builder setGetSymbolicIcon(GetSymbolicIconCallback getSymbolicIcon) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_symbolic_icon"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getSymbolicIcon == null ? MemoryAddress.NULL : getSymbolicIcon.toCallback()));
            return this;
        }
    }
}
