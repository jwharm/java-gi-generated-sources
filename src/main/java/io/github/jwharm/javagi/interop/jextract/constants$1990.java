// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1990 {

    static final FunctionDescriptor GTK_CONSTRAINT_TARGET$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GTK_CONSTRAINT_TARGET$MH = RuntimeHelper.downcallHandle(
        "GTK_CONSTRAINT_TARGET",
        constants$1990.GTK_CONSTRAINT_TARGET$FUNC
    );
    static final FunctionDescriptor GTK_IS_CONSTRAINT_TARGET$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GTK_IS_CONSTRAINT_TARGET$MH = RuntimeHelper.downcallHandle(
        "GTK_IS_CONSTRAINT_TARGET",
        constants$1990.GTK_IS_CONSTRAINT_TARGET$FUNC
    );
    static final FunctionDescriptor GTK_CONSTRAINT_TARGET_GET_IFACE$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GTK_CONSTRAINT_TARGET_GET_IFACE$MH = RuntimeHelper.downcallHandle(
        "GTK_CONSTRAINT_TARGET_GET_IFACE",
        constants$1990.GTK_CONSTRAINT_TARGET_GET_IFACE$FUNC
    );
    static final FunctionDescriptor gtk_constraint_get_type$FUNC = FunctionDescriptor.of(Constants$root.C_LONG_LONG$LAYOUT);
    static final MethodHandle gtk_constraint_get_type$MH = RuntimeHelper.downcallHandle(
        "gtk_constraint_get_type",
        constants$1990.gtk_constraint_get_type$FUNC
    );
    static final FunctionDescriptor glib_autoptr_clear_GtkConstraint$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glib_autoptr_clear_GtkConstraint$MH = RuntimeHelper.downcallHandle(
        "glib_autoptr_clear_GtkConstraint",
        constants$1990.glib_autoptr_clear_GtkConstraint$FUNC
    );
    static final FunctionDescriptor glib_autoptr_cleanup_GtkConstraint$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glib_autoptr_cleanup_GtkConstraint$MH = RuntimeHelper.downcallHandle(
        "glib_autoptr_cleanup_GtkConstraint",
        constants$1990.glib_autoptr_cleanup_GtkConstraint$FUNC
    );
}


