package org.harfbuzz;

import io.github.jwharm.javagi.*;
import java.lang.foreign.*;
import java.lang.invoke.*;
import org.jetbrains.annotations.*;

/**
 * A callback method for {@link BufferT}. The method gets called with the
 * {@link BufferT} it was set on, the {@link FontT} the buffer is shaped with and a
 * message describing what step of the shaping process will be performed.
 * Returning {@code false} from this method will skip this shaping step and move to
 * the next one.
 * @version 1.1.3
 */
@FunctionalInterface
public interface BufferMessageFuncT {
        org.harfbuzz.BoolT onBufferMessageFuncT(@NotNull org.harfbuzz.BufferT buffer, @NotNull org.harfbuzz.FontT font, @NotNull java.lang.String message, @Nullable java.lang.foreign.MemoryAddress userData);
}
