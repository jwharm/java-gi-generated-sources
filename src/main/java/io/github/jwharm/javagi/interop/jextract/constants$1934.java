// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1934 {

    static final FunctionDescriptor gtk_editable_get_enable_undo$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_editable_get_enable_undo$MH = RuntimeHelper.downcallHandle(
        "gtk_editable_get_enable_undo",
        constants$1934.gtk_editable_get_enable_undo$FUNC
    );
    static final FunctionDescriptor gtk_editable_set_enable_undo$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_editable_set_enable_undo$MH = RuntimeHelper.downcallHandle(
        "gtk_editable_set_enable_undo",
        constants$1934.gtk_editable_set_enable_undo$FUNC
    );
    static final FunctionDescriptor gtk_editable_install_properties$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_editable_install_properties$MH = RuntimeHelper.downcallHandle(
        "gtk_editable_install_properties",
        constants$1934.gtk_editable_install_properties$FUNC
    );
    static final FunctionDescriptor gtk_editable_get_delegate$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_editable_get_delegate$MH = RuntimeHelper.downcallHandle(
        "gtk_editable_get_delegate",
        constants$1934.gtk_editable_get_delegate$FUNC
    );
    static final FunctionDescriptor gtk_editable_init_delegate$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_editable_init_delegate$MH = RuntimeHelper.downcallHandle(
        "gtk_editable_init_delegate",
        constants$1934.gtk_editable_init_delegate$FUNC
    );
    static final FunctionDescriptor gtk_editable_finish_delegate$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_editable_finish_delegate$MH = RuntimeHelper.downcallHandle(
        "gtk_editable_finish_delegate",
        constants$1934.gtk_editable_finish_delegate$FUNC
    );
}


