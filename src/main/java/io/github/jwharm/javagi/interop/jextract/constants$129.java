// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$129 {

    static final FunctionDescriptor g_dngettext$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_dngettext$MH = RuntimeHelper.downcallHandle(
        "g_dngettext",
        constants$129.g_dngettext$FUNC
    );
    static final FunctionDescriptor g_dpgettext$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_dpgettext$MH = RuntimeHelper.downcallHandle(
        "g_dpgettext",
        constants$129.g_dpgettext$FUNC
    );
    static final FunctionDescriptor g_dpgettext2$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_dpgettext2$MH = RuntimeHelper.downcallHandle(
        "g_dpgettext2",
        constants$129.g_dpgettext2$FUNC
    );
    static final FunctionDescriptor g_free$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_free$MH = RuntimeHelper.downcallHandle(
        "g_free",
        constants$129.g_free$FUNC
    );
    static final FunctionDescriptor g_clear_pointer$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_clear_pointer$MH = RuntimeHelper.downcallHandle(
        "g_clear_pointer",
        constants$129.g_clear_pointer$FUNC
    );
    static final FunctionDescriptor g_malloc$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle g_malloc$MH = RuntimeHelper.downcallHandle(
        "g_malloc",
        constants$129.g_malloc$FUNC
    );
}


