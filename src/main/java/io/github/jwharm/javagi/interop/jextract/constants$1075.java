// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1075 {

    static final FunctionDescriptor g_unix_fd_add_full$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_unix_fd_add_full$MH = RuntimeHelper.downcallHandle(
        "g_unix_fd_add_full",
        constants$1075.g_unix_fd_add_full$FUNC
    );
    static final FunctionDescriptor g_unix_fd_add$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_unix_fd_add$MH = RuntimeHelper.downcallHandle(
        "g_unix_fd_add",
        constants$1075.g_unix_fd_add$FUNC
    );
    static final FunctionDescriptor g_unix_get_passwd_entry$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_unix_get_passwd_entry$MH = RuntimeHelper.downcallHandle(
        "g_unix_get_passwd_entry",
        constants$1075.g_unix_get_passwd_entry$FUNC
    );
    static final FunctionDescriptor gtk_css_parser_error_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle gtk_css_parser_error_get_type$MH = RuntimeHelper.downcallHandle(
        "gtk_css_parser_error_get_type",
        constants$1075.gtk_css_parser_error_get_type$FUNC
    );
    static final FunctionDescriptor gtk_css_parser_warning_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle gtk_css_parser_warning_get_type$MH = RuntimeHelper.downcallHandle(
        "gtk_css_parser_warning_get_type",
        constants$1075.gtk_css_parser_warning_get_type$FUNC
    );
    static final FunctionDescriptor gtk_css_parser_error_quark$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT);
    static final MethodHandle gtk_css_parser_error_quark$MH = RuntimeHelper.downcallHandle(
        "gtk_css_parser_error_quark",
        constants$1075.gtk_css_parser_error_quark$FUNC
    );
}


