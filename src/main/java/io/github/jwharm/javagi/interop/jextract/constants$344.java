// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$344 {

    static final FunctionDescriptor GCompletionFunc$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GCompletionFunc$MH = RuntimeHelper.downcallHandle(
        constants$344.GCompletionFunc$FUNC
    );
    static final FunctionDescriptor GCompletionStrncmpFunc$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle GCompletionStrncmpFunc$MH = RuntimeHelper.downcallHandle(
        constants$344.GCompletionStrncmpFunc$FUNC
    );
    static final FunctionDescriptor g_completion_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_completion_new$MH = RuntimeHelper.downcallHandle(
        "g_completion_new",
        constants$344.g_completion_new$FUNC
    );
    static final FunctionDescriptor g_completion_add_items$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_completion_add_items$MH = RuntimeHelper.downcallHandle(
        "g_completion_add_items",
        constants$344.g_completion_add_items$FUNC
    );
    static final FunctionDescriptor g_completion_remove_items$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_completion_remove_items$MH = RuntimeHelper.downcallHandle(
        "g_completion_remove_items",
        constants$344.g_completion_remove_items$FUNC
    );
}


