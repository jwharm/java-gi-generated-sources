// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1412 {

    static final FunctionDescriptor gdk_keyval_from_name$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_keyval_from_name$MH = RuntimeHelper.downcallHandle(
        "gdk_keyval_from_name",
        constants$1412.gdk_keyval_from_name$FUNC
    );
    static final FunctionDescriptor gdk_keyval_convert_case$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_keyval_convert_case$MH = RuntimeHelper.downcallHandle(
        "gdk_keyval_convert_case",
        constants$1412.gdk_keyval_convert_case$FUNC
    );
    static final FunctionDescriptor gdk_keyval_to_upper$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gdk_keyval_to_upper$MH = RuntimeHelper.downcallHandle(
        "gdk_keyval_to_upper",
        constants$1412.gdk_keyval_to_upper$FUNC
    );
    static final FunctionDescriptor gdk_keyval_to_lower$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gdk_keyval_to_lower$MH = RuntimeHelper.downcallHandle(
        "gdk_keyval_to_lower",
        constants$1412.gdk_keyval_to_lower$FUNC
    );
    static final FunctionDescriptor gdk_keyval_is_upper$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gdk_keyval_is_upper$MH = RuntimeHelper.downcallHandle(
        "gdk_keyval_is_upper",
        constants$1412.gdk_keyval_is_upper$FUNC
    );
    static final FunctionDescriptor gdk_keyval_is_lower$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gdk_keyval_is_lower$MH = RuntimeHelper.downcallHandle(
        "gdk_keyval_is_lower",
        constants$1412.gdk_keyval_is_lower$FUNC
    );
}


