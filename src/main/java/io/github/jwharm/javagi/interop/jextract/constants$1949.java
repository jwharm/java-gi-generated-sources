// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1949 {

    static final FunctionDescriptor gtk_entry_completion_complete$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_entry_completion_complete$MH = RuntimeHelper.downcallHandle(
        "gtk_entry_completion_complete",
        constants$1949.gtk_entry_completion_complete$FUNC
    );
    static final FunctionDescriptor gtk_entry_completion_insert_prefix$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_entry_completion_insert_prefix$MH = RuntimeHelper.downcallHandle(
        "gtk_entry_completion_insert_prefix",
        constants$1949.gtk_entry_completion_insert_prefix$FUNC
    );
    static final FunctionDescriptor gtk_entry_completion_set_inline_completion$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_entry_completion_set_inline_completion$MH = RuntimeHelper.downcallHandle(
        "gtk_entry_completion_set_inline_completion",
        constants$1949.gtk_entry_completion_set_inline_completion$FUNC
    );
    static final FunctionDescriptor gtk_entry_completion_get_inline_completion$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_entry_completion_get_inline_completion$MH = RuntimeHelper.downcallHandle(
        "gtk_entry_completion_get_inline_completion",
        constants$1949.gtk_entry_completion_get_inline_completion$FUNC
    );
    static final FunctionDescriptor gtk_entry_completion_set_inline_selection$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_entry_completion_set_inline_selection$MH = RuntimeHelper.downcallHandle(
        "gtk_entry_completion_set_inline_selection",
        constants$1949.gtk_entry_completion_set_inline_selection$FUNC
    );
    static final FunctionDescriptor gtk_entry_completion_get_inline_selection$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_entry_completion_get_inline_selection$MH = RuntimeHelper.downcallHandle(
        "gtk_entry_completion_get_inline_selection",
        constants$1949.gtk_entry_completion_get_inline_selection$FUNC
    );
}


