package io.github.jwharm.javagi;

import java.lang.foreign.MemoryAddress;

public interface Proxy {

    MemoryAddress handle();
    Refcounted refcounted();

    default boolean equals(Proxy nativeAddress) {
        return handle() != null && handle().equals(nativeAddress.handle());
    }
}
