package io.github.jwharm.javagi;

import java.lang.foreign.MemoryAddress;

public interface NativeAddress {

    MemoryAddress handle();
    Reference getReference();

    default boolean equals(NativeAddress nativeAddress) {
        return handle() != null && handle().equals(nativeAddress.handle());
    }
}
