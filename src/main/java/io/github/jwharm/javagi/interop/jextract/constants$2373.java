// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$2373 {

    static final FunctionDescriptor gtk_snapshot_render_background$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle gtk_snapshot_render_background$MH = RuntimeHelper.downcallHandle(
        "gtk_snapshot_render_background",
        constants$2373.gtk_snapshot_render_background$FUNC
    );
    static final FunctionDescriptor gtk_snapshot_render_frame$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle gtk_snapshot_render_frame$MH = RuntimeHelper.downcallHandle(
        "gtk_snapshot_render_frame",
        constants$2373.gtk_snapshot_render_frame$FUNC
    );
    static final FunctionDescriptor gtk_snapshot_render_focus$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle gtk_snapshot_render_focus$MH = RuntimeHelper.downcallHandle(
        "gtk_snapshot_render_focus",
        constants$2373.gtk_snapshot_render_focus$FUNC
    );
    static final FunctionDescriptor gtk_snapshot_render_layout$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_snapshot_render_layout$MH = RuntimeHelper.downcallHandle(
        "gtk_snapshot_render_layout",
        constants$2373.gtk_snapshot_render_layout$FUNC
    );
    static final FunctionDescriptor gtk_snapshot_render_insertion_cursor$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_snapshot_render_insertion_cursor$MH = RuntimeHelper.downcallHandle(
        "gtk_snapshot_render_insertion_cursor",
        constants$2373.gtk_snapshot_render_insertion_cursor$FUNC
    );
    static final FunctionDescriptor gtk_stack_page_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle gtk_stack_page_get_type$MH = RuntimeHelper.downcallHandle(
        "gtk_stack_page_get_type",
        constants$2373.gtk_stack_page_get_type$FUNC
    );
}


