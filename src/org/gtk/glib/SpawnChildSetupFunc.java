package org.gtk.glib;

@FunctionalInterface
public interface SpawnChildSetupFunc {

    /**
     * Specifies the type of the setup function passed to g_spawn_async(),
     * g_spawn_sync() and g_spawn_async_with_pipes(), which can, in very
     * limited ways, be used to affect the child's execution.
     * 
     * On POSIX platforms, the function is called in the child after GLib
     * has performed all the setup it plans to perform, but before calling
     * exec(). Actions taken in this function will only affect the child,
     * not the parent.
     * 
     * On Windows, the function is called in the parent. Its usefulness on
     * Windows is thus questionable. In many cases executing the child setup
     * function in the parent can have ill effects, and you should be very
     * careful when porting software to Windows that uses child setup
     * functions.
     * 
     * However, even on POSIX, you are extremely limited in what you can
     * safely do from a #GSpawnChildSetupFunc, because any mutexes that were
     * held by other threads in the parent process at the time of the fork()
     * will still be locked in the child process, and they will never be
     * unlocked (since the threads that held them don't exist in the child).
     * POSIX allows only async-signal-safe functions (see signal(7)) to be
     * called in the child between fork() and exec(), which drastically limits
     * the usefulness of child setup functions.
     * 
     * In particular, it is not safe to call any function which may
     * call malloc(), which includes POSIX functions such as setenv().
     * If you need to set up the child environment differently from
     * the parent, you should use g_get_environ(), g_environ_setenv(),
     * and g_environ_unsetenv(), and then pass the complete environment
     * list to the `g_spawn...` function.
     */
    public void onSpawnChildSetupFunc(jdk.incubator.foreign.MemoryAddress userData);
}