package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A function to be used by {@code GtkCustomLayout} to allocate a widget.
 */
/**
 * Functional interface declaration of the {@code CustomAllocateFunc} callback.
 */
@FunctionalInterface
public interface CustomAllocateFunc {

    /**
     * A function to be used by {@code GtkCustomLayout} to allocate a widget.
     */
    void run(org.gtk.gtk.Widget widget, int width, int height, int baseline);
    
    @ApiStatus.Internal default void upcall(MemoryAddress widget, int width, int height, int baseline) {
        run((org.gtk.gtk.Widget) Interop.register(widget, org.gtk.gtk.Widget.fromAddress).marshal(widget, null), width, height, baseline);
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.C_INT);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), CustomAllocateFunc.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}
