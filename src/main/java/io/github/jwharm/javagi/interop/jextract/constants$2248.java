// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$2248 {

    static final FunctionDescriptor gtk_overlay_set_measure_overlay$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_overlay_set_measure_overlay$MH = RuntimeHelper.downcallHandle(
        "gtk_overlay_set_measure_overlay",
        constants$2248.gtk_overlay_set_measure_overlay$FUNC
    );
    static final FunctionDescriptor gtk_overlay_get_clip_overlay$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_overlay_get_clip_overlay$MH = RuntimeHelper.downcallHandle(
        "gtk_overlay_get_clip_overlay",
        constants$2248.gtk_overlay_get_clip_overlay$FUNC
    );
    static final FunctionDescriptor gtk_overlay_set_clip_overlay$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_overlay_set_clip_overlay$MH = RuntimeHelper.downcallHandle(
        "gtk_overlay_set_clip_overlay",
        constants$2248.gtk_overlay_set_clip_overlay$FUNC
    );
    static final FunctionDescriptor gtk_overlay_layout_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle gtk_overlay_layout_get_type$MH = RuntimeHelper.downcallHandle(
        "gtk_overlay_layout_get_type",
        constants$2248.gtk_overlay_layout_get_type$FUNC
    );
    static final FunctionDescriptor glib_autoptr_clear_GtkOverlayLayout$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glib_autoptr_clear_GtkOverlayLayout$MH = RuntimeHelper.downcallHandle(
        "glib_autoptr_clear_GtkOverlayLayout",
        constants$2248.glib_autoptr_clear_GtkOverlayLayout$FUNC
    );
    static final FunctionDescriptor glib_autoptr_cleanup_GtkOverlayLayout$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glib_autoptr_cleanup_GtkOverlayLayout$MH = RuntimeHelper.downcallHandle(
        "glib_autoptr_cleanup_GtkOverlayLayout",
        constants$2248.glib_autoptr_cleanup_GtkOverlayLayout$FUNC
    );
}


