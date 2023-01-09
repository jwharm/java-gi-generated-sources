package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Specifies the type of function passed to g_dataset_foreach(). It is
 * called with each {@link Quark} id and associated data element, together
 * with the {@code user_data} parameter supplied to g_dataset_foreach().
 */
/**
 * Functional interface declaration of the {@code DataForeachFunc} callback.
 */
@FunctionalInterface
public interface DataForeachFunc {

    /**
     * Specifies the type of function passed to g_dataset_foreach(). It is
     * called with each {@link Quark} id and associated data element, together
     * with the {@code user_data} parameter supplied to g_dataset_foreach().
     */
    void run(org.gtk.glib.Quark keyId);
    
    @ApiStatus.Internal default void upcall(int keyId, MemoryAddress data, MemoryAddress userData) {
        run(new org.gtk.glib.Quark(keyId));
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), DataForeachFunc.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}
