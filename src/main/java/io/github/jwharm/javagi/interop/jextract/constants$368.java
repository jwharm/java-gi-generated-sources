// Generated by jextract

package io.github.jwharm.javagi.interop.jextract;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.nio.ByteOrder;
import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
class constants$368 {

    static final FunctionDescriptor pthread_key_create$__destr_function$FUNC = FunctionDescriptor.ofVoid(
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pthread_key_create$__destr_function$MH = RuntimeHelper.downcallHandle(
        constants$368.pthread_key_create$__destr_function$FUNC
    );
    static final FunctionDescriptor pthread_key_create$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pthread_key_create$MH = RuntimeHelper.downcallHandle(
        "pthread_key_create",
        constants$368.pthread_key_create$FUNC
    );
    static final FunctionDescriptor pthread_key_delete$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle pthread_key_delete$MH = RuntimeHelper.downcallHandle(
        "pthread_key_delete",
        constants$368.pthread_key_delete$FUNC
    );
    static final FunctionDescriptor pthread_getspecific$FUNC = FunctionDescriptor.of(Constants$root.C_POINTER$LAYOUT,
        Constants$root.C_INT$LAYOUT
    );
    static final MethodHandle pthread_getspecific$MH = RuntimeHelper.downcallHandle(
        "pthread_getspecific",
        constants$368.pthread_getspecific$FUNC
    );
    static final FunctionDescriptor pthread_setspecific$FUNC = FunctionDescriptor.of(Constants$root.C_INT$LAYOUT,
        Constants$root.C_INT$LAYOUT,
        Constants$root.C_POINTER$LAYOUT
    );
    static final MethodHandle pthread_setspecific$MH = RuntimeHelper.downcallHandle(
        "pthread_setspecific",
        constants$368.pthread_setspecific$FUNC
    );
}


