// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$849 {

    static final FunctionDescriptor g_task_run_in_thread$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_task_run_in_thread$MH = RuntimeHelper.downcallHandle(
        "g_task_run_in_thread",
        constants$849.g_task_run_in_thread$FUNC
    );
    static final FunctionDescriptor g_task_run_in_thread_sync$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_task_run_in_thread_sync$MH = RuntimeHelper.downcallHandle(
        "g_task_run_in_thread_sync",
        constants$849.g_task_run_in_thread_sync$FUNC
    );
    static final FunctionDescriptor g_task_set_return_on_cancel$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_task_set_return_on_cancel$MH = RuntimeHelper.downcallHandle(
        "g_task_set_return_on_cancel",
        constants$849.g_task_set_return_on_cancel$FUNC
    );
    static final FunctionDescriptor g_task_get_return_on_cancel$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_task_get_return_on_cancel$MH = RuntimeHelper.downcallHandle(
        "g_task_get_return_on_cancel",
        constants$849.g_task_get_return_on_cancel$FUNC
    );
    static final FunctionDescriptor g_task_attach_source$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_task_attach_source$MH = RuntimeHelper.downcallHandle(
        "g_task_attach_source",
        constants$849.g_task_attach_source$FUNC
    );
    static final FunctionDescriptor g_task_return_pointer$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_task_return_pointer$MH = RuntimeHelper.downcallHandle(
        "g_task_return_pointer",
        constants$849.g_task_return_pointer$FUNC
    );
}


