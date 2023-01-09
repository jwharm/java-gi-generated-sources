package org.gtk.gio;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * This is the function type of the callback used for the {@link org.gtk.glib.Source}
 * returned by g_cancellable_source_new().
 * @version 2.28
 */
/**
 * Functional interface declaration of the {@code CancellableSourceFunc} callback.
 */
@FunctionalInterface
public interface CancellableSourceFunc {

    /**
     * This is the function type of the callback used for the {@link org.gtk.glib.Source}
     * returned by g_cancellable_source_new().
     * @version 2.28
     */
    boolean run(@Nullable org.gtk.gio.Cancellable cancellable);
    
    @ApiStatus.Internal default int upcall(MemoryAddress cancellable, MemoryAddress userData) {
        var RESULT = run((org.gtk.gio.Cancellable) Interop.register(cancellable, org.gtk.gio.Cancellable.fromAddress).marshal(cancellable, null));
        return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), CancellableSourceFunc.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}
