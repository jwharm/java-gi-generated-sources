package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Queries a widget for its preferred size request mode.
 */
/**
 * Functional interface declaration of the {@code CustomRequestModeFunc} callback.
 */
@FunctionalInterface
public interface CustomRequestModeFunc {

    /**
     * Queries a widget for its preferred size request mode.
     */
    org.gtk.gtk.SizeRequestMode run(org.gtk.gtk.Widget widget);
    
    @ApiStatus.Internal default int upcall(MemoryAddress widget) {
        var RESULT = run((org.gtk.gtk.Widget) Interop.register(widget, org.gtk.gtk.Widget.fromAddress).marshal(widget, null));
        return RESULT.getValue();
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), CustomRequestModeFunc.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}
