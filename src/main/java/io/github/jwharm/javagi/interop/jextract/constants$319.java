// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$319 {

    static final FunctionDescriptor GTestLogFatalFunc$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GTestLogFatalFunc$MH = RuntimeHelper.downcallHandle(
        constants$319.GTestLogFatalFunc$FUNC
    );
    static final FunctionDescriptor g_test_log_set_fatal_handler$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_test_log_set_fatal_handler$MH = RuntimeHelper.downcallHandle(
        "g_test_log_set_fatal_handler",
        constants$319.g_test_log_set_fatal_handler$FUNC
    );
    static final FunctionDescriptor g_test_expect_message$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_test_expect_message$MH = RuntimeHelper.downcallHandle(
        "g_test_expect_message",
        constants$319.g_test_expect_message$FUNC
    );
    static final FunctionDescriptor g_test_assert_expected_messages_internal$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_test_assert_expected_messages_internal$MH = RuntimeHelper.downcallHandle(
        "g_test_assert_expected_messages_internal",
        constants$319.g_test_assert_expected_messages_internal$FUNC
    );
    static final FunctionDescriptor g_test_build_filename$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_test_build_filename$MH = RuntimeHelper.downcallHandleVariadic(
        "g_test_build_filename",
        constants$319.g_test_build_filename$FUNC
    );
    static final FunctionDescriptor g_test_get_dir$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_test_get_dir$MH = RuntimeHelper.downcallHandle(
        "g_test_get_dir",
        constants$319.g_test_get_dir$FUNC
    );
}


