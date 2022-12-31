package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A callback function used by the type system to do base initialization
 * of the class structures of derived types.
 * <p>
 * This function is called as part of the initialization process of all derived
 * classes and should reallocate or reset all dynamic class members copied over
 * from the parent class.
 * <p>
 * For example, class members (such as strings) that are not sufficiently
 * handled by a plain memory copy of the parent class into the derived class
 * have to be altered. See GClassInitFunc() for a discussion of the class
 * initialization process.
 */
@FunctionalInterface
public interface BaseInitFunc {
    void run(org.gtk.gobject.TypeClass gClass);

    @ApiStatus.Internal default void upcall(MemoryAddress gClass) {
        run(org.gtk.gobject.TypeClass.fromAddress.marshal(gClass, Ownership.NONE));
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(BaseInitFunc.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}
