// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$2041 {

    static final FunctionDescriptor gtk_event_controller_get_widget$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_event_controller_get_widget$MH = RuntimeHelper.downcallHandle(
        "gtk_event_controller_get_widget",
        constants$2041.gtk_event_controller_get_widget$FUNC
    );
    static final FunctionDescriptor gtk_event_controller_reset$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_event_controller_reset$MH = RuntimeHelper.downcallHandle(
        "gtk_event_controller_reset",
        constants$2041.gtk_event_controller_reset$FUNC
    );
    static final FunctionDescriptor gtk_event_controller_get_propagation_phase$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_event_controller_get_propagation_phase$MH = RuntimeHelper.downcallHandle(
        "gtk_event_controller_get_propagation_phase",
        constants$2041.gtk_event_controller_get_propagation_phase$FUNC
    );
    static final FunctionDescriptor gtk_event_controller_set_propagation_phase$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_event_controller_set_propagation_phase$MH = RuntimeHelper.downcallHandle(
        "gtk_event_controller_set_propagation_phase",
        constants$2041.gtk_event_controller_set_propagation_phase$FUNC
    );
    static final FunctionDescriptor gtk_event_controller_get_propagation_limit$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_event_controller_get_propagation_limit$MH = RuntimeHelper.downcallHandle(
        "gtk_event_controller_get_propagation_limit",
        constants$2041.gtk_event_controller_get_propagation_limit$FUNC
    );
    static final FunctionDescriptor gtk_event_controller_set_propagation_limit$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_event_controller_set_propagation_limit$MH = RuntimeHelper.downcallHandle(
        "gtk_event_controller_set_propagation_limit",
        constants$2041.gtk_event_controller_set_propagation_limit$FUNC
    );
}


