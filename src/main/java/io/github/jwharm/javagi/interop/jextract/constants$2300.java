// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$2300 {

    static final FunctionDescriptor gtk_progress_bar_set_inverted$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_progress_bar_set_inverted$MH = RuntimeHelper.downcallHandle(
        "gtk_progress_bar_set_inverted",
        constants$2300.gtk_progress_bar_set_inverted$FUNC
    );
    static final FunctionDescriptor gtk_progress_bar_get_text$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_progress_bar_get_text$MH = RuntimeHelper.downcallHandle(
        "gtk_progress_bar_get_text",
        constants$2300.gtk_progress_bar_get_text$FUNC
    );
    static final FunctionDescriptor gtk_progress_bar_get_fraction$FUNC = FunctionDescriptor.of(Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_progress_bar_get_fraction$MH = RuntimeHelper.downcallHandle(
        "gtk_progress_bar_get_fraction",
        constants$2300.gtk_progress_bar_get_fraction$FUNC
    );
    static final FunctionDescriptor gtk_progress_bar_get_pulse_step$FUNC = FunctionDescriptor.of(Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_progress_bar_get_pulse_step$MH = RuntimeHelper.downcallHandle(
        "gtk_progress_bar_get_pulse_step",
        constants$2300.gtk_progress_bar_get_pulse_step$FUNC
    );
    static final FunctionDescriptor gtk_progress_bar_get_inverted$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_progress_bar_get_inverted$MH = RuntimeHelper.downcallHandle(
        "gtk_progress_bar_get_inverted",
        constants$2300.gtk_progress_bar_get_inverted$FUNC
    );
    static final FunctionDescriptor gtk_progress_bar_set_ellipsize$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_progress_bar_set_ellipsize$MH = RuntimeHelper.downcallHandle(
        "gtk_progress_bar_set_ellipsize",
        constants$2300.gtk_progress_bar_set_ellipsize$FUNC
    );
}


