// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$584 {

    static final FunctionDescriptor crypt$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle crypt$MH = RuntimeHelper.downcallHandle(
        "crypt",
        constants$584.crypt$FUNC
    );
    static final FunctionDescriptor getentropy$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle getentropy$MH = RuntimeHelper.downcallHandle(
        "getentropy",
        constants$584.getentropy$FUNC
    );
    static final FunctionDescriptor g_credentials_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_credentials_get_type$MH = RuntimeHelper.downcallHandle(
        "g_credentials_get_type",
        constants$584.g_credentials_get_type$FUNC
    );
    static final FunctionDescriptor g_credentials_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle g_credentials_new$MH = RuntimeHelper.downcallHandle(
        "g_credentials_new",
        constants$584.g_credentials_new$FUNC
    );
    static final FunctionDescriptor g_credentials_to_string$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_credentials_to_string$MH = RuntimeHelper.downcallHandle(
        "g_credentials_to_string",
        constants$584.g_credentials_to_string$FUNC
    );
    static final FunctionDescriptor g_credentials_get_native$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_credentials_get_native$MH = RuntimeHelper.downcallHandle(
        "g_credentials_get_native",
        constants$584.g_credentials_get_native$FUNC
    );
}


