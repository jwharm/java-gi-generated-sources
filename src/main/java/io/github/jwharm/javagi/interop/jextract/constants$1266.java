// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1266 {

    static final FunctionDescriptor pango_glyph_item_iter_init_start$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_glyph_item_iter_init_start$MH = RuntimeHelper.downcallHandle(
        "pango_glyph_item_iter_init_start",
        constants$1266.pango_glyph_item_iter_init_start$FUNC
    );
    static final FunctionDescriptor pango_glyph_item_iter_init_end$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_glyph_item_iter_init_end$MH = RuntimeHelper.downcallHandle(
        "pango_glyph_item_iter_init_end",
        constants$1266.pango_glyph_item_iter_init_end$FUNC
    );
    static final FunctionDescriptor pango_glyph_item_iter_next_cluster$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_glyph_item_iter_next_cluster$MH = RuntimeHelper.downcallHandle(
        "pango_glyph_item_iter_next_cluster",
        constants$1266.pango_glyph_item_iter_next_cluster$FUNC
    );
    static final FunctionDescriptor pango_glyph_item_iter_prev_cluster$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pango_glyph_item_iter_prev_cluster$MH = RuntimeHelper.downcallHandle(
        "pango_glyph_item_iter_prev_cluster",
        constants$1266.pango_glyph_item_iter_prev_cluster$FUNC
    );
    static final FunctionDescriptor pango_tab_array_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle pango_tab_array_new$MH = RuntimeHelper.downcallHandle(
        "pango_tab_array_new",
        constants$1266.pango_tab_array_new$FUNC
    );
    static final FunctionDescriptor pango_tab_array_new_with_positions$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle pango_tab_array_new_with_positions$MH = RuntimeHelper.downcallHandleVariadic(
        "pango_tab_array_new_with_positions",
        constants$1266.pango_tab_array_new_with_positions$FUNC
    );
}


