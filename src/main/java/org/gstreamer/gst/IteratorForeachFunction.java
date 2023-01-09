package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A function that is called by gst_iterator_foreach() for every element.
 */
/**
 * Functional interface declaration of the {@code IteratorForeachFunction} callback.
 */
@FunctionalInterface
public interface IteratorForeachFunction {

    /**
     * A function that is called by gst_iterator_foreach() for every element.
     */
    void run(org.gtk.gobject.Value item);
    
    @ApiStatus.Internal default void upcall(MemoryAddress item, MemoryAddress userData) {
        run(org.gtk.gobject.Value.fromAddress.marshal(item, null));
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), IteratorForeachFunction.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}
