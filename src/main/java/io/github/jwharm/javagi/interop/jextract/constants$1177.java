// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1177 {

    static final FunctionDescriptor hb_font_get_glyph_contour_point$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle hb_font_get_glyph_contour_point$MH = RuntimeHelper.downcallHandle(
        "hb_font_get_glyph_contour_point",
        constants$1177.hb_font_get_glyph_contour_point$FUNC
    );
    static final FunctionDescriptor hb_font_get_glyph_name$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle hb_font_get_glyph_name$MH = RuntimeHelper.downcallHandle(
        "hb_font_get_glyph_name",
        constants$1177.hb_font_get_glyph_name$FUNC
    );
    static final FunctionDescriptor hb_font_get_glyph_from_name$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle hb_font_get_glyph_from_name$MH = RuntimeHelper.downcallHandle(
        "hb_font_get_glyph_from_name",
        constants$1177.hb_font_get_glyph_from_name$FUNC
    );
    static final FunctionDescriptor hb_font_get_glyph_shape$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle hb_font_get_glyph_shape$MH = RuntimeHelper.downcallHandle(
        "hb_font_get_glyph_shape",
        constants$1177.hb_font_get_glyph_shape$FUNC
    );
    static final FunctionDescriptor hb_font_get_glyph$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle hb_font_get_glyph$MH = RuntimeHelper.downcallHandle(
        "hb_font_get_glyph",
        constants$1177.hb_font_get_glyph$FUNC
    );
    static final FunctionDescriptor hb_font_get_extents_for_direction$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle hb_font_get_extents_for_direction$MH = RuntimeHelper.downcallHandle(
        "hb_font_get_extents_for_direction",
        constants$1177.hb_font_get_extents_for_direction$FUNC
    );
}


