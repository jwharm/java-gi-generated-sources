package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Interface for creating {@link Drive} implementations.
 */
public class DriveIface extends Struct {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GDriveIface";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.TypeInterface.getMemoryLayout().withName("g_iface"),
            Interop.valueLayout.ADDRESS.withName("changed"),
            Interop.valueLayout.ADDRESS.withName("disconnected"),
            Interop.valueLayout.ADDRESS.withName("eject_button"),
            Interop.valueLayout.ADDRESS.withName("get_name"),
            Interop.valueLayout.ADDRESS.withName("get_icon"),
            Interop.valueLayout.ADDRESS.withName("has_volumes"),
            Interop.valueLayout.ADDRESS.withName("get_volumes"),
            Interop.valueLayout.ADDRESS.withName("is_media_removable"),
            Interop.valueLayout.ADDRESS.withName("has_media"),
            Interop.valueLayout.ADDRESS.withName("is_media_check_automatic"),
            Interop.valueLayout.ADDRESS.withName("can_eject"),
            Interop.valueLayout.ADDRESS.withName("can_poll_for_media"),
            Interop.valueLayout.ADDRESS.withName("eject"),
            Interop.valueLayout.ADDRESS.withName("eject_finish"),
            Interop.valueLayout.ADDRESS.withName("poll_for_media"),
            Interop.valueLayout.ADDRESS.withName("poll_for_media_finish"),
            Interop.valueLayout.ADDRESS.withName("get_identifier"),
            Interop.valueLayout.ADDRESS.withName("enumerate_identifiers"),
            Interop.valueLayout.ADDRESS.withName("get_start_stop_type"),
            Interop.valueLayout.ADDRESS.withName("can_start"),
            Interop.valueLayout.ADDRESS.withName("can_start_degraded"),
            Interop.valueLayout.ADDRESS.withName("start"),
            Interop.valueLayout.ADDRESS.withName("start_finish"),
            Interop.valueLayout.ADDRESS.withName("can_stop"),
            Interop.valueLayout.ADDRESS.withName("stop"),
            Interop.valueLayout.ADDRESS.withName("stop_finish"),
            Interop.valueLayout.ADDRESS.withName("stop_button"),
            Interop.valueLayout.ADDRESS.withName("eject_with_operation"),
            Interop.valueLayout.ADDRESS.withName("eject_with_operation_finish"),
            Interop.valueLayout.ADDRESS.withName("get_sort_key"),
            Interop.valueLayout.ADDRESS.withName("get_symbolic_icon"),
            Interop.valueLayout.ADDRESS.withName("is_removable")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link DriveIface}
     * @return A new, uninitialized @{link DriveIface}
     */
    public static DriveIface allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        DriveIface newInstance = new DriveIface(segment.address(), Ownership.NONE);
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
        void run(org.gtk.gio.Drive drive);

        @ApiStatus.Internal default void upcall(MemoryAddress drive) {
            run((org.gtk.gio.Drive) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(drive)), org.gtk.gio.Drive.fromAddress).marshal(drive, Ownership.NONE));
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
    public interface DisconnectedCallback {
        void run(org.gtk.gio.Drive drive);

        @ApiStatus.Internal default void upcall(MemoryAddress drive) {
            run((org.gtk.gio.Drive) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(drive)), org.gtk.gio.Drive.fromAddress).marshal(drive, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(DisconnectedCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code disconnected}
     * @param disconnected The new value of the field {@code disconnected}
     */
    public void setDisconnected(DisconnectedCallback disconnected) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("disconnected"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (disconnected == null ? MemoryAddress.NULL : disconnected.toCallback()));
    }
    
    @FunctionalInterface
    public interface EjectButtonCallback {
        void run(org.gtk.gio.Drive drive);

        @ApiStatus.Internal default void upcall(MemoryAddress drive) {
            run((org.gtk.gio.Drive) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(drive)), org.gtk.gio.Drive.fromAddress).marshal(drive, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(EjectButtonCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code eject_button}
     * @param ejectButton The new value of the field {@code eject_button}
     */
    public void setEjectButton(EjectButtonCallback ejectButton) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("eject_button"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (ejectButton == null ? MemoryAddress.NULL : ejectButton.toCallback()));
    }
    
    @FunctionalInterface
    public interface GetNameCallback {
        java.lang.String run(org.gtk.gio.Drive drive);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress drive) {
            var RESULT = run((org.gtk.gio.Drive) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(drive)), org.gtk.gio.Drive.fromAddress).marshal(drive, Ownership.NONE));
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
        org.gtk.gio.Icon run(org.gtk.gio.Drive drive);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress drive) {
            var RESULT = run((org.gtk.gio.Drive) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(drive)), org.gtk.gio.Drive.fromAddress).marshal(drive, Ownership.NONE));
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
    public interface HasVolumesCallback {
        boolean run(org.gtk.gio.Drive drive);

        @ApiStatus.Internal default int upcall(MemoryAddress drive) {
            var RESULT = run((org.gtk.gio.Drive) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(drive)), org.gtk.gio.Drive.fromAddress).marshal(drive, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(HasVolumesCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code has_volumes}
     * @param hasVolumes The new value of the field {@code has_volumes}
     */
    public void setHasVolumes(HasVolumesCallback hasVolumes) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("has_volumes"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (hasVolumes == null ? MemoryAddress.NULL : hasVolumes.toCallback()));
    }
    
    @FunctionalInterface
    public interface GetVolumesCallback {
        org.gtk.glib.List run(org.gtk.gio.Drive drive);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress drive) {
            var RESULT = run((org.gtk.gio.Drive) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(drive)), org.gtk.gio.Drive.fromAddress).marshal(drive, Ownership.NONE));
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GetVolumesCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_volumes}
     * @param getVolumes The new value of the field {@code get_volumes}
     */
    public void setGetVolumes(GetVolumesCallback getVolumes) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("get_volumes"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getVolumes == null ? MemoryAddress.NULL : getVolumes.toCallback()));
    }
    
    @FunctionalInterface
    public interface IsMediaRemovableCallback {
        boolean run(org.gtk.gio.Drive drive);

        @ApiStatus.Internal default int upcall(MemoryAddress drive) {
            var RESULT = run((org.gtk.gio.Drive) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(drive)), org.gtk.gio.Drive.fromAddress).marshal(drive, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(IsMediaRemovableCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code is_media_removable}
     * @param isMediaRemovable The new value of the field {@code is_media_removable}
     */
    public void setIsMediaRemovable(IsMediaRemovableCallback isMediaRemovable) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("is_media_removable"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (isMediaRemovable == null ? MemoryAddress.NULL : isMediaRemovable.toCallback()));
    }
    
    @FunctionalInterface
    public interface HasMediaCallback {
        boolean run(org.gtk.gio.Drive drive);

        @ApiStatus.Internal default int upcall(MemoryAddress drive) {
            var RESULT = run((org.gtk.gio.Drive) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(drive)), org.gtk.gio.Drive.fromAddress).marshal(drive, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(HasMediaCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code has_media}
     * @param hasMedia The new value of the field {@code has_media}
     */
    public void setHasMedia(HasMediaCallback hasMedia) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("has_media"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (hasMedia == null ? MemoryAddress.NULL : hasMedia.toCallback()));
    }
    
    @FunctionalInterface
    public interface IsMediaCheckAutomaticCallback {
        boolean run(org.gtk.gio.Drive drive);

        @ApiStatus.Internal default int upcall(MemoryAddress drive) {
            var RESULT = run((org.gtk.gio.Drive) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(drive)), org.gtk.gio.Drive.fromAddress).marshal(drive, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(IsMediaCheckAutomaticCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code is_media_check_automatic}
     * @param isMediaCheckAutomatic The new value of the field {@code is_media_check_automatic}
     */
    public void setIsMediaCheckAutomatic(IsMediaCheckAutomaticCallback isMediaCheckAutomatic) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("is_media_check_automatic"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (isMediaCheckAutomatic == null ? MemoryAddress.NULL : isMediaCheckAutomatic.toCallback()));
    }
    
    @FunctionalInterface
    public interface CanEjectCallback {
        boolean run(org.gtk.gio.Drive drive);

        @ApiStatus.Internal default int upcall(MemoryAddress drive) {
            var RESULT = run((org.gtk.gio.Drive) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(drive)), org.gtk.gio.Drive.fromAddress).marshal(drive, Ownership.NONE));
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
    public interface CanPollForMediaCallback {
        boolean run(org.gtk.gio.Drive drive);

        @ApiStatus.Internal default int upcall(MemoryAddress drive) {
            var RESULT = run((org.gtk.gio.Drive) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(drive)), org.gtk.gio.Drive.fromAddress).marshal(drive, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(CanPollForMediaCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code can_poll_for_media}
     * @param canPollForMedia The new value of the field {@code can_poll_for_media}
     */
    public void setCanPollForMedia(CanPollForMediaCallback canPollForMedia) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("can_poll_for_media"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (canPollForMedia == null ? MemoryAddress.NULL : canPollForMedia.toCallback()));
    }
    
    @FunctionalInterface
    public interface EjectCallback {
        void run(org.gtk.gio.Drive drive, org.gtk.gio.MountUnmountFlags flags, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback);

        @ApiStatus.Internal default void upcall(MemoryAddress drive, int flags, MemoryAddress cancellable, MemoryAddress callback, MemoryAddress userData) {
            run((org.gtk.gio.Drive) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(drive)), org.gtk.gio.Drive.fromAddress).marshal(drive, Ownership.NONE), new org.gtk.gio.MountUnmountFlags(flags), (org.gtk.gio.Cancellable) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(cancellable)), org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, Ownership.NONE), null /* Unsupported parameter type */);
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
        boolean run(org.gtk.gio.Drive drive, org.gtk.gio.AsyncResult result);

        @ApiStatus.Internal default int upcall(MemoryAddress drive, MemoryAddress result) {
            var RESULT = run((org.gtk.gio.Drive) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(drive)), org.gtk.gio.Drive.fromAddress).marshal(drive, Ownership.NONE), (org.gtk.gio.AsyncResult) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(result)), org.gtk.gio.AsyncResult.fromAddress).marshal(result, Ownership.NONE));
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
    public interface PollForMediaCallback {
        void run(org.gtk.gio.Drive drive, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback);

        @ApiStatus.Internal default void upcall(MemoryAddress drive, MemoryAddress cancellable, MemoryAddress callback, MemoryAddress userData) {
            run((org.gtk.gio.Drive) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(drive)), org.gtk.gio.Drive.fromAddress).marshal(drive, Ownership.NONE), (org.gtk.gio.Cancellable) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(cancellable)), org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, Ownership.NONE), null /* Unsupported parameter type */);
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(PollForMediaCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code poll_for_media}
     * @param pollForMedia The new value of the field {@code poll_for_media}
     */
    public void setPollForMedia(PollForMediaCallback pollForMedia) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("poll_for_media"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (pollForMedia == null ? MemoryAddress.NULL : pollForMedia.toCallback()));
    }
    
    @FunctionalInterface
    public interface PollForMediaFinishCallback {
        boolean run(org.gtk.gio.Drive drive, org.gtk.gio.AsyncResult result);

        @ApiStatus.Internal default int upcall(MemoryAddress drive, MemoryAddress result) {
            var RESULT = run((org.gtk.gio.Drive) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(drive)), org.gtk.gio.Drive.fromAddress).marshal(drive, Ownership.NONE), (org.gtk.gio.AsyncResult) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(result)), org.gtk.gio.AsyncResult.fromAddress).marshal(result, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(PollForMediaFinishCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code poll_for_media_finish}
     * @param pollForMediaFinish The new value of the field {@code poll_for_media_finish}
     */
    public void setPollForMediaFinish(PollForMediaFinishCallback pollForMediaFinish) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("poll_for_media_finish"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (pollForMediaFinish == null ? MemoryAddress.NULL : pollForMediaFinish.toCallback()));
    }
    
    @FunctionalInterface
    public interface GetIdentifierCallback {
        @Nullable java.lang.String run(org.gtk.gio.Drive drive, java.lang.String kind);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress drive, MemoryAddress kind) {
            var RESULT = run((org.gtk.gio.Drive) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(drive)), org.gtk.gio.Drive.fromAddress).marshal(drive, Ownership.NONE), Marshal.addressToString.marshal(kind, null));
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
        java.lang.String[] run(org.gtk.gio.Drive drive);

        @ApiStatus.Internal default void upcall(MemoryAddress drive) {
            run((org.gtk.gio.Drive) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(drive)), org.gtk.gio.Drive.fromAddress).marshal(drive, Ownership.NONE));
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
    public interface GetStartStopTypeCallback {
        org.gtk.gio.DriveStartStopType run(org.gtk.gio.Drive drive);

        @ApiStatus.Internal default int upcall(MemoryAddress drive) {
            var RESULT = run((org.gtk.gio.Drive) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(drive)), org.gtk.gio.Drive.fromAddress).marshal(drive, Ownership.NONE));
            return RESULT.getValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GetStartStopTypeCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_start_stop_type}
     * @param getStartStopType The new value of the field {@code get_start_stop_type}
     */
    public void setGetStartStopType(GetStartStopTypeCallback getStartStopType) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("get_start_stop_type"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getStartStopType == null ? MemoryAddress.NULL : getStartStopType.toCallback()));
    }
    
    @FunctionalInterface
    public interface CanStartCallback {
        boolean run(org.gtk.gio.Drive drive);

        @ApiStatus.Internal default int upcall(MemoryAddress drive) {
            var RESULT = run((org.gtk.gio.Drive) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(drive)), org.gtk.gio.Drive.fromAddress).marshal(drive, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(CanStartCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code can_start}
     * @param canStart The new value of the field {@code can_start}
     */
    public void setCanStart(CanStartCallback canStart) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("can_start"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (canStart == null ? MemoryAddress.NULL : canStart.toCallback()));
    }
    
    @FunctionalInterface
    public interface CanStartDegradedCallback {
        boolean run(org.gtk.gio.Drive drive);

        @ApiStatus.Internal default int upcall(MemoryAddress drive) {
            var RESULT = run((org.gtk.gio.Drive) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(drive)), org.gtk.gio.Drive.fromAddress).marshal(drive, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(CanStartDegradedCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code can_start_degraded}
     * @param canStartDegraded The new value of the field {@code can_start_degraded}
     */
    public void setCanStartDegraded(CanStartDegradedCallback canStartDegraded) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("can_start_degraded"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (canStartDegraded == null ? MemoryAddress.NULL : canStartDegraded.toCallback()));
    }
    
    @FunctionalInterface
    public interface StartCallback {
        void run(org.gtk.gio.Drive drive, org.gtk.gio.DriveStartFlags flags, @Nullable org.gtk.gio.MountOperation mountOperation, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback);

        @ApiStatus.Internal default void upcall(MemoryAddress drive, int flags, MemoryAddress mountOperation, MemoryAddress cancellable, MemoryAddress callback, MemoryAddress userData) {
            run((org.gtk.gio.Drive) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(drive)), org.gtk.gio.Drive.fromAddress).marshal(drive, Ownership.NONE), new org.gtk.gio.DriveStartFlags(flags), (org.gtk.gio.MountOperation) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(mountOperation)), org.gtk.gio.MountOperation.fromAddress).marshal(mountOperation, Ownership.NONE), (org.gtk.gio.Cancellable) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(cancellable)), org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, Ownership.NONE), null /* Unsupported parameter type */);
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(StartCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code start}
     * @param start The new value of the field {@code start}
     */
    public void setStart(StartCallback start) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("start"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (start == null ? MemoryAddress.NULL : start.toCallback()));
    }
    
    @FunctionalInterface
    public interface StartFinishCallback {
        boolean run(org.gtk.gio.Drive drive, org.gtk.gio.AsyncResult result);

        @ApiStatus.Internal default int upcall(MemoryAddress drive, MemoryAddress result) {
            var RESULT = run((org.gtk.gio.Drive) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(drive)), org.gtk.gio.Drive.fromAddress).marshal(drive, Ownership.NONE), (org.gtk.gio.AsyncResult) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(result)), org.gtk.gio.AsyncResult.fromAddress).marshal(result, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(StartFinishCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code start_finish}
     * @param startFinish The new value of the field {@code start_finish}
     */
    public void setStartFinish(StartFinishCallback startFinish) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("start_finish"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (startFinish == null ? MemoryAddress.NULL : startFinish.toCallback()));
    }
    
    @FunctionalInterface
    public interface CanStopCallback {
        boolean run(org.gtk.gio.Drive drive);

        @ApiStatus.Internal default int upcall(MemoryAddress drive) {
            var RESULT = run((org.gtk.gio.Drive) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(drive)), org.gtk.gio.Drive.fromAddress).marshal(drive, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(CanStopCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code can_stop}
     * @param canStop The new value of the field {@code can_stop}
     */
    public void setCanStop(CanStopCallback canStop) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("can_stop"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (canStop == null ? MemoryAddress.NULL : canStop.toCallback()));
    }
    
    @FunctionalInterface
    public interface StopCallback {
        void run(org.gtk.gio.Drive drive, org.gtk.gio.MountUnmountFlags flags, @Nullable org.gtk.gio.MountOperation mountOperation, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback);

        @ApiStatus.Internal default void upcall(MemoryAddress drive, int flags, MemoryAddress mountOperation, MemoryAddress cancellable, MemoryAddress callback, MemoryAddress userData) {
            run((org.gtk.gio.Drive) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(drive)), org.gtk.gio.Drive.fromAddress).marshal(drive, Ownership.NONE), new org.gtk.gio.MountUnmountFlags(flags), (org.gtk.gio.MountOperation) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(mountOperation)), org.gtk.gio.MountOperation.fromAddress).marshal(mountOperation, Ownership.NONE), (org.gtk.gio.Cancellable) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(cancellable)), org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, Ownership.NONE), null /* Unsupported parameter type */);
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(StopCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code stop}
     * @param stop The new value of the field {@code stop}
     */
    public void setStop(StopCallback stop) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("stop"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (stop == null ? MemoryAddress.NULL : stop.toCallback()));
    }
    
    @FunctionalInterface
    public interface StopFinishCallback {
        boolean run(org.gtk.gio.Drive drive, org.gtk.gio.AsyncResult result);

        @ApiStatus.Internal default int upcall(MemoryAddress drive, MemoryAddress result) {
            var RESULT = run((org.gtk.gio.Drive) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(drive)), org.gtk.gio.Drive.fromAddress).marshal(drive, Ownership.NONE), (org.gtk.gio.AsyncResult) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(result)), org.gtk.gio.AsyncResult.fromAddress).marshal(result, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(StopFinishCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code stop_finish}
     * @param stopFinish The new value of the field {@code stop_finish}
     */
    public void setStopFinish(StopFinishCallback stopFinish) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("stop_finish"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (stopFinish == null ? MemoryAddress.NULL : stopFinish.toCallback()));
    }
    
    @FunctionalInterface
    public interface StopButtonCallback {
        void run(org.gtk.gio.Drive drive);

        @ApiStatus.Internal default void upcall(MemoryAddress drive) {
            run((org.gtk.gio.Drive) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(drive)), org.gtk.gio.Drive.fromAddress).marshal(drive, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(StopButtonCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code stop_button}
     * @param stopButton The new value of the field {@code stop_button}
     */
    public void setStopButton(StopButtonCallback stopButton) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("stop_button"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (stopButton == null ? MemoryAddress.NULL : stopButton.toCallback()));
    }
    
    @FunctionalInterface
    public interface EjectWithOperationCallback {
        void run(org.gtk.gio.Drive drive, org.gtk.gio.MountUnmountFlags flags, @Nullable org.gtk.gio.MountOperation mountOperation, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback);

        @ApiStatus.Internal default void upcall(MemoryAddress drive, int flags, MemoryAddress mountOperation, MemoryAddress cancellable, MemoryAddress callback, MemoryAddress userData) {
            run((org.gtk.gio.Drive) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(drive)), org.gtk.gio.Drive.fromAddress).marshal(drive, Ownership.NONE), new org.gtk.gio.MountUnmountFlags(flags), (org.gtk.gio.MountOperation) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(mountOperation)), org.gtk.gio.MountOperation.fromAddress).marshal(mountOperation, Ownership.NONE), (org.gtk.gio.Cancellable) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(cancellable)), org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, Ownership.NONE), null /* Unsupported parameter type */);
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
        boolean run(org.gtk.gio.Drive drive, org.gtk.gio.AsyncResult result);

        @ApiStatus.Internal default int upcall(MemoryAddress drive, MemoryAddress result) {
            var RESULT = run((org.gtk.gio.Drive) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(drive)), org.gtk.gio.Drive.fromAddress).marshal(drive, Ownership.NONE), (org.gtk.gio.AsyncResult) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(result)), org.gtk.gio.AsyncResult.fromAddress).marshal(result, Ownership.NONE));
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
        @Nullable java.lang.String run(org.gtk.gio.Drive drive);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress drive) {
            var RESULT = run((org.gtk.gio.Drive) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(drive)), org.gtk.gio.Drive.fromAddress).marshal(drive, Ownership.NONE));
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
        org.gtk.gio.Icon run(org.gtk.gio.Drive drive);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress drive) {
            var RESULT = run((org.gtk.gio.Drive) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(drive)), org.gtk.gio.Drive.fromAddress).marshal(drive, Ownership.NONE));
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
    
    @FunctionalInterface
    public interface IsRemovableCallback {
        boolean run(org.gtk.gio.Drive drive);

        @ApiStatus.Internal default int upcall(MemoryAddress drive) {
            var RESULT = run((org.gtk.gio.Drive) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(drive)), org.gtk.gio.Drive.fromAddress).marshal(drive, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(IsRemovableCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code is_removable}
     * @param isRemovable The new value of the field {@code is_removable}
     */
    public void setIsRemovable(IsRemovableCallback isRemovable) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("is_removable"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (isRemovable == null ? MemoryAddress.NULL : isRemovable.toCallback()));
    }
    
    /**
     * Create a DriveIface proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected DriveIface(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, DriveIface> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new DriveIface(input, ownership);
    
    /**
     * A {@link DriveIface.Builder} object constructs a {@link DriveIface} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link DriveIface.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final DriveIface struct;
        
        private Builder() {
            struct = DriveIface.allocate();
        }
        
         /**
         * Finish building the {@link DriveIface} struct.
         * @return A new instance of {@code DriveIface} with the fields 
         *         that were set in the Builder object.
         */
        public DriveIface build() {
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
        
        public Builder setDisconnected(DisconnectedCallback disconnected) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("disconnected"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (disconnected == null ? MemoryAddress.NULL : disconnected.toCallback()));
            return this;
        }
        
        public Builder setEjectButton(EjectButtonCallback ejectButton) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("eject_button"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (ejectButton == null ? MemoryAddress.NULL : ejectButton.toCallback()));
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
        
        public Builder setHasVolumes(HasVolumesCallback hasVolumes) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("has_volumes"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (hasVolumes == null ? MemoryAddress.NULL : hasVolumes.toCallback()));
            return this;
        }
        
        public Builder setGetVolumes(GetVolumesCallback getVolumes) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_volumes"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getVolumes == null ? MemoryAddress.NULL : getVolumes.toCallback()));
            return this;
        }
        
        public Builder setIsMediaRemovable(IsMediaRemovableCallback isMediaRemovable) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("is_media_removable"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (isMediaRemovable == null ? MemoryAddress.NULL : isMediaRemovable.toCallback()));
            return this;
        }
        
        public Builder setHasMedia(HasMediaCallback hasMedia) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("has_media"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (hasMedia == null ? MemoryAddress.NULL : hasMedia.toCallback()));
            return this;
        }
        
        public Builder setIsMediaCheckAutomatic(IsMediaCheckAutomaticCallback isMediaCheckAutomatic) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("is_media_check_automatic"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (isMediaCheckAutomatic == null ? MemoryAddress.NULL : isMediaCheckAutomatic.toCallback()));
            return this;
        }
        
        public Builder setCanEject(CanEjectCallback canEject) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("can_eject"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (canEject == null ? MemoryAddress.NULL : canEject.toCallback()));
            return this;
        }
        
        public Builder setCanPollForMedia(CanPollForMediaCallback canPollForMedia) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("can_poll_for_media"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (canPollForMedia == null ? MemoryAddress.NULL : canPollForMedia.toCallback()));
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
        
        public Builder setPollForMedia(PollForMediaCallback pollForMedia) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("poll_for_media"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (pollForMedia == null ? MemoryAddress.NULL : pollForMedia.toCallback()));
            return this;
        }
        
        public Builder setPollForMediaFinish(PollForMediaFinishCallback pollForMediaFinish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("poll_for_media_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (pollForMediaFinish == null ? MemoryAddress.NULL : pollForMediaFinish.toCallback()));
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
        
        public Builder setGetStartStopType(GetStartStopTypeCallback getStartStopType) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_start_stop_type"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getStartStopType == null ? MemoryAddress.NULL : getStartStopType.toCallback()));
            return this;
        }
        
        public Builder setCanStart(CanStartCallback canStart) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("can_start"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (canStart == null ? MemoryAddress.NULL : canStart.toCallback()));
            return this;
        }
        
        public Builder setCanStartDegraded(CanStartDegradedCallback canStartDegraded) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("can_start_degraded"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (canStartDegraded == null ? MemoryAddress.NULL : canStartDegraded.toCallback()));
            return this;
        }
        
        public Builder setStart(StartCallback start) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("start"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (start == null ? MemoryAddress.NULL : start.toCallback()));
            return this;
        }
        
        public Builder setStartFinish(StartFinishCallback startFinish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("start_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (startFinish == null ? MemoryAddress.NULL : startFinish.toCallback()));
            return this;
        }
        
        public Builder setCanStop(CanStopCallback canStop) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("can_stop"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (canStop == null ? MemoryAddress.NULL : canStop.toCallback()));
            return this;
        }
        
        public Builder setStop(StopCallback stop) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("stop"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (stop == null ? MemoryAddress.NULL : stop.toCallback()));
            return this;
        }
        
        public Builder setStopFinish(StopFinishCallback stopFinish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("stop_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (stopFinish == null ? MemoryAddress.NULL : stopFinish.toCallback()));
            return this;
        }
        
        public Builder setStopButton(StopButtonCallback stopButton) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("stop_button"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (stopButton == null ? MemoryAddress.NULL : stopButton.toCallback()));
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
        
        public Builder setIsRemovable(IsRemovableCallback isRemovable) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("is_removable"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (isRemovable == null ? MemoryAddress.NULL : isRemovable.toCallback()));
            return this;
        }
    }
}
