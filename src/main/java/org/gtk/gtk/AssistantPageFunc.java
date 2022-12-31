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
@FunctionalInterface
public interface AssistantPageFunc {
    int run(int currentPage);

    @ApiStatus.Internal default int upcall(int currentPage, MemoryAddress data) {
        var RESULT = run(currentPage);
        return RESULT;
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(AssistantPageFunc.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}
