// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$349 {

    static final FunctionDescriptor g_thread_foreach$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_thread_foreach$MH = RuntimeHelper.downcallHandle(
        "g_thread_foreach",
        constants$349.g_thread_foreach$FUNC
    );
    static final FunctionDescriptor __sched_cpucount$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle __sched_cpucount$MH = RuntimeHelper.downcallHandle(
        "__sched_cpucount",
        constants$349.__sched_cpucount$FUNC
    );
    static final FunctionDescriptor __sched_cpualloc$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle __sched_cpualloc$MH = RuntimeHelper.downcallHandle(
        "__sched_cpualloc",
        constants$349.__sched_cpualloc$FUNC
    );
    static final FunctionDescriptor __sched_cpufree$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle __sched_cpufree$MH = RuntimeHelper.downcallHandle(
        "__sched_cpufree",
        constants$349.__sched_cpufree$FUNC
    );
    static final FunctionDescriptor sched_setparam$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle sched_setparam$MH = RuntimeHelper.downcallHandle(
        "sched_setparam",
        constants$349.sched_setparam$FUNC
    );
    static final FunctionDescriptor sched_getparam$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle sched_getparam$MH = RuntimeHelper.downcallHandle(
        "sched_getparam",
        constants$349.sched_getparam$FUNC
    );
}


