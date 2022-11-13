package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The {@code GMainLoop} struct is an opaque data type
 * representing the main event loop of a GLib or GTK+ application.
 */
public class MainLoop extends io.github.jwharm.javagi.ProxyBase {
    
    static {
        GLib.javagi$ensureInitialized();
    }
    
    private static final java.lang.String C_TYPE_NAME = "GMainLoop";
    
    /**
     * Memory layout of the native struct is unknown.
     * @return always {@code Interop.valueLayout.ADDRESS}
     */
    @ApiStatus.Internal
    public static MemoryLayout getMemoryLayout() {
        return Interop.valueLayout.ADDRESS;
    }
    
    private MemorySegment allocatedMemorySegment;
    
    public static MainLoop allocate() {
        MemorySegment segment = Interop.getAllocator().allocate(getMemoryLayout());
        MainLoop newInstance = new MainLoop(segment.address(), Ownership.NONE);
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a MainLoop proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     * @param ownership The ownership indicator used for ref-counted objects
     */
    @ApiStatus.Internal
    public MainLoop(Addressable address, Ownership ownership) {
        super(address, ownership);
    }
    
    private static Addressable constructNew(@Nullable org.gtk.glib.MainContext context, boolean isRunning) {
        Addressable RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_main_loop_new.invokeExact(
                    (Addressable) (context == null ? MemoryAddress.NULL : context.handle()),
                    isRunning ? 1 : 0);
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT;
    }
    
    /**
     * Creates a new {@link MainLoop} structure.
     * @param context a {@link MainContext}  (if {@code null}, the default context will be used).
     * @param isRunning set to {@code true} to indicate that the loop is running. This
     * is not very important since calling g_main_loop_run() will set this to
     * {@code true} anyway.
     */
    public MainLoop(@Nullable org.gtk.glib.MainContext context, boolean isRunning) {
        super(constructNew(context, isRunning), Ownership.FULL);
    }
    
    /**
     * Returns the {@link MainContext} of {@code loop}.
     * @return the {@link MainContext} of {@code loop}
     */
    public @NotNull org.gtk.glib.MainContext getContext() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_main_loop_get_context.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.MainContext(RESULT, Ownership.NONE);
    }
    
    /**
     * Checks to see if the main loop is currently being run via g_main_loop_run().
     * @return {@code true} if the mainloop is currently being run.
     */
    public boolean isRunning() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_main_loop_is_running.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return RESULT != 0;
    }
    
    /**
     * Stops a {@link MainLoop} from running. Any calls to g_main_loop_run()
     * for the loop will return.
     * <p>
     * Note that sources that have already been dispatched when
     * g_main_loop_quit() is called will still be executed.
     */
    public void quit() {
        try {
            DowncallHandles.g_main_loop_quit.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Increases the reference count on a {@link MainLoop} object by one.
     * @return {@code loop}
     */
    public @NotNull org.gtk.glib.MainLoop ref() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_main_loop_ref.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return new org.gtk.glib.MainLoop(RESULT, Ownership.FULL);
    }
    
    /**
     * Runs a main loop until g_main_loop_quit() is called on the loop.
     * If this is called for the thread of the loop's {@link MainContext},
     * it will process events from the loop, otherwise it will
     * simply wait.
     */
    public void run() {
        try {
            DowncallHandles.g_main_loop_run.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Decreases the reference count on a {@link MainLoop} object by one. If
     * the result is zero, free the loop and free all associated memory.
     */
    public void unref() {
        try {
            DowncallHandles.g_main_loop_unref.invokeExact(
                    handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_main_loop_new = Interop.downcallHandle(
            "g_main_loop_new",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS, ValueLayout.JAVA_INT),
            false
        );
        
        private static final MethodHandle g_main_loop_get_context = Interop.downcallHandle(
            "g_main_loop_get_context",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_main_loop_is_running = Interop.downcallHandle(
            "g_main_loop_is_running",
            FunctionDescriptor.of(ValueLayout.JAVA_INT, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_main_loop_quit = Interop.downcallHandle(
            "g_main_loop_quit",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_main_loop_ref = Interop.downcallHandle(
            "g_main_loop_ref",
            FunctionDescriptor.of(ValueLayout.ADDRESS, ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_main_loop_run = Interop.downcallHandle(
            "g_main_loop_run",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS),
            false
        );
        
        private static final MethodHandle g_main_loop_unref = Interop.downcallHandle(
            "g_main_loop_unref",
            FunctionDescriptor.ofVoid(ValueLayout.ADDRESS),
            false
        );
    }
}
