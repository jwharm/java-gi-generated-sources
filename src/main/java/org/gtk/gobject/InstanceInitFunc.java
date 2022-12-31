package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A callback function used by the type system to initialize a new
 * instance of a type.
 * <p>
 * This function initializes all instance members and allocates any resources
 * required by it.
 * <p>
 * Initialization of a derived instance involves calling all its parent
 * types instance initializers, so the class member of the instance
 * is altered during its initialization to always point to the class that
 * belongs to the type the current initializer was introduced for.
 * <p>
 * The extended members of {@code instance} are guaranteed to have been filled with
 * zeros before this function is called.
 */
@FunctionalInterface
public interface InstanceInitFunc {
    void run(org.gtk.gobject.TypeInstance instance, org.gtk.gobject.TypeClass gClass);

    @ApiStatus.Internal default void upcall(MemoryAddress instance, MemoryAddress gClass) {
        run(org.gtk.gobject.TypeInstance.fromAddress.marshal(instance, Ownership.NONE), org.gtk.gobject.TypeClass.fromAddress.marshal(gClass, Ownership.NONE));
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(InstanceInitFunc.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}
