package org.gtk.glib;

import org.gtk.gobject.*;
import io.github.jwharm.javagi.interop.jextract.gtk_h;
import static io.github.jwharm.javagi.interop.jextract.gtk_h.C_INT;
import io.github.jwharm.javagi.*;
import jdk.incubator.foreign.*;
import java.lang.invoke.*;

/**
 * The {@link Thread} struct represents a running thread. This struct
 * is returned by g_thread_new() or g_thread_try_new(). You can
 * obtain the {@link Thread} struct representing the current thread by
 * calling g_thread_self().
 * <p>
 * GThread is refcounted, see g_thread_ref() and g_thread_unref().
 * The thread represented by it holds a reference while it is running,
 * and g_thread_join() consumes the reference that it is given, so
 * it is normally not necessary to manage GThread references
 * explicitly.
 * <p>
 * The structure is opaque -- none of its fields may be directly
 * accessed.
 */
public class Thread extends io.github.jwharm.javagi.ResourceBase {

    public Thread(io.github.jwharm.javagi.Reference reference) {
        super(reference);
    }
    
    private static Reference constructNew(java.lang.String name, ThreadFunc func) {
        try {
            Reference RESULT = References.get(gtk_h.g_thread_new(Interop.allocateNativeString(name).handle(), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbThreadFunc",
                            MethodType.methodType(MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(func.hashCode(), func))), true);
            return RESULT;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * This function creates a new thread. The new thread starts by invoking
     * {@code func} with the argument data. The thread will run until {@code func} returns
     * or until g_thread_exit() is called from the new thread. The return value
     * of {@code func} becomes the return value of the thread, which can be obtained
     * with g_thread_join().
     * <p>
     * The {@code name} can be useful for discriminating threads in a debugger.
     * It is not used for other purposes and does not have to be unique.
     * Some systems restrict the length of {@code name} to 16 bytes.
     * <p>
     * If the thread can not be created the program aborts. See
     * g_thread_try_new() if you want to attempt to deal with failures.
     * <p>
     * If you are using threads to offload (potentially many) short-lived tasks,
     * {@link ThreadPool} may be more appropriate than manually spawning and tracking
     * multiple {@code GThreads}.
     * <p>
     * To free the struct returned by this function, use g_thread_unref().
     * Note that g_thread_join() implicitly unrefs the {@link Thread} as well.
     * <p>
     * New threads by default inherit their scheduler policy (POSIX) or thread
     * priority (Windows) of the thread creating the new thread.
     * <p>
     * This behaviour changed in GLib 2.64: before threads on Windows were not
     * inheriting the thread priority but were spawned with the default priority.
     * Starting with GLib 2.64 the behaviour is now consistent between Windows and
     * POSIX and all threads inherit their parent thread's priority.
     */
    public Thread(java.lang.String name, ThreadFunc func) {
        super(constructNew(name, func));
    }
    
    private static Reference constructTryNew(java.lang.String name, ThreadFunc func) throws GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(ValueLayout.ADDRESS);
        try {
            Reference RESULT = References.get(gtk_h.g_thread_try_new(Interop.allocateNativeString(name).handle(), 
                    CLinker.systemCLinker().upcallStub(
                        MethodHandles.lookup().findStatic(JVMCallbacks.class, "cbThreadFunc",
                            MethodType.methodType(MemoryAddress.class, MemoryAddress.class)),
                        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
                        Interop.getScope()), 
                    Interop.getAllocator().allocate(C_INT, Interop.registerCallback(func.hashCode(), func)), GERROR), true);
            if (GErrorException.isErrorSet(GERROR)) {
                throw new GErrorException(GERROR);
            }
            return RESULT;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
    /**
     * This function is the same as g_thread_new() except that
     * it allows for the possibility of failure.
     * <p>
     * If a thread can not be created (due to resource limits),
     * {@code error} is set and <code>null</code> is returned.
     */
    public static Thread tryNew(java.lang.String name, ThreadFunc func) throws GErrorException {
        return new Thread(constructTryNew(name, func));
    }
    
    /**
     * Waits until {@code thread} finishes, i.e. the function {@code func}, as
     * given to g_thread_new(), returns or g_thread_exit() is called.
     * If {@code thread} has already terminated, then g_thread_join()
     * returns immediately.
     * <p>
     * Any thread can wait for any other thread by calling g_thread_join(),
     * not just its 'creator'. Calling g_thread_join() from multiple threads
     * for the same {@code thread} leads to undefined behaviour.
     * <p>
     * The value returned by {@code func} or given to g_thread_exit() is
     * returned by this function.
     * <p>
     * g_thread_join() consumes the reference to the passed-in {@code thread}.
     * This will usually cause the {@link Thread} struct and associated resources
     * to be freed. Use g_thread_ref() to obtain an extra reference if you
     * want to keep the GThread alive beyond the g_thread_join() call.
     */
    public jdk.incubator.foreign.MemoryAddress join() {
        var RESULT = gtk_h.g_thread_join(handle());
        return RESULT;
    }
    
    /**
     * Increase the reference count on {@code thread}.
     */
    public Thread ref() {
        var RESULT = gtk_h.g_thread_ref(handle());
        return new Thread(References.get(RESULT, true));
    }
    
    /**
     * Decrease the reference count on {@code thread}, possibly freeing all
     * resources associated with it.
     * <p>
     * Note that each thread holds a reference to its {@link Thread} while
     * it is running, so it is safe to drop your own reference to it
     * if you don't need it anymore.
     */
    public void unref() {
        gtk_h.g_thread_unref(handle());
    }
    
    public static Quark errorQuark() {
        var RESULT = gtk_h.g_thread_error_quark();
        return new Quark(RESULT);
    }
    
    /**
     * Terminates the current thread.
     * <p>
     * If another thread is waiting for us using g_thread_join() then the
     * waiting thread will be woken up and get {@code retval} as the return value
     * of g_thread_join().
     * <p>
     * Calling g_thread_exit() with a parameter {@code retval} is equivalent to
     * returning {@code retval} from the function {@code func}, as given to g_thread_new().
     * <p>
     * You must only call g_thread_exit() from a thread that you created
     * yourself with g_thread_new() or related APIs. You must not call
     * this function from a thread created with another threading library
     * or or from within a {@link ThreadPool}.
     */
    public static void exit(jdk.incubator.foreign.MemoryAddress retval) {
        gtk_h.g_thread_exit(retval);
    }
    
    /**
     * This function returns the {@link Thread} corresponding to the
     * current thread. Note that this function does not increase
     * the reference count of the returned struct.
     * <p>
     * This function will return a {@link Thread} even for threads that
     * were not created by GLib (i.e. those created by other threading
     * APIs). This may be useful for thread identification purposes
     * (i.e. comparisons) but you must not use GLib functions (such
     * as g_thread_join()) on these threads.
     */
    public static Thread self() {
        var RESULT = gtk_h.g_thread_self();
        return new Thread(References.get(RESULT, false));
    }
    
    /**
     * Causes the calling thread to voluntarily relinquish the CPU, so
     * that other threads can run.
     * <p>
     * This function is often used as a method to make busy wait less evil.
     */
    public static void yield() {
        gtk_h.g_thread_yield();
    }
    
}
