// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1009 {

    static final FunctionDescriptor getprotobyname_r$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle getprotobyname_r$MH = RuntimeHelper.downcallHandle(
        "getprotobyname_r",
        constants$1009.getprotobyname_r$FUNC
    );
    static final FunctionDescriptor getprotobynumber_r$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle getprotobynumber_r$MH = RuntimeHelper.downcallHandle(
        "getprotobynumber_r",
        constants$1009.getprotobynumber_r$FUNC
    );
    static final FunctionDescriptor setnetgrent$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle setnetgrent$MH = RuntimeHelper.downcallHandle(
        "setnetgrent",
        constants$1009.setnetgrent$FUNC
    );
    static final FunctionDescriptor endnetgrent$FUNC = FunctionDescriptor.ofVoid();
    static final MethodHandle endnetgrent$MH = RuntimeHelper.downcallHandle(
        "endnetgrent",
        constants$1009.endnetgrent$FUNC
    );
    static final FunctionDescriptor getnetgrent$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle getnetgrent$MH = RuntimeHelper.downcallHandle(
        "getnetgrent",
        constants$1009.getnetgrent$FUNC
    );
    static final FunctionDescriptor innetgr$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle innetgr$MH = RuntimeHelper.downcallHandle(
        "innetgr",
        constants$1009.innetgr$FUNC
    );
}


