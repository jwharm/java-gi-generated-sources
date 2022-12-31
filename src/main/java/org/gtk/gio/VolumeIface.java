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
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        VolumeIface newInstance = new VolumeIface(segment.address(), Ownership.NONE);
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
        void run(org.gtk.gio.Volume volume);

        @ApiStatus.Internal default void upcall(MemoryAddress volume) {
            run((org.gtk.gio.Volume) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(volume)), org.gtk.gio.Volume.fromAddress).marshal(volume, Ownership.NONE));
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
    public interface RemovedCallback {
        void run(org.gtk.gio.Volume volume);

        @ApiStatus.Internal default void upcall(MemoryAddress volume) {
            run((org.gtk.gio.Volume) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(volume)), org.gtk.gio.Volume.fromAddress).marshal(volume, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(RemovedCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code removed}
     * @param removed The new value of the field {@code removed}
     */
    public void setRemoved(RemovedCallback removed) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("removed"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (removed == null ? MemoryAddress.NULL : removed.toCallback()));
    }
    
    @FunctionalInterface
    public interface GetNameCallback {
        java.lang.String run(org.gtk.gio.Volume volume);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress volume) {
            var RESULT = run((org.gtk.gio.Volume) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(volume)), org.gtk.gio.Volume.fromAddress).marshal(volume, Ownership.NONE));
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
        org.gtk.gio.Icon run(org.gtk.gio.Volume volume);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress volume) {
            var RESULT = run((org.gtk.gio.Volume) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(volume)), org.gtk.gio.Volume.fromAddress).marshal(volume, Ownership.NONE));
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
        @Nullable java.lang.String run(org.gtk.gio.Volume volume);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress volume) {
            var RESULT = run((org.gtk.gio.Volume) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(volume)), org.gtk.gio.Volume.fromAddress).marshal(volume, Ownership.NONE));
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
    public interface GetDriveCallback {
        @Nullable org.gtk.gio.Drive run(org.gtk.gio.Volume volume);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress volume) {
            var RESULT = run((org.gtk.gio.Volume) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(volume)), org.gtk.gio.Volume.fromAddress).marshal(volume, Ownership.NONE));
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
    public interface GetMountCallback {
        @Nullable org.gtk.gio.Mount run(org.gtk.gio.Volume volume);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress volume) {
            var RESULT = run((org.gtk.gio.Volume) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(volume)), org.gtk.gio.Volume.fromAddress).marshal(volume, Ownership.NONE));
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GetMountCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_mount}
     * @param getMount The new value of the field {@code get_mount}
     */
    public void setGetMount(GetMountCallback getMount) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("get_mount"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getMount == null ? MemoryAddress.NULL : getMount.toCallback()));
    }
    
    @FunctionalInterface
    public interface CanMountCallback {
        boolean run(org.gtk.gio.Volume volume);

        @ApiStatus.Internal default int upcall(MemoryAddress volume) {
            var RESULT = run((org.gtk.gio.Volume) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(volume)), org.gtk.gio.Volume.fromAddress).marshal(volume, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(CanMountCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code can_mount}
     * @param canMount The new value of the field {@code can_mount}
     */
    public void setCanMount(CanMountCallback canMount) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("can_mount"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (canMount == null ? MemoryAddress.NULL : canMount.toCallback()));
    }
    
    @FunctionalInterface
    public interface CanEjectCallback {
        boolean run(org.gtk.gio.Volume volume);

        @ApiStatus.Internal default int upcall(MemoryAddress volume) {
            var RESULT = run((org.gtk.gio.Volume) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(volume)), org.gtk.gio.Volume.fromAddress).marshal(volume, Ownership.NONE));
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
    public interface MountFnCallback {
        void run(org.gtk.gio.Volume volume, org.gtk.gio.MountMountFlags flags, @Nullable org.gtk.gio.MountOperation mountOperation, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback);

        @ApiStatus.Internal default void upcall(MemoryAddress volume, int flags, MemoryAddress mountOperation, MemoryAddress cancellable, MemoryAddress callback, MemoryAddress userData) {
            run((org.gtk.gio.Volume) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(volume)), org.gtk.gio.Volume.fromAddress).marshal(volume, Ownership.NONE), new org.gtk.gio.MountMountFlags(flags), (org.gtk.gio.MountOperation) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(mountOperation)), org.gtk.gio.MountOperation.fromAddress).marshal(mountOperation, Ownership.NONE), (org.gtk.gio.Cancellable) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(cancellable)), org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, Ownership.NONE), null /* Unsupported parameter type */);
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MountFnCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code mount_fn}
     * @param mountFn The new value of the field {@code mount_fn}
     */
    public void setMountFn(MountFnCallback mountFn) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("mount_fn"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (mountFn == null ? MemoryAddress.NULL : mountFn.toCallback()));
    }
    
    @FunctionalInterface
    public interface MountFinishCallback {
        boolean run(org.gtk.gio.Volume volume, org.gtk.gio.AsyncResult result);

        @ApiStatus.Internal default int upcall(MemoryAddress volume, MemoryAddress result) {
            var RESULT = run((org.gtk.gio.Volume) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(volume)), org.gtk.gio.Volume.fromAddress).marshal(volume, Ownership.NONE), (org.gtk.gio.AsyncResult) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(result)), org.gtk.gio.AsyncResult.fromAddress).marshal(result, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MountFinishCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code mount_finish}
     * @param mountFinish The new value of the field {@code mount_finish}
     */
    public void setMountFinish(MountFinishCallback mountFinish) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("mount_finish"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (mountFinish == null ? MemoryAddress.NULL : mountFinish.toCallback()));
    }
    
    @FunctionalInterface
    public interface EjectCallback {
        void run(org.gtk.gio.Volume volume, org.gtk.gio.MountUnmountFlags flags, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback);

        @ApiStatus.Internal default void upcall(MemoryAddress volume, int flags, MemoryAddress cancellable, MemoryAddress callback, MemoryAddress userData) {
            run((org.gtk.gio.Volume) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(volume)), org.gtk.gio.Volume.fromAddress).marshal(volume, Ownership.NONE), new org.gtk.gio.MountUnmountFlags(flags), (org.gtk.gio.Cancellable) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(cancellable)), org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, Ownership.NONE), null /* Unsupported parameter type */);
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
        boolean run(org.gtk.gio.Volume volume, org.gtk.gio.AsyncResult result);

        @ApiStatus.Internal default int upcall(MemoryAddress volume, MemoryAddress result) {
            var RESULT = run((org.gtk.gio.Volume) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(volume)), org.gtk.gio.Volume.fromAddress).marshal(volume, Ownership.NONE), (org.gtk.gio.AsyncResult) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(result)), org.gtk.gio.AsyncResult.fromAddress).marshal(result, Ownership.NONE));
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
    public interface GetIdentifierCallback {
        @Nullable java.lang.String run(org.gtk.gio.Volume volume, java.lang.String kind);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress volume, MemoryAddress kind) {
            var RESULT = run((org.gtk.gio.Volume) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(volume)), org.gtk.gio.Volume.fromAddress).marshal(volume, Ownership.NONE), Marshal.addressToString.marshal(kind, null));
            return RESULT == null ? MemoryAddress.NULL.address() : (Marshal.stringToAddress.marshal(RESULT, null)).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GetIdentifierCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_identifier}
     * @param getIdentifier The new value of the field {@code get_identifier}
     */
    public void setGetIdentifier(GetIdentifierCallback getIdentifier) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("get_identifier"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getIdentifier == null ? MemoryAddress.NULL : getIdentifier.toCallback()));
    }
    
    @FunctionalInterface
    public interface EnumerateIdentifiersCallback {
        java.lang.String[] run(org.gtk.gio.Volume volume);

        @ApiStatus.Internal default void upcall(MemoryAddress volume) {
            run((org.gtk.gio.Volume) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(volume)), org.gtk.gio.Volume.fromAddress).marshal(volume, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(EnumerateIdentifiersCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code enumerate_identifiers}
     * @param enumerateIdentifiers The new value of the field {@code enumerate_identifiers}
     */
    public void setEnumerateIdentifiers(EnumerateIdentifiersCallback enumerateIdentifiers) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("enumerate_identifiers"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (enumerateIdentifiers == null ? MemoryAddress.NULL : enumerateIdentifiers.toCallback()));
    }
    
    @FunctionalInterface
    public interface ShouldAutomountCallback {
        boolean run(org.gtk.gio.Volume volume);

        @ApiStatus.Internal default int upcall(MemoryAddress volume) {
            var RESULT = run((org.gtk.gio.Volume) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(volume)), org.gtk.gio.Volume.fromAddress).marshal(volume, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ShouldAutomountCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code should_automount}
     * @param shouldAutomount The new value of the field {@code should_automount}
     */
    public void setShouldAutomount(ShouldAutomountCallback shouldAutomount) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("should_automount"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (shouldAutomount == null ? MemoryAddress.NULL : shouldAutomount.toCallback()));
    }
    
    @FunctionalInterface
    public interface GetActivationRootCallback {
        @Nullable org.gtk.gio.File run(org.gtk.gio.Volume volume);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress volume) {
            var RESULT = run((org.gtk.gio.Volume) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(volume)), org.gtk.gio.Volume.fromAddress).marshal(volume, Ownership.NONE));
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GetActivationRootCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_activation_root}
     * @param getActivationRoot The new value of the field {@code get_activation_root}
     */
    public void setGetActivationRoot(GetActivationRootCallback getActivationRoot) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("get_activation_root"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getActivationRoot == null ? MemoryAddress.NULL : getActivationRoot.toCallback()));
    }
    
    @FunctionalInterface
    public interface EjectWithOperationCallback {
        void run(org.gtk.gio.Volume volume, org.gtk.gio.MountUnmountFlags flags, @Nullable org.gtk.gio.MountOperation mountOperation, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback);

        @ApiStatus.Internal default void upcall(MemoryAddress volume, int flags, MemoryAddress mountOperation, MemoryAddress cancellable, MemoryAddress callback, MemoryAddress userData) {
            run((org.gtk.gio.Volume) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(volume)), org.gtk.gio.Volume.fromAddress).marshal(volume, Ownership.NONE), new org.gtk.gio.MountUnmountFlags(flags), (org.gtk.gio.MountOperation) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(mountOperation)), org.gtk.gio.MountOperation.fromAddress).marshal(mountOperation, Ownership.NONE), (org.gtk.gio.Cancellable) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(cancellable)), org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, Ownership.NONE), null /* Unsupported parameter type */);
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
        boolean run(org.gtk.gio.Volume volume, org.gtk.gio.AsyncResult result);

        @ApiStatus.Internal default int upcall(MemoryAddress volume, MemoryAddress result) {
            var RESULT = run((org.gtk.gio.Volume) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(volume)), org.gtk.gio.Volume.fromAddress).marshal(volume, Ownership.NONE), (org.gtk.gio.AsyncResult) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(result)), org.gtk.gio.AsyncResult.fromAddress).marshal(result, Ownership.NONE));
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
    public interface GetSortKeyCallback {
        @Nullable java.lang.String run(org.gtk.gio.Volume volume);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress volume) {
            var RESULT = run((org.gtk.gio.Volume) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(volume)), org.gtk.gio.Volume.fromAddress).marshal(volume, Ownership.NONE));
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
        org.gtk.gio.Icon run(org.gtk.gio.Volume volume);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress volume) {
            var RESULT = run((org.gtk.gio.Volume) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(volume)), org.gtk.gio.Volume.fromAddress).marshal(volume, Ownership.NONE));
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
     * Create a VolumeIface proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected VolumeIface(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, VolumeIface> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new VolumeIface(input, ownership);
    
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
        
        public Builder setRemoved(RemovedCallback removed) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("removed"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (removed == null ? MemoryAddress.NULL : removed.toCallback()));
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
        
        public Builder setGetDrive(GetDriveCallback getDrive) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_drive"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getDrive == null ? MemoryAddress.NULL : getDrive.toCallback()));
            return this;
        }
        
        public Builder setGetMount(GetMountCallback getMount) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_mount"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getMount == null ? MemoryAddress.NULL : getMount.toCallback()));
            return this;
        }
        
        public Builder setCanMount(CanMountCallback canMount) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("can_mount"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (canMount == null ? MemoryAddress.NULL : canMount.toCallback()));
            return this;
        }
        
        public Builder setCanEject(CanEjectCallback canEject) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("can_eject"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (canEject == null ? MemoryAddress.NULL : canEject.toCallback()));
            return this;
        }
        
        public Builder setMountFn(MountFnCallback mountFn) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("mount_fn"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (mountFn == null ? MemoryAddress.NULL : mountFn.toCallback()));
            return this;
        }
        
        public Builder setMountFinish(MountFinishCallback mountFinish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("mount_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (mountFinish == null ? MemoryAddress.NULL : mountFinish.toCallback()));
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
        
        public Builder setGetIdentifier(GetIdentifierCallback getIdentifier) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_identifier"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getIdentifier == null ? MemoryAddress.NULL : getIdentifier.toCallback()));
            return this;
        }
        
        public Builder setEnumerateIdentifiers(EnumerateIdentifiersCallback enumerateIdentifiers) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("enumerate_identifiers"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (enumerateIdentifiers == null ? MemoryAddress.NULL : enumerateIdentifiers.toCallback()));
            return this;
        }
        
        public Builder setShouldAutomount(ShouldAutomountCallback shouldAutomount) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("should_automount"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (shouldAutomount == null ? MemoryAddress.NULL : shouldAutomount.toCallback()));
            return this;
        }
        
        public Builder setGetActivationRoot(GetActivationRootCallback getActivationRoot) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_activation_root"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getActivationRoot == null ? MemoryAddress.NULL : getActivationRoot.toCallback()));
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
