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
/**
 * Functional interface declaration of the {@code SourceDisposeFunc} callback.
 */
@FunctionalInterface
public interface SourceDisposeFunc {

    /**
     * Dispose function for {@code source}. See g_source_set_dispose_function() for
     * details.
     * @version 2.64
     */
    void run(org.gtk.glib.Source source);
    
    @ApiStatus.Internal default void upcall(MemoryAddress source) {
        run(org.gtk.glib.Source.fromAddress.marshal(source, null));
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), SourceDisposeFunc.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}
