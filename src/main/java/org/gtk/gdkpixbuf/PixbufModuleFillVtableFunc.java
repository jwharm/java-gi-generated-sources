package org.gtk.gdkpixbuf;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Defines the type of the function used to set the vtable of a
 * {@link PixbufModule} when it is loaded.
 * @version 2.2
 */
/**
 * Functional interface declaration of the {@code PixbufModuleFillVtableFunc} callback.
 */
@FunctionalInterface
public interface PixbufModuleFillVtableFunc {

    /**
     * Defines the type of the function used to set the vtable of a
     * {@link PixbufModule} when it is loaded.
     * @version 2.2
     */
    void run(org.gtk.gdkpixbuf.PixbufModule module);
    
    @ApiStatus.Internal default void upcall(MemoryAddress module) {
        run(org.gtk.gdkpixbuf.PixbufModule.fromAddress.marshal(module, null));
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), PixbufModuleFillVtableFunc.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}
