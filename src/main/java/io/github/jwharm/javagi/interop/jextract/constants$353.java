// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$353 {

    static final FunctionDescriptor pthread_attr_getguardsize$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pthread_attr_getguardsize$MH = RuntimeHelper.downcallHandle(
        "pthread_attr_getguardsize",
        constants$353.pthread_attr_getguardsize$FUNC
    );
    static final FunctionDescriptor pthread_attr_setguardsize$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_LONG_LONG$LAYOUT
    );
    static final MethodHandle pthread_attr_setguardsize$MH = RuntimeHelper.downcallHandle(
        "pthread_attr_setguardsize",
        constants$353.pthread_attr_setguardsize$FUNC
    );
    static final FunctionDescriptor pthread_attr_getschedparam$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pthread_attr_getschedparam$MH = RuntimeHelper.downcallHandle(
        "pthread_attr_getschedparam",
        constants$353.pthread_attr_getschedparam$FUNC
    );
    static final FunctionDescriptor pthread_attr_setschedparam$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pthread_attr_setschedparam$MH = RuntimeHelper.downcallHandle(
        "pthread_attr_setschedparam",
        constants$353.pthread_attr_setschedparam$FUNC
    );
    static final FunctionDescriptor pthread_attr_getschedpolicy$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pthread_attr_getschedpolicy$MH = RuntimeHelper.downcallHandle(
        "pthread_attr_getschedpolicy",
        constants$353.pthread_attr_getschedpolicy$FUNC
    );
    static final FunctionDescriptor pthread_attr_setschedpolicy$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle pthread_attr_setschedpolicy$MH = RuntimeHelper.downcallHandle(
        "pthread_attr_setschedpolicy",
        constants$353.pthread_attr_setschedpolicy$FUNC
    );
}


