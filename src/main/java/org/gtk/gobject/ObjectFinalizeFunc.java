package org.gtk.gobject;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The type of the {@code finalize} function of {@link ObjectClass}.
 */
/**
 * Functional interface declaration of the {@code ObjectFinalizeFunc} callback.
 */
@FunctionalInterface
public interface ObjectFinalizeFunc {

    /**
     * The type of the {@code finalize} function of {@link ObjectClass}.
     */
    void run(org.gtk.gobject.GObject object);
    
    @ApiStatus.Internal default void upcall(MemoryAddress object) {
        run((org.gtk.gobject.GObject) Interop.register(object, org.gtk.gobject.GObject.fromAddress).marshal(object, null));
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), ObjectFinalizeFunc.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}
