// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1527 {

    static final FunctionDescriptor __drem$FUNC = FunctionDescriptor.of(Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle __drem$MH = RuntimeHelper.downcallHandle(
        "__drem",
        constants$1527.__drem$FUNC
    );
    static final FunctionDescriptor significand$FUNC = FunctionDescriptor.of(Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle significand$MH = RuntimeHelper.downcallHandle(
        "significand",
        constants$1527.significand$FUNC
    );
    static final FunctionDescriptor __significand$FUNC = FunctionDescriptor.of(Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle __significand$MH = RuntimeHelper.downcallHandle(
        "__significand",
        constants$1527.__significand$FUNC
    );
    static final FunctionDescriptor copysign$FUNC = FunctionDescriptor.of(Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle copysign$MH = RuntimeHelper.downcallHandle(
        "copysign",
        constants$1527.copysign$FUNC
    );
    static final FunctionDescriptor __copysign$FUNC = FunctionDescriptor.of(Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle __copysign$MH = RuntimeHelper.downcallHandle(
        "__copysign",
        constants$1527.__copysign$FUNC
    );
    static final FunctionDescriptor nan$FUNC = FunctionDescriptor.of(Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle nan$MH = RuntimeHelper.downcallHandle(
        "nan",
        constants$1527.nan$FUNC
    );
}


