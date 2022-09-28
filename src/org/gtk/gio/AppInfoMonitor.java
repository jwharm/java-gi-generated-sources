package org.gtk.gio;

import io.github.jwharm.javagi.interop.jextract.gtk_h;
import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;

/**
 * {@link AppInfoMonitor} is a very simple object used for monitoring the app
 * info database for changes (ie: newly installed or removed
 * applications).
 * <p>
 * Call g_app_info_monitor_get() to get a {@link AppInfoMonitor} and connect
 * to the "changed" signal.
 * <p>
 * In the usual case, applications should try to make note of the change
 * (doing things like invalidating caches) but not act on it.  In
 * particular, applications should avoid making calls to {@link AppInfo} APIs
 * in response to the change signal, deferring these until the time that
 * the data is actually required.  The exception to this case is when
 * application information is actually being displayed on the screen
 * (eg: during a search or when the list of all applications is shown).
 * The reason for this is that changes to the list of installed
 * applications often come in groups (like during system updates) and
 * rescanning the list on every change is pointless and expensive.
 */
public class AppInfoMonitor extends org.gtk.gobject.Object {

    public AppInfoMonitor(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    /** Cast object to AppInfoMonitor */
    public static AppInfoMonitor castFrom(org.gtk.gobject.Object gobject) {
        return new AppInfoMonitor(gobject.getReference());
    }
    
    /**
     * Gets the {@link AppInfoMonitor} for the current thread-default main
     * context.
     * <p>
     * The {@link AppInfoMonitor} will emit a "changed" signal in the
     * thread-default main context whenever the list of installed
     * applications (as reported by g_app_info_get_all()) may have changed.
     * <p>
     * You must only call g_object_unref() on the return value from under
     * the same main context as you created it.
     */
    public static AppInfoMonitor get() {
        var RESULT = gtk_h.g_app_info_monitor_get();
        return new AppInfoMonitor(References.get(RESULT, true));
    }
    
    @FunctionalInterface
    public interface ChangedHandler {
        void signalReceived(AppInfoMonitor source);
    }
    
    /**
     * Signal emitted when the app info database for changes (ie: newly installed
     * or removed applications).
     */
    public SignalHandle onChanged(ChangedHandler handler) {
        try {
            var RESULT = gtk_h.g_signal_connect_data(
                handle(),
                Interop.allocateNativeString("changed").handle(),
                Linker.nativeLinker().upcallStub(
                    MethodHandles.lookup().findStatic(AppInfoMonitor.class, "__signalAppInfoMonitorChanged",
                        MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class)),
                    FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                    Interop.getScope()),
                Interop.getAllocator().allocate(ValueLayout.JAVA_INT, Interop.registerCallback(handler.hashCode(), handler)),
                MemoryAddress.NULL, 0);
            return new SignalHandle(handle(), RESULT);
        } catch (IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
    
    public static void __signalAppInfoMonitorChanged(MemoryAddress source, MemoryAddress data) {
        int hash = data.get(ValueLayout.JAVA_INT, 0);
        var handler = (AppInfoMonitor.ChangedHandler) Interop.signalRegistry.get(hash);
        handler.signalReceived(new AppInfoMonitor(References.get(source)));
    }
    
}
