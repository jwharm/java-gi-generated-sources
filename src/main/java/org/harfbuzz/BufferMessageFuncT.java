package org.harfbuzz;

import io.github.jwharm.javagi.*;

/**
 * A callback method for {@link buffer_t}. The method gets called with the
 * {@link buffer_t} it was set on, the {@link font_t} the buffer is shaped with and a
 * message describing what step of the shaping process will be performed.
 * Returning {@code false} from this method will skip this shaping step and move to
 * the next one.
 */
@FunctionalInterface
public interface BufferMessageFuncT {
        BoolT onBufferMessageFuncT(BufferT buffer, FontT font, java.lang.String message, java.lang.foreign.MemoryAddress userData);
}