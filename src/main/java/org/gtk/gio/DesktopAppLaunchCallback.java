package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * During invocation, g_desktop_app_info_launch_uris_as_manager() may
 * create one or more child processes.  This callback is invoked once
 * for each, providing the process ID.
 */
@FunctionalInterface
public interface DesktopAppLaunchCallback {
    void run(org.gtk.gio.DesktopAppInfo appinfo, org.gtk.glib.Pid pid);

    @ApiStatus.Internal default void upcall(MemoryAddress appinfo, int pid, MemoryAddress userData) {
        run((org.gtk.gio.DesktopAppInfo) java.util.Objects.requireNonNullElse(Interop.typeRegister.get(Interop.getType(appinfo)), org.gtk.gio.DesktopAppInfo.fromAddress).marshal(appinfo, Ownership.NONE), new org.gtk.glib.Pid(pid));
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(DesktopAppLaunchCallback.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}
