// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1992 {

    static final FunctionDescriptor glib_slistautoptr_cleanup_GtkConstraintClass$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glib_slistautoptr_cleanup_GtkConstraintClass$MH = RuntimeHelper.downcallHandle(
        "glib_slistautoptr_cleanup_GtkConstraintClass",
        constants$1992.glib_slistautoptr_cleanup_GtkConstraintClass$FUNC
    );
    static final FunctionDescriptor glib_queueautoptr_cleanup_GtkConstraintClass$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glib_queueautoptr_cleanup_GtkConstraintClass$MH = RuntimeHelper.downcallHandle(
        "glib_queueautoptr_cleanup_GtkConstraintClass",
        constants$1992.glib_queueautoptr_cleanup_GtkConstraintClass$FUNC
    );
    static final FunctionDescriptor GTK_CONSTRAINT$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GTK_CONSTRAINT$MH = RuntimeHelper.downcallHandle(
        "GTK_CONSTRAINT",
        constants$1992.GTK_CONSTRAINT$FUNC
    );
    static final FunctionDescriptor GTK_IS_CONSTRAINT$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GTK_IS_CONSTRAINT$MH = RuntimeHelper.downcallHandle(
        "GTK_IS_CONSTRAINT",
        constants$1992.GTK_IS_CONSTRAINT$FUNC
    );
    static final FunctionDescriptor gtk_constraint_new$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_constraint_new$MH = RuntimeHelper.downcallHandle(
        "gtk_constraint_new",
        constants$1992.gtk_constraint_new$FUNC
    );
    static final FunctionDescriptor gtk_constraint_new_constant$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_DOUBLE$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_constraint_new_constant$MH = RuntimeHelper.downcallHandle(
        "gtk_constraint_new_constant",
        constants$1992.gtk_constraint_new_constant$FUNC
    );
}


