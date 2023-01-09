package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Callback type for adding a function to update animations. See gtk_widget_add_tick_callback().
 */
/**
 * Functional interface declaration of the {@code TickCallback} callback.
 */
@FunctionalInterface
public interface TickCallback {

    /**
     * Callback type for adding a function to update animations. See gtk_widget_add_tick_callback().
     */
    boolean run(org.gtk.gtk.Widget widget, org.gtk.gdk.FrameClock frameClock);
    
    @ApiStatus.Internal default int upcall(MemoryAddress widget, MemoryAddress frameClock, MemoryAddress userData) {
        var RESULT = run((org.gtk.gtk.Widget) Interop.register(widget, org.gtk.gtk.Widget.fromAddress).marshal(widget, null), (org.gtk.gdk.FrameClock) Interop.register(frameClock, org.gtk.gdk.FrameClock.fromAddress).marshal(frameClock, null));
        return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), TickCallback.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}
