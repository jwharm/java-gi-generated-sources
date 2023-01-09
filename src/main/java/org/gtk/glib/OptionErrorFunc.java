package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The type of function to be used as callback when a parse error occurs.
 */
/**
 * Functional interface declaration of the {@code OptionErrorFunc} callback.
 */
@FunctionalInterface
public interface OptionErrorFunc {

    /**
     * The type of function to be used as callback when a parse error occurs.
     */
    void run(org.gtk.glib.OptionContext context, org.gtk.glib.OptionGroup group);
    
    @ApiStatus.Internal default void upcall(MemoryAddress context, MemoryAddress group, MemoryAddress userData) {
        run(org.gtk.glib.OptionContext.fromAddress.marshal(context, null), org.gtk.glib.OptionGroup.fromAddress.marshal(group, null));
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), OptionErrorFunc.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}
