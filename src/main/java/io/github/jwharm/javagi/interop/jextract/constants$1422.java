// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1422 {

    static final FunctionDescriptor gdk_toplevel_layout_ref$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_toplevel_layout_ref$MH = RuntimeHelper.downcallHandle(
        "gdk_toplevel_layout_ref",
        constants$1422.gdk_toplevel_layout_ref$FUNC
    );
    static final FunctionDescriptor gdk_toplevel_layout_unref$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_toplevel_layout_unref$MH = RuntimeHelper.downcallHandle(
        "gdk_toplevel_layout_unref",
        constants$1422.gdk_toplevel_layout_unref$FUNC
    );
    static final FunctionDescriptor gdk_toplevel_layout_copy$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_toplevel_layout_copy$MH = RuntimeHelper.downcallHandle(
        "gdk_toplevel_layout_copy",
        constants$1422.gdk_toplevel_layout_copy$FUNC
    );
    static final FunctionDescriptor gdk_toplevel_layout_equal$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_toplevel_layout_equal$MH = RuntimeHelper.downcallHandle(
        "gdk_toplevel_layout_equal",
        constants$1422.gdk_toplevel_layout_equal$FUNC
    );
    static final FunctionDescriptor gdk_toplevel_layout_set_maximized$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gdk_toplevel_layout_set_maximized$MH = RuntimeHelper.downcallHandle(
        "gdk_toplevel_layout_set_maximized",
        constants$1422.gdk_toplevel_layout_set_maximized$FUNC
    );
    static final FunctionDescriptor gdk_toplevel_layout_set_fullscreen$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_toplevel_layout_set_fullscreen$MH = RuntimeHelper.downcallHandle(
        "gdk_toplevel_layout_set_fullscreen",
        constants$1422.gdk_toplevel_layout_set_fullscreen$FUNC
    );
}


