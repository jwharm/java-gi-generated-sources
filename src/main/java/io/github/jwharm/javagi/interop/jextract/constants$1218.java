// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1218 {

    static final FunctionDescriptor pango_font_description_better_match$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_font_description_better_match$MH = RuntimeHelper.downcallHandle(
        "pango_font_description_better_match",
        constants$1218.pango_font_description_better_match$FUNC
    );
    static final FunctionDescriptor pango_font_description_from_string$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_font_description_from_string$MH = RuntimeHelper.downcallHandle(
        "pango_font_description_from_string",
        constants$1218.pango_font_description_from_string$FUNC
    );
    static final FunctionDescriptor pango_font_description_to_string$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_font_description_to_string$MH = RuntimeHelper.downcallHandle(
        "pango_font_description_to_string",
        constants$1218.pango_font_description_to_string$FUNC
    );
    static final FunctionDescriptor pango_font_description_to_filename$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_font_description_to_filename$MH = RuntimeHelper.downcallHandle(
        "pango_font_description_to_filename",
        constants$1218.pango_font_description_to_filename$FUNC
    );
    static final FunctionDescriptor pango_font_metrics_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle pango_font_metrics_get_type$MH = RuntimeHelper.downcallHandle(
        "pango_font_metrics_get_type",
        constants$1218.pango_font_metrics_get_type$FUNC
    );
    static final FunctionDescriptor pango_font_metrics_ref$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_font_metrics_ref$MH = RuntimeHelper.downcallHandle(
        "pango_font_metrics_ref",
        constants$1218.pango_font_metrics_ref$FUNC
    );
}


