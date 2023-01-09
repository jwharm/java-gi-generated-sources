package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Prototype for shortcuts based on user callbacks.
 */
/**
 * Functional interface declaration of the {@code ShortcutFunc} callback.
 */
@FunctionalInterface
public interface ShortcutFunc {

    /**
     * Prototype for shortcuts based on user callbacks.
     */
    boolean run(org.gtk.gtk.Widget widget, @Nullable org.gtk.glib.Variant args);
    
    @ApiStatus.Internal default int upcall(MemoryAddress widget, MemoryAddress args, MemoryAddress userData) {
        var RESULT = run((org.gtk.gtk.Widget) Interop.register(widget, org.gtk.gtk.Widget.fromAddress).marshal(widget, null), org.gtk.glib.Variant.fromAddress.marshal(args, null));
        return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ShortcutFunc.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}
