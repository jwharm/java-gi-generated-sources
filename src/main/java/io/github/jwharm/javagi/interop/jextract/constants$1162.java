// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1162 {

    static final FunctionDescriptor hb_draw_funcs_destroy$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle hb_draw_funcs_destroy$MH = RuntimeHelper.downcallHandle(
        "hb_draw_funcs_destroy",
        constants$1162.hb_draw_funcs_destroy$FUNC
    );
    static final FunctionDescriptor hb_draw_funcs_make_immutable$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle hb_draw_funcs_make_immutable$MH = RuntimeHelper.downcallHandle(
        "hb_draw_funcs_make_immutable",
        constants$1162.hb_draw_funcs_make_immutable$FUNC
    );
    static final FunctionDescriptor hb_draw_funcs_is_immutable$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle hb_draw_funcs_is_immutable$MH = RuntimeHelper.downcallHandle(
        "hb_draw_funcs_is_immutable",
        constants$1162.hb_draw_funcs_is_immutable$FUNC
    );
    static final FunctionDescriptor hb_draw_move_to$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT
    );
    static final MethodHandle hb_draw_move_to$MH = RuntimeHelper.downcallHandle(
        "hb_draw_move_to",
        constants$1162.hb_draw_move_to$FUNC
    );
    static final FunctionDescriptor hb_draw_line_to$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT
    );
    static final MethodHandle hb_draw_line_to$MH = RuntimeHelper.downcallHandle(
        "hb_draw_line_to",
        constants$1162.hb_draw_line_to$FUNC
    );
    static final FunctionDescriptor hb_draw_quadratic_to$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT
    );
    static final MethodHandle hb_draw_quadratic_to$MH = RuntimeHelper.downcallHandle(
        "hb_draw_quadratic_to",
        constants$1162.hb_draw_quadratic_to$FUNC
    );
}


