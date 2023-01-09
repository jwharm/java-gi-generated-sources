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
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        AppInfoIface newInstance = new AppInfoIface(segment.address());
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
     * Functional interface declaration of the {@code DupCallback} callback.
     */
    @FunctionalInterface
    public interface DupCallback {
    
        org.gtk.gio.AppInfo run(org.gtk.gio.AppInfo appinfo);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress appinfo) {
            var RESULT = run((org.gtk.gio.AppInfo) Interop.register(appinfo, org.gtk.gio.AppInfo.fromAddress).marshal(appinfo, null));
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
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), DupCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code dup}
     * @param dup The new value of the field {@code dup}
     */
    public void setDup(DupCallback dup) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("dup"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (dup == null ? MemoryAddress.NULL : dup.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code EqualCallback} callback.
     */
    @FunctionalInterface
    public interface EqualCallback {
    
        boolean run(org.gtk.gio.AppInfo appinfo1, org.gtk.gio.AppInfo appinfo2);
        
        @ApiStatus.Internal default int upcall(MemoryAddress appinfo1, MemoryAddress appinfo2) {
            var RESULT = run((org.gtk.gio.AppInfo) Interop.register(appinfo1, org.gtk.gio.AppInfo.fromAddress).marshal(appinfo1, null), (org.gtk.gio.AppInfo) Interop.register(appinfo2, org.gtk.gio.AppInfo.fromAddress).marshal(appinfo2, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), EqualCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code equal}
     * @param equal The new value of the field {@code equal}
     */
    public void setEqual(EqualCallback equal) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("equal"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (equal == null ? MemoryAddress.NULL : equal.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GetIdCallback} callback.
     */
    @FunctionalInterface
    public interface GetIdCallback {
    
        @Nullable java.lang.String run(org.gtk.gio.AppInfo appinfo);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress appinfo) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                var RESULT = run((org.gtk.gio.AppInfo) Interop.register(appinfo, org.gtk.gio.AppInfo.fromAddress).marshal(appinfo, null));
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
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GetIdCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_id}
     * @param getId The new value of the field {@code get_id}
     */
    public void setGetId(GetIdCallback getId) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_id"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getId == null ? MemoryAddress.NULL : getId.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GetNameCallback} callback.
     */
    @FunctionalInterface
    public interface GetNameCallback {
    
        java.lang.String run(org.gtk.gio.AppInfo appinfo);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress appinfo) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                var RESULT = run((org.gtk.gio.AppInfo) Interop.register(appinfo, org.gtk.gio.AppInfo.fromAddress).marshal(appinfo, null));
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
     * Functional interface declaration of the {@code GetDescriptionCallback} callback.
     */
    @FunctionalInterface
    public interface GetDescriptionCallback {
    
        @Nullable java.lang.String run(org.gtk.gio.AppInfo appinfo);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress appinfo) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                var RESULT = run((org.gtk.gio.AppInfo) Interop.register(appinfo, org.gtk.gio.AppInfo.fromAddress).marshal(appinfo, null));
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
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GetDescriptionCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_description}
     * @param getDescription The new value of the field {@code get_description}
     */
    public void setGetDescription(GetDescriptionCallback getDescription) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_description"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getDescription == null ? MemoryAddress.NULL : getDescription.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GetExecutableCallback} callback.
     */
    @FunctionalInterface
    public interface GetExecutableCallback {
    
        java.lang.String run(org.gtk.gio.AppInfo appinfo);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress appinfo) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                var RESULT = run((org.gtk.gio.AppInfo) Interop.register(appinfo, org.gtk.gio.AppInfo.fromAddress).marshal(appinfo, null));
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
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GetExecutableCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_executable}
     * @param getExecutable The new value of the field {@code get_executable}
     */
    public void setGetExecutable(GetExecutableCallback getExecutable) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_executable"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getExecutable == null ? MemoryAddress.NULL : getExecutable.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GetIconCallback} callback.
     */
    @FunctionalInterface
    public interface GetIconCallback {
    
        @Nullable org.gtk.gio.Icon run(org.gtk.gio.AppInfo appinfo);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress appinfo) {
            var RESULT = run((org.gtk.gio.AppInfo) Interop.register(appinfo, org.gtk.gio.AppInfo.fromAddress).marshal(appinfo, null));
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
     * Functional interface declaration of the {@code LaunchCallback} callback.
     */
    @FunctionalInterface
    public interface LaunchCallback {
    
        boolean run(org.gtk.gio.AppInfo appinfo, @Nullable org.gtk.glib.List files, @Nullable org.gtk.gio.AppLaunchContext context);
        
        @ApiStatus.Internal default int upcall(MemoryAddress appinfo, MemoryAddress files, MemoryAddress context) {
            var RESULT = run((org.gtk.gio.AppInfo) Interop.register(appinfo, org.gtk.gio.AppInfo.fromAddress).marshal(appinfo, null), org.gtk.glib.List.fromAddress.marshal(files, null), (org.gtk.gio.AppLaunchContext) Interop.register(context, org.gtk.gio.AppLaunchContext.fromAddress).marshal(context, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), LaunchCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code launch}
     * @param launch The new value of the field {@code launch}
     */
    public void setLaunch(LaunchCallback launch) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("launch"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (launch == null ? MemoryAddress.NULL : launch.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code SupportsUrisCallback} callback.
     */
    @FunctionalInterface
    public interface SupportsUrisCallback {
    
        boolean run(org.gtk.gio.AppInfo appinfo);
        
        @ApiStatus.Internal default int upcall(MemoryAddress appinfo) {
            var RESULT = run((org.gtk.gio.AppInfo) Interop.register(appinfo, org.gtk.gio.AppInfo.fromAddress).marshal(appinfo, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), SupportsUrisCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code supports_uris}
     * @param supportsUris The new value of the field {@code supports_uris}
     */
    public void setSupportsUris(SupportsUrisCallback supportsUris) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("supports_uris"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (supportsUris == null ? MemoryAddress.NULL : supportsUris.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code SupportsFilesCallback} callback.
     */
    @FunctionalInterface
    public interface SupportsFilesCallback {
    
        boolean run(org.gtk.gio.AppInfo appinfo);
        
        @ApiStatus.Internal default int upcall(MemoryAddress appinfo) {
            var RESULT = run((org.gtk.gio.AppInfo) Interop.register(appinfo, org.gtk.gio.AppInfo.fromAddress).marshal(appinfo, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), SupportsFilesCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code supports_files}
     * @param supportsFiles The new value of the field {@code supports_files}
     */
    public void setSupportsFiles(SupportsFilesCallback supportsFiles) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("supports_files"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (supportsFiles == null ? MemoryAddress.NULL : supportsFiles.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code LaunchUrisCallback} callback.
     */
    @FunctionalInterface
    public interface LaunchUrisCallback {
    
        boolean run(org.gtk.gio.AppInfo appinfo, @Nullable org.gtk.glib.List uris, @Nullable org.gtk.gio.AppLaunchContext context);
        
        @ApiStatus.Internal default int upcall(MemoryAddress appinfo, MemoryAddress uris, MemoryAddress context) {
            var RESULT = run((org.gtk.gio.AppInfo) Interop.register(appinfo, org.gtk.gio.AppInfo.fromAddress).marshal(appinfo, null), org.gtk.glib.List.fromAddress.marshal(uris, null), (org.gtk.gio.AppLaunchContext) Interop.register(context, org.gtk.gio.AppLaunchContext.fromAddress).marshal(context, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), LaunchUrisCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code launch_uris}
     * @param launchUris The new value of the field {@code launch_uris}
     */
    public void setLaunchUris(LaunchUrisCallback launchUris) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("launch_uris"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (launchUris == null ? MemoryAddress.NULL : launchUris.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code ShouldShowCallback} callback.
     */
    @FunctionalInterface
    public interface ShouldShowCallback {
    
        boolean run(org.gtk.gio.AppInfo appinfo);
        
        @ApiStatus.Internal default int upcall(MemoryAddress appinfo) {
            var RESULT = run((org.gtk.gio.AppInfo) Interop.register(appinfo, org.gtk.gio.AppInfo.fromAddress).marshal(appinfo, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ShouldShowCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code should_show}
     * @param shouldShow The new value of the field {@code should_show}
     */
    public void setShouldShow(ShouldShowCallback shouldShow) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("should_show"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (shouldShow == null ? MemoryAddress.NULL : shouldShow.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code SetAsDefaultForTypeCallback} callback.
     */
    @FunctionalInterface
    public interface SetAsDefaultForTypeCallback {
    
        boolean run(org.gtk.gio.AppInfo appinfo, java.lang.String contentType);
        
        @ApiStatus.Internal default int upcall(MemoryAddress appinfo, MemoryAddress contentType) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                var RESULT = run((org.gtk.gio.AppInfo) Interop.register(appinfo, org.gtk.gio.AppInfo.fromAddress).marshal(appinfo, null), Marshal.addressToString.marshal(contentType, null));
                return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), SetAsDefaultForTypeCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code set_as_default_for_type}
     * @param setAsDefaultForType The new value of the field {@code set_as_default_for_type}
     */
    public void setSetAsDefaultForType(SetAsDefaultForTypeCallback setAsDefaultForType) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_as_default_for_type"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (setAsDefaultForType == null ? MemoryAddress.NULL : setAsDefaultForType.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code SetAsDefaultForExtensionCallback} callback.
     */
    @FunctionalInterface
    public interface SetAsDefaultForExtensionCallback {
    
        boolean run(org.gtk.gio.AppInfo appinfo, java.lang.String extension);
        
        @ApiStatus.Internal default int upcall(MemoryAddress appinfo, MemoryAddress extension) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                var RESULT = run((org.gtk.gio.AppInfo) Interop.register(appinfo, org.gtk.gio.AppInfo.fromAddress).marshal(appinfo, null), Marshal.addressToString.marshal(extension, null));
                return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), SetAsDefaultForExtensionCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code set_as_default_for_extension}
     * @param setAsDefaultForExtension The new value of the field {@code set_as_default_for_extension}
     */
    public void setSetAsDefaultForExtension(SetAsDefaultForExtensionCallback setAsDefaultForExtension) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_as_default_for_extension"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (setAsDefaultForExtension == null ? MemoryAddress.NULL : setAsDefaultForExtension.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code AddSupportsTypeCallback} callback.
     */
    @FunctionalInterface
    public interface AddSupportsTypeCallback {
    
        boolean run(org.gtk.gio.AppInfo appinfo, java.lang.String contentType);
        
        @ApiStatus.Internal default int upcall(MemoryAddress appinfo, MemoryAddress contentType) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                var RESULT = run((org.gtk.gio.AppInfo) Interop.register(appinfo, org.gtk.gio.AppInfo.fromAddress).marshal(appinfo, null), Marshal.addressToString.marshal(contentType, null));
                return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), AddSupportsTypeCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code add_supports_type}
     * @param addSupportsType The new value of the field {@code add_supports_type}
     */
    public void setAddSupportsType(AddSupportsTypeCallback addSupportsType) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("add_supports_type"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (addSupportsType == null ? MemoryAddress.NULL : addSupportsType.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code CanRemoveSupportsTypeCallback} callback.
     */
    @FunctionalInterface
    public interface CanRemoveSupportsTypeCallback {
    
        boolean run(org.gtk.gio.AppInfo appinfo);
        
        @ApiStatus.Internal default int upcall(MemoryAddress appinfo) {
            var RESULT = run((org.gtk.gio.AppInfo) Interop.register(appinfo, org.gtk.gio.AppInfo.fromAddress).marshal(appinfo, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), CanRemoveSupportsTypeCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code can_remove_supports_type}
     * @param canRemoveSupportsType The new value of the field {@code can_remove_supports_type}
     */
    public void setCanRemoveSupportsType(CanRemoveSupportsTypeCallback canRemoveSupportsType) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("can_remove_supports_type"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (canRemoveSupportsType == null ? MemoryAddress.NULL : canRemoveSupportsType.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code RemoveSupportsTypeCallback} callback.
     */
    @FunctionalInterface
    public interface RemoveSupportsTypeCallback {
    
        boolean run(org.gtk.gio.AppInfo appinfo, java.lang.String contentType);
        
        @ApiStatus.Internal default int upcall(MemoryAddress appinfo, MemoryAddress contentType) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                var RESULT = run((org.gtk.gio.AppInfo) Interop.register(appinfo, org.gtk.gio.AppInfo.fromAddress).marshal(appinfo, null), Marshal.addressToString.marshal(contentType, null));
                return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), RemoveSupportsTypeCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code remove_supports_type}
     * @param removeSupportsType The new value of the field {@code remove_supports_type}
     */
    public void setRemoveSupportsType(RemoveSupportsTypeCallback removeSupportsType) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("remove_supports_type"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (removeSupportsType == null ? MemoryAddress.NULL : removeSupportsType.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code CanDeleteCallback} callback.
     */
    @FunctionalInterface
    public interface CanDeleteCallback {
    
        boolean run(org.gtk.gio.AppInfo appinfo);
        
        @ApiStatus.Internal default int upcall(MemoryAddress appinfo) {
            var RESULT = run((org.gtk.gio.AppInfo) Interop.register(appinfo, org.gtk.gio.AppInfo.fromAddress).marshal(appinfo, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), CanDeleteCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code can_delete}
     * @param canDelete The new value of the field {@code can_delete}
     */
    public void setCanDelete(CanDeleteCallback canDelete) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("can_delete"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (canDelete == null ? MemoryAddress.NULL : canDelete.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code DoDeleteCallback} callback.
     */
    @FunctionalInterface
    public interface DoDeleteCallback {
    
        boolean run(org.gtk.gio.AppInfo appinfo);
        
        @ApiStatus.Internal default int upcall(MemoryAddress appinfo) {
            var RESULT = run((org.gtk.gio.AppInfo) Interop.register(appinfo, org.gtk.gio.AppInfo.fromAddress).marshal(appinfo, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), DoDeleteCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code do_delete}
     * @param doDelete The new value of the field {@code do_delete}
     */
    public void setDoDelete(DoDeleteCallback doDelete) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("do_delete"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (doDelete == null ? MemoryAddress.NULL : doDelete.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GetCommandlineCallback} callback.
     */
    @FunctionalInterface
    public interface GetCommandlineCallback {
    
        @Nullable java.lang.String run(org.gtk.gio.AppInfo appinfo);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress appinfo) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                var RESULT = run((org.gtk.gio.AppInfo) Interop.register(appinfo, org.gtk.gio.AppInfo.fromAddress).marshal(appinfo, null));
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
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GetCommandlineCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_commandline}
     * @param getCommandline The new value of the field {@code get_commandline}
     */
    public void setGetCommandline(GetCommandlineCallback getCommandline) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_commandline"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getCommandline == null ? MemoryAddress.NULL : getCommandline.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GetDisplayNameCallback} callback.
     */
    @FunctionalInterface
    public interface GetDisplayNameCallback {
    
        java.lang.String run(org.gtk.gio.AppInfo appinfo);
        
        @ApiStatus.Internal default Addressable upcall(MemoryAddress appinfo) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                var RESULT = run((org.gtk.gio.AppInfo) Interop.register(appinfo, org.gtk.gio.AppInfo.fromAddress).marshal(appinfo, null));
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
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GetDisplayNameCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_display_name}
     * @param getDisplayName The new value of the field {@code get_display_name}
     */
    public void setGetDisplayName(GetDisplayNameCallback getDisplayName) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_display_name"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getDisplayName == null ? MemoryAddress.NULL : getDisplayName.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code SetAsLastUsedForTypeCallback} callback.
     */
    @FunctionalInterface
    public interface SetAsLastUsedForTypeCallback {
    
        boolean run(org.gtk.gio.AppInfo appinfo, java.lang.String contentType);
        
        @ApiStatus.Internal default int upcall(MemoryAddress appinfo, MemoryAddress contentType) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                var RESULT = run((org.gtk.gio.AppInfo) Interop.register(appinfo, org.gtk.gio.AppInfo.fromAddress).marshal(appinfo, null), Marshal.addressToString.marshal(contentType, null));
                return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), SetAsLastUsedForTypeCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code set_as_last_used_for_type}
     * @param setAsLastUsedForType The new value of the field {@code set_as_last_used_for_type}
     */
    public void setSetAsLastUsedForType(SetAsLastUsedForTypeCallback setAsLastUsedForType) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("set_as_last_used_for_type"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (setAsLastUsedForType == null ? MemoryAddress.NULL : setAsLastUsedForType.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code GetSupportedTypesCallback} callback.
     */
    @FunctionalInterface
    public interface GetSupportedTypesCallback {
    
        java.lang.String[] run(org.gtk.gio.AppInfo appinfo);
        
        @ApiStatus.Internal default void upcall(MemoryAddress appinfo) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                run((org.gtk.gio.AppInfo) Interop.register(appinfo, org.gtk.gio.AppInfo.fromAddress).marshal(appinfo, null));
            }
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), GetSupportedTypesCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code get_supported_types}
     * @param getSupportedTypes The new value of the field {@code get_supported_types}
     */
    public void setGetSupportedTypes(GetSupportedTypesCallback getSupportedTypes) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("get_supported_types"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getSupportedTypes == null ? MemoryAddress.NULL : getSupportedTypes.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code LaunchUrisAsyncCallback} callback.
     */
    @FunctionalInterface
    public interface LaunchUrisAsyncCallback {
    
        void run(org.gtk.gio.AppInfo appinfo, @Nullable org.gtk.glib.List uris, @Nullable org.gtk.gio.AppLaunchContext context, @Nullable org.gtk.gio.Cancellable cancellable, @Nullable org.gtk.gio.AsyncReadyCallback callback);
        
        @ApiStatus.Internal default void upcall(MemoryAddress appinfo, MemoryAddress uris, MemoryAddress context, MemoryAddress cancellable, MemoryAddress callback, MemoryAddress userData) {
            run((org.gtk.gio.AppInfo) Interop.register(appinfo, org.gtk.gio.AppInfo.fromAddress).marshal(appinfo, null), org.gtk.glib.List.fromAddress.marshal(uris, null), (org.gtk.gio.AppLaunchContext) Interop.register(context, org.gtk.gio.AppLaunchContext.fromAddress).marshal(context, null), (org.gtk.gio.Cancellable) Interop.register(cancellable, org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, null), null /* Unsupported parameter type */);
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), LaunchUrisAsyncCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code launch_uris_async}
     * @param launchUrisAsync The new value of the field {@code launch_uris_async}
     */
    public void setLaunchUrisAsync(LaunchUrisAsyncCallback launchUrisAsync) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("launch_uris_async"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (launchUrisAsync == null ? MemoryAddress.NULL : launchUrisAsync.toCallback()));
        }
    }
    
    /**
     * Functional interface declaration of the {@code LaunchUrisFinishCallback} callback.
     */
    @FunctionalInterface
    public interface LaunchUrisFinishCallback {
    
        boolean run(org.gtk.gio.AppInfo appinfo, org.gtk.gio.AsyncResult result);
        
        @ApiStatus.Internal default int upcall(MemoryAddress appinfo, MemoryAddress result) {
            var RESULT = run((org.gtk.gio.AppInfo) Interop.register(appinfo, org.gtk.gio.AppInfo.fromAddress).marshal(appinfo, null), (org.gtk.gio.AsyncResult) Interop.register(result, org.gtk.gio.AsyncResult.fromAddress).marshal(result, null));
            return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
        }
        
        /**
         * Describes the parameter types of the native callback function.
         */
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        
        /**
         * The method handle for the callback.
         */
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), LaunchUrisFinishCallback.class, DESCRIPTOR);
        
        /**
         * Creates a callback that can be called from native code and executes the {@code run} method.
         * @return the memory address of the callback function
         */
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
        }
    }
    
    /**
     * Change the value of the field {@code launch_uris_finish}
     * @param launchUrisFinish The new value of the field {@code launch_uris_finish}
     */
    public void setLaunchUrisFinish(LaunchUrisFinishCallback launchUrisFinish) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            getMemoryLayout()
                .varHandle(MemoryLayout.PathElement.groupElement("launch_uris_finish"))
                .set(MemorySegment.ofAddress((MemoryAddress) handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (launchUrisFinish == null ? MemoryAddress.NULL : launchUrisFinish.toCallback()));
        }
    }
    
    /**
     * Create a AppInfoIface proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected AppInfoIface(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, AppInfoIface> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new AppInfoIface(input);
    
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
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("g_iface"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (gIface == null ? MemoryAddress.NULL : gIface.handle()));
                return this;
            }
        }
        
        public Builder setDup(DupCallback dup) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("dup"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (dup == null ? MemoryAddress.NULL : dup.toCallback()));
                return this;
            }
        }
        
        public Builder setEqual(EqualCallback equal) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("equal"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (equal == null ? MemoryAddress.NULL : equal.toCallback()));
                return this;
            }
        }
        
        public Builder setGetId(GetIdCallback getId) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("get_id"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getId == null ? MemoryAddress.NULL : getId.toCallback()));
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
        
        public Builder setGetDescription(GetDescriptionCallback getDescription) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("get_description"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getDescription == null ? MemoryAddress.NULL : getDescription.toCallback()));
                return this;
            }
        }
        
        public Builder setGetExecutable(GetExecutableCallback getExecutable) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("get_executable"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getExecutable == null ? MemoryAddress.NULL : getExecutable.toCallback()));
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
        
        public Builder setLaunch(LaunchCallback launch) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("launch"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (launch == null ? MemoryAddress.NULL : launch.toCallback()));
                return this;
            }
        }
        
        public Builder setSupportsUris(SupportsUrisCallback supportsUris) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("supports_uris"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (supportsUris == null ? MemoryAddress.NULL : supportsUris.toCallback()));
                return this;
            }
        }
        
        public Builder setSupportsFiles(SupportsFilesCallback supportsFiles) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("supports_files"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (supportsFiles == null ? MemoryAddress.NULL : supportsFiles.toCallback()));
                return this;
            }
        }
        
        public Builder setLaunchUris(LaunchUrisCallback launchUris) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("launch_uris"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (launchUris == null ? MemoryAddress.NULL : launchUris.toCallback()));
                return this;
            }
        }
        
        public Builder setShouldShow(ShouldShowCallback shouldShow) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("should_show"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (shouldShow == null ? MemoryAddress.NULL : shouldShow.toCallback()));
                return this;
            }
        }
        
        public Builder setSetAsDefaultForType(SetAsDefaultForTypeCallback setAsDefaultForType) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("set_as_default_for_type"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (setAsDefaultForType == null ? MemoryAddress.NULL : setAsDefaultForType.toCallback()));
                return this;
            }
        }
        
        public Builder setSetAsDefaultForExtension(SetAsDefaultForExtensionCallback setAsDefaultForExtension) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("set_as_default_for_extension"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (setAsDefaultForExtension == null ? MemoryAddress.NULL : setAsDefaultForExtension.toCallback()));
                return this;
            }
        }
        
        public Builder setAddSupportsType(AddSupportsTypeCallback addSupportsType) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("add_supports_type"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (addSupportsType == null ? MemoryAddress.NULL : addSupportsType.toCallback()));
                return this;
            }
        }
        
        public Builder setCanRemoveSupportsType(CanRemoveSupportsTypeCallback canRemoveSupportsType) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("can_remove_supports_type"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (canRemoveSupportsType == null ? MemoryAddress.NULL : canRemoveSupportsType.toCallback()));
                return this;
            }
        }
        
        public Builder setRemoveSupportsType(RemoveSupportsTypeCallback removeSupportsType) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("remove_supports_type"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (removeSupportsType == null ? MemoryAddress.NULL : removeSupportsType.toCallback()));
                return this;
            }
        }
        
        public Builder setCanDelete(CanDeleteCallback canDelete) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("can_delete"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (canDelete == null ? MemoryAddress.NULL : canDelete.toCallback()));
                return this;
            }
        }
        
        public Builder setDoDelete(DoDeleteCallback doDelete) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("do_delete"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (doDelete == null ? MemoryAddress.NULL : doDelete.toCallback()));
                return this;
            }
        }
        
        public Builder setGetCommandline(GetCommandlineCallback getCommandline) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("get_commandline"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getCommandline == null ? MemoryAddress.NULL : getCommandline.toCallback()));
                return this;
            }
        }
        
        public Builder setGetDisplayName(GetDisplayNameCallback getDisplayName) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("get_display_name"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getDisplayName == null ? MemoryAddress.NULL : getDisplayName.toCallback()));
                return this;
            }
        }
        
        public Builder setSetAsLastUsedForType(SetAsLastUsedForTypeCallback setAsLastUsedForType) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("set_as_last_used_for_type"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (setAsLastUsedForType == null ? MemoryAddress.NULL : setAsLastUsedForType.toCallback()));
                return this;
            }
        }
        
        public Builder setGetSupportedTypes(GetSupportedTypesCallback getSupportedTypes) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("get_supported_types"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (getSupportedTypes == null ? MemoryAddress.NULL : getSupportedTypes.toCallback()));
                return this;
            }
        }
        
        public Builder setLaunchUrisAsync(LaunchUrisAsyncCallback launchUrisAsync) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("launch_uris_async"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (launchUrisAsync == null ? MemoryAddress.NULL : launchUrisAsync.toCallback()));
                return this;
            }
        }
        
        public Builder setLaunchUrisFinish(LaunchUrisFinishCallback launchUrisFinish) {
            try (MemorySession SCOPE = MemorySession.openConfined()) {
                getMemoryLayout()
                    .varHandle(MemoryLayout.PathElement.groupElement("launch_uris_finish"))
                    .set(MemorySegment.ofAddress((MemoryAddress) struct.handle(), getMemoryLayout().byteSize(), SCOPE), (Addressable) (launchUrisFinish == null ? MemoryAddress.NULL : launchUrisFinish.toCallback()));
                return this;
            }
        }
    }
}
