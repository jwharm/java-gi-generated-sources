// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1521 {

    static final FunctionDescriptor __ldexp$FUNC = FunctionDescriptor.of(Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle __ldexp$MH = RuntimeHelper.downcallHandle(
        "__ldexp",
        constants$1521.__ldexp$FUNC
    );
    static final FunctionDescriptor log$FUNC = FunctionDescriptor.of(Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle log$MH = RuntimeHelper.downcallHandle(
        "log",
        constants$1521.log$FUNC
    );
    static final FunctionDescriptor __log$FUNC = FunctionDescriptor.of(Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle __log$MH = RuntimeHelper.downcallHandle(
        "__log",
        constants$1521.__log$FUNC
    );
    static final FunctionDescriptor log10$FUNC = FunctionDescriptor.of(Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle log10$MH = RuntimeHelper.downcallHandle(
        "log10",
        constants$1521.log10$FUNC
    );
    static final FunctionDescriptor __log10$FUNC = FunctionDescriptor.of(Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle __log10$MH = RuntimeHelper.downcallHandle(
        "__log10",
        constants$1521.__log10$FUNC
    );
    static final FunctionDescriptor modf$FUNC = FunctionDescriptor.of(Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle modf$MH = RuntimeHelper.downcallHandle(
        "modf",
        constants$1521.modf$FUNC
    );
}


