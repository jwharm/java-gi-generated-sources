// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$259 {

    static final FunctionDescriptor g_pattern_match_simple$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_pattern_match_simple$MH = RuntimeHelper.downcallHandle(
        "g_pattern_match_simple",
        constants$259.g_pattern_match_simple$FUNC
    );
    static final FunctionDescriptor g_spaced_primes_closest$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_spaced_primes_closest$MH = RuntimeHelper.downcallHandle(
        "g_spaced_primes_closest",
        constants$259.g_spaced_primes_closest$FUNC
    );
    static final FunctionDescriptor g_qsort_with_data$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_qsort_with_data$MH = RuntimeHelper.downcallHandle(
        "g_qsort_with_data",
        constants$259.g_qsort_with_data$FUNC
    );
    static final FunctionDescriptor g_queue_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle g_queue_new$MH = RuntimeHelper.downcallHandle(
        "g_queue_new",
        constants$259.g_queue_new$FUNC
    );
    static final FunctionDescriptor g_queue_free$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_queue_free$MH = RuntimeHelper.downcallHandle(
        "g_queue_free",
        constants$259.g_queue_free$FUNC
    );
    static final FunctionDescriptor g_queue_free_full$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_queue_free_full$MH = RuntimeHelper.downcallHandle(
        "g_queue_free_full",
        constants$259.g_queue_free_full$FUNC
    );
}


