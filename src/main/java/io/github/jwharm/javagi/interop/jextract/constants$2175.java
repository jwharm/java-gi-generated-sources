// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$2175 {

    static final FunctionDescriptor GtkListBoxForeachFunc$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle GtkListBoxForeachFunc$MH = RuntimeHelper.downcallHandle(
        constants$2175.GtkListBoxForeachFunc$FUNC
    );
    static final FunctionDescriptor gtk_list_box_selected_foreach$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_list_box_selected_foreach$MH = RuntimeHelper.downcallHandle(
        "gtk_list_box_selected_foreach",
        constants$2175.gtk_list_box_selected_foreach$FUNC
    );
    static final FunctionDescriptor gtk_list_box_get_selected_rows$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_list_box_get_selected_rows$MH = RuntimeHelper.downcallHandle(
        "gtk_list_box_get_selected_rows",
        constants$2175.gtk_list_box_get_selected_rows$FUNC
    );
    static final FunctionDescriptor gtk_list_box_unselect_row$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_list_box_unselect_row$MH = RuntimeHelper.downcallHandle(
        "gtk_list_box_unselect_row",
        constants$2175.gtk_list_box_unselect_row$FUNC
    );
    static final FunctionDescriptor gtk_list_box_select_all$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_list_box_select_all$MH = RuntimeHelper.downcallHandle(
        "gtk_list_box_select_all",
        constants$2175.gtk_list_box_select_all$FUNC
    );
}


