// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$759 {

    static final FunctionDescriptor g_mount_can_unmount$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_mount_can_unmount$MH = RuntimeHelper.downcallHandle(
        "g_mount_can_unmount",
        constants$759.g_mount_can_unmount$FUNC
    );
    static final FunctionDescriptor g_mount_can_eject$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_mount_can_eject$MH = RuntimeHelper.downcallHandle(
        "g_mount_can_eject",
        constants$759.g_mount_can_eject$FUNC
    );
    static final FunctionDescriptor g_mount_unmount$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_mount_unmount$MH = RuntimeHelper.downcallHandle(
        "g_mount_unmount",
        constants$759.g_mount_unmount$FUNC
    );
    static final FunctionDescriptor g_mount_unmount_finish$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_mount_unmount_finish$MH = RuntimeHelper.downcallHandle(
        "g_mount_unmount_finish",
        constants$759.g_mount_unmount_finish$FUNC
    );
    static final FunctionDescriptor g_mount_eject$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_mount_eject$MH = RuntimeHelper.downcallHandle(
        "g_mount_eject",
        constants$759.g_mount_eject$FUNC
    );
    static final FunctionDescriptor g_mount_eject_finish$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle g_mount_eject_finish$MH = RuntimeHelper.downcallHandle(
        "g_mount_eject_finish",
        constants$759.g_mount_eject_finish$FUNC
    );
}


