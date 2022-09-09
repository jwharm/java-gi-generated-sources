package org.gtk.gio;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.interop.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * #GAppInfoMonitor is a very simple object used for monitoring the app
 * info database for changes (ie: newly installed or removed
 * applications).
 * 
 * Call g_app_info_monitor_get() to get a #GAppInfoMonitor and connect
 * to the "changed" signal.
 * 
 * In the usual case, applications should try to make note of the change
 * (doing things like invalidating caches) but not act on it.  In
 * particular, applications should avoid making calls to #GAppInfo APIs
 * in response to the change signal, deferring these until the time that
 * the data is actually required.  The exception to this case is when
 * application information is actually being displayed on the screen
 * (eg: during a search or when the list of all applications is shown).
 * The reason for this is that changes to the list of installed
 * applications often come in groups (like during system updates) and
 * rescanning the list on every change is pointless and expensive.
 */
public class AppInfoMonitor extends org.gtk.gobject.Object {

    public AppInfoMonitor(io.github.jwharm.javagi.interop.Reference reference) {
        super(reference);
    }
    
    /** Cast object to AppInfoMonitor */
    public static AppInfoMonitor castFrom(org.gtk.gobject.Object gobject) {
        return new AppInfoMonitor(gobject.getReference());
    }
    
    /**
     * Gets the #GAppInfoMonitor for the current thread-default main
     * context.
     * 
     * The #GAppInfoMonitor will emit a "changed" signal in the
     * thread-default main context whenever the list of installed
     * applications (as reported by g_app_info_get_all()) may have changed.
     * 
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
    public void onChanged(ChangedHandler handler) {
        try {
            int hash = handler.hashCode();
            JVMCallbacks.signalRegistry.put(hash, handler);
            MemorySegment intSegment = Interop.getAllocator().allocate(C_INT, hash);
            MethodType methodType = MethodType.methodType(void.class, MemoryAddress.class, MemoryAddress.class);
            MethodHandle methodHandle = MethodHandles.lookup().findStatic(JVMCallbacks.class, "signalAppInfoMonitorChanged", methodType);
            FunctionDescriptor descriptor = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.ADDRESS);
            NativeSymbol nativeSymbol = CLinker.systemCLinker().upcallStub(methodHandle, descriptor, Interop.getScope());
            gtk_h.g_signal_connect_data(this.handle(), Interop.allocateNativeString("changed").handle(), nativeSymbol, intSegment, MemoryAddress.NULL, 0);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
