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
@FunctionalInterface
public interface DataForeachFunc {
    void run(org.gtk.glib.Quark keyId);

    @ApiStatus.Internal default void upcall(int keyId, MemoryAddress data, MemoryAddress userData) {
        run(new org.gtk.glib.Quark(keyId));
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(DataForeachFunc.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}
