package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

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
public class Thread extends Struct {
    
    static {
        GLib.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GThread";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    /**
     * Allocate a new {@link Thread}
     * @return A new, uninitialized @{link Thread}
     */
    public static Thread allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        Thread newInstance = new Thread(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a Thread proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    protected Thread(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    @ApiStatus.Internal
    public static final Marshal<Addressable, Thread> fromAddress = (input, ownership) -> input.equals(MemoryAddress.NULL) ? null : new Thread(input, ownership);
    
    private static MemoryAddress constructNew(@Nullable java.lang.String name, org.gtk.glib.ThreadFunc func) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_thread_new.invokeExact(
                    (Addressable) (name == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(name, null)),
                    (Addressable) func.toCallback(),
                    (Addressable) MemoryAddress.NULL);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
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
     * @param name an (optional) name for the new thread
     * @param func a function to execute in the new thread
     */
    public Thread(@Nullable java.lang.String name, org.gtk.glib.ThreadFunc func) {
        super(constructNew(name, func), Ownership.FULL);
    }
    
    private static MemoryAddress constructTryNew(@Nullable java.lang.String name, org.gtk.glib.ThreadFunc func) throws GErrorException {
        MemorySegment GERROR = Interop.getAllocator().allocate(Interop.valueLayout.ADDRESS);
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_thread_try_new.invokeExact(
                    (Addressable) (name == null ? MemoryAddress.NULL : Marshal.stringToAddress.marshal(name, null)),
                    (Addressable) func.toCallback(),
                    (Addressable) MemoryAddress.NULL,
                    (Addressable) GERROR);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        if (GErrorException.isErrorSet(GERROR)) {
            throw new GErrorException(GERROR);
        }
        return RESULT;
    }
    
    /**
     * This function is the same as g_thread_new() except that
     * it allows for the possibility of failure.
     * <p>
     * If a thread can not be created (due to resource limits),
     * {@code error} is set and {@code null} is returned.
     * @param name an (optional) name for the new thread
     * @param func a function to execute in the new thread
     * @return the new {@link Thread}, or {@code null} if an error occurred
     * @throws GErrorException See {@link org.gtk.glib.Error}
     */
    public static Thread tryNew(@Nullable java.lang.String name, org.gtk.glib.ThreadFunc func) throws GErrorException {
        var RESULT = constructTryNew(name, func);
        return org.gtk.glib.Thread.fromAddress.marshal(RESULT, Ownership.FULL);
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
     * @return the return value of the thread
     */
    public @Nullable java.lang.foreign.MemoryAddress join() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_thread_join.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        this.yieldOwnership();
        return RESULT;
    }
    
    /**
     * Increase the reference count on {@code thread}.
     * @return a new reference to {@code thread}
     */
    public org.gtk.glib.Thread ref() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_thread_ref.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.Thread.fromAddress.marshal(RESULT, Ownership.FULL);
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
        try {
            DowncallHandles.g_thread_unref.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        this.yieldOwnership();
    }
    
    public static org.gtk.glib.Quark errorQuark() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_thread_error_quark.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.Quark(RESULT);
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
     * @param retval the return value of this thread
     */
    public static void exit(@Nullable java.lang.foreign.MemoryAddress retval) {
        try {
            DowncallHandles.g_thread_exit.invokeExact(
                    (Addressable) (retval == null ? MemoryAddress.NULL : (Addressable) retval));
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
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
     * @return the {@link Thread} representing the current thread
     */
    public static org.gtk.glib.Thread self() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_thread_self.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.Thread.fromAddress.marshal(RESULT, Ownership.NONE);
    }
    
    /**
     * Causes the calling thread to voluntarily relinquish the CPU, so
     * that other threads can run.
     * <p>
     * This function is often used as a method to make busy wait less evil.
     */
    public static void yield() {
        try {
            DowncallHandles.g_thread_yield.invokeExact();
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_thread_new = Interop.downcallHandle(
            "g_thread_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_thread_try_new = Interop.downcallHandle(
            "g_thread_try_new",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_thread_join = Interop.downcallHandle(
            "g_thread_join",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_thread_ref = Interop.downcallHandle(
            "g_thread_ref",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_thread_unref = Interop.downcallHandle(
            "g_thread_unref",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_thread_error_quark = Interop.downcallHandle(
            "g_thread_error_quark",
            FunctionDescriptor.of(Interop.valueLayout.C_INT),
            false
        );
        
        private static final MethodHandle g_thread_exit = Interop.downcallHandle(
            "g_thread_exit",
            FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_thread_self = Interop.downcallHandle(
            "g_thread_self",
            FunctionDescriptor.of(Interop.valueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_thread_yield = Interop.downcallHandle(
            "g_thread_yield",
            FunctionDescriptor.ofVoid(),
            false
        );
    }
}
