package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The {@code GMainLoop} struct is an opaque data type
 * representing the main event loop of a GLib or GTK+ application.
 */
public class MainLoop extends Struct {
    
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
    
    /**
     * Allocate a new {@link MainLoop}
     * @return A new, uninitialized @{link MainLoop}
     */
    public static MainLoop allocate() {
        MemorySegment segment = MemorySession.openImplicit().allocate(getMemoryLayout());
        MainLoop newInstance = new MainLoop(segment.address());
        newInstance.allocatedMemorySegment = segment;
        return newInstance;
    }
    
    /**
     * Create a MainLoop proxy instance for the provided memory address.
     * @param address   The memory address of the native object
     */
    protected MainLoop(Addressable address) {
        super(address);
    }
    
    /**
     * The marshal function from a native memory address to a Java proxy instance
     */
    @ApiStatus.Internal
    public static final Marshal<Addressable, MainLoop> fromAddress = (input, scope) -> input.equals(MemoryAddress.NULL) ? null : new MainLoop(input);
    
    private static MemoryAddress constructNew(@Nullable org.gtk.glib.MainContext context, boolean isRunning) {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_main_loop_new.invokeExact(
                    (Addressable) (context == null ? MemoryAddress.NULL : context.handle()),
                    Marshal.booleanToInteger.marshal(isRunning, null).intValue());
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
        super(constructNew(context, isRunning));
        this.takeOwnership();
    }
    
    /**
     * Returns the {@link MainContext} of {@code loop}.
     * @return the {@link MainContext} of {@code loop}
     */
    public org.gtk.glib.MainContext getContext() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_main_loop_get_context.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return org.gtk.glib.MainContext.fromAddress.marshal(RESULT, null);
    }
    
    /**
     * Checks to see if the main loop is currently being run via g_main_loop_run().
     * @return {@code true} if the mainloop is currently being run.
     */
    public boolean isRunning() {
        int RESULT;
        try {
            RESULT = (int) DowncallHandles.g_main_loop_is_running.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        return Marshal.integerToBoolean.marshal(RESULT, null).booleanValue();
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
            DowncallHandles.g_main_loop_quit.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    /**
     * Increases the reference count on a {@link MainLoop} object by one.
     * @return {@code loop}
     */
    public org.gtk.glib.MainLoop ref() {
        MemoryAddress RESULT;
        try {
            RESULT = (MemoryAddress) DowncallHandles.g_main_loop_ref.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
        var OBJECT = org.gtk.glib.MainLoop.fromAddress.marshal(RESULT, null);
        OBJECT.takeOwnership();
        return OBJECT;
    }
    
    /**
     * Runs a main loop until g_main_loop_quit() is called on the loop.
     * If this is called for the thread of the loop's {@link MainContext},
     * it will process events from the loop, otherwise it will
     * simply wait.
     */
    public void run() {
        try {
            DowncallHandles.g_main_loop_run.invokeExact(handle());
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
            DowncallHandles.g_main_loop_unref.invokeExact(handle());
        } catch (Throwable ERR) {
            throw new AssertionError("Unexpected exception occured: ", ERR);
        }
    }
    
    private static class DowncallHandles {
        
        private static final MethodHandle g_main_loop_new = Interop.downcallHandle(
                "g_main_loop_new",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT),
                false
        );
        
        private static final MethodHandle g_main_loop_get_context = Interop.downcallHandle(
                "g_main_loop_get_context",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_main_loop_is_running = Interop.downcallHandle(
                "g_main_loop_is_running",
                FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_main_loop_quit = Interop.downcallHandle(
                "g_main_loop_quit",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_main_loop_ref = Interop.downcallHandle(
                "g_main_loop_ref",
                FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_main_loop_run = Interop.downcallHandle(
                "g_main_loop_run",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
        
        private static final MethodHandle g_main_loop_unref = Interop.downcallHandle(
                "g_main_loop_unref",
                FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS),
                false
        );
    }
}
