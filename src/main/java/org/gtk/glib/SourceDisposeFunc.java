package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Dispose function for {@code source}. See g_source_set_dispose_function() for
 * details.
 * @version 2.64
 */
@FunctionalInterface
public interface SourceDisposeFunc {
    void run(org.gtk.glib.Source source);

    @ApiStatus.Internal default void upcall(MemoryAddress source) {
        run(org.gtk.glib.Source.fromAddress.marshal(source, Ownership.NONE));
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(SourceDisposeFunc.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}
