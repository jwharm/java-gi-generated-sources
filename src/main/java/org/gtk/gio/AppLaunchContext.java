package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Integrating the launch with the launching application. This is used to
 * handle for instance startup notification and launching the new application
 * on the same screen as the launching window.
 */
public class AppLaunchContext extends org.gtk.gobject.GObject {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GAppLaunchContext";
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return MemoryLayout.structLayout(
            org.gtk.gobject.GObject.getMemoryLayout().withName("parent_instance"),
            Interop.valueLayout.ADDRESS.withName("priv")
        ).withName(C_TYPE_NAME);
    }
    
    /**
     * Create a AppLaunchContext proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected AppLaunchContext(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, AppLaunchContext> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new AppLaunchContext(input, ownership);
    
    private static MemoryAddress constructNew() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_app_launch_context_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new application launch context. This is not normally used,
     * instead you instantiate a subclass of this, such as {@code GdkAppLaunchContext}.
     */
    public AppLaunchContext() {
        super(constructNew(), Ownership.FULL);
    }
    
    /**
     * Gets the display string for the {@code context}. This is used to ensure new
     * applications are started on the same display as the launching
     * application, by setting the {@code DISPLAY} environment variable.
     * @param info a {@link AppInfo}
     * @param files a {@link org.gtk.glib.List} of {@link File} objects
     * @return a display string for the display.
     */
    public @Nullable java.lang.String getDisplay(org.gtk.gio.AppInfo info, org.gtk.glib.List files) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_app_launch_context_get_display.invokeExact(
                    handle(),
                    info.handle(),
                    files.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Gets the complete environment variable list to be passed to
     * the child process when {@code context} is used to launch an application.
     * This is a {@code null}-terminated array of strings, where each string has
     * the form {@code KEY=VALUE}.
     * @return the child's environment
     */
    public PointerString getEnvironment() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_app_launch_context_get_environment.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PointerString(RESULT);
    }
    
    /**
     * Initiates startup notification for the application and returns the
     * {@code DESKTOP_STARTUP_ID} for the launched operation, if supported.
     * <p>
     * Startup notification IDs are defined in the
     * <a href="http://standards.freedesktop.org/startup-notification-spec/startup-notification-latest.txt">FreeDesktop.Org Startup Notifications standard</a>.
     * @param info a {@link AppInfo}
     * @param files a {@link org.gtk.glib.List} of of {@link File} objects
     * @return a startup notification ID for the application, or {@code null} if
     *     not supported.
     */
    public @Nullable java.lang.String getStartupNotifyId(org.gtk.gio.AppInfo info, org.gtk.glib.List files) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_app_launch_context_get_startup_notify_id.invokeExact(
                    handle(),
                    info.handle(),
                    files.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.addressToString.marshal(RESULT, null);
    }
    
    /**
     * Called when an application has failed to launch, so that it can cancel
     * the application startup notification started in g_app_launch_context_get_startup_notify_id().
     * @param startupNotifyId the startup notification id that was returned by g_app_launch_context_get_startup_notify_id().
     */
    public void launchFailed(java.lang.String startupNotifyId) {
        try {
            DowncallHandles.g_app_launch_context_launch_failed.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(startupNotifyId, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Arranges for {@code variable} to be set to {@code value} in the child's
     * environment when {@code context} is used to launch an application.
     * @param variable the environment variable to set
     * @param value the value for to set the variable to.
     */
    public void setenv(java.lang.String variable, java.lang.String value) {
        try {
            DowncallHandles.g_app_launch_context_setenv.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(variable, null),
                    Marshal.stringToAddress.marshal(value, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Arranges for {@code variable} to be unset in the child's environment
     * when {@code context} is used to launch an application.
     * @param variable the environment variable to remove
     */
    public void unsetenv(java.lang.String variable) {
        try {
            DowncallHandles.g_app_launch_context_unsetenv.invokeExact(
                    handle(),
                    Marshal.stringToAddress.marshal(variable, null));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Get the gtype
     * @return The gtype
     */
    public static org.gtk.glib.Type getType() {
        long RESULT;
        try {
            RESULT = (long) DowncallHandles.g_app_launch_context_get_type.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Type(RESULT);
    }
    
    @FunctionalInterface
    public interface LaunchFailed {
        void run(java.lang.String startupNotifyId);

        @ApiStatus.Internal default void upcall(MemoryAddress sourceAppLaunchContext, MemoryAddress startupNotifyId) {
            run(Marshal.addressToString.marshal(startupNotifyId, null));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(LaunchFailed.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * The {@link AppLaunchContext}::launch-failed signal is emitted when a {@link AppInfo} launch
     * fails. The startup notification id is provided, so that the launcher
     * can cancel the startup notification.
     * <p>
     * Because a launch operation may involve spawning multiple instances of the
     * target application, you should expect this signal to be emitted multiple
     * times, one for each spawned instance.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<AppLaunchContext.LaunchFailed> onLaunchFailed(AppLaunchContext.LaunchFailed handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("launch-failed"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface LaunchStarted {
        void run(org.gtk.gio.AppInfo info, @Nullable org.gtk.glib.Variant platformData);

        @ApiStatus.Internal default void upcall(MemoryAddress sourceAppLaunchContext, MemoryAddress info, MemoryAddress platformData) {
            run((org.gtk.gio.AppInfo) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(info)), org.gtk.gio.AppInfo.fromAddress).marshal(info, Ownership.NONE), org.gtk.glib.Variant.fromAddress.marshal(platformData, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(LaunchStarted.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * The {@link AppLaunchContext}::launch-started signal is emitted when a {@link AppInfo} is
     * about to be launched. If non-null the {@code platform_data} is an
     * GVariant dictionary mapping strings to variants (ie {@code a{sv}}), which
     * contains additional, platform-specific data about this launch. On
     * UNIX, at least the {@code startup-notification-id} keys will be
     * present.
     * <p>
     * The value of the {@code startup-notification-id} key (type {@code s}) is a startup
     * notification ID corresponding to the format from the [startup-notification
     * specification](https://specifications.freedesktop.org/startup-notification-spec/startup-notification-0.1.txt).
     * It allows tracking the progress of the launchee through startup.
     * <p>
     * It is guaranteed that this signal is followed by either a {@link AppLaunchContext}::launched or
     * {@link AppLaunchContext}::launch-failed signal.
     * <p>
     * Because a launch operation may involve spawning multiple instances of the
     * target application, you should expect this signal to be emitted multiple
     * times, one for each spawned instance.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<AppLaunchContext.LaunchStarted> onLaunchStarted(AppLaunchContext.LaunchStarted handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("launch-started"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface Launched {
        void run(org.gtk.gio.AppInfo info, org.gtk.glib.Variant platformData);

        @ApiStatus.Internal default void upcall(MemoryAddress sourceAppLaunchContext, MemoryAddress info, MemoryAddress platformData) {
            run((org.gtk.gio.AppInfo) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(info)), org.gtk.gio.AppInfo.fromAddress).marshal(info, Ownership.NONE), org.gtk.glib.Variant.fromAddress.marshal(platformData, Ownership.NONE));
        }
        
        @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
        @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(Launched.class, DESCRIPTOR);
        
        default MemoryAddress toCallback() {
            return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
        }
    }
    
    /**
     * The {@link AppLaunchContext}::launched signal is emitted when a {@link AppInfo} is successfully
     * launched.
     * <p>
     * Because a launch operation may involve spawning multiple instances of the
     * target application, you should expect this signal to be emitted multiple
     * times, one time for each spawned instance.
     * <p>
     * The {@code platform_data} is an GVariant dictionary mapping
     * strings to variants (ie {@code a{sv}}), which contains additional,
     * platform-specific data about this launch. On UNIX, at least the
     * {@code pid} and {@code startup-notification-id} keys will be present.
     * <p>
     * Since 2.72 the {@code pid} may be 0 if the process id wasn't known (for
     * example if the process was launched via D-Bus). The {@code pid} may not be
     * set at all in subsequent releases.
     * <p>
     * On Windows, {@code pid} is guaranteed to be valid only for the duration of the
     * {@link AppLaunchContext}::launched signal emission; after the signal is emitted,
     * GLib will call g_spawn_close_pid(). If you need to keep the {@link org.gtk.glib.Pid} after the
     * signal has been emitted, then you can duplicate {@code pid} using {@code DuplicateHandle()}.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<AppLaunchContext.Launched> onLaunched(AppLaunchContext.Launched handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(), Interop.allocateNativeString("launched"), (Addressable) handler.toCallback(), (Addressable) MemoryAddress.NULL, (Addressable) MemoryAddress.NULL, 0);
            return new Signal<>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * A {@link AppLaunchContext.Builder} object constructs a {@link AppLaunchContext} 
     * using the <em>builder pattern</em> to set property values. 
     * Use the various {@code set...()} methods to set properties, 
     * and finish construction with {@link AppLaunchContext.Builder#build()}. 
     */
    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Inner class implementing a builder pattern to construct 
     * a GObject with properties.
     */
    public static class Builder extends org.gtk.gobject.GObject.Builder {
        
        protected Builder() {
        }
        
        /**
         * Finish building the {@link AppLaunchContext} object.
         * Internally, a call to {@link org.gtk.gobject.GObjects#typeFromName} 
         * is executed to create a new GObject instance, which is then cast to 
         * {@link AppLaunchContext}.
         * @return A new instance of {@code AppLaunchContext} with the properties 
         *         that were set in the Builder object.
         */
        public AppLaunchContext build() {
            return (AppLaunchContext) org.gtk.gobject.GObject.newWithProperties(
                AppLaunchContext.getType(),
                names.size(),
                names.toArray(new String[names.size()]),
                values.toArray(new org.gtk.gobject.Value[names.size()])
            );
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_app_launch_context_new = Interop.downcallHandle(
            "g_app_launch_context_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_app_launch_context_get_display = Interop.downcallHandle(
            "g_app_launch_context_get_display",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_app_launch_context_get_environment = Interop.downcallHandle(
            "g_app_launch_context_get_environment",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_app_launch_context_get_startup_notify_id = Interop.downcallHandle(
            "g_app_launch_context_get_startup_notify_id",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_app_launch_context_launch_failed = Interop.downcallHandle(
            "g_app_launch_context_launch_failed",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_app_launch_context_setenv = Interop.downcallHandle(
            "g_app_launch_context_setenv",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_app_launch_context_unsetenv = Interop.downcallHandle(
            "g_app_launch_context_unsetenv",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_app_launch_context_get_type = Interop.downcallHandle(
            "g_app_launch_context_get_type",
            FunctionDescriptor.of(Interop.valueLayout.C_LONG),
            false
        );
    }
}
