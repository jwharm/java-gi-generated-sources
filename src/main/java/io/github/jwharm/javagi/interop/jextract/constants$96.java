// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$96 {

    static final FunctionDescriptor g_bookmark_file_get_is_private$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_bookmark_file_get_is_private$MH = RuntimeHelper.downcallHandle(
        "g_bookmark_file_get_is_private",
        constants$96.g_bookmark_file_get_is_private$FUNC
    );
    static final FunctionDescriptor g_bookmark_file_set_icon$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_bookmark_file_set_icon$MH = RuntimeHelper.downcallHandle(
        "g_bookmark_file_set_icon",
        constants$96.g_bookmark_file_set_icon$FUNC
    );
    static final FunctionDescriptor g_bookmark_file_get_icon$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_bookmark_file_get_icon$MH = RuntimeHelper.downcallHandle(
        "g_bookmark_file_get_icon",
        constants$96.g_bookmark_file_get_icon$FUNC
    );
    static final FunctionDescriptor g_bookmark_file_set_added$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_bookmark_file_set_added$MH = RuntimeHelper.downcallHandle(
        "g_bookmark_file_set_added",
        constants$96.g_bookmark_file_set_added$FUNC
    );
    static final FunctionDescriptor g_bookmark_file_set_added_date_time$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_bookmark_file_set_added_date_time$MH = RuntimeHelper.downcallHandle(
        "g_bookmark_file_set_added_date_time",
        constants$96.g_bookmark_file_set_added_date_time$FUNC
    );
    static final FunctionDescriptor g_bookmark_file_get_added$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_bookmark_file_get_added$MH = RuntimeHelper.downcallHandle(
        "g_bookmark_file_get_added",
        constants$96.g_bookmark_file_get_added$FUNC
    );
}


