package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The {@code GMainLoop} struct is an opaque data type
 * representing the main event loop of a GLib or GTK+ application.
 */
public class MainLoop extends io.github.jwharm.javagi.ResourceBase {

    public MainLoop(io.github.jwharm.javagi.Refcounted ref) {
        super(ref);
    }
    
    private static final MethodHandle g_main_loop_new = Interop.downcallHandle(
        "g_main_loop_new",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT)
    );
    
    private static Refcounted constructNew(@Nullable MainContext context, @NotNull boolean isRunning) {
        try {
            Refcounted RESULT = Refcounted.get((MemoryAddress) g_main_loop_new.invokeExact(context.handle(), isRunning ? 1 : 0), true);
            return RESULT;
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Creates a new {@link MainLoop} structure.
     */
    public MainLoop(@Nullable MainContext context, @NotNull boolean isRunning) {
        super(constructNew(context, isRunning));
    }
    
    private static final MethodHandle g_main_loop_get_context = Interop.downcallHandle(
        "g_main_loop_get_context",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Returns the {@link MainContext} of {@code loop}.
     */
    public @NotNull MainContext getContext() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_main_loop_get_context.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new MainContext(Refcounted.get(RESULT, false));
    }
    
    private static final MethodHandle g_main_loop_is_running = Interop.downcallHandle(
        "g_main_loop_is_running",
        FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS)
    );
    
    /**
     * Checks to see if the main loop is currently being run via g_main_loop_run().
     */
    public boolean isRunning() {
        int RESULT;
        try {
            RESULT = (int) g_main_loop_is_running.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    private static final MethodHandle g_main_loop_quit = Interop.downcallHandle(
        "g_main_loop_quit",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Stops a {@link MainLoop} from running. Any calls to g_main_loop_run()
     * for the loop will return.
     * <p>
     * Note that sources that have already been dispatched when
     * g_main_loop_quit() is called will still be executed.
     */
    public @NotNull void quit() {
        try {
            g_main_loop_quit.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_main_loop_ref = Interop.downcallHandle(
        "g_main_loop_ref",
        FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS)
    );
    
    /**
     * Increases the reference count on a {@link MainLoop} object by one.
     */
    public @NotNull MainLoop ref() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) g_main_loop_ref.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new MainLoop(Refcounted.get(RESULT, true));
    }
    
    private static final MethodHandle g_main_loop_run = Interop.downcallHandle(
        "g_main_loop_run",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Runs a main loop until g_main_loop_quit() is called on the loop.
     * If this is called for the thread of the loop's {@link MainContext},
     * it will process events from the loop, otherwise it will
     * simply wait.
     */
    public @NotNull void run() {
        try {
            g_main_loop_run.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static final MethodHandle g_main_loop_unref = Interop.downcallHandle(
        "g_main_loop_unref",
        FunctionDescriptor.ofVoid(ValueLayout.ADDRESS)
    );
    
    /**
     * Decreases the reference count on a {@link MainLoop} object by one. If
     * the result is zero, free the loop and free all associated memory.
     */
    public @NotNull void unref() {
        try {
            g_main_loop_unref.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
}
