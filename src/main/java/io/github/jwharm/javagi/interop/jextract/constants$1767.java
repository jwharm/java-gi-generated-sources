// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1767 {

    static final FunctionDescriptor gtk_about_dialog_get_logo_icon_name$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_about_dialog_get_logo_icon_name$MH = RuntimeHelper.downcallHandle(
        "gtk_about_dialog_get_logo_icon_name",
        constants$1767.gtk_about_dialog_get_logo_icon_name$FUNC
    );
    static final FunctionDescriptor gtk_about_dialog_set_logo_icon_name$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_about_dialog_set_logo_icon_name$MH = RuntimeHelper.downcallHandle(
        "gtk_about_dialog_set_logo_icon_name",
        constants$1767.gtk_about_dialog_set_logo_icon_name$FUNC
    );
    static final FunctionDescriptor gtk_about_dialog_add_credit_section$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gtk_about_dialog_add_credit_section$MH = RuntimeHelper.downcallHandle(
        "gtk_about_dialog_add_credit_section",
        constants$1767.gtk_about_dialog_add_credit_section$FUNC
    );
    static final FunctionDescriptor glib_autoptr_clear_GtkAboutDialog$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glib_autoptr_clear_GtkAboutDialog$MH = RuntimeHelper.downcallHandle(
        "glib_autoptr_clear_GtkAboutDialog",
        constants$1767.glib_autoptr_clear_GtkAboutDialog$FUNC
    );
    static final FunctionDescriptor glib_autoptr_cleanup_GtkAboutDialog$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glib_autoptr_cleanup_GtkAboutDialog$MH = RuntimeHelper.downcallHandle(
        "glib_autoptr_cleanup_GtkAboutDialog",
        constants$1767.glib_autoptr_cleanup_GtkAboutDialog$FUNC
    );
    static final FunctionDescriptor glib_listautoptr_cleanup_GtkAboutDialog$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle glib_listautoptr_cleanup_GtkAboutDialog$MH = RuntimeHelper.downcallHandle(
        "glib_listautoptr_cleanup_GtkAboutDialog",
        constants$1767.glib_listautoptr_cleanup_GtkAboutDialog$FUNC
    );
}


