// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$541 {

    static final FunctionDescriptor g_application_command_line_set_exit_status$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_application_command_line_set_exit_status$MH = RuntimeHelper.downcallHandle(
        "g_application_command_line_set_exit_status",
        constants$541.g_application_command_line_set_exit_status$FUNC
    );
    static final FunctionDescriptor g_application_command_line_get_platform_data$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_application_command_line_get_platform_data$MH = RuntimeHelper.downcallHandle(
        "g_application_command_line_get_platform_data",
        constants$541.g_application_command_line_get_platform_data$FUNC
    );
    static final FunctionDescriptor g_application_command_line_create_file_for_arg$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_application_command_line_create_file_for_arg$MH = RuntimeHelper.downcallHandle(
        "g_application_command_line_create_file_for_arg",
        constants$541.g_application_command_line_create_file_for_arg$FUNC
    );
    static final FunctionDescriptor g_initable_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_initable_get_type$MH = RuntimeHelper.downcallHandle(
        "g_initable_get_type",
        constants$541.g_initable_get_type$FUNC
    );
    static final FunctionDescriptor g_initable_init$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_initable_init$MH = RuntimeHelper.downcallHandle(
        "g_initable_init",
        constants$541.g_initable_init$FUNC
    );
    static final FunctionDescriptor g_initable_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_initable_new$MH = RuntimeHelper.downcallHandleVariadic(
        "g_initable_new",
        constants$541.g_initable_new$FUNC
    );
}


