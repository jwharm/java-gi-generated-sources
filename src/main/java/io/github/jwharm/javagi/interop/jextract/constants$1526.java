// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1526 {

    static final FunctionDescriptor __floor$FUNC = FunctionDescriptor.of(Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle __floor$MH = RuntimeHelper.downcallHandle(
        "__floor",
        constants$1526.__floor$FUNC
    );
    static final FunctionDescriptor fmod$FUNC = FunctionDescriptor.of(Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle fmod$MH = RuntimeHelper.downcallHandle(
        "fmod",
        constants$1526.fmod$FUNC
    );
    static final FunctionDescriptor __fmod$FUNC = FunctionDescriptor.of(Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle __fmod$MH = RuntimeHelper.downcallHandle(
        "__fmod",
        constants$1526.__fmod$FUNC
    );
    static final FunctionDescriptor isinf$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle isinf$MH = RuntimeHelper.downcallHandle(
        "isinf",
        constants$1526.isinf$FUNC
    );
    static final FunctionDescriptor finite$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle finite$MH = RuntimeHelper.downcallHandle(
        "finite",
        constants$1526.finite$FUNC
    );
    static final FunctionDescriptor drem$FUNC = FunctionDescriptor.of(Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle drem$MH = RuntimeHelper.downcallHandle(
        "drem",
        constants$1526.drem$FUNC
    );
}


