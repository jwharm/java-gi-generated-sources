package org.gstreamer.gst;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Callback prototype used in {@code gst_element_call_async}
 */
/**
 * Functional interface declaration of the {@code ElementCallAsyncFunc} callback.
 */
@FunctionalInterface
public interface ElementCallAsyncFunc {

    /**
     * Callback prototype used in {@code gst_element_call_async}
     */
    void run(org.gstreamer.gst.Element element);
    
    @ApiStatus.Internal default void upcall(MemoryAddress element, MemoryAddress userData) {
        run((org.gstreamer.gst.Element) Interop.register(element, org.gstreamer.gst.Element.fromAddress).marshal(element, null));
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ElementCallAsyncFunc.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}
