// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$286 {

    static final FunctionDescriptor g_sequence_foreach_range$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_sequence_foreach_range$MH = RuntimeHelper.downcallHandle(
        "g_sequence_foreach_range",
        constants$286.g_sequence_foreach_range$FUNC
    );
    static final FunctionDescriptor g_sequence_sort$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_sequence_sort$MH = RuntimeHelper.downcallHandle(
        "g_sequence_sort",
        constants$286.g_sequence_sort$FUNC
    );
    static final FunctionDescriptor g_sequence_sort_iter$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_sequence_sort_iter$MH = RuntimeHelper.downcallHandle(
        "g_sequence_sort_iter",
        constants$286.g_sequence_sort_iter$FUNC
    );
    static final FunctionDescriptor g_sequence_is_empty$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_sequence_is_empty$MH = RuntimeHelper.downcallHandle(
        "g_sequence_is_empty",
        constants$286.g_sequence_is_empty$FUNC
    );
    static final FunctionDescriptor g_sequence_get_begin_iter$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_sequence_get_begin_iter$MH = RuntimeHelper.downcallHandle(
        "g_sequence_get_begin_iter",
        constants$286.g_sequence_get_begin_iter$FUNC
    );
    static final FunctionDescriptor g_sequence_get_end_iter$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_sequence_get_end_iter$MH = RuntimeHelper.downcallHandle(
        "g_sequence_get_end_iter",
        constants$286.g_sequence_get_end_iter$FUNC
    );
}


