// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$2310 {

    static final FunctionDescriptor gtk_recent_info_get_groups$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_recent_info_get_groups$MH = RuntimeHelper.downcallHandle(
        "gtk_recent_info_get_groups",
        constants$2310.gtk_recent_info_get_groups$FUNC
    );
    static final FunctionDescriptor gtk_recent_info_has_group$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_recent_info_has_group$MH = RuntimeHelper.downcallHandle(
        "gtk_recent_info_has_group",
        constants$2310.gtk_recent_info_has_group$FUNC
    );
    static final FunctionDescriptor gtk_recent_info_get_gicon$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_recent_info_get_gicon$MH = RuntimeHelper.downcallHandle(
        "gtk_recent_info_get_gicon",
        constants$2310.gtk_recent_info_get_gicon$FUNC
    );
    static final FunctionDescriptor gtk_recent_info_get_short_name$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_recent_info_get_short_name$MH = RuntimeHelper.downcallHandle(
        "gtk_recent_info_get_short_name",
        constants$2310.gtk_recent_info_get_short_name$FUNC
    );
    static final FunctionDescriptor gtk_recent_info_get_uri_display$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_recent_info_get_uri_display$MH = RuntimeHelper.downcallHandle(
        "gtk_recent_info_get_uri_display",
        constants$2310.gtk_recent_info_get_uri_display$FUNC
    );
    static final FunctionDescriptor gtk_recent_info_get_age$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_recent_info_get_age$MH = RuntimeHelper.downcallHandle(
        "gtk_recent_info_get_age",
        constants$2310.gtk_recent_info_get_age$FUNC
    );
}


