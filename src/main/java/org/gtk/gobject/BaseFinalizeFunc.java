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
/**
 * Functional interface declaration of the {@code BaseFinalizeFunc} callback.
 */
@FunctionalInterface
public interface BaseFinalizeFunc {

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
    void run(org.gtk.gobject.TypeClass gClass);
    
    @ApiStatus.Internal default void upcall(MemoryAddress gClass) {
        run(org.gtk.gobject.TypeClass.fromAddress.marshal(gClass, null));
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), BaseFinalizeFunc.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}
