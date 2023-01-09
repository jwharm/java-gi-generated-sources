package org.gstreamer.pbutils;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The prototype of the callback function that will be called once the
 * external plugin installer program has returned. You only need to provide
 * a callback function if you are using the asynchronous interface.
 */
/**
 * Functional interface declaration of the {@code InstallPluginsResultFunc} callback.
 */
@FunctionalInterface
public interface InstallPluginsResultFunc {

    /**
     * The prototype of the callback function that will be called once the
     * external plugin installer program has returned. You only need to provide
     * a callback function if you are using the asynchronous interface.
     */
    void run(org.gstreamer.pbutils.InstallPluginsReturn result);
    
    @ApiStatus.Internal default void upcall(int result, MemoryAddress userData) {
        run(org.gstreamer.pbutils.InstallPluginsReturn.of(result));
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.ofVoid(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), InstallPluginsResultFunc.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}
