package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Prototype of a {@code GChildWatchSource} callback, called when a child
 * process has exited.
 * <p>
 * To interpret {@code wait_status}, see the documentation
 * for g_spawn_check_wait_status(). In particular,
 * on Unix platforms, note that it is usually not equal
 * to the integer passed to {@code exit()} or returned from {@code main()}.
 */
@FunctionalInterface
public interface ChildWatchFunc {
    void run(org.gtk.glib.Pid pid, int waitStatus);

    @ApiStatus.Internal default void upcall(int pid, int waitStatus, MemoryAddress userData) {
        run(new org.gtk.glib.Pid(pid), waitStatus);
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ChildWatchFunc.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}
