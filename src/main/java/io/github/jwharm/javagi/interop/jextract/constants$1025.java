// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1025 {

    static final FunctionDescriptor ferror_unlocked$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle ferror_unlocked$MH = RuntimeHelper.downcallHandle(
        "ferror_unlocked",
        constants$1025.ferror_unlocked$FUNC
    );
    static final FunctionDescriptor perror$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle perror$MH = RuntimeHelper.downcallHandle(
        "perror",
        constants$1025.perror$FUNC
    );
    static final FunctionDescriptor fileno$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle fileno$MH = RuntimeHelper.downcallHandle(
        "fileno",
        constants$1025.fileno$FUNC
    );
    static final FunctionDescriptor fileno_unlocked$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle fileno_unlocked$MH = RuntimeHelper.downcallHandle(
        "fileno_unlocked",
        constants$1025.fileno_unlocked$FUNC
    );
    static final FunctionDescriptor pclose$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pclose$MH = RuntimeHelper.downcallHandle(
        "pclose",
        constants$1025.pclose$FUNC
    );
    static final FunctionDescriptor popen$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle popen$MH = RuntimeHelper.downcallHandle(
        "popen",
        constants$1025.popen$FUNC
    );
}


