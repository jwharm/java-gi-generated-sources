package io.github.jwharm.javagi.interop;

import jdk.incubator.foreign.MemoryAddress;

public interface NativeAddress {

    MemoryAddress HANDLE();

    Reference getReference();

    default boolean equals(ResourceBase nativeAddress) {
        return HANDLE() != null && HANDLE().equals(nativeAddress.HANDLE());
    }
}
