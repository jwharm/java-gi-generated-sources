package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * Integrating the launch with the launching application. This is used to
 * handle for instance startup notification and launching the new application
 * on the same screen as the launching window.
 */
public class AppLaunchContext extends org.gtk.gobject.Object {

    public AppLaunchContext(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to AppLaunchContext */
    public static AppLaunchContext castFrom(org.gtk.gobject.Object gobject) {
        return new AppLaunchContext(gobject.getReference());
    }
    
    private static Reference constructNew() {
        Reference RESULT = References.get(gtk_h.g_app_launch_context_new(), true);
        return RESULT;
    }
    
    /**
     * Creates a new application launch context. This is not normally used,
     * instead you instantiate a subclass of this, such as {@link org.gtk.gdk.AppLaunchContext}
     */
    public AppLaunchContext() {
        super(constructNew());
    }
    
    /**
     * Gets the display string for the @context. This is used to ensure new
     * applications are started on the same display as the launching
     * application, by setting the <code>DISPLAY</code> environment variable.
     */
    public java.lang.String getDisplay(AppInfo info, org.gtk.glib.List files) {
        var RESULT = gtk_h.g_app_launch_context_get_display(handle(), info.handle(), files.handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Initiates startup notification for the application and returns the<code>DESKTOP_STARTUP_ID</code> for the launched operation, if supported.
     * 
     * Startup notification IDs are defined in the
     * {@link [FreeDesktop.Org Startup Notifications standard]}(http://standards.freedesktop.org/startup-notification-spec/startup-notification-latest.txt).
     */
    public java.lang.String getStartupNotifyId(AppInfo info, org.gtk.glib.List files) {
        var RESULT = gtk_h.g_app_launch_context_get_startup_notify_id(handle(), info.handle(), files.handle());
        return RESULT.getUtf8String(0);
    }
    
    /**
     * Called when an application has failed to launch, so that it can cancel
     * the application startup notification started in g_app_launch_context_get_startup_notify_id().
     */
    public void launchFailed(java.lang.String startupNotifyId) {
        gtk_h.g_app_launch_context_launch_failed(handle(), Interop.allocateNativeString(startupNotifyId).handle());
    }
    
    /**
     * Arranges for @variable to be set to @value in the child&<code>#39</code> s
     * environment when @context is used to launch an application.
     */
    public void setenv(java.lang.String variable, java.lang.String value) {
        gtk_h.g_app_launch_context_setenv(handle(), Interop.allocateNativeString(variable).handle(), Interop.allocateNativeString(value).handle());
    }
    
    /**
     * Arranges for @variable to be unset in the child&<code>#39</code> s environment
     * when @context is used to launch an application.
     */
    public void unsetenv(java.lang.String variable) {
        gtk_h.g_app_launch_context_unsetenv(handle(), Interop.allocateNativeString(variable).handle());
    }
    
    @FunctionalInterface
    public interface LaunchFailedHandler {
        void signalReceived(AppLaunchContext source, java.lang.String startupNotifyId);
    }
    
    /**
     * The {@link org.gtk.gio.AppLaunchContext} :launch-failed signal is emitted when a {@link org.gtk.gio.AppInfo} launch
     * fails. The startup notification id is provided, so that the launcher
     * can cancel the startup notification.
     */
    public SignalHandle onLaunchFailed(LaunchFailedHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalAppLaunchContextLaunchFailed", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("launch-failed").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface LaunchStartedHandler {
        void signalReceived(AppLaunchContext source, AppInfo info, org.gtk.glib.Variant platformData);
    }
    
    /**
     * The {@link org.gtk.gio.AppLaunchContext} :launch-started signal is emitted when a {@link org.gtk.gio.AppInfo} is
     * about to be launched. If non-null the @platform_data is an
     * GVariant dictionary mapping strings to variants (ie <code>a{sv}</code>), which
     * contains additional, platform-specific data about this launch. On
     * UNIX, at least the <code>startup-notification-id</code> keys will be
     * present.
     * <p>
     * The value of the <code>startup-notification-id</code> key (type <code>s</code>) is a startup
     * notification ID corresponding to the format from the {@link [startup-notification
     * specification]}(https://specifications.freedesktop.org/startup-notification-spec/startup-notification-0.1.txt).
     * It allows tracking the progress of the launchee through startup.
     * 
     * It is guaranteed that this signal is followed by either a {@link org.gtk.gio.AppLaunchContext} :launched or
     * {@link org.gtk.gio.AppLaunchContext} :launch-failed signal.
     */
    public SignalHandle onLaunchStarted(LaunchStartedHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalAppLaunchContextLaunchStarted", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("launch-started").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    @FunctionalInterface
    public interface LaunchedHandler {
        void signalReceived(AppLaunchContext source, AppInfo info, org.gtk.glib.Variant platformData);
    }
    
    /**
     * The {@link org.gtk.gio.AppLaunchContext} :launched signal is emitted when a {@link org.gtk.gio.AppInfo} is successfully
     * launched. The @platform_data is an GVariant dictionary mapping
     * strings to variants (ie <code>a{sv}</code>), which contains additional,
     * platform-specific data about this launch. On UNIX, at least the<code>pid</code> and <code>startup-notification-id</code> keys will be present.
     * <p>
     * Since 2.72 the <code>pid</code> may be 0 if the process id wasn&<code>#39</code> t known (for
     * example if the process was launched via D-Bus). The <code>pid</code> may not be
     * set at all in subsequent releases.
     */
    public SignalHandle onLaunched(LaunchedHandler handler) {
        try {
            int hash = Interop.registerCallback(handler.hashCode(), handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalAppLaunchContextLaunched", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            long handlerId = gtk_h.g_signal_connect_data(handle(), Interop.allocateNativeString("launched").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), handlerId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
