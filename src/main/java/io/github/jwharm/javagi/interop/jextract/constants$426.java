// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$426 {

    static final FunctionDescriptor GInterfaceFinalizeFunc$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GInterfaceFinalizeFunc$MH = RuntimeHelper.downcallHandle(
        constants$426.GInterfaceFinalizeFunc$FUNC
    );
    static final FunctionDescriptor GTypeClassCacheFunc$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GTypeClassCacheFunc$MH = RuntimeHelper.downcallHandle(
        constants$426.GTypeClassCacheFunc$FUNC
    );
    static final FunctionDescriptor GTypeInterfaceCheckFunc$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GTypeInterfaceCheckFunc$MH = RuntimeHelper.downcallHandle(
        constants$426.GTypeInterfaceCheckFunc$FUNC
    );
    static final FunctionDescriptor g_type_register_static$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle g_type_register_static$MH = RuntimeHelper.downcallHandle(
        "g_type_register_static",
        constants$426.g_type_register_static$FUNC
    );
}


