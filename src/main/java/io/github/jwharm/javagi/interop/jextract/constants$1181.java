// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1181 {

    static final FunctionDescriptor hb_font_is_immutable$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle hb_font_is_immutable$MH = RuntimeHelper.downcallHandle(
        "hb_font_is_immutable",
        constants$1181.hb_font_is_immutable$FUNC
    );
    static final FunctionDescriptor hb_font_set_parent$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle hb_font_set_parent$MH = RuntimeHelper.downcallHandle(
        "hb_font_set_parent",
        constants$1181.hb_font_set_parent$FUNC
    );
    static final FunctionDescriptor hb_font_get_parent$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle hb_font_get_parent$MH = RuntimeHelper.downcallHandle(
        "hb_font_get_parent",
        constants$1181.hb_font_get_parent$FUNC
    );
    static final FunctionDescriptor hb_font_set_face$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle hb_font_set_face$MH = RuntimeHelper.downcallHandle(
        "hb_font_set_face",
        constants$1181.hb_font_set_face$FUNC
    );
    static final FunctionDescriptor hb_font_get_face$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle hb_font_get_face$MH = RuntimeHelper.downcallHandle(
        "hb_font_get_face",
        constants$1181.hb_font_get_face$FUNC
    );
    static final FunctionDescriptor hb_font_set_funcs$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle hb_font_set_funcs$MH = RuntimeHelper.downcallHandle(
        "hb_font_set_funcs",
        constants$1181.hb_font_set_funcs$FUNC
    );
}


