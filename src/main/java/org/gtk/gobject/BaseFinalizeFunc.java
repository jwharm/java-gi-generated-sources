package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A callback function used by the type system to finalize those portions
 * of a derived types class structure that were setup from the corresponding
 * GBaseInitFunc() function.
 * <p>
 * Class finalization basically works the inverse way in which class
 * initialization is performed.
 * <p>
 * See GClassInitFunc() for a discussion of the class initialization process.
 */
@FunctionalInterface
public interface BaseFinalizeFunc {
    void run(org.gtk.gobject.TypeClass gClass);

    @ApiStatus.Internal default void upcall(MemoryAddress gClass) {
        run(org.gtk.gobject.TypeClass.fromAddress.marshal(gClass, Ownership.NONE));
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(BaseFinalizeFunc.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}
