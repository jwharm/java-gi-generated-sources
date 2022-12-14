package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Specifies the type of the setup function passed to g_spawn_async(),
 * g_spawn_sync() and g_spawn_async_with_pipes(), which can, in very
 * limited ways, be used to affect the child's execution.
 * <p>
 * On POSIX platforms, the function is called in the child after GLib
 * has performed all the setup it plans to perform, but before calling
 * exec(). Actions taken in this function will only affect the child,
 * not the parent.
 * <p>
 * On Windows, the function is called in the parent. Its usefulness on
 * Windows is thus questionable. In many cases executing the child setup
 * function in the parent can have ill effects, and you should be very
 * careful when porting software to Windows that uses child setup
 * functions.
 * <p>
 * However, even on POSIX, you are extremely limited in what you can
 * safely do from a {@link SpawnChildSetupFunc}, because any mutexes that were
 * held by other threads in the parent process at the time of the fork()
 * will still be locked in the child process, and they will never be
 * unlocked (since the threads that held them don't exist in the child).
 * POSIX allows only async-signal-safe functions (see signal(7)) to be
 * called in the child between fork() and exec(), which drastically limits
 * the usefulness of child setup functions.
 * <p>
 * In particular, it is not safe to call any function which may
 * call malloc(), which includes POSIX functions such as setenv().
 * If you need to set up the child environment differently from
 * the parent, you should use g_get_environ(), g_environ_setenv(),
 * and g_environ_unsetenv(), and then pass the complete environment
 * list to the {@code g_spawn...} function.
 */
/**
 * Functional interface declaration of the {@code SpawnChildSetupFunc} callback.
 */
@FunctionalInterface
public interface SpawnChildSetupFunc {

    /**
     * Specifies the type of the setup function passed to g_spawn_async(),
     * g_spawn_sync() and g_spawn_async_with_pipes(), which can, in very
     * limited ways, be used to affect the child's execution.
     * <p>
     * On POSIX platforms, the function is called in the child after GLib
     * has performed all the setup it plans to perform, but before calling
     * exec(). Actions taken in this function will only affect the child,
     * not the parent.
     * <p>
     * On Windows, the function is called in the parent. Its usefulness on
     * Windows is thus questionable. In many cases executing the child setup
     * function in the parent can have ill effects, and you should be very
     * careful when porting software to Windows that uses child setup
     * functions.
     * <p>
     * However, even on POSIX, you are extremely limited in what you can
     * safely do from a {@link SpawnChildSetupFunc}, because any mutexes that were
     * held by other threads in the parent process at the time of the fork()
     * will still be locked in the child process, and they will never be
     * unlocked (since the threads that held them don't exist in the child).
     * POSIX allows only async-signal-safe functions (see signal(7)) to be
     * called in the child between fork() and exec(), which drastically limits
     * the usefulness of child setup functions.
     * <p>
     * In particular, it is not safe to call any function which may
     * call malloc(), which includes POSIX functions such as setenv().
     * If you need to set up the child environment differently from
     * the parent, you should use g_get_environ(), g_environ_setenv(),
     * and g_environ_unsetenv(), and then pass the complete environment
     * list to the {@code g_spawn...} function.
     */
    void run();
    
    @ApiStatus.Internal default void upcall(MemoryAddress userData) {
        run();
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), SpawnChildSetupFunc.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}
