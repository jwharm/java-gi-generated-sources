package org.gtk.gdkpixbuf;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Defines the type of the function used to fill a
 * {@link PixbufFormat} structure with information about a module.
 * @version 2.2
 */
/**
 * Functional interface declaration of the {@code PixbufModuleFillInfoFunc} callback.
 */
@FunctionalInterface
public interface PixbufModuleFillInfoFunc {

    /**
     * Defines the type of the function used to fill a
     * {@link PixbufFormat} structure with information about a module.
     * @version 2.2
     */
    void run(org.gtk.gdkpixbuf.PixbufFormat info);
    
    @ApiStatus.Internal default void upcall(MemoryAddress info) {
        run(org.gtk.gdkpixbuf.PixbufFormat.fromAddress.marshal(info, null));
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), PixbufModuleFillInfoFunc.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}
