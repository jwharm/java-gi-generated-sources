package org.harfbuzz;

import io.github.jwharm.javagi.*;
import org.jetbrains.annotations.*;

/**
 * A callback method for {@link buffer_t}. The method gets called with the
 * {@link buffer_t} it was set on, the {@link font_t} the buffer is shaped with and a
 * message describing what step of the shaping process will be performed.
 * Returning {@code false} from this method will skip this shaping step and move to
 * the next one.
 */
@FunctionalInterface
public interface BufferMessageFuncT {
        BoolT onBufferMessageFuncT(@NotNull BufferT buffer, @NotNull FontT font, @NotNull java.lang.String message, @Nullable java.lang.foreign.MemoryAddress userData);
}
