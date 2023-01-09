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
/**
 * Functional interface declaration of the {@code RegexEvalCallback} callback.
 */
@FunctionalInterface
public interface RegexEvalCallback {

    /**
     * Specifies the type of the function passed to g_regex_replace_eval().
     * It is called for each occurrence of the pattern in the string passed
     * to g_regex_replace_eval(), and it should append the replacement to
     * {@code result}.
     * @version 2.14
     */
    boolean run(org.gtk.glib.MatchInfo matchInfo, org.gtk.glib.GString result);
    
    @ApiStatus.Internal default int upcall(MemoryAddress matchInfo, MemoryAddress result, MemoryAddress userData) {
        var RESULT = run(org.gtk.glib.MatchInfo.fromAddress.marshal(matchInfo, null), org.gtk.glib.GString.fromAddress.marshal(result, null));
        return Marshal.booleanToInteger.marshal(RESULT, null).intValue();
    }
    
    /**
     * Describes the parameter types of the native callback function.
     */
    @ApiStatus.Internal FunctionDescriptor DESCRIPTOR = FunctionDescriptor.of(Interop.valueLayout.C_INT, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS, Interop.valueLayout.ADDRESS);
    
    /**
     * The method handle for the callback.
     */
    @ApiStatus.Internal MethodHandle HANDLE = Interop.getHandle(MethodHandles.lookup(), RegexEvalCallback.class, DESCRIPTOR);
    
    /**
     * Creates a callback that can be called from native code and executes the {@code run} method.
     * @return the memory address of the callback function
     */
    default MemoryAddress toCallback() {
        return Linker.nativeLinker().upcallStub(HANDLE.bindTo(this), DESCRIPTOR, MemorySession.global()).address();
    }
}
