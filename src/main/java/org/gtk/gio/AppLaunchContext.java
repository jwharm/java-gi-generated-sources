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

    public AppLaunchContext(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    /** Cast object to AppLaunchContext */
    public static AppLaunchContext castFrom(org.gtk.gobject.Object gobject) {
        return new AppLaunchContext(gobject.refcounted());
    }
    
    private static final MethodHandle g_app_launch_context_new = Interop.downcallHandle(
        "g_app_launch_context_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS)
    );
    
    private static Refcounted constructNew() {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) g_app_launch_context_new.invokeExact(), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new application launch context. This is not normally used,
     * instead you instantiate a subclass of this, such as {@link org.gtk.gdk.AppLaunchContext}.
     */
    public AppLaunchContext() {
        super(constructNew());
    }
    
    private static final MethodHandle g_app_launch_context_get_display = Interop.downcallHandle(
        "g_app_launch_context_get_display",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the display string for the {@code context}. This is used to ensure new
     * applications are started on the same display as the launching
     * application, by setting the {@code DISPLAY} environment variable.
     */
    public @Nullable java.lang.String getDisplay(@NotNull AppInfo info, @NotNull org.gtk.glib.List files) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_app_launch_context_get_display.invokeExact(handle(), info.handle(), files.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle g_app_launch_context_get_environment = Interop.downcallHandle(
        "g_app_launch_context_get_environment",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Gets the complete environment variable list to be passed to
     * the child process when {@code context} is used to launch an application.
     * This is a {@code null}-terminated array of strings, where each string has
     * the form {@code KEY=VALUE}.
     */
    public PointerString getEnvironment() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_app_launch_context_get_environment.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new PointerString(RESULT);
    }
    
    private static final MethodHandle g_app_launch_context_get_startup_notify_id = Interop.downcallHandle(
        "g_app_launch_context_get_startup_notify_id",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Initiates startup notification for the application and returns the
     * {@code DESKTOP_STARTUP_ID} for the launched operation, if supported.
     * <p>
     * Startup notification IDs are defined in the
     * <a href="http://standards.freedesktop.org/startup-notification-spec/startup-notification-latest.txt">FreeDesktop.Org Startup Notifications standard</a>.
     */
    public @Nullable java.lang.String getStartupNotifyId(@NotNull AppInfo info, @NotNull org.gtk.glib.List files) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_app_launch_context_get_startup_notify_id.invokeExact(handle(), info.handle(), files.handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT.getUtf8String(0);
    }
    
    private static final MethodHandle g_app_launch_context_launch_failed = Interop.downcallHandle(
        "g_app_launch_context_launch_failed",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Called when an application has failed to launch, so that it can cancel
     * the application startup notification started in g_app_launch_context_get_startup_notify_id().
     */
    public @NotNull void launchFailed(@NotNull java.lang.String startupNotifyId) {
        try {
            g_app_launch_context_launch_failed.invokeExact(handle(), Interop.allocateNativeString(startupNotifyId));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_app_launch_context_setenv = Interop.downcallHandle(
        "g_app_launch_context_setenv",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Arranges for {@code variable} to be set to {@code value} in the child's
     * environment when {@code context} is used to launch an application.
     */
    public @NotNull void setenv(@NotNull java.lang.String variable, @NotNull java.lang.String value) {
        try {
            g_app_launch_context_setenv.invokeExact(handle(), Interop.allocateNativeString(variable), Interop.allocateNativeString(value));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_app_launch_context_unsetenv = Interop.downcallHandle(
        "g_app_launch_context_unsetenv",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Arranges for {@code variable} to be unset in the child's environment
     * when {@code context} is used to launch an application.
     */
    public @NotNull void unsetenv(@NotNull java.lang.String variable) {
        try {
            g_app_launch_context_unsetenv.invokeExact(handle(), Interop.allocateNativeString(variable));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface LaunchFailedHandler {
        void signalReceived(AppLaunchContext source, @NotNull java.lang.String startupNotifyId);
    }
    
    /**
     * The {@link AppLaunchContext}::launch-failed signal is emitted when a {@link AppInfo} launch
     * fails. The startup notification id is provided, so that the launcher
     * can cancel the startup notification.
     */
    public SignalHandle onLaunchFailed(LaunchFailedHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("launch-failed"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(AppLaunchContext.Callbacks.class, "signalAppLaunchContextLaunchFailed",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface LaunchStartedHandler {
        void signalReceived(AppLaunchContext source, @NotNull AppInfo info, @Nullable org.gtk.glib.Variant platformData);
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
     */
    public SignalHandle onLaunchStarted(LaunchStartedHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("launch-started"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(AppLaunchContext.Callbacks.class, "signalAppLaunchContextLaunchStarted",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    @FunctionalInterface
    public interface LaunchedHandler {
        void signalReceived(AppLaunchContext source, @NotNull AppInfo info, @NotNull org.gtk.glib.Variant platformData);
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
     */
    public SignalHandle onLaunched(LaunchedHandler handler) {
        try {
            var RESULT = (long) Interop.g_signal_connect_data.invokeExact(
                handle(),
                Interop.allocateNativeString("launched"),
                (Addressable) Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(AppLaunchContext.Callbacks.class, "signalAppLaunchContextLaunched",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                (Addressable) Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler)),
                (Addressable) MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    public static class Callbacks {
    
        public static void signalAppLaunchContextLaunchFailed(MemoryAddress source, MemoryAddress startupNotifyId, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (AppLaunchContext.LaunchFailedHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new AppLaunchContext(Refcounted.get(source)), startupNotifyId.getUtf8String(0));
        }
        
        public static void signalAppLaunchContextLaunchStarted(MemoryAddress source, MemoryAddress info, MemoryAddress platformData, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (AppLaunchContext.LaunchStartedHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new AppLaunchContext(Refcounted.get(source)), new AppInfo.AppInfoImpl(Refcounted.get(info, false)), new org.gtk.glib.Variant(Refcounted.get(platformData, false)));
        }
        
        public static void signalAppLaunchContextLaunched(MemoryAddress source, MemoryAddress info, MemoryAddress platformData, MemoryAddress data) {
            int hash = data.get(ValueLayout.JAVA_INT, 0);
            var handler = (AppLaunchContext.LaunchedHandler) Interop.signalRegistry.get(hash);
            handler.signalReceived(new AppLaunchContext(Refcounted.get(source)), new AppInfo.AppInfoImpl(Refcounted.get(info, false)), new org.gtk.glib.Variant(Refcounted.get(platformData, false)));
        }
        
    }
}
