package org.gtk.glib;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

public class Type extends io.github.jwharm.javagi.Alias<Long> {
    
    public Type(long value) {
        super(value);
    }
    
    @ApiStatus.Internal
    public static Type[] fromNativeArray(MemoryAddress address, long length) {
        Type[] array = new Type[(int) length];
        long bytesSize = Interop.valueLayout.C_LONG.byteSize();
        for (int i = 0; i < length; i++) {
            array[i] = new Type(address.get(Interop.valueLayout.C_LONG, i * bytesSize));
        }
        return array;
    }
    
    public static final long G_TYPE_FUNDAMENTAL_SHIFT = 2;
    public static final Type G_TYPE_INVALID = new Type(0L << G_TYPE_FUNDAMENTAL_SHIFT);
    public static final Type G_TYPE_NONE = new Type(1L << G_TYPE_FUNDAMENTAL_SHIFT);
    public static final Type G_TYPE_INTERFACE = new Type(2L << G_TYPE_FUNDAMENTAL_SHIFT);
    public static final Type G_TYPE_CHAR = new Type(3L << G_TYPE_FUNDAMENTAL_SHIFT);
    public static final Type G_TYPE_UCHAR = new Type(4L << G_TYPE_FUNDAMENTAL_SHIFT);
    public static final Type G_TYPE_BOOLEAN = new Type(5L << G_TYPE_FUNDAMENTAL_SHIFT);
    public static final Type G_TYPE_INT = new Type(6L << G_TYPE_FUNDAMENTAL_SHIFT);
    public static final Type G_TYPE_UINT = new Type(7L << G_TYPE_FUNDAMENTAL_SHIFT);
    public static final Type G_TYPE_LONG = new Type(8L << G_TYPE_FUNDAMENTAL_SHIFT);
    public static final Type G_TYPE_ULONG = new Type(9L << G_TYPE_FUNDAMENTAL_SHIFT);
    public static final Type G_TYPE_INT64 = new Type(10L << G_TYPE_FUNDAMENTAL_SHIFT);
    public static final Type G_TYPE_UINT64 = new Type(11L << G_TYPE_FUNDAMENTAL_SHIFT);
    public static final Type G_TYPE_ENUM = new Type(12L << G_TYPE_FUNDAMENTAL_SHIFT);
    public static final Type G_TYPE_FLAGS = new Type(13L << G_TYPE_FUNDAMENTAL_SHIFT);
    public static final Type G_TYPE_FLOAT = new Type(14L << G_TYPE_FUNDAMENTAL_SHIFT);
    public static final Type G_TYPE_DOUBLE = new Type(15L << G_TYPE_FUNDAMENTAL_SHIFT);
    public static final Type G_TYPE_STRING = new Type(16L << G_TYPE_FUNDAMENTAL_SHIFT);
    public static final Type G_TYPE_POINTER = new Type(17L << G_TYPE_FUNDAMENTAL_SHIFT);
    public static final Type G_TYPE_BOXED = new Type(18L << G_TYPE_FUNDAMENTAL_SHIFT);
    public static final Type G_TYPE_PARAM = new Type(19L << G_TYPE_FUNDAMENTAL_SHIFT);
    public static final Type G_TYPE_OBJECT = new Type(20L << G_TYPE_FUNDAMENTAL_SHIFT);
    public static final Type G_TYPE_VARIANT = new Type(21L << G_TYPE_FUNDAMENTAL_SHIFT);
}
