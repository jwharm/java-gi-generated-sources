// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1736 {

    static final FunctionDescriptor gtk_widget_get_has_tooltip$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_widget_get_has_tooltip$MH = RuntimeHelper.downcallHandle(
        "gtk_widget_get_has_tooltip",
        constants$1736.gtk_widget_get_has_tooltip$FUNC
    );
    static final FunctionDescriptor gtk_requisition_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle gtk_requisition_get_type$MH = RuntimeHelper.downcallHandle(
        "gtk_requisition_get_type",
        constants$1736.gtk_requisition_get_type$FUNC
    );
    static final FunctionDescriptor gtk_requisition_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT);
    static final MethodHandle gtk_requisition_new$MH = RuntimeHelper.downcallHandle(
        "gtk_requisition_new",
        constants$1736.gtk_requisition_new$FUNC
    );
    static final FunctionDescriptor gtk_requisition_copy$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_requisition_copy$MH = RuntimeHelper.downcallHandle(
        "gtk_requisition_copy",
        constants$1736.gtk_requisition_copy$FUNC
    );
    static final FunctionDescriptor gtk_requisition_free$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_requisition_free$MH = RuntimeHelper.downcallHandle(
        "gtk_requisition_free",
        constants$1736.gtk_requisition_free$FUNC
    );
    static final FunctionDescriptor gtk_widget_in_destruction$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_widget_in_destruction$MH = RuntimeHelper.downcallHandle(
        "gtk_widget_in_destruction",
        constants$1736.gtk_widget_in_destruction$FUNC
    );
}


