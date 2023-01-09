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
/**
 * Functional interface declaration of the {@code DesktopAppLaunchCallback} callback.
 */
@FunctionalInterface
public interface DesktopAppLaunchCallback {

    /**
     * During invocation, g_desktop_app_info_launch_uris_as_manager() may
     * create one or more child processes.  This callback is invoked once
     * for each, providing the process ID.
     */
    void run(org.gtk.gio.DesktopAppInfo appinfo, org.gtk.glib.Pid pid);
    
    @ApiStatus.Internal default void upcall(MemoryAddress appinfo, int pid, MemoryAddress userData) {
        run((org.gtk.gio.DesktopAppInfo) Interop.register(appinfo, org.gtk.gio.DesktopAppInfo.fromAddress).marshal(appinfo, null), new org.gtk.glib.Pid(pid));
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), DesktopAppLaunchCallback.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}
