package org.gtk.gtk;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Type of callback used to calculate the next page in a {@code GtkAssistant}.
 * <p>
 * It’s called both for computing the next page when the user presses the
 * “forward” button and for handling the behavior of the “last” button.
 * <p>
 * See {@link Assistant#setForwardPageFunc}.
 */
/**
 * Functional interface declaration of the {@code AssistantPageFunc} callback.
 */
@FunctionalInterface
public interface AssistantPageFunc {

    /**
     * Type of callback used to calculate the next page in a {@code GtkAssistant}.
     * <p>
     * It’s called both for computing the next page when the user presses the
     * “forward” button and for handling the behavior of the “last” button.
     * <p>
     * See {@link Assistant#setForwardPageFunc}.
     */
    int run(int currentPage);
    
    @ApiStatus.Internal default int upcall(int currentPage, MemoryAddress data) {
        var RESULT = run(currentPage);
        return RESULT;
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), AssistantPageFunc.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}
