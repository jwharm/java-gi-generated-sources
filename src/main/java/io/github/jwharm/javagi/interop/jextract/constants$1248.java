// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1248 {

    static final FunctionDescriptor pango_fontset_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle pango_fontset_get_type$MH = RuntimeHelper.downcallHandle(
        "pango_fontset_get_type",
        constants$1248.pango_fontset_get_type$FUNC
    );
    static final FunctionDescriptor PangoFontsetForeachFunc$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle PangoFontsetForeachFunc$MH = RuntimeHelper.downcallHandle(
        constants$1248.PangoFontsetForeachFunc$FUNC
    );
    static final FunctionDescriptor pango_fontset_get_font$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle pango_fontset_get_font$MH = RuntimeHelper.downcallHandle(
        "pango_fontset_get_font",
        constants$1248.pango_fontset_get_font$FUNC
    );
    static final FunctionDescriptor pango_fontset_get_metrics$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_fontset_get_metrics$MH = RuntimeHelper.downcallHandle(
        "pango_fontset_get_metrics",
        constants$1248.pango_fontset_get_metrics$FUNC
    );
    static final FunctionDescriptor pango_fontset_foreach$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_fontset_foreach$MH = RuntimeHelper.downcallHandle(
        "pango_fontset_foreach",
        constants$1248.pango_fontset_foreach$FUNC
    );
}


