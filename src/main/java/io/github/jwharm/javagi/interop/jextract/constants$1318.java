// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1318 {

    static final FunctionDescriptor GdkPixbufModulePreparedFunc$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GdkPixbufModulePreparedFunc$MH = RuntimeHelper.downcallHandle(
        constants$1318.GdkPixbufModulePreparedFunc$FUNC
    );
    static final FunctionDescriptor GdkPixbufModuleUpdatedFunc$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GdkPixbufModuleUpdatedFunc$MH = RuntimeHelper.downcallHandle(
        constants$1318.GdkPixbufModuleUpdatedFunc$FUNC
    );
    static final FunctionDescriptor GdkPixbufModuleLoadFunc$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GdkPixbufModuleLoadFunc$MH = RuntimeHelper.downcallHandle(
        constants$1318.GdkPixbufModuleLoadFunc$FUNC
    );
}


