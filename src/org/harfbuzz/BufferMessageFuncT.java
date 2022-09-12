package org.harfbuzz;

/**
 * A callback method for #hb_buffer_t. The method gets called with the
 * #hb_buffer_t it was set on, the #hb_font_t the buffer is shaped with and a
 * message describing what step of the shaping process will be performed.
 * Returning %false from this method will skip this shaping step and move to
 * the next one.
 */
@FunctionalInterface
public interface BufferMessageFuncT {
        BoolT onBufferMessageFuncT(BufferT buffer, FontT font, java.lang.String message, jdk.incubator.foreign.MemoryAddress userData);
}
