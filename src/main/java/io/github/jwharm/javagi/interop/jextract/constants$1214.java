// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1214 {

    static final FunctionDescriptor pango_font_description_set_family$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_font_description_set_family$MH = RuntimeHelper.downcallHandle(
        "pango_font_description_set_family",
        constants$1214.pango_font_description_set_family$FUNC
    );
    static final FunctionDescriptor pango_font_description_set_family_static$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_font_description_set_family_static$MH = RuntimeHelper.downcallHandle(
        "pango_font_description_set_family_static",
        constants$1214.pango_font_description_set_family_static$FUNC
    );
    static final FunctionDescriptor pango_font_description_get_family$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_font_description_get_family$MH = RuntimeHelper.downcallHandle(
        "pango_font_description_get_family",
        constants$1214.pango_font_description_get_family$FUNC
    );
    static final FunctionDescriptor pango_font_description_set_style$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle pango_font_description_set_style$MH = RuntimeHelper.downcallHandle(
        "pango_font_description_set_style",
        constants$1214.pango_font_description_set_style$FUNC
    );
    static final FunctionDescriptor pango_font_description_get_style$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_font_description_get_style$MH = RuntimeHelper.downcallHandle(
        "pango_font_description_get_style",
        constants$1214.pango_font_description_get_style$FUNC
    );
    static final FunctionDescriptor pango_font_description_set_variant$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle pango_font_description_set_variant$MH = RuntimeHelper.downcallHandle(
        "pango_font_description_set_variant",
        constants$1214.pango_font_description_set_variant$FUNC
    );
}


