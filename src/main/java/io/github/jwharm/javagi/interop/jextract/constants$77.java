// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$77 {

    static final FunctionDescriptor sigwaitinfo$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle sigwaitinfo$MH = RuntimeHelper.downcallHandle(
        "sigwaitinfo",
        constants$77.sigwaitinfo$FUNC
    );
    static final FunctionDescriptor sigtimedwait$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle sigtimedwait$MH = RuntimeHelper.downcallHandle(
        "sigtimedwait",
        constants$77.sigtimedwait$FUNC
    );
    static final FunctionDescriptor sigqueue$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        MemoryLayout.unionLayout(
            Constants$root.C_INT$LAYOUT.withName("sival_int"),
            Constants$root.C_POINTER$LAYOUT.withName("sival_ptr")
        ).withName("sigval")
    );
    static final MethodHandle sigqueue$MH = RuntimeHelper.downcallHandle(
        "sigqueue",
        constants$77.sigqueue$FUNC
    );
    static final FunctionDescriptor sigreturn$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle sigreturn$MH = RuntimeHelper.downcallHandle(
        "sigreturn",
        constants$77.sigreturn$FUNC
    );
    static final FunctionDescriptor siginterrupt$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle siginterrupt$MH = RuntimeHelper.downcallHandle(
        "siginterrupt",
        constants$77.siginterrupt$FUNC
    );
    static final FunctionDescriptor sigaltstack$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle sigaltstack$MH = RuntimeHelper.downcallHandle(
        "sigaltstack",
        constants$77.sigaltstack$FUNC
    );
}


