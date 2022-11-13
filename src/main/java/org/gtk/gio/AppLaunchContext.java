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
public class AppLaunchContext extends org.gtk.gobject.Object {
    
    static {
        Gio.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GAppLaunchContext";
    
    private static GroupLayout memoryLayout = MemoryLayout.structLayout(
        org.gtk.gobject.Object.getMemoryLayout().withName("parent_instance"),
        Interop.valueLayout.ADDRESS.withName("priv")
    ).withName(C_TYPE_NAME);
    
    /**
     * The memory layout of the native struct.
     * @return the memory layout
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return memoryLayout;
    }
    
    /**
     * Get the value of the field {@code parent_instance}
     * @return The value of the field {@code parent_instance}
     */
    public org.gtk.gobject.Object parent_instance$get() {
        long OFFSET = getMemoryLayout().byteOffset(MemoryLayout.PathElement.groupElement("parent_instance"));
        return new org.gtk.gobject.Object(((MemoryAddress) handle()).addOffset(OFFSET), Ownership.UNKNOWN);
    }
    
    /**
     * Create a AppLaunchContext proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public AppLaunchContext(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    /**
     * Cast object to AppLaunchContext if its GType is a (or inherits from) "GAppLaunchContext".
     * <p>
     * Internally, this creates a new Proxy object with the same ownership status as the parameter. If 
     * the parameter object was owned by the user, the Cleaner will be removed from it, and will be attached 
     * to the new Proxy object, so the call to {@code g_object_unref} will happen only once the new Proxy instance 
     * is garbage-collected. 
     * @param  gobject            An object that inherits from GObject
     * @return                    A new proxy instance of type {@code AppLaunchContext} that points to the memory address of the provided GObject.
     *                            The type of the object is checked with {@code g_type_check_instance_is_a}.
     * @throws ClassCastException If the GType is not derived from "GAppLaunchContext", a ClassCastException will be thrown.
     */
    public static AppLaunchContext castFrom(org.gtk.gobject.Object gobject) {
        if (org.gtk.gobject.GObject.typeCheckInstanceIsA(gobject.g_type_instance$get(), org.gtk.gobject.GObject.typeFromName("GAppLaunchContext"))) {
            return new AppLaunchContext(gobject.handle(), gobject.yieldOwnership());
        } else {
            throw new ClassCastException("Object type is not an instance of GAppLaunchContext");
        }
    }
    
    private static Addressable constructNew() {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_app_launch_context_new.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new application launch context. This is not normally used,
     * instead you instantiate a subclass of this, such as {@link org.gtk.gdk.AppLaunchContext}.
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
    public @Nullable java.lang.String getDisplay(@NotNull org.gtk.gio.AppInfo info, @NotNull org.gtk.glib.List files) {
        java.util.Objects.requireNonNull(info, "Parameter 'info' must not be null");
        java.util.Objects.requireNonNull(files, "Parameter 'files' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_app_launch_context_get_display.invokeExact(
                    handle(),
                    info.handle(),
                    files.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Gets the complete environment variable list to be passed to
     * the child process when {@code context} is used to launch an application.
     * This is a {@code null}-terminated array of strings, where each string has
     * the form {@code KEY=VALUE}.
     * @return the child's environment
     */
    public @NotNull PointerString getEnvironment() {
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
    public @Nullable java.lang.String getStartupNotifyId(@NotNull org.gtk.gio.AppInfo info, @NotNull org.gtk.glib.List files) {
        java.util.Objects.requireNonNull(info, "Parameter 'info' must not be null");
        java.util.Objects.requireNonNull(files, "Parameter 'files' must not be null");
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_app_launch_context_get_startup_notify_id.invokeExact(
                    handle(),
                    info.handle(),
                    files.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Interop.getStringFrom(RESULT);
    }
    
    /**
     * Called when an application has failed to launch, so that it can cancel
     * the application startup notification started in g_app_launch_context_get_startup_notify_id().
     * @param startupNotifyId the startup notification id that was returned by g_app_launch_context_get_startup_notify_id().
     */
    public void launchFailed(@NotNull java.lang.String startupNotifyId) {
        java.util.Objects.requireNonNull(startupNotifyId, "Parameter 'startupNotifyId' must not be null");
        try {
            DowncallHandles.g_app_launch_context_launch_failed.invokeExact(
                    handle(),
                    Interop.allocateNativeString(startupNotifyId));
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
    public void setenv(@NotNull java.lang.String variable, @NotNull java.lang.String value) {
        java.util.Objects.requireNonNull(variable, "Parameter 'variable' must not be null");
        java.util.Objects.requireNonNull(value, "Parameter 'value' must not be null");
        try {
            DowncallHandles.g_app_launch_context_setenv.invokeExact(
                    handle(),
                    Interop.allocateNativeString(variable),
                    Interop.allocateNativeString(value));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Arranges for {@code variable} to be unset in the child's environment
     * when {@code context} is used to launch an application.
     * @param variable the environment variable to remove
     */
    public void unsetenv(@NotNull java.lang.String variable) {
        java.util.Objects.requireNonNull(variable, "Parameter 'variable' must not be null");
        try {
            DowncallHandles.g_app_launch_context_unsetenv.invokeExact(
                    handle(),
                    Interop.allocateNativeString(variable));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface LaunchFailed {
        void signalReceived(AppLaunchContext source, @NotNull java.lang.String startupNotifyId);
    }
    
    /**
     * The {@link AppLaunchContext}::launch-failed signal is emitted when a {@link AppInfo} launch
     * fails. The startup notification id is provided, so that the launcher
     * can cancel the startup notification.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<AppLaunchContext.LaunchFailed> onLaunchFailed(AppLaunchContext.LaunchFailed handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("launch-failed"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(AppLaunchContext.Callbacks.class, "signalAppLaunchContextLaunchFailed",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<AppLaunchContext.LaunchFailed>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface LaunchStarted {
        void signalReceived(AppLaunchContext source, @NotNull org.gtk.gio.AppInfo info, @Nullable org.gtk.glib.Variant platformData);
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
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<AppLaunchContext.LaunchStarted> onLaunchStarted(AppLaunchContext.LaunchStarted handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("launch-started"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(AppLaunchContext.Callbacks.class, "signalAppLaunchContextLaunchStarted",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<AppLaunchContext.LaunchStarted>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface Launched {
        void signalReceived(AppLaunchContext source, @NotNull org.gtk.gio.AppInfo info, @NotNull org.gtk.glib.Variant platformData);
    }
    
    /**
     * The {@link AppLaunchContext}::launched signal is emitted when a {@link AppInfo} is successfully
     * launched. The {@code platform_data} is an GVariant dictionary mapping
     * strings to variants (ie {@code a{sv}}), which contains additional,
     * platform-specific data about this launch. On UNIX, at least the
     * {@code pid} and {@code startup-notification-id} keys will be present.
     * <p>
     * Since 2.72 the {@code pid} may be 0 if the process id wasn't known (for
     * example if the process was launched via D-Bus). The {@code pid} may not be
     * set at all in subsequent releases.
     * @param handler The signal handler
     * @return A {@link io.github.jwharm.javagi.Signal} object to keep track of the signal connection
     */
    public Signal<AppLaunchContext.Launched> onLaunched(AppLaunchContext.Launched handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("launched"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(AppLaunchContext.Callbacks.class, "signalAppLaunchContextLaunched",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.registerCallback(handler),
                (Addressable) MemoryAddress.NULL, 0);
            return new Signal<AppLaunchContext.Launched>(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_app_launch_context_new = Interop.downcallHandle(
            "g_app_launch_context_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_app_launch_context_get_display = Interop.downcallHandle(
            "g_app_launch_context_get_display",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_app_launch_context_get_environment = Interop.downcallHandle(
            "g_app_launch_context_get_environment",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_app_launch_context_get_startup_notify_id = Interop.downcallHandle(
            "g_app_launch_context_get_startup_notify_id",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_app_launch_context_launch_failed = Interop.downcallHandle(
            "g_app_launch_context_launch_failed",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_app_launch_context_setenv = Interop.downcallHandle(
            "g_app_launch_context_setenv",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_app_launch_context_unsetenv = Interop.downcallHandle(
            "g_app_launch_context_unsetenv",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
    }
    
    private static class Callbacks {
        
        public static void signalAppLaunchContextLaunchFailed(MemoryAddress source, MemoryAddress startupNotifyId, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (AppLaunchContext.LaunchFailed) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new AppLaunchContext(source, Ownership.UNKNOWN), Interop.getStringFrom(startupNotifyId));
        }
        
        public static void signalAppLaunchContextLaunchStarted(MemoryAddress source, MemoryAddress info, MemoryAddress platformData, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (AppLaunchContext.LaunchStarted) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new AppLaunchContext(source, Ownership.UNKNOWN), new org.gtk.gio.AppInfo.AppInfoImpl(info, Ownership.NONE), new org.gtk.glib.Variant(platformData, Ownership.NONE));
        }
        
        public static void signalAppLaunchContextLaunched(MemoryAddress source, MemoryAddress info, MemoryAddress platformData, MemoryAddress data) {
            int HASH = data.get(ValueLayout.JAVA_INT, 0);
            var HANDLER = (AppLaunchContext.Launched) Interop.signalRegistry.get(HASH);
            HANDLER.signalReceived(new AppLaunchContext(source, Ownership.UNKNOWN), new org.gtk.gio.AppInfo.AppInfoImpl(info, Ownership.NONE), new org.gtk.glib.Variant(platformData, Ownership.NONE));
        }
    }
}
