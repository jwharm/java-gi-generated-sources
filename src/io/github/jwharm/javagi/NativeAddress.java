package io.github.jwharm.javagi;

import jdk.incubator.foreign.MemoryAddress;

public interface NativeAddress {

    MemoryAddress handle();
    Reference getReference();

    default boolean equals(NativeAddress nativeAddress) {
        return handle() != null && handle().equals(nativeAddress.handle());
    }
}
