// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$2829 {

    static final FunctionDescriptor adw_swipe_tracker_get_allow_long_swipes$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle adw_swipe_tracker_get_allow_long_swipes$MH = RuntimeHelper.downcallHandle(
        "adw_swipe_tracker_get_allow_long_swipes",
        constants$2829.adw_swipe_tracker_get_allow_long_swipes$FUNC
    );
    static final FunctionDescriptor adw_swipe_tracker_set_allow_long_swipes$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle adw_swipe_tracker_set_allow_long_swipes$MH = RuntimeHelper.downcallHandle(
        "adw_swipe_tracker_set_allow_long_swipes",
        constants$2829.adw_swipe_tracker_set_allow_long_swipes$FUNC
    );
    static final FunctionDescriptor adw_swipe_tracker_shift_position$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT
    );
    static final MethodHandle adw_swipe_tracker_shift_position$MH = RuntimeHelper.downcallHandle(
        "adw_swipe_tracker_shift_position",
        constants$2829.adw_swipe_tracker_shift_position$FUNC
    );
    static final FunctionDescriptor adw_tab_page_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle adw_tab_page_get_type$MH = RuntimeHelper.downcallHandle(
        "adw_tab_page_get_type",
        constants$2829.adw_tab_page_get_type$FUNC
    );
    static final FunctionDescriptor glib_autoptr_clear_AdwTabPage$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glib_autoptr_clear_AdwTabPage$MH = RuntimeHelper.downcallHandle(
        "glib_autoptr_clear_AdwTabPage",
        constants$2829.glib_autoptr_clear_AdwTabPage$FUNC
    );
    static final FunctionDescriptor glib_autoptr_cleanup_AdwTabPage$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glib_autoptr_cleanup_AdwTabPage$MH = RuntimeHelper.downcallHandle(
        "glib_autoptr_cleanup_AdwTabPage",
        constants$2829.glib_autoptr_cleanup_AdwTabPage$FUNC
    );
}


