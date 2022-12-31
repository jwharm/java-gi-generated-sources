package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * The type of function that can be called before and after parsing.
 */
@FunctionalInterface
public interface OptionParseFunc {
    boolean run(org.gtk.glib.OptionContext context, org.gtk.glib.OptionGroup group);

    @ApiStatus.Internal default int upcall(MemoryAddress context, MemoryAddress group, MemoryAddress userData) {
        var RESULT = run(org.gtk.glib.OptionContext.fromAddress.marshal(context, Ownership.NONE), org.gtk.glib.OptionGroup.fromAddress.marshal(group, Ownership.NONE));
        return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(OptionParseFunc.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}
