package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The function that will be called after the next item of the iterator
 * has been retrieved. This function can be used to skip items or stop
 * the iterator.
 * <p>
 * The function will be called with the iterator lock held.
 */
/**
 * Functional interface declaration of the {@code IteratorItemFunction} callback.
 */
@FunctionalInterface
public interface IteratorItemFunction {

    /**
     * The function that will be called after the next item of the iterator
     * has been retrieved. This function can be used to skip items or stop
     * the iterator.
     * <p>
     * The function will be called with the iterator lock held.
     */
    org.gstreamer.gst.IteratorItem run(org.gstreamer.gst.Iterator it, org.gtk.gobject.Value item);
    
    @ApiStatus.Internal default int upcall(MemoryAddress it, MemoryAddress item) {
        var RESULT = run(org.gstreamer.gst.Iterator.fromAddress.marshal(it, null), org.gtk.gobject.Value.fromAddress.marshal(item, null));
        return RESULT.getValue();
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), IteratorItemFunction.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}
