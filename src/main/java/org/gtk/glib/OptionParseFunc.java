package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The type of function that can be called before and after parsing.
 */
/**
 * Functional interface declaration of the {@code OptionParseFunc} callback.
 */
@FunctionalInterface
public interface OptionParseFunc {

    /**
     * The type of function that can be called before and after parsing.
     */
    boolean run(org.gtk.glib.OptionContext context, org.gtk.glib.OptionGroup group);
    
    @ApiStatus.Internal default int upcall(MemoryAddress context, MemoryAddress group, MemoryAddress userData) {
        var RESULT = run(org.gtk.glib.OptionContext.fromAddress.marshal(context, null), org.gtk.glib.OptionGroup.fromAddress.marshal(group, null));
        return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), OptionParseFunc.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}
