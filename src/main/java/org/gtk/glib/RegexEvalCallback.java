package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * Specifies the type of the function passed to g_regex_replace_eval().
 * It is called for each occurrence of the pattern in the string passed
 * to g_regex_replace_eval(), and it should append the replacement to
 * {@code result}.
 * @version 2.14
 */
@FunctionalInterface
public interface RegexEvalCallback {
    boolean run(org.gtk.glib.MatchInfo matchInfo, org.gtk.glib.GString result);

    @ApiStatus.Internal default int upcall(MemoryAddress matchInfo, MemoryAddress result, MemoryAddress userData) {
        var RESULT = run(org.gtk.glib.MatchInfo.fromAddress.marshal(matchInfo, Ownership.NONE), org.gtk.glib.GString.fromAddress.marshal(result, Ownership.NONE));
        return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
    }
    
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(RegexEvalCallback.class, DESCRIPTOR);
    
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, Interop.getScope()).address();
    }
}
