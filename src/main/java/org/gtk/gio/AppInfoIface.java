package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Application Information interface, for operating system portability.
 */
public class AppInfoIface extends Struct {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GAppInfoIface";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.TypeInterface.getMemoryLayout().withName("g_iface"),
            Interop.valueLayout.ADDRESS.withName("dup"),
            Interop.valueLayout.ADDRESS.withName("equal"),
            Interop.valueLayout.ADDRESS.withName("get_id"),
            Interop.valueLayout.ADDRESS.withName("get_name"),
            Interop.valueLayout.ADDRESS.withName("get_description"),
            Interop.valueLayout.ADDRESS.withName("get_executable"),
            Interop.valueLayout.ADDRESS.withName("get_icon"),
            Interop.valueLayout.ADDRESS.withName("launch"),
            Interop.valueLayout.ADDRESS.withName("supports_uris"),
            Interop.valueLayout.ADDRESS.withName("supports_files"),
            Interop.valueLayout.ADDRESS.withName("launch_uris"),
            Interop.valueLayout.ADDRESS.withName("should_show"),
            Interop.valueLayout.ADDRESS.withName("set_as_default_for_type"),
            Interop.valueLayout.ADDRESS.withName("set_as_default_for_extension"),
            Interop.valueLayout.ADDRESS.withName("add_supports_type"),
            Interop.valueLayout.ADDRESS.withName("can_remove_supports_type"),
            Interop.valueLayout.ADDRESS.withName("remove_supports_type"),
            Interop.valueLayout.ADDRESS.withName("can_delete"),
            Interop.valueLayout.ADDRESS.withName("do_delete"),
            Interop.valueLayout.ADDRESS.withName("get_commandline"),
            Interop.valueLayout.ADDRESS.withName("get_display_name"),
            Interop.valueLayout.ADDRESS.withName("set_as_last_used_for_type"),
            Interop.valueLayout.ADDRESS.withName("get_supported_types"),
            Interop.valueLayout.ADDRESS.withName("launch_uris_async"),
            Interop.valueLayout.ADDRESS.withName("launch_uris_finish")
        ).withName(C_TYPE_NAME);
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link AppInfoIface}
     * @return A new, uninitialized @{link AppInfoIface}
     */
    public static AppInfoIface allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        AppInfoIface newInstance = new AppInfoIface(segment.address(), Ownership.NONE);
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
    public interface DupCallback {
        org.gtk.gio.AppInfo run(org.gtk.gio.AppInfo appinfo);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress appinfo) {
            var RESULT = run((org.gtk.gio.AppInfo) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(appinfo)), org.gtk.gio.AppInfo.fromAddress).marshal(appinfo, Ownership.NONE));
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(DupCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code dup}
     * @param dup The new value of the field {@code dup}
     */
    public void setDup(DupCallback dup) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("dup"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (dup == null ? MemoryAddress.NULL : dup.toCallback()));
    }
    
    @FunctionalInterface
    public interface EqualCallback {
        boolean run(org.gtk.gio.AppInfo appinfo1, org.gtk.gio.AppInfo appinfo2);

        @ApiStatus.Internal default int upcall(MemoryAddress appinfo1, MemoryAddress appinfo2) {
            var RESULT = run((org.gtk.gio.AppInfo) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(appinfo1)), org.gtk.gio.AppInfo.fromAddress).marshal(appinfo1, Ownership.NONE), (org.gtk.gio.AppInfo) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(appinfo2)), org.gtk.gio.AppInfo.fromAddress).marshal(appinfo2, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(EqualCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code equal}
     * @param equal The new value of the field {@code equal}
     */
    public void setEqual(EqualCallback equal) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("equal"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (equal == null ? MemoryAddress.NULL : equal.toCallback()));
    }
    
    @FunctionalInterface
    public interface GetIdCallback {
        @Nullable java.lang.String run(org.gtk.gio.AppInfo appinfo);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress appinfo) {
            var RESULT = run((org.gtk.gio.AppInfo) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(appinfo)), org.gtk.gio.AppInfo.fromAddress).marshal(appinfo, Ownership.NONE));
            return RESULT == null ? MemoryAddress.NULL.address() : (Marshal.stringToAddress.marshal(RESULT, null)).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GetIdCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_id}
     * @param getId The new value of the field {@code get_id}
     */
    public void setGetId(GetIdCallback getId) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("get_id"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getId == null ? MemoryAddress.NULL : getId.toCallback()));
    }
    
    @FunctionalInterface
    public interface GetNameCallback {
        java.lang.String run(org.gtk.gio.AppInfo appinfo);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress appinfo) {
            var RESULT = run((org.gtk.gio.AppInfo) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(appinfo)), org.gtk.gio.AppInfo.fromAddress).marshal(appinfo, Ownership.NONE));
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
    public interface GetDescriptionCallback {
        @Nullable java.lang.String run(org.gtk.gio.AppInfo appinfo);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress appinfo) {
            var RESULT = run((org.gtk.gio.AppInfo) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(appinfo)), org.gtk.gio.AppInfo.fromAddress).marshal(appinfo, Ownership.NONE));
            return RESULT == null ? MemoryAddress.NULL.address() : (Marshal.stringToAddress.marshal(RESULT, null)).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GetDescriptionCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_description}
     * @param getDescription The new value of the field {@code get_description}
     */
    public void setGetDescription(GetDescriptionCallback getDescription) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("get_description"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getDescription == null ? MemoryAddress.NULL : getDescription.toCallback()));
    }
    
    @FunctionalInterface
    public interface GetExecutableCallback {
        java.lang.String run(org.gtk.gio.AppInfo appinfo);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress appinfo) {
            var RESULT = run((org.gtk.gio.AppInfo) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(appinfo)), org.gtk.gio.AppInfo.fromAddress).marshal(appinfo, Ownership.NONE));
            return RESULT == null ? MemoryAddress.NULL.address() : (Marshal.stringToAddress.marshal(RESULT, null)).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GetExecutableCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_executable}
     * @param getExecutable The new value of the field {@code get_executable}
     */
    public void setGetExecutable(GetExecutableCallback getExecutable) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("get_executable"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getExecutable == null ? MemoryAddress.NULL : getExecutable.toCallback()));
    }
    
    @FunctionalInterface
    public interface GetIconCallback {
        @Nullable org.gtk.gio.Icon run(org.gtk.gio.AppInfo appinfo);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress appinfo) {
            var RESULT = run((org.gtk.gio.AppInfo) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(appinfo)), org.gtk.gio.AppInfo.fromAddress).marshal(appinfo, Ownership.NONE));
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
    public interface LaunchCallback {
        boolean run(org.gtk.gio.AppInfo appinfo, @Nullable org.gtk.glib.List files, @Nullable org.gtk.gio.AppLaunchContext context);

        @ApiStatus.Internal default int upcall(MemoryAddress appinfo, MemoryAddress files, MemoryAddress context) {
            var RESULT = run((org.gtk.gio.AppInfo) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(appinfo)), org.gtk.gio.AppInfo.fromAddress).marshal(appinfo, Ownership.NONE), org.gtk.glib.List.fromAddress.marshal(files, Ownership.NONE), (org.gtk.gio.AppLaunchContext) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(context)), org.gtk.gio.AppLaunchContext.fromAddress).marshal(context, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(LaunchCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code launch}
     * @param launch The new value of the field {@code launch}
     */
    public void setLaunch(LaunchCallback launch) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("launch"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (launch == null ? MemoryAddress.NULL : launch.toCallback()));
    }
    
    @FunctionalInterface
    public interface SupportsUrisCallback {
        boolean run(org.gtk.gio.AppInfo appinfo);

        @ApiStatus.Internal default int upcall(MemoryAddress appinfo) {
            var RESULT = run((org.gtk.gio.AppInfo) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(appinfo)), org.gtk.gio.AppInfo.fromAddress).marshal(appinfo, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(SupportsUrisCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code supports_uris}
     * @param supportsUris The new value of the field {@code supports_uris}
     */
    public void setSupportsUris(SupportsUrisCallback supportsUris) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("supports_uris"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (supportsUris == null ? MemoryAddress.NULL : supportsUris.toCallback()));
    }
    
    @FunctionalInterface
    public interface SupportsFilesCallback {
        boolean run(org.gtk.gio.AppInfo appinfo);

        @ApiStatus.Internal default int upcall(MemoryAddress appinfo) {
            var RESULT = run((org.gtk.gio.AppInfo) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(appinfo)), org.gtk.gio.AppInfo.fromAddress).marshal(appinfo, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(SupportsFilesCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code supports_files}
     * @param supportsFiles The new value of the field {@code supports_files}
     */
    public void setSupportsFiles(SupportsFilesCallback supportsFiles) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("supports_files"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (supportsFiles == null ? MemoryAddress.NULL : supportsFiles.toCallback()));
    }
    
    @FunctionalInterface
    public interface LaunchUrisCallback {
        boolean run(org.gtk.gio.AppInfo appinfo, @Nullable org.gtk.glib.List uris, @Nullable org.gtk.gio.AppLaunchContext context);

        @ApiStatus.Internal default int upcall(MemoryAddress appinfo, MemoryAddress uris, MemoryAddress context) {
            var RESULT = run((org.gtk.gio.AppInfo) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(appinfo)), org.gtk.gio.AppInfo.fromAddress).marshal(appinfo, Ownership.NONE), org.gtk.glib.List.fromAddress.marshal(uris, Ownership.NONE), (org.gtk.gio.AppLaunchContext) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(context)), org.gtk.gio.AppLaunchContext.fromAddress).marshal(context, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(LaunchUrisCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code launch_uris}
     * @param launchUris The new value of the field {@code launch_uris}
     */
    public void setLaunchUris(LaunchUrisCallback launchUris) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("launch_uris"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (launchUris == null ? MemoryAddress.NULL : launchUris.toCallback()));
    }
    
    @FunctionalInterface
    public interface ShouldShowCallback {
        boolean run(org.gtk.gio.AppInfo appinfo);

        @ApiStatus.Internal default int upcall(MemoryAddress appinfo) {
            var RESULT = run((org.gtk.gio.AppInfo) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(appinfo)), org.gtk.gio.AppInfo.fromAddress).marshal(appinfo, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ShouldShowCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code should_show}
     * @param shouldShow The new value of the field {@code should_show}
     */
    public void setShouldShow(ShouldShowCallback shouldShow) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("should_show"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (shouldShow == null ? MemoryAddress.NULL : shouldShow.toCallback()));
    }
    
    @FunctionalInterface
    public interface SetAsDefaultForTypeCallback {
        boolean run(org.gtk.gio.AppInfo appinfo, java.lang.String contentType);

        @ApiStatus.Internal default int upcall(MemoryAddress appinfo, MemoryAddress contentType) {
            var RESULT = run((org.gtk.gio.AppInfo) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(appinfo)), org.gtk.gio.AppInfo.fromAddress).marshal(appinfo, Ownership.NONE), Marshal.addressToString.marshal(contentType, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(SetAsDefaultForTypeCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code set_as_default_for_type}
     * @param setAsDefaultForType The new value of the field {@code set_as_default_for_type}
     */
    public void setSetAsDefaultForType(SetAsDefaultForTypeCallback setAsDefaultForType) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("set_as_default_for_type"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (setAsDefaultForType == null ? MemoryAddress.NULL : setAsDefaultForType.toCallback()));
    }
    
    @FunctionalInterface
    public interface SetAsDefaultForExtensionCallback {
        boolean run(org.gtk.gio.AppInfo appinfo, java.lang.String extension);

        @ApiStatus.Internal default int upcall(MemoryAddress appinfo, MemoryAddress extension) {
            var RESULT = run((org.gtk.gio.AppInfo) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(appinfo)), org.gtk.gio.AppInfo.fromAddress).marshal(appinfo, Ownership.NONE), Marshal.addressToString.marshal(extension, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(SetAsDefaultForExtensionCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code set_as_default_for_extension}
     * @param setAsDefaultForExtension The new value of the field {@code set_as_default_for_extension}
     */
    public void setSetAsDefaultForExtension(SetAsDefaultForExtensionCallback setAsDefaultForExtension) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("set_as_default_for_extension"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (setAsDefaultForExtension == null ? MemoryAddress.NULL : setAsDefaultForExtension.toCallback()));
    }
    
    @FunctionalInterface
    public interface AddSupportsTypeCallback {
        boolean run(org.gtk.gio.AppInfo appinfo, java.lang.String contentType);

        @ApiStatus.Internal default int upcall(MemoryAddress appinfo, MemoryAddress contentType) {
            var RESULT = run((org.gtk.gio.AppInfo) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(appinfo)), org.gtk.gio.AppInfo.fromAddress).marshal(appinfo, Ownership.NONE), Marshal.addressToString.marshal(contentType, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(AddSupportsTypeCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code add_supports_type}
     * @param addSupportsType The new value of the field {@code add_supports_type}
     */
    public void setAddSupportsType(AddSupportsTypeCallback addSupportsType) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("add_supports_type"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (addSupportsType == null ? MemoryAddress.NULL : addSupportsType.toCallback()));
    }
    
    @FunctionalInterface
    public interface CanRemoveSupportsTypeCallback {
        boolean run(org.gtk.gio.AppInfo appinfo);

        @ApiStatus.Internal default int upcall(MemoryAddress appinfo) {
            var RESULT = run((org.gtk.gio.AppInfo) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(appinfo)), org.gtk.gio.AppInfo.fromAddress).marshal(appinfo, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(CanRemoveSupportsTypeCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code can_remove_supports_type}
     * @param canRemoveSupportsType The new value of the field {@code can_remove_supports_type}
     */
    public void setCanRemoveSupportsType(CanRemoveSupportsTypeCallback canRemoveSupportsType) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("can_remove_supports_type"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (canRemoveSupportsType == null ? MemoryAddress.NULL : canRemoveSupportsType.toCallback()));
    }
    
    @FunctionalInterface
    public interface RemoveSupportsTypeCallback {
        boolean run(org.gtk.gio.AppInfo appinfo, java.lang.String contentType);

        @ApiStatus.Internal default int upcall(MemoryAddress appinfo, MemoryAddress contentType) {
            var RESULT = run((org.gtk.gio.AppInfo) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(appinfo)), org.gtk.gio.AppInfo.fromAddress).marshal(appinfo, Ownership.NONE), Marshal.addressToString.marshal(contentType, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(RemoveSupportsTypeCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code remove_supports_type}
     * @param removeSupportsType The new value of the field {@code remove_supports_type}
     */
    public void setRemoveSupportsType(RemoveSupportsTypeCallback removeSupportsType) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("remove_supports_type"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (removeSupportsType == null ? MemoryAddress.NULL : removeSupportsType.toCallback()));
    }
    
    @FunctionalInterface
    public interface CanDeleteCallback {
        boolean run(org.gtk.gio.AppInfo appinfo);

        @ApiStatus.Internal default int upcall(MemoryAddress appinfo) {
            var RESULT = run((org.gtk.gio.AppInfo) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(appinfo)), org.gtk.gio.AppInfo.fromAddress).marshal(appinfo, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(CanDeleteCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code can_delete}
     * @param canDelete The new value of the field {@code can_delete}
     */
    public void setCanDelete(CanDeleteCallback canDelete) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("can_delete"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (canDelete == null ? MemoryAddress.NULL : canDelete.toCallback()));
    }
    
    @FunctionalInterface
    public interface DoDeleteCallback {
        boolean run(org.gtk.gio.AppInfo appinfo);

        @ApiStatus.Internal default int upcall(MemoryAddress appinfo) {
            var RESULT = run((org.gtk.gio.AppInfo) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(appinfo)), org.gtk.gio.AppInfo.fromAddress).marshal(appinfo, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(DoDeleteCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code do_delete}
     * @param doDelete The new value of the field {@code do_delete}
     */
    public void setDoDelete(DoDeleteCallback doDelete) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("do_delete"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (doDelete == null ? MemoryAddress.NULL : doDelete.toCallback()));
    }
    
    @FunctionalInterface
    public interface GetCommandlineCallback {
        @Nullable java.lang.String run(org.gtk.gio.AppInfo appinfo);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress appinfo) {
            var RESULT = run((org.gtk.gio.AppInfo) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(appinfo)), org.gtk.gio.AppInfo.fromAddress).marshal(appinfo, Ownership.NONE));
            return RESULT == null ? MemoryAddress.NULL.address() : (Marshal.stringToAddress.marshal(RESULT, null)).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GetCommandlineCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_commandline}
     * @param getCommandline The new value of the field {@code get_commandline}
     */
    public void setGetCommandline(GetCommandlineCallback getCommandline) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("get_commandline"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getCommandline == null ? MemoryAddress.NULL : getCommandline.toCallback()));
    }
    
    @FunctionalInterface
    public interface GetDisplayNameCallback {
        java.lang.String run(org.gtk.gio.AppInfo appinfo);

        @ApiStatus.Internal default Addressable upcall(MemoryAddress appinfo) {
            var RESULT = run((org.gtk.gio.AppInfo) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(appinfo)), org.gtk.gio.AppInfo.fromAddress).marshal(appinfo, Ownership.NONE));
            return RESULT == null ? MemoryAddress.NULL.address() : (Marshal.stringToAddress.marshal(RESULT, null)).address();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GetDisplayNameCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_display_name}
     * @param getDisplayName The new value of the field {@code get_display_name}
     */
    public void setGetDisplayName(GetDisplayNameCallback getDisplayName) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("get_display_name"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getDisplayName == null ? MemoryAddress.NULL : getDisplayName.toCallback()));
    }
    
    @FunctionalInterface
    public interface SetAsLastUsedForTypeCallback {
        boolean run(org.gtk.gio.AppInfo appinfo, java.lang.String contentType);

        @ApiStatus.Internal default int upcall(MemoryAddress appinfo, MemoryAddress contentType) {
            var RESULT = run((org.gtk.gio.AppInfo) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(appinfo)), org.gtk.gio.AppInfo.fromAddress).marshal(appinfo, Ownership.NONE), Marshal.addressToString.marshal(contentType, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(SetAsLastUsedForTypeCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code set_as_last_used_for_type}
     * @param setAsLastUsedForType The new value of the field {@code set_as_last_used_for_type}
     */
    public void setSetAsLastUsedForType(SetAsLastUsedForTypeCallback setAsLastUsedForType) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("set_as_last_used_for_type"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (setAsLastUsedForType == null ? MemoryAddress.NULL : setAsLastUsedForType.toCallback()));
    }
    
    @FunctionalInterface
    public interface GetSupportedTypesCallback {
        java.lang.String[] run(org.gtk.gio.AppInfo appinfo);

        @ApiStatus.Internal default void upcall(MemoryAddress appinfo) {
            run((org.gtk.gio.AppInfo) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(appinfo)), org.gtk.gio.AppInfo.fromAddress).marshal(appinfo, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(GetSupportedTypesCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_supported_types}
     * @param getSupportedTypes The new value of the field {@code get_supported_types}
     */
    public void setGetSupportedTypes(GetSupportedTypesCallback getSupportedTypes) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("get_supported_types"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getSupportedTypes == null ? MemoryAddress.NULL : getSupportedTypes.toCallback()));
    }
    
    @FunctionalInterface
    public interface LaunchUrisAsyncCallback {
        void run(org.gtk.gio.AppInfo appinfo, @Nullable org.gtk.glib.List uris, @Nullable org.gtk.gio.AppLaunchContext context, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback);

        @ApiStatus.Internal default void upcall(MemoryAddress appinfo, MemoryAddress uris, MemoryAddress context, MemoryAddress cancellable, MemoryAddress callback, MemoryAddress userData) {
            run((org.gtk.gio.AppInfo) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(appinfo)), org.gtk.gio.AppInfo.fromAddress).marshal(appinfo, Ownership.NONE), org.gtk.glib.List.fromAddress.marshal(uris, Ownership.NONE), (org.gtk.gio.AppLaunchContext) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(context)), org.gtk.gio.AppLaunchContext.fromAddress).marshal(context, Ownership.NONE), (org.gtk.gio.Cancellable) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(cancellable)), org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, Ownership.NONE), null /* Unsupported parameter type */);
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(LaunchUrisAsyncCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code launch_uris_async}
     * @param launchUrisAsync The new value of the field {@code launch_uris_async}
     */
    public void setLaunchUrisAsync(LaunchUrisAsyncCallback launchUrisAsync) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("launch_uris_async"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (launchUrisAsync == null ? MemoryAddress.NULL : launchUrisAsync.toCallback()));
    }
    
    @FunctionalInterface
    public interface LaunchUrisFinishCallback {
        boolean run(org.gtk.gio.AppInfo appinfo, org.gtk.gio.AsyncResult result);

        @ApiStatus.Internal default int upcall(MemoryAddress appinfo, MemoryAddress result) {
            var RESULT = run((org.gtk.gio.AppInfo) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(appinfo)), org.gtk.gio.AppInfo.fromAddress).marshal(appinfo, Ownership.NONE), (org.gtk.gio.AsyncResult) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(result)), org.gtk.gio.AsyncResult.fromAddress).marshal(result, Ownership.NONE));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(LaunchUrisFinishCallback.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * Change the value of the field {@code launch_uris_finish}
     * @param launchUrisFinish The new value of the field {@code launch_uris_finish}
     */
    public void setLaunchUrisFinish(LaunchUrisFinishCallback launchUrisFinish) {
        getMemoryLayout()
            .varHandle(MemoryLayout.PathElement.groupElement("launch_uris_finish"))
            .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (launchUrisFinish == null ? MemoryAddress.NULL : launchUrisFinish.toCallback()));
    }
    
    /**
     * Create a AppInfoIface proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected AppInfoIface(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, AppInfoIface> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new AppInfoIface(input, ownership);
    
    /**
     * A {@link AppInfoIface.Builder} object constructs a {@link AppInfoIface} 
     * struct using the <em>builder pattern</em> to set the field values. 
     * Use the various {@code set...()} methods to set field values, 
     * and finish construction with {@link AppInfoIface.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a struct and set its values.
     */
    public static class Builder {
        
        private final AppInfoIface struct;
        
        private Builder() {
            struct = AppInfoIface.allocate();
        }
        
         /**
         * Finish building the {@link AppInfoIface} struct.
         * @return A new instance of {@code AppInfoIface} with the fields 
         *         that were set in the Builder object.
         */
        public AppInfoIface build() {
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
        
        public Builder setDup(DupCallback dup) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("dup"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (dup == null ? MemoryAddress.NULL : dup.toCallback()));
            return this;
        }
        
        public Builder setEqual(EqualCallback equal) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("equal"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (equal == null ? MemoryAddress.NULL : equal.toCallback()));
            return this;
        }
        
        public Builder setGetId(GetIdCallback getId) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_id"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getId == null ? MemoryAddress.NULL : getId.toCallback()));
            return this;
        }
        
        public Builder setGetName(GetNameCallback getName) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_name"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getName == null ? MemoryAddress.NULL : getName.toCallback()));
            return this;
        }
        
        public Builder setGetDescription(GetDescriptionCallback getDescription) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_description"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getDescription == null ? MemoryAddress.NULL : getDescription.toCallback()));
            return this;
        }
        
        public Builder setGetExecutable(GetExecutableCallback getExecutable) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_executable"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getExecutable == null ? MemoryAddress.NULL : getExecutable.toCallback()));
            return this;
        }
        
        public Builder setGetIcon(GetIconCallback getIcon) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_icon"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getIcon == null ? MemoryAddress.NULL : getIcon.toCallback()));
            return this;
        }
        
        public Builder setLaunch(LaunchCallback launch) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("launch"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (launch == null ? MemoryAddress.NULL : launch.toCallback()));
            return this;
        }
        
        public Builder setSupportsUris(SupportsUrisCallback supportsUris) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("supports_uris"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (supportsUris == null ? MemoryAddress.NULL : supportsUris.toCallback()));
            return this;
        }
        
        public Builder setSupportsFiles(SupportsFilesCallback supportsFiles) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("supports_files"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (supportsFiles == null ? MemoryAddress.NULL : supportsFiles.toCallback()));
            return this;
        }
        
        public Builder setLaunchUris(LaunchUrisCallback launchUris) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("launch_uris"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (launchUris == null ? MemoryAddress.NULL : launchUris.toCallback()));
            return this;
        }
        
        public Builder setShouldShow(ShouldShowCallback shouldShow) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("should_show"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (shouldShow == null ? MemoryAddress.NULL : shouldShow.toCallback()));
            return this;
        }
        
        public Builder setSetAsDefaultForType(SetAsDefaultForTypeCallback setAsDefaultForType) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_as_default_for_type"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (setAsDefaultForType == null ? MemoryAddress.NULL : setAsDefaultForType.toCallback()));
            return this;
        }
        
        public Builder setSetAsDefaultForExtension(SetAsDefaultForExtensionCallback setAsDefaultForExtension) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_as_default_for_extension"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (setAsDefaultForExtension == null ? MemoryAddress.NULL : setAsDefaultForExtension.toCallback()));
            return this;
        }
        
        public Builder setAddSupportsType(AddSupportsTypeCallback addSupportsType) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("add_supports_type"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (addSupportsType == null ? MemoryAddress.NULL : addSupportsType.toCallback()));
            return this;
        }
        
        public Builder setCanRemoveSupportsType(CanRemoveSupportsTypeCallback canRemoveSupportsType) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("can_remove_supports_type"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (canRemoveSupportsType == null ? MemoryAddress.NULL : canRemoveSupportsType.toCallback()));
            return this;
        }
        
        public Builder setRemoveSupportsType(RemoveSupportsTypeCallback removeSupportsType) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("remove_supports_type"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (removeSupportsType == null ? MemoryAddress.NULL : removeSupportsType.toCallback()));
            return this;
        }
        
        public Builder setCanDelete(CanDeleteCallback canDelete) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("can_delete"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (canDelete == null ? MemoryAddress.NULL : canDelete.toCallback()));
            return this;
        }
        
        public Builder setDoDelete(DoDeleteCallback doDelete) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("do_delete"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (doDelete == null ? MemoryAddress.NULL : doDelete.toCallback()));
            return this;
        }
        
        public Builder setGetCommandline(GetCommandlineCallback getCommandline) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_commandline"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getCommandline == null ? MemoryAddress.NULL : getCommandline.toCallback()));
            return this;
        }
        
        public Builder setGetDisplayName(GetDisplayNameCallback getDisplayName) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_display_name"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getDisplayName == null ? MemoryAddress.NULL : getDisplayName.toCallback()));
            return this;
        }
        
        public Builder setSetAsLastUsedForType(SetAsLastUsedForTypeCallback setAsLastUsedForType) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_as_last_used_for_type"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (setAsLastUsedForType == null ? MemoryAddress.NULL : setAsLastUsedForType.toCallback()));
            return this;
        }
        
        public Builder setGetSupportedTypes(GetSupportedTypesCallback getSupportedTypes) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_supported_types"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (getSupportedTypes == null ? MemoryAddress.NULL : getSupportedTypes.toCallback()));
            return this;
        }
        
        public Builder setLaunchUrisAsync(LaunchUrisAsyncCallback launchUrisAsync) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("launch_uris_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (launchUrisAsync == null ? MemoryAddress.NULL : launchUrisAsync.toCallback()));
            return this;
        }
        
        public Builder setLaunchUrisFinish(LaunchUrisFinishCallback launchUrisFinish) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("launch_uris_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), Interop.getScope()), (Addressable) (launchUrisFinish == null ? MemoryAddress.NULL : launchUrisFinish.toCallback()));
            return this;
        }
    }
}
