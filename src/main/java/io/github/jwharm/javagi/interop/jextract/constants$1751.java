// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1751 {

    static final FunctionDescriptor gtk_window_set_transient_for$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_window_set_transient_for$MH = RuntimeHelper.downcallHandle(
        "gtk_window_set_transient_for",
        constants$1751.gtk_window_set_transient_for$FUNC
    );
    static final FunctionDescriptor gtk_window_get_transient_for$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_window_get_transient_for$MH = RuntimeHelper.downcallHandle(
        "gtk_window_get_transient_for",
        constants$1751.gtk_window_get_transient_for$FUNC
    );
    static final FunctionDescriptor gtk_window_set_destroy_with_parent$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_window_set_destroy_with_parent$MH = RuntimeHelper.downcallHandle(
        "gtk_window_set_destroy_with_parent",
        constants$1751.gtk_window_set_destroy_with_parent$FUNC
    );
    static final FunctionDescriptor gtk_window_get_destroy_with_parent$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_window_get_destroy_with_parent$MH = RuntimeHelper.downcallHandle(
        "gtk_window_get_destroy_with_parent",
        constants$1751.gtk_window_get_destroy_with_parent$FUNC
    );
    static final FunctionDescriptor gtk_window_set_hide_on_close$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_window_set_hide_on_close$MH = RuntimeHelper.downcallHandle(
        "gtk_window_set_hide_on_close",
        constants$1751.gtk_window_set_hide_on_close$FUNC
    );
    static final FunctionDescriptor gtk_window_get_hide_on_close$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_window_get_hide_on_close$MH = RuntimeHelper.downcallHandle(
        "gtk_window_get_hide_on_close",
        constants$1751.gtk_window_get_hide_on_close$FUNC
    );
}


