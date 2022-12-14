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
/**
 * Functional interface declaration of the {@code ChildWatchFunc} callback.
 */
@FunctionalInterface
public interface ChildWatchFunc {

    /**
     * Prototype of a {@code GChildWatchSource} callback, called when a child
     * process has exited.
     * <p>
     * To interpret {@code wait_status}, see the documentation
     * for g_spawn_check_wait_status(). In particular,
     * on Unix platforms, note that it is usually not equal
     * to the integer passed to {@code exit()} or returned from {@code main()}.
     */
    void run(org.gtk.glib.Pid pid, int waitStatus);
    
    @ApiStatus.Internal default void upcall(int pid, int waitStatus, MemoryAddress userData) {
        run(new org.gtk.glib.Pid(pid), waitStatus);
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ChildWatchFunc.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}
