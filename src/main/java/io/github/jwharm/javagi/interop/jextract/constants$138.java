// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$138 {

    static final FunctionDescriptor g_node_first_sibling$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_node_first_sibling$MH = RuntimeHelper.downcallHandle(
        "g_node_first_sibling",
        constants$138.g_node_first_sibling$FUNC
    );
    static final FunctionDescriptor g_node_last_sibling$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_node_last_sibling$MH = RuntimeHelper.downcallHandle(
        "g_node_last_sibling",
        constants$138.g_node_last_sibling$FUNC
    );
    static final FunctionDescriptor g_list_alloc$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle g_list_alloc$MH = RuntimeHelper.downcallHandle(
        "g_list_alloc",
        constants$138.g_list_alloc$FUNC
    );
    static final FunctionDescriptor g_list_free$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_list_free$MH = RuntimeHelper.downcallHandle(
        "g_list_free",
        constants$138.g_list_free$FUNC
    );
    static final FunctionDescriptor g_list_free_1$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_list_free_1$MH = RuntimeHelper.downcallHandle(
        "g_list_free_1",
        constants$138.g_list_free_1$FUNC
    );
    static final FunctionDescriptor g_list_free_full$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_list_free_full$MH = RuntimeHelper.downcallHandle(
        "g_list_free_full",
        constants$138.g_list_free_full$FUNC
    );
}


