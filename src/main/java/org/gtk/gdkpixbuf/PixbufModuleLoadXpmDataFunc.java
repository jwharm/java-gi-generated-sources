package org.gtk.gdkpixbuf;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Loads XPM data into a new {@code GdkPixbuf}.
 */
/**
 * Functional interface declaration of the {@code PixbufModuleLoadXpmDataFunc} callback.
 */
@FunctionalInterface
public interface PixbufModuleLoadXpmDataFunc {

    /**
     * Loads XPM data into a new {@code GdkPixbuf}.
     */
    org.gtk.gdkpixbuf.Pixbuf run(PointerString data);
    
    @ApiStatus.Internal default Addressable upcall(MemoryAddress data) {
        try (MemorySession SCOPE = MemorySession.openConfined()) {
            var RESULT = run(new PointerString(data));
            RESULT.yieldOwnership();
            return RESULT == null ? MemoryAddress.NULL.address() : (RESULT.handle()).address();
        }
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), PixbufModuleLoadXpmDataFunc.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}
