// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$367 {

    static final FunctionDescriptor pthread_barrier_destroy$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pthread_barrier_destroy$MH = RuntimeHelper.downcallHandle(
        "pthread_barrier_destroy",
        constants$367.pthread_barrier_destroy$FUNC
    );
    static final FunctionDescriptor pthread_barrier_wait$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pthread_barrier_wait$MH = RuntimeHelper.downcallHandle(
        "pthread_barrier_wait",
        constants$367.pthread_barrier_wait$FUNC
    );
    static final FunctionDescriptor pthread_barrierattr_init$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pthread_barrierattr_init$MH = RuntimeHelper.downcallHandle(
        "pthread_barrierattr_init",
        constants$367.pthread_barrierattr_init$FUNC
    );
    static final FunctionDescriptor pthread_barrierattr_destroy$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pthread_barrierattr_destroy$MH = RuntimeHelper.downcallHandle(
        "pthread_barrierattr_destroy",
        constants$367.pthread_barrierattr_destroy$FUNC
    );
    static final FunctionDescriptor pthread_barrierattr_getpshared$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pthread_barrierattr_getpshared$MH = RuntimeHelper.downcallHandle(
        "pthread_barrierattr_getpshared",
        constants$367.pthread_barrierattr_getpshared$FUNC
    );
    static final FunctionDescriptor pthread_barrierattr_setpshared$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle pthread_barrierattr_setpshared$MH = RuntimeHelper.downcallHandle(
        "pthread_barrierattr_setpshared",
        constants$367.pthread_barrierattr_setpshared$FUNC
    );
}


