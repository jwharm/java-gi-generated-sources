// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$2483 {

    static final FunctionDescriptor gtk_tree_store_set_valuesv$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_tree_store_set_valuesv$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_store_set_valuesv",
        constants$2483.gtk_tree_store_set_valuesv$FUNC
    );
    static final FunctionDescriptor gtk_tree_store_set_valist$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_tree_store_set_valist$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_store_set_valist",
        constants$2483.gtk_tree_store_set_valist$FUNC
    );
    static final FunctionDescriptor gtk_tree_store_remove$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_tree_store_remove$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_store_remove",
        constants$2483.gtk_tree_store_remove$FUNC
    );
    static final FunctionDescriptor gtk_tree_store_insert$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle gtk_tree_store_insert$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_store_insert",
        constants$2483.gtk_tree_store_insert$FUNC
    );
    static final FunctionDescriptor gtk_tree_store_insert_before$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_tree_store_insert_before$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_store_insert_before",
        constants$2483.gtk_tree_store_insert_before$FUNC
    );
    static final FunctionDescriptor gtk_tree_store_insert_after$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_tree_store_insert_after$MH = RuntimeHelper.downcallHandle(
        "gtk_tree_store_insert_after",
        constants$2483.gtk_tree_store_insert_after$FUNC
    );
}


