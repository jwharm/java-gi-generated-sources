// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$1354 {

    static final FunctionDescriptor gdk_content_serializer_get_user_data$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_content_serializer_get_user_data$MH = RuntimeHelper.downcallHandle(
        "gdk_content_serializer_get_user_data",
        constants$1354.gdk_content_serializer_get_user_data$FUNC
    );
    static final FunctionDescriptor gdk_content_serializer_set_task_data$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_content_serializer_set_task_data$MH = RuntimeHelper.downcallHandle(
        "gdk_content_serializer_set_task_data",
        constants$1354.gdk_content_serializer_set_task_data$FUNC
    );
    static final FunctionDescriptor gdk_content_serializer_get_task_data$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_content_serializer_get_task_data$MH = RuntimeHelper.downcallHandle(
        "gdk_content_serializer_get_task_data",
        constants$1354.gdk_content_serializer_get_task_data$FUNC
    );
    static final FunctionDescriptor gdk_content_serializer_return_success$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_content_serializer_return_success$MH = RuntimeHelper.downcallHandle(
        "gdk_content_serializer_return_success",
        constants$1354.gdk_content_serializer_return_success$FUNC
    );
    static final FunctionDescriptor gdk_content_serializer_return_error$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_content_serializer_return_error$MH = RuntimeHelper.downcallHandle(
        "gdk_content_serializer_return_error",
        constants$1354.gdk_content_serializer_return_error$FUNC
    );
    static final FunctionDescriptor gdk_content_formats_union_serialize_gtypes$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle gdk_content_formats_union_serialize_gtypes$MH = RuntimeHelper.downcallHandle(
        "gdk_content_formats_union_serialize_gtypes",
        constants$1354.gdk_content_formats_union_serialize_gtypes$FUNC
    );
}


