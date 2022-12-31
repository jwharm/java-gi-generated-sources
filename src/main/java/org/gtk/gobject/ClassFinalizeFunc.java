package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A callback function used by the type system to finalize a class.
 * <p>
 * This function is rarely needed, as dynamically allocated class resources
 * should be handled by GBaseInitFunc() and GBaseFinalizeFunc().
 * <p>
 * Also, specification of a GClassFinalizeFunc() in the {@link TypeInfo}
 * structure of a static type is invalid, because classes of static types
 * will never be finalized (they are artificially kept alive when their
 * reference count drops to zero).
 */
@FunctionalInterface
public interface ClassFinalizeFunc {
    void run(org.gtk.gobject.TypeClass gClass);

    @ApiStatus.Internal default void upcall(MemoryAddress gClass, MemoryAddress classData) {
        run(org.gtk.gobject.TypeClass.fromAddress.marshal(gClass, Ownership.NONE));
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(ClassFinalizeFunc.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}
