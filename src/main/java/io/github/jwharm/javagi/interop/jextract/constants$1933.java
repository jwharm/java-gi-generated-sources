// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1933 {

    static final FunctionDescriptor gtk_editable_get_alignment$FUNC = FunctionDescriptor.of(Constants$root.C_FLOAT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_editable_get_alignment$MH = RuntimeHelper.downcallHandle(
        "gtk_editable_get_alignment",
        constants$1933.gtk_editable_get_alignment$FUNC
    );
    static final FunctionDescriptor gtk_editable_set_alignment$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_FLOAT$LAYOUT
    );
    static final MethodHandle gtk_editable_set_alignment$MH = RuntimeHelper.downcallHandle(
        "gtk_editable_set_alignment",
        constants$1933.gtk_editable_set_alignment$FUNC
    );
    static final FunctionDescriptor gtk_editable_get_width_chars$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_editable_get_width_chars$MH = RuntimeHelper.downcallHandle(
        "gtk_editable_get_width_chars",
        constants$1933.gtk_editable_get_width_chars$FUNC
    );
    static final FunctionDescriptor gtk_editable_set_width_chars$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_editable_set_width_chars$MH = RuntimeHelper.downcallHandle(
        "gtk_editable_set_width_chars",
        constants$1933.gtk_editable_set_width_chars$FUNC
    );
    static final FunctionDescriptor gtk_editable_get_max_width_chars$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_editable_get_max_width_chars$MH = RuntimeHelper.downcallHandle(
        "gtk_editable_get_max_width_chars",
        constants$1933.gtk_editable_get_max_width_chars$FUNC
    );
    static final FunctionDescriptor gtk_editable_set_max_width_chars$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_editable_set_max_width_chars$MH = RuntimeHelper.downcallHandle(
        "gtk_editable_set_max_width_chars",
        constants$1933.gtk_editable_set_max_width_chars$FUNC
    );
}


