// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$701 {

    static final FunctionDescriptor g_file_info_set_access_date_time$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_info_set_access_date_time$MH = RuntimeHelper.downcallHandle(
        "g_file_info_set_access_date_time",
        constants$701.g_file_info_set_access_date_time$FUNC
    );
    static final FunctionDescriptor g_file_info_set_creation_date_time$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_info_set_creation_date_time$MH = RuntimeHelper.downcallHandle(
        "g_file_info_set_creation_date_time",
        constants$701.g_file_info_set_creation_date_time$FUNC
    );
    static final FunctionDescriptor g_file_info_set_symlink_target$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_info_set_symlink_target$MH = RuntimeHelper.downcallHandle(
        "g_file_info_set_symlink_target",
        constants$701.g_file_info_set_symlink_target$FUNC
    );
    static final FunctionDescriptor g_file_info_set_sort_order$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_file_info_set_sort_order$MH = RuntimeHelper.downcallHandle(
        "g_file_info_set_sort_order",
        constants$701.g_file_info_set_sort_order$FUNC
    );
    static final FunctionDescriptor g_file_attribute_matcher_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle g_file_attribute_matcher_get_type$MH = RuntimeHelper.downcallHandle(
        "g_file_attribute_matcher_get_type",
        constants$701.g_file_attribute_matcher_get_type$FUNC
    );
    static final FunctionDescriptor g_file_attribute_matcher_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_file_attribute_matcher_new$MH = RuntimeHelper.downcallHandle(
        "g_file_attribute_matcher_new",
        constants$701.g_file_attribute_matcher_new$FUNC
    );
}


